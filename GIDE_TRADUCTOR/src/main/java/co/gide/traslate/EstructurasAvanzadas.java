package co.gide.traslate;

import com.growupit.gideesquema.TipoArticulo;
import com.growupit.gideesquema.TipoArticuloPeligroso;
import com.growupit.gideesquema.TipoCargo;
import com.growupit.gideesquema.TipoClasificacionMercancia;
import com.growupit.gideesquema.TipoClienteTercero;
import com.growupit.gideesquema.TipoCondicionesTransaccion;
import com.growupit.gideesquema.TipoContrato;
import com.growupit.gideesquema.TipoDetalleFactura;
import com.growupit.gideesquema.TipoDireccion;
import com.growupit.gideesquema.TipoDocumentoReferencia;
import com.growupit.gideesquema.TipoEntrega;
import com.growupit.gideesquema.TipoIdentificacionArticulos;
import com.growupit.gideesquema.TipoIdentificador;
import com.growupit.gideesquema.TipoImpuestoCategoria;
import com.growupit.gideesquema.TipoImpuestoTotal;
import com.growupit.gideesquema.TipoInstanciaArticulo;
import com.growupit.gideesquema.TipoLineaReferencia;
import com.growupit.gideesquema.TipoMedioPago;
import com.growupit.gideesquema.TipoPago;
import com.growupit.gideesquema.TipoPropiedadArticulo;
import com.growupit.gideesquema.TipoProveedor;
import com.growupit.gideesquema.TipoReferenciaFactura;
import com.growupit.gideesquema.TipoReferenciaLineaPedido;
import com.growupit.gideesquema.TipoReferenciaPedido;
import com.growupit.gideesquema.TipoSubtotalImpuesto;
import com.growupit.gideesquema.TipoTasaCambio;
import com.growupit.gideesquema.TipoTercero;
import com.growupit.gideesquema.TipoTerminosEntrega;
import com.growupit.gideesquema.TipoTerminosPago;
import com.growupit.gideesquema.TipoTexto;
import com.growupit.gideesquema.TipoTotalMonetarioLegal;
import co.gov.dian.contratos.facturaelectronica.v1.AllowanceChargeType;
import co.gov.dian.contratos.facturaelectronica.v1.CustomerPartyType;
import co.gov.dian.contratos.facturaelectronica.v1.DeliveryTermsType;
import co.gov.dian.contratos.facturaelectronica.v1.DeliveryType;
import co.gov.dian.contratos.facturaelectronica.v1.InvoiceLineType;
import co.gov.dian.contratos.facturaelectronica.v1.ItemType;
import co.gov.dian.contratos.facturaelectronica.v1.MonetaryTotalType;
import co.gov.dian.contratos.facturaelectronica.v1.PaymentType;
import co.gov.dian.contratos.facturaelectronica.v1.SupplierPartyType;
import co.gov.dian.contratos.facturaelectronica.v1.TaxTotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContractType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ExchangeRateType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.OrderReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PaymentMeansType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PaymentTermsType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.*;

public class EstructurasAvanzadas {

	private EstructurasBasicas estBasicas;

	public OrderReferenceType getReferenciaPedidos(TipoReferenciaPedido referenciaPedido, TipoIdentificador CUFE) {

		OrderReferenceType refePedi = new OrderReferenceType();

		CopyIndicatorType esCopia = new CopyIndicatorType();
		esCopia.setValue(referenciaPedido.isIndicadorCopia());
		refePedi.setCopyIndicator(esCopia);

		CustomerReferenceType referenciaCliente = new CustomerReferenceType();
		estBasicas.getTexto(referenciaPedido.getReferenciaCliente(), referenciaCliente);
		refePedi.setCustomerReference(referenciaCliente);

		refePedi.setDocumentReference(estBasicas.getDocumentoReferencia(referenciaPedido.getDocumentoreferencia()));

		IDType id = new IDType();
		estBasicas.getIdentificador(referenciaPedido.getID(), id);
		refePedi.setID(id);

		IssueDateType fechaAsunto = new IssueDateType();
		fechaAsunto.setValue(referenciaPedido.getFechaAsunto());
		refePedi.setIssueDate(fechaAsunto);

		SalesOrderIDType idOrdenDeVenta = new SalesOrderIDType();
		estBasicas.getIdentificador(referenciaPedido.getIdOrdenesVenta(), idOrdenDeVenta);
		refePedi.setSalesOrderID(idOrdenDeVenta);

		IssueTimeType horaAsunto = new IssueTimeType();
		horaAsunto.setValue(referenciaPedido.getHoraAsunto());
		refePedi.setIssueTime(horaAsunto);

		UUIDType cufe = new UUIDType();
		estBasicas.getIdentificador(CUFE, cufe);
		refePedi.setUUID(cufe);

		return refePedi;
	}

	public SupplierPartyType getTerceroProveedor(TipoProveedor terceroProveedor) {

		SupplierPartyType proveedor = new SupplierPartyType();

		proveedor.setAccountingContact(estBasicas.getContacto(terceroProveedor.getContactoContable()));

		AdditionalAccountIDType idCuentaAdcional = new AdditionalAccountIDType();
		estBasicas.getIdentificador(terceroProveedor.getCuentaAdicionalID(), idCuentaAdcional);
		proveedor.setAdditionalAccountID(idCuentaAdcional);

		CustomerAssignedAccountIDType cuentaAsignadaClienteID = new CustomerAssignedAccountIDType();
		estBasicas.getIdentificador(terceroProveedor.getCuentaAsignadaClienteID(), cuentaAsignadaClienteID);
		proveedor.setCustomerAssignedAccountID(cuentaAsignadaClienteID);

		DataSendingCapabilityType capacidadEnvioDatos = new DataSendingCapabilityType();
		estBasicas.getTexto(terceroProveedor.getCapacidadEnvioDatos(), capacidadEnvioDatos);
		proveedor.setDataSendingCapability(capacidadEnvioDatos);

		proveedor.setDespatchContact(estBasicas.getContacto(terceroProveedor.getContactoDespacho()));
		proveedor.setParty(estBasicas.getTerceroDIAN(terceroProveedor.getTercero()));
		proveedor.setSellerContact(estBasicas.getContacto(terceroProveedor.getContactoVendedor()));

		return proveedor;
	}

	public CustomerPartyType getTerceroCliente(TipoClienteTercero terceroCliente) {

		CustomerPartyType cliente = new CustomerPartyType();

		cliente.setAccountingContact(estBasicas.getContacto(terceroCliente.getContactoContable()));

		AdditionalAccountIDType idCuentaAdcional = new AdditionalAccountIDType();

		estBasicas.getIdentificador(terceroCliente.getCuentaAdicionalID(), idCuentaAdcional);
		cliente.setAdditionalAccountID(idCuentaAdcional);

		CustomerAssignedAccountIDType cuentaAsignadaClienteID = new CustomerAssignedAccountIDType();
		estBasicas.getIdentificador(terceroCliente.getCuentaAsignadaClienteID(), cuentaAsignadaClienteID);
		cliente.setCustomerAssignedAccountID(cuentaAsignadaClienteID);

		cliente.setParty(estBasicas.getTerceroDIAN(terceroCliente.getTercero()));

		cliente.setBuyerContact(estBasicas.getContacto(terceroCliente.getContactoComprador()));

		cliente.setDeliveryContact(estBasicas.getContacto(terceroCliente.getContactoEntrega()));

		SupplierAssignedAccountIDType cuentaAsignadaProveedorID = new SupplierAssignedAccountIDType();
		estBasicas.getIdentificador(terceroCliente.getCuentaAsignadaProveedorID(), cuentaAsignadaProveedorID);
		cliente.setSupplierAssignedAccountID(cuentaAsignadaProveedorID);

		return cliente;
	}

	private co.gov.dian.contratos.facturaelectronica.v1.AddressType getDireccion2(TipoDireccion tipoDireccion) {

		co.gov.dian.contratos.facturaelectronica.v1.AddressType direccion = new co.gov.dian.contratos.facturaelectronica.v1.AddressType();

		IDType id = new IDType();
		estBasicas.getIdentificador(tipoDireccion.getID(), id);
		direccion.setID(id);

		AddressTypeCodeType tipoCodigoDireccion = new AddressTypeCodeType();
		estBasicas.getCodigo(tipoDireccion.getTipoCodigoDireccion(), tipoCodigoDireccion);
		direccion.setAddressTypeCode(tipoCodigoDireccion);

		AddressFormatCodeType formatoCodigoDireccion = new AddressFormatCodeType();
		estBasicas.getCodigo(tipoDireccion.getTipoCodigoDireccion(), formatoCodigoDireccion);
		direccion.setAddressFormatCode(formatoCodigoDireccion);

		PostboxType buzon = new PostboxType();
		estBasicas.getTexto(tipoDireccion.getBuzon(), buzon);
		direccion.setPostbox(buzon);

		FloorType piso = new FloorType();
		estBasicas.getTexto(tipoDireccion.getPiso(), piso);
		direccion.setFloor(piso);

		RoomType cuarto = new RoomType();
		estBasicas.getTexto(tipoDireccion.getCuarto(), cuarto);
		direccion.setRoom(cuarto);

		StreetNameType nombreCalle = new StreetNameType();
		estBasicas.getNombre(tipoDireccion.getNombreCalle(), nombreCalle);
		direccion.setStreetName(nombreCalle);

		AdditionalStreetNameType nombreCalleAdicional = new AdditionalStreetNameType();
		estBasicas.getNombre(tipoDireccion.getNombreCalleAdicional(), nombreCalleAdicional);
		direccion.setAdditionalStreetName(nombreCalleAdicional);

		BlockNameType nombreBloque = new BlockNameType();
		estBasicas.getNombre(tipoDireccion.getNombreBloque(), nombreBloque);
		direccion.setBlockName(nombreBloque);

		BuildingNameType nombreEdificio = new BuildingNameType();
		estBasicas.getNombre(tipoDireccion.getNombreEdificio(), nombreEdificio);
		direccion.setBuildingName(nombreEdificio);

		BuildingNumberType numeroEdificio = new BuildingNumberType();
		estBasicas.getTexto(tipoDireccion.getNumeroEdificio(), numeroEdificio);
		direccion.setBuildingNumber(numeroEdificio);

		InhouseMailType correoInterno = new InhouseMailType();
		estBasicas.getTexto(tipoDireccion.getCorreoInterno(), correoInterno);
		direccion.setInhouseMail(correoInterno);

		DepartmentType departamento = new DepartmentType();
		estBasicas.getTexto(tipoDireccion.getDepartamento(), departamento);
		direccion.setDepartment(departamento);

		MarkAttentionType marcaAtencion = new MarkAttentionType();
		estBasicas.getTexto(tipoDireccion.getMarcaAtencion(), marcaAtencion);
		direccion.setMarkAttention(marcaAtencion);

		PlotIdentificationType identificacionParcela = new PlotIdentificationType();
		estBasicas.getTexto(tipoDireccion.getIdentificacionParcela(), identificacionParcela);
		direccion.setPlotIdentification(identificacionParcela);

		CitySubdivisionNameType nombreSubdivisionCiudad = new CitySubdivisionNameType();
		estBasicas.getNombre(tipoDireccion.getNombreSubdivisionCiudad(), nombreSubdivisionCiudad);
		direccion.setCitySubdivisionName(nombreSubdivisionCiudad);

		CityNameType nombreCiudad = new CityNameType();
		estBasicas.getNombre(tipoDireccion.getNombreCiudad(), nombreCiudad);
		direccion.setCityName(nombreCiudad);

		PostalZoneType zonaPostal = new PostalZoneType();
		estBasicas.getTexto(tipoDireccion.getZonaPostal(), zonaPostal);
		direccion.setPostalZone(zonaPostal);

		CountrySubentityType subentidadPais = new CountrySubentityType();
		estBasicas.getTexto(tipoDireccion.getSubentidadPais(), subentidadPais);
		direccion.setCountrySubentity(subentidadPais);

		CountrySubentityCodeType codigoSubentidadesPais = new CountrySubentityCodeType();
		estBasicas.getCodigo(tipoDireccion.getCodigoSubentidadesPais(), codigoSubentidadesPais);
		direccion.setCountrySubentityCode(codigoSubentidadesPais);

		RegionType region = new RegionType();
		estBasicas.getTexto(tipoDireccion.getRegion(), region);
		direccion.setRegion(region);

		DistrictType distrito = new DistrictType();
		estBasicas.getTexto(tipoDireccion.getDistrito(), distrito);
		direccion.setDistrict(distrito);

		TimezoneOffsetType zonaHorariaOffset = new TimezoneOffsetType();
		estBasicas.getTexto(tipoDireccion.getZonaHorariaOffset(), zonaHorariaOffset);
		direccion.setTimezoneOffset(zonaHorariaOffset);

		for (TipoTexto lineaDirecciones : tipoDireccion.getLineaDireccion()) {

			AddressLineType lineaDireccion = new AddressLineType();
			estBasicas.getLineaDireccion(lineaDirecciones, lineaDireccion);
			direccion.getAddressLine().add(lineaDireccion);

		}

		direccion.setCountry(estBasicas.getPais(tipoDireccion.getPais()));
		direccion.setLocationCoordinate(estBasicas.getCoordenadasUbicacion(tipoDireccion.getCoordenadasUbicacion()));
		return direccion;
	}

	private AddressType getDireccion(TipoDireccion tipoDireccion) {

		AddressType direccion = new AddressType();

		IDType id = new IDType();
		estBasicas.getIdentificador(tipoDireccion.getID(), id);
		direccion.setID(id);

		AddressTypeCodeType tipoCodigoDireccion = new AddressTypeCodeType();
		estBasicas.getCodigo(tipoDireccion.getTipoCodigoDireccion(), tipoCodigoDireccion);
		direccion.setAddressTypeCode(tipoCodigoDireccion);

		AddressFormatCodeType formatoCodigoDireccion = new AddressFormatCodeType();
		estBasicas.getCodigo(tipoDireccion.getTipoCodigoDireccion(), formatoCodigoDireccion);
		direccion.setAddressFormatCode(formatoCodigoDireccion);

		PostboxType buzon = new PostboxType();
		estBasicas.getTexto(tipoDireccion.getBuzon(), buzon);
		direccion.setPostbox(buzon);

		FloorType piso = new FloorType();
		estBasicas.getTexto(tipoDireccion.getPiso(), piso);
		direccion.setFloor(piso);

		RoomType cuarto = new RoomType();
		estBasicas.getTexto(tipoDireccion.getCuarto(), cuarto);
		direccion.setRoom(cuarto);

		StreetNameType nombreCalle = new StreetNameType();
		estBasicas.getNombre(tipoDireccion.getNombreCalle(), nombreCalle);
		direccion.setStreetName(nombreCalle);

		AdditionalStreetNameType nombreCalleAdicional = new AdditionalStreetNameType();
		estBasicas.getNombre(tipoDireccion.getNombreCalleAdicional(), nombreCalleAdicional);
		direccion.setAdditionalStreetName(nombreCalleAdicional);

		BlockNameType nombreBloque = new BlockNameType();
		estBasicas.getNombre(tipoDireccion.getNombreBloque(), nombreBloque);
		direccion.setBlockName(nombreBloque);

		BuildingNameType nombreEdificio = new BuildingNameType();
		estBasicas.getNombre(tipoDireccion.getNombreEdificio(), nombreEdificio);
		direccion.setBuildingName(nombreEdificio);

		BuildingNumberType numeroEdificio = new BuildingNumberType();
		estBasicas.getTexto(tipoDireccion.getNumeroEdificio(), numeroEdificio);
		direccion.setBuildingNumber(numeroEdificio);

		InhouseMailType correoInterno = new InhouseMailType();
		estBasicas.getTexto(tipoDireccion.getCorreoInterno(), correoInterno);
		direccion.setInhouseMail(correoInterno);

		DepartmentType departamento = new DepartmentType();
		estBasicas.getTexto(tipoDireccion.getDepartamento(), departamento);
		direccion.setDepartment(departamento);

		MarkAttentionType marcaAtencion = new MarkAttentionType();
		estBasicas.getTexto(tipoDireccion.getMarcaAtencion(), marcaAtencion);
		direccion.setMarkAttention(marcaAtencion);

		PlotIdentificationType identificacionParcela = new PlotIdentificationType();
		estBasicas.getTexto(tipoDireccion.getIdentificacionParcela(), identificacionParcela);
		direccion.setPlotIdentification(identificacionParcela);

		CitySubdivisionNameType nombreSubdivisionCiudad = new CitySubdivisionNameType();
		estBasicas.getNombre(tipoDireccion.getNombreSubdivisionCiudad(), nombreSubdivisionCiudad);
		direccion.setCitySubdivisionName(nombreSubdivisionCiudad);

		CityNameType nombreCiudad = new CityNameType();
		estBasicas.getNombre(tipoDireccion.getNombreCiudad(), nombreCiudad);
		direccion.setCityName(nombreCiudad);

		PostalZoneType zonaPostal = new PostalZoneType();
		estBasicas.getTexto(tipoDireccion.getZonaPostal(), zonaPostal);
		direccion.setPostalZone(zonaPostal);

		CountrySubentityType subentidadPais = new CountrySubentityType();
		estBasicas.getTexto(tipoDireccion.getSubentidadPais(), subentidadPais);
		direccion.setCountrySubentity(subentidadPais);

		CountrySubentityCodeType codigoSubentidadesPais = new CountrySubentityCodeType();
		estBasicas.getCodigo(tipoDireccion.getCodigoSubentidadesPais(), codigoSubentidadesPais);
		direccion.setCountrySubentityCode(codigoSubentidadesPais);

		RegionType region = new RegionType();
		estBasicas.getTexto(tipoDireccion.getRegion(), region);
		direccion.setRegion(region);

		DistrictType distrito = new DistrictType();
		estBasicas.getTexto(tipoDireccion.getDistrito(), distrito);
		direccion.setDistrict(distrito);

		TimezoneOffsetType zonaHorariaOffset = new TimezoneOffsetType();
		estBasicas.getTexto(tipoDireccion.getZonaHorariaOffset(), zonaHorariaOffset);
		direccion.setTimezoneOffset(zonaHorariaOffset);

		for (TipoTexto lineaDirecciones : tipoDireccion.getLineaDireccion()) {

			AddressLineType lineaDireccion = new AddressLineType();
			estBasicas.getLineaDireccion(lineaDirecciones, lineaDireccion);
			direccion.getAddressLine().add(lineaDireccion);

		}

		direccion.setCountry(estBasicas.getPais(tipoDireccion.getPais()));
		direccion.setLocationCoordinate(estBasicas.getCoordenadasUbicacion(tipoDireccion.getCoordenadasUbicacion()));
		return direccion;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType getTerceroComprador(
			TipoClienteTercero terceroComprador) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType comprador = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType();

		comprador.setAccountingContact(estBasicas.getContacto(terceroComprador.getContactoContable()));
		comprador.setBuyerContact(estBasicas.getContacto(terceroComprador.getContactoComprador()));

		CustomerAssignedAccountIDType cuentaAsignadaClienteID = new CustomerAssignedAccountIDType();
		estBasicas.getIdentificador(terceroComprador.getCuentaAsignadaClienteID(), cuentaAsignadaClienteID);
		comprador.setCustomerAssignedAccountID(cuentaAsignadaClienteID);

		comprador.setDeliveryContact(estBasicas.getContacto(terceroComprador.getContactoEntrega()));

		comprador.setParty(estBasicas.getTercero(terceroComprador.getTercero()));

		SupplierAssignedAccountIDType cuentaAsignadaProveedorID = new SupplierAssignedAccountIDType();
		estBasicas.getIdentificador(terceroComprador.getCuentaAsignadaProveedorID(), cuentaAsignadaProveedorID);
		comprador.setSupplierAssignedAccountID(cuentaAsignadaProveedorID);

		AdditionalAccountIDType cuentaAdicionalID = new AdditionalAccountIDType();
		estBasicas.getIdentificador(terceroComprador.getCuentaAdicionalID(), cuentaAdicionalID);
		comprador.getAdditionalAccountID().add(cuentaAdicionalID);

		return comprador;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType getTerceroProveedorVendedor(
			TipoProveedor terceroProveedorVendedor) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType proveedorVendedor = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType();

		CustomerAssignedAccountIDType cuentaAsignadaClienteID = new CustomerAssignedAccountIDType();
		estBasicas.getIdentificador(terceroProveedorVendedor.getCuentaAsignadaClienteID(), cuentaAsignadaClienteID);
		proveedorVendedor.setCustomerAssignedAccountID(cuentaAsignadaClienteID);

		AdditionalAccountIDType cuentaAdicionalID = new AdditionalAccountIDType();
		estBasicas.getIdentificador(terceroProveedorVendedor.getCuentaAdicionalID(), cuentaAdicionalID);
		proveedorVendedor.getAdditionalAccountID().add(cuentaAdicionalID);

		DataSendingCapabilityType capacidadEnvioDatos = new DataSendingCapabilityType();
		estBasicas.getTexto(terceroProveedorVendedor.getCapacidadEnvioDatos(), capacidadEnvioDatos);
		proveedorVendedor.setDataSendingCapability(capacidadEnvioDatos);

		proveedorVendedor.setParty(estBasicas.getTercero(terceroProveedorVendedor.getTercero()));

		proveedorVendedor.setDespatchContact(estBasicas.getContacto(terceroProveedorVendedor.getContactoDespacho()));

		proveedorVendedor.setAccountingContact(estBasicas.getContacto(terceroProveedorVendedor.getContactoContable()));

		proveedorVendedor.setSellerContact(estBasicas.getContacto(terceroProveedorVendedor.getContactoVendedor()));

		return proveedorVendedor;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType getCondicionesDeEntrega2(
			TipoEntrega entrega) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType e = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType();

		IDType id = new IDType();
		estBasicas.getIdentificador(entrega.getID(), id);
		e.setID(id);

		QuantityType cantidad = new QuantityType();
		estBasicas.getCantidad(entrega.getCantidad(), cantidad);
		e.setQuantity(cantidad);

		MinimumQuantityType cantidadMinima = new MinimumQuantityType();
		estBasicas.getCantidad(entrega.getCantidadMinima(), cantidadMinima);
		e.setMinimumQuantity(cantidadMinima);

		MaximumQuantityType cantidadMaxima = new MaximumQuantityType();
		estBasicas.getCantidad(entrega.getCantidadMaxima(), cantidadMaxima);
		e.setMaximumQuantity(cantidadMaxima);

		ActualDeliveryDateType fechaActualEntrega = new ActualDeliveryDateType();
		fechaActualEntrega.setValue(entrega.getFechaActualEntrega());
		e.setActualDeliveryDate(fechaActualEntrega);

		ActualDeliveryTimeType horaActualEntrega = new ActualDeliveryTimeType();
		horaActualEntrega.setValue(entrega.getHoraActualEntrega());
		e.setActualDeliveryTime(horaActualEntrega);

		LatestDeliveryDateType fechaUltimaEntrega = new LatestDeliveryDateType();
		fechaUltimaEntrega.setValue(entrega.getFechaUltimaEntrega());
		e.setLatestDeliveryDate(fechaUltimaEntrega);

		LatestDeliveryTimeType horaUltimaEntrega = new LatestDeliveryTimeType();
		horaUltimaEntrega.setValue(entrega.getHoraUltimaEntrega());
		e.setLatestDeliveryTime(horaUltimaEntrega);

		TrackingIDType iDSeguimiento = new TrackingIDType();
		estBasicas.getIdentificador(entrega.getIDSeguimiento(), iDSeguimiento);
		e.setTrackingID(iDSeguimiento);

		e.setDeliveryAddress(getDireccion(entrega.getDireccionEntrega()));

		e.setDeliveryLocation(estBasicas.getUbicacionFisica2(entrega.getUbicacionEntrega()));
		PeriodType plazoEntregaSolicitado = new PeriodType();
		estBasicas.getPeriodo(entrega.getPlazoEntregaSolicitado(), plazoEntregaSolicitado);
		e.setRequestedDeliveryPeriod(plazoEntregaSolicitado);

		PeriodType plazoEntregaPrometido = new PeriodType();
		estBasicas.getPeriodo(entrega.getPlazoEntregaPrometido(), plazoEntregaPrometido);
		e.setPromisedDeliveryPeriod(plazoEntregaPrometido);

		PeriodType plazoEntregaEstimado = new PeriodType();
		estBasicas.getPeriodo(entrega.getPlazoEntregaEstimado(), plazoEntregaEstimado);
		e.setEstimatedDeliveryPeriod(plazoEntregaEstimado);

		e.setDeliveryParty(estBasicas.getTercero(entrega.getEntregaTercero()));

		e.setDespatch(estBasicas.getDespacho2(entrega.getDespacho()));

		return e;
	}

	public DeliveryType getCondicionesDeEntrega(TipoEntrega entrega) {

		DeliveryType e = new DeliveryType();

		IDType id = new IDType();
		estBasicas.getIdentificador(entrega.getID(), id);
		e.setID(id);

		QuantityType cantidad = new QuantityType();
		estBasicas.getCantidad(entrega.getCantidad(), cantidad);
		e.setQuantity(cantidad);

		MinimumQuantityType cantidadMinima = new MinimumQuantityType();
		estBasicas.getCantidad(entrega.getCantidadMinima(), cantidadMinima);
		e.setMinimumQuantity(cantidadMinima);

		MaximumQuantityType cantidadMaxima = new MaximumQuantityType();
		estBasicas.getCantidad(entrega.getCantidadMaxima(), cantidadMaxima);
		e.setMaximumQuantity(cantidadMaxima);

		ActualDeliveryDateType fechaActualEntrega = new ActualDeliveryDateType();
		fechaActualEntrega.setValue(entrega.getFechaActualEntrega());
		e.setActualDeliveryDate(fechaActualEntrega);

		ActualDeliveryTimeType horaActualEntrega = new ActualDeliveryTimeType();
		horaActualEntrega.setValue(entrega.getHoraActualEntrega());
		e.setActualDeliveryTime(horaActualEntrega);

		LatestDeliveryDateType fechaUltimaEntrega = new LatestDeliveryDateType();
		fechaUltimaEntrega.setValue(entrega.getFechaUltimaEntrega());
		e.setLatestDeliveryDate(fechaUltimaEntrega);

		LatestDeliveryTimeType horaUltimaEntrega = new LatestDeliveryTimeType();
		horaUltimaEntrega.setValue(entrega.getHoraUltimaEntrega());
		e.setLatestDeliveryTime(horaUltimaEntrega);

		TrackingIDType iDSeguimiento = new TrackingIDType();
		estBasicas.getIdentificador(entrega.getIDSeguimiento(), iDSeguimiento);
		e.setTrackingID(iDSeguimiento);

		e.setDeliveryAddress(getDireccion2(entrega.getDireccionEntrega()));

		e.setDeliveryLocation(estBasicas.getUbicacionFisica(entrega.getUbicacionEntrega()));
		PeriodType plazoEntregaSolicitado = new PeriodType();
		estBasicas.getPeriodo(entrega.getPlazoEntregaSolicitado(), plazoEntregaSolicitado);
		e.setRequestedDeliveryPeriod(plazoEntregaSolicitado);

		PeriodType plazoEntregaPrometido = new PeriodType();
		estBasicas.getPeriodo(entrega.getPlazoEntregaPrometido(), plazoEntregaPrometido);
		e.setPromisedDeliveryPeriod(plazoEntregaPrometido);

		PeriodType plazoEntregaEstimado = new PeriodType();
		estBasicas.getPeriodo(entrega.getPlazoEntregaEstimado(), plazoEntregaEstimado);
		e.setEstimatedDeliveryPeriod(plazoEntregaEstimado);

		e.setDeliveryParty(estBasicas.getTerceroDIAN(entrega.getEntregaTercero()));

		e.setDespatch(estBasicas.getDespacho(entrega.getDespacho()));

		return e;
	}

	public DeliveryTermsType getTerminosEntrega(TipoTerminosEntrega terminosEntrega) {

		DeliveryTermsType termEntr = new DeliveryTermsType();

		termEntr.setAllowanceCharge(estBasicas.getCargos(terminosEntrega.getCargo()));
		termEntr.setDeliveryLocation(estBasicas.getUbicacionFisica2(terminosEntrega.getUbicacionEntrega()));
		IDType id = new IDType();
		estBasicas.getIdentificador(terminosEntrega.getID(), id);
		termEntr.setID(id);
		LossRiskType riesgoPerdida = new LossRiskType();
		estBasicas.getTexto(terminosEntrega.getRiesgoPerdida(), riesgoPerdida);
		termEntr.setLossRisk(riesgoPerdida);

		LossRiskResponsibilityCodeType codigoResponsableRiesgoPerdida = new LossRiskResponsibilityCodeType();
		estBasicas.getCodigo(terminosEntrega.getCodigoResponsableRiesgoPerdida(), codigoResponsableRiesgoPerdida);
		termEntr.setLossRiskResponsibilityCode(codigoResponsableRiesgoPerdida);

		SpecialTermsType terminosEspeciales = new SpecialTermsType();
		estBasicas.getTexto(terminosEntrega.getTerminosEspeciales(), terminosEspeciales);
		termEntr.setSpecialTerms(terminosEspeciales);

		return termEntr;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType getTerminosEntrega2(
			TipoTerminosEntrega terminosEntrega) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType termEntr = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType();

		termEntr.setAllowanceCharge(estBasicas.getCargos(terminosEntrega.getCargo()));
		termEntr.setDeliveryLocation(estBasicas.getUbicacionFisica2(terminosEntrega.getUbicacionEntrega()));
		IDType id = new IDType();
		estBasicas.getIdentificador(terminosEntrega.getID(), id);
		termEntr.setID(id);
		LossRiskType riesgoPerdida = new LossRiskType();
		estBasicas.getTexto(terminosEntrega.getRiesgoPerdida(), riesgoPerdida);
		termEntr.setLossRisk(riesgoPerdida);

		LossRiskResponsibilityCodeType codigoResponsableRiesgoPerdida = new LossRiskResponsibilityCodeType();
		estBasicas.getCodigo(terminosEntrega.getCodigoResponsableRiesgoPerdida(), codigoResponsableRiesgoPerdida);
		termEntr.setLossRiskResponsibilityCode(codigoResponsableRiesgoPerdida);

		SpecialTermsType terminosEspeciales = new SpecialTermsType();
		estBasicas.getTexto(terminosEntrega.getTerminosEspeciales(), terminosEspeciales);
		termEntr.setSpecialTerms(terminosEspeciales);

		return termEntr;
	}

	public PaymentMeansType getMedioDePago(TipoMedioPago medioDePago) {

		PaymentMeansType mediosDePago = new PaymentMeansType();

		mediosDePago.setCardAccount(estBasicas.getcuentaTarjeta(medioDePago.getCuentaTarjeta()));

		mediosDePago.setCreditAccount(estBasicas.getCuentaCredito(medioDePago.getCuentaCredito()));

		IDType id = new IDType();
		estBasicas.getIdentificador(medioDePago.getId(), id);
		mediosDePago.setID(id);

		InstructionIDType ordenID = new InstructionIDType();
		estBasicas.getIdentificador(medioDePago.getOrdenID(), ordenID);
		mediosDePago.setInstructionID(ordenID);

		mediosDePago.setPayeeFinancialAccount(
				estBasicas.getCuentaContribuyenteBeneficiario(medioDePago.getCuentaContribuyenteBeneficiario()));

		mediosDePago.setPayerFinancialAccount(
				estBasicas.getCuentaContribuyenteBeneficiario(medioDePago.getCuentaContribuyenteFinanciero()));

		PaymentChannelCodeType codigoCanalPago = new PaymentChannelCodeType();
		estBasicas.getCodigo(medioDePago.getCodigoCanalPago(), codigoCanalPago);
		mediosDePago.setPaymentChannelCode(codigoCanalPago);

		PaymentDueDateType fechaVencimientoPago = new PaymentDueDateType();
		fechaVencimientoPago.setValue(medioDePago.getFechaVencimientoPago());
		mediosDePago.setPaymentDueDate(fechaVencimientoPago);

		PaymentMeansCodeType codigoMedioPago = new PaymentMeansCodeType();
		estBasicas.getCodigo(medioDePago.getCodigoMedioPago(), codigoMedioPago);
		mediosDePago.setPaymentMeansCode(codigoMedioPago);

		for (TipoIdentificador pago : medioDePago.getIDPago()) {
			PaymentIDType iDPago = new PaymentIDType();
			estBasicas.getIdentificador(pago, iDPago);
			mediosDePago.getPaymentID().add(iDPago);
		}

		for (TipoTexto orden : medioDePago.getNotaOrden()) {
			InstructionNoteType notaOrden = new InstructionNoteType();
			estBasicas.getTexto(orden, notaOrden);
			mediosDePago.getInstructionNote().add(notaOrden);
		}
		return mediosDePago;
	}

	public PaymentTermsType getTerminoDePago(TipoTerminosPago terminoDePago) {

		PaymentTermsType condicionesDePago = new PaymentTermsType();

		AmountType monto = new AmountType();
		estBasicas.getMonto(terminoDePago.getMonto(), monto);
		condicionesDePago.setAmount(monto);

		IDType id = new IDType();
		estBasicas.getIdentificador(terminoDePago.getID(), id);
		condicionesDePago.setID(id);

		PaymentMeansIDType iDMedioPago = new PaymentMeansIDType();
		estBasicas.getIdentificador(terminoDePago.getIDMedioPago(), iDMedioPago);
		condicionesDePago.setPaymentMeansID(iDMedioPago);

		PeriodType periodoPenalizacion = new PeriodType();
		estBasicas.getPeriodo(terminoDePago.getPeriodoPenalizacion(), periodoPenalizacion);
		condicionesDePago.setPenaltyPeriod(periodoPenalizacion);

		PenaltySurchargePercentType porcentajeRecargoPenal = new PenaltySurchargePercentType();
		porcentajeRecargoPenal.setValue(terminoDePago.getPorcentajeRecargoPenal());
		condicionesDePago.setPenaltySurchargePercent(porcentajeRecargoPenal);

		PrepaidPaymentReferenceIDType iDReferenciaPagoPrepago = new PrepaidPaymentReferenceIDType();
		estBasicas.getIdentificador(terminoDePago.getIDReferenciaPagoPrepago(), iDReferenciaPagoPrepago);
		condicionesDePago.setPrepaidPaymentReferenceID(iDReferenciaPagoPrepago);

		ReferenceEventCodeType codigoReferenciaEvento = new ReferenceEventCodeType();
		estBasicas.getCodigo(terminoDePago.getCodigoReferenciaEvento(), codigoReferenciaEvento);
		condicionesDePago.setReferenceEventCode(codigoReferenciaEvento);

		SettlementDiscountPercentType porcentajeDescuentoLiquidacion = new SettlementDiscountPercentType();
		porcentajeDescuentoLiquidacion.setValue(terminoDePago.getPorcentajeDescuentoLiquidacion());
		condicionesDePago.setSettlementDiscountPercent(porcentajeDescuentoLiquidacion);

		PeriodType periodoLiquidacion = new PeriodType();
		estBasicas.getPeriodo(terminoDePago.getPeriodoLiquidacion(), periodoLiquidacion);
		condicionesDePago.setSettlementPeriod(periodoLiquidacion);
		for (TipoTexto notas : terminoDePago.getNota()) {
			NoteType nota = new NoteType();
			estBasicas.getTexto(notas, nota);
			condicionesDePago.getNote().add(nota);

		}

		return condicionesDePago;
	}

	public PaymentType getPagoAnticipado(TipoPago pagoAnticipado) {

		PaymentType anticipo = new PaymentType();

		IDType id = new IDType();
		estBasicas.getIdentificador(pagoAnticipado.getID(), id);
		anticipo.setID(id);

		InstructionIDType ordenID = new InstructionIDType();
		estBasicas.getIdentificador(pagoAnticipado.getOrdenID(), ordenID);
		anticipo.setInstructionID(ordenID);

		PaidAmountType montoPagado = new PaidAmountType();
		estBasicas.getMonto(pagoAnticipado.getMontoPagado(), montoPagado);
		anticipo.setPaidAmount(montoPagado);

		PaidDateType fechaPago = new PaidDateType();
		fechaPago.setValue(pagoAnticipado.getFechaPago());
		anticipo.setPaidDate(fechaPago);

		PaidTimeType horaPago = new PaidTimeType();
		horaPago.setValue(pagoAnticipado.getHoraPago());
		anticipo.setPaidTime(horaPago);

		ReceivedDateType fechaRecibido = new ReceivedDateType();
		fechaRecibido.setValue(pagoAnticipado.getFechaRecibido());
		anticipo.setReceivedDate(fechaRecibido);

		return anticipo;
	}

	public AllowanceChargeType getCargo(TipoCargo cargo) {

		AllowanceChargeType c = new AllowanceChargeType();

		AccountingCostType CostoContable = new AccountingCostType();
		estBasicas.getTexto(cargo.getCostoContable(), CostoContable);
		c.setAccountingCost(CostoContable);

		AccountingCostCodeType CodigoCostoContable = new AccountingCostCodeType();
		estBasicas.getCodigo(cargo.getCodigoCostoContable(), CodigoCostoContable);
		c.setAccountingCostCode(CodigoCostoContable);

		AllowanceChargeReasonType RazonAsignacionCargo = new AllowanceChargeReasonType();
		estBasicas.getTexto(cargo.getRazonAsignacionCargo(), RazonAsignacionCargo);
		c.setAllowanceChargeReason(RazonAsignacionCargo);

		AllowanceChargeReasonCodeType CodigoRazonAsignacionCargo = new AllowanceChargeReasonCodeType();
		estBasicas.getCodigo(cargo.getCodigoRazonAsignacionCargo(), CodigoRazonAsignacionCargo);
		c.setAllowanceChargeReasonCode(CodigoRazonAsignacionCargo);

		AmountType monto = new AmountType();
		estBasicas.getMonto(cargo.getMonto(), monto);
		c.setAmount(monto);

		BaseAmountType MontoBase = new BaseAmountType();
		estBasicas.getMonto(cargo.getMontoBase(), MontoBase);
		c.setBaseAmount(MontoBase);

		ChargeIndicatorType IndicadorCarga = new ChargeIndicatorType();
		IndicadorCarga.setValue(cargo.isIndicadorCarga());
		c.setChargeIndicator(IndicadorCarga);

		IDType id = new IDType();
		estBasicas.getIdentificador(cargo.getID(), id);
		c.setID(id);

		MultiplierFactorNumericType FactorNumericoMultiplicador = new MultiplierFactorNumericType();
		FactorNumericoMultiplicador.setValue(cargo.getFactorNumericoMultiplicador());
		c.setMultiplierFactorNumeric(FactorNumericoMultiplicador);

		PrepaidIndicatorType IndicadorPagoAdelantado = new PrepaidIndicatorType();
		IndicadorPagoAdelantado.setValue(cargo.isIndicadorPagoAdelantado());
		c.setPrepaidIndicator(IndicadorPagoAdelantado);

		SequenceNumericType SecuenciaNumerica = new SequenceNumericType();
		SecuenciaNumerica.setValue(cargo.getSecuenciaNumerica());
		c.setSequenceNumeric(SecuenciaNumerica);

		c.setTaxTotal(estBasicas.getImpues(cargo.getImpuestoTotal()));

		for (TipoMedioPago medioPago : cargo.getMedioPago()) {
			PaymentMeansType MedioPago = new PaymentMeansType();
			estBasicas.getMedioDePago(medioPago, MedioPago);
			c.getPaymentMeans().add(MedioPago);
		}

		for (TipoImpuestoCategoria impuestos : cargo.getCategoriaImpuesto()) {
			c.getTaxCategory().add(estBasicas.getImpuestoCategoria(impuestos));
		}

		return c;
	}

	public ExchangeRateType getTasaCambioPago(TipoTasaCambio tasaCambioPago) {

		ExchangeRateType tasaDeCambio = new ExchangeRateType();

		CalculationRateType tasaCalculada = new CalculationRateType();
		tasaCalculada.setValue(tasaCambioPago.getTasaCalculada());
		tasaDeCambio.setCalculationRate(tasaCalculada);

		DateType fecha = new DateType();
		fecha.setValue(tasaCambioPago.getFecha());
		tasaDeCambio.setDate(fecha);

		ExchangeMarketIDType iDIntercambioMercado = new ExchangeMarketIDType();
		estBasicas.getIdentificador(tasaCambioPago.getIDIntercambioMercado(), iDIntercambioMercado);
		tasaDeCambio.setExchangeMarketID(iDIntercambioMercado);

		tasaDeCambio
				.setForeignExchangeContract(getContratoMonedaExtranjera(tasaCambioPago.getContratoMonedaExtranjera()));

		MathematicOperatorCodeType codigoOperadorMatematico = new MathematicOperatorCodeType();
		estBasicas.getCodigo(tasaCambioPago.getCodigoOperadorMatematico(), codigoOperadorMatematico);
		tasaDeCambio.setMathematicOperatorCode(codigoOperadorMatematico);

		SourceCurrencyBaseRateType tasaBaseModenaFuente = new SourceCurrencyBaseRateType();
		tasaBaseModenaFuente.setValue(tasaCambioPago.getTasaBaseModenaFuente());
		tasaDeCambio.setSourceCurrencyBaseRate(tasaBaseModenaFuente);

		SourceCurrencyCodeType codigoMoneda = new SourceCurrencyCodeType();
		estBasicas.getCodigo(tasaCambioPago.getCodigoMonedaFuente(), codigoMoneda);
		tasaDeCambio.setSourceCurrencyCode(codigoMoneda);

		TargetCurrencyBaseRateType tasaBaseMonedaObjetivo = new TargetCurrencyBaseRateType();
		tasaBaseMonedaObjetivo.setValue(tasaCambioPago.getTasaBaseMonedaObjetivo());
		tasaDeCambio.setTargetCurrencyBaseRate(tasaBaseMonedaObjetivo);

		TargetCurrencyCodeType codigoMonedaObjetivo = new TargetCurrencyCodeType();
		estBasicas.getCodigo(tasaCambioPago.getCodigoMonedaObjetivo(), codigoMonedaObjetivo);
		tasaDeCambio.setTargetCurrencyCode(codigoMonedaObjetivo);

		return tasaDeCambio;
	}

	private ContractType getContratoMonedaExtranjera(TipoContrato contratoMonedaExtranjera) {

		ContractType monedaExtranjera = new ContractType();

		ContractTypeType TipoContrato = new ContractTypeType();
		estBasicas.getTexto(contratoMonedaExtranjera.getTipoContrato(), TipoContrato);
		monedaExtranjera.setContractType(TipoContrato);

		ContractTypeCodeType TipoCodigoContrato = new ContractTypeCodeType();
		estBasicas.getCodigo(contratoMonedaExtranjera.getTipoCodigoContrato(), TipoCodigoContrato);
		monedaExtranjera.setContractTypeCode(TipoCodigoContrato);

		IDType id = new IDType();
		estBasicas.getIdentificador(contratoMonedaExtranjera.getID(), id);
		monedaExtranjera.setID(id);

		IssueDateType FechaEmision = new IssueDateType();
		FechaEmision.setValue(contratoMonedaExtranjera.getFechaEmision());
		monedaExtranjera.setIssueDate(FechaEmision);

		IssueTimeType HoraEmision = new IssueTimeType();
		HoraEmision.setValue(contratoMonedaExtranjera.getHoraEmision());
		monedaExtranjera.setIssueTime(HoraEmision);

		PeriodType PeriodoValidez = new PeriodType();
		estBasicas.getPeriodo(contratoMonedaExtranjera.getPeriodoValidez(), PeriodoValidez);
		monedaExtranjera.setValidityPeriod(PeriodoValidez);

		for (TipoDocumentoReferencia contrato : contratoMonedaExtranjera.getDocumentoReferenciaContrato()) {

			monedaExtranjera.getContractDocumentReference().add(estBasicas.getDocumentoReferencia(contrato));
		}

		return monedaExtranjera;
	}

	public TaxTotalType getTotalImpuesto(TipoImpuestoTotal totalImpuesto) {

		TaxTotalType impuestos = new TaxTotalType();

		RoundingAmountType montoRedondeado = new RoundingAmountType();
		estBasicas.getMonto(totalImpuesto.getMontoRedondeado(), montoRedondeado);
		impuestos.setRoundingAmount(montoRedondeado);

		TaxAmountType montoImpuesto = new TaxAmountType();
		estBasicas.getMonto(totalImpuesto.getMontoImpuesto(), montoImpuesto);
		impuestos.setTaxAmount(montoImpuesto);

		TaxEvidenceIndicatorType indicadorEvidenciaImpuesto = new TaxEvidenceIndicatorType();
		indicadorEvidenciaImpuesto.setValue(totalImpuesto.isIndicadorEvidenciaImpuesto());
		impuestos.setTaxEvidenceIndicator(indicadorEvidenciaImpuesto);

		for (TipoSubtotalImpuesto impuesto : totalImpuesto.getSubtotalImpuesto()) {
			impuestos.getTaxSubtotal().add(estBasicas.getSubtotalImpuesto(impuesto));

		}

		return impuestos;
	}

	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType getTotalImpuesto2(
			TipoImpuestoTotal totalImpuesto) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType impuestos = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType();

		RoundingAmountType montoRedondeado = new RoundingAmountType();
		estBasicas.getMonto(totalImpuesto.getMontoRedondeado(), montoRedondeado);
		impuestos.setRoundingAmount(montoRedondeado);

		TaxAmountType montoImpuesto = new TaxAmountType();
		estBasicas.getMonto(totalImpuesto.getMontoImpuesto(), montoImpuesto);
		impuestos.setTaxAmount(montoImpuesto);

		TaxEvidenceIndicatorType indicadorEvidenciaImpuesto = new TaxEvidenceIndicatorType();
		indicadorEvidenciaImpuesto.setValue(totalImpuesto.isIndicadorEvidenciaImpuesto());
		impuestos.setTaxEvidenceIndicator(indicadorEvidenciaImpuesto);

		for (TipoSubtotalImpuesto impuesto : totalImpuesto.getSubtotalImpuesto()) {
			impuestos.getTaxSubtotal().add(getSubtotalImpuesto2(impuesto));

		}

		return impuestos;

	}

	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType getSubtotalImpuesto2(
			TipoSubtotalImpuesto impuesto) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType subTotalImpuestos = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType();

		BaseUnitMeasureType baseUnidadMedida = new BaseUnitMeasureType();
		estBasicas.getMedida(impuesto.getBaseUnidadMedida(), baseUnidadMedida);
		subTotalImpuestos.setBaseUnitMeasure(baseUnidadMedida);

		CalculationSequenceNumericType calculoSecuenciaNumerica = new CalculationSequenceNumericType();
		calculoSecuenciaNumerica.setValue(impuesto.getCalculoSecuenciaNumerica());
		subTotalImpuestos.setCalculationSequenceNumeric(calculoSecuenciaNumerica);

		PercentType porcentaje = new PercentType();
		porcentaje.setValue(impuesto.getPorcentaje());
		subTotalImpuestos.setPercent(porcentaje);

		PerUnitAmountType montoPorUnidad = new PerUnitAmountType();
		estBasicas.getMonto(impuesto.getMontoPorUnidad(), montoPorUnidad);
		subTotalImpuestos.setPerUnitAmount(montoPorUnidad);

		TaxableAmountType montoGravable = new TaxableAmountType();
		estBasicas.getMonto(impuesto.getMontoGravable(), montoGravable);
		subTotalImpuestos.setTaxableAmount(montoGravable);

		TaxAmountType montoImpuesto = new TaxAmountType();
		estBasicas.getMonto(impuesto.getMontoImpuesto(), montoImpuesto);
		subTotalImpuestos.setTaxAmount(montoImpuesto);

		subTotalImpuestos.setTaxCategory(estBasicas.getImpuestoCategoria(impuesto.getImpuestoCategoria()));

		TierRangeType nivelRango = new TierRangeType();
		estBasicas.getTexto(impuesto.getNivelRango(), nivelRango);
		subTotalImpuestos.setTierRange(nivelRango);

		TierRatePercentType porcentajeNivelRango = new TierRatePercentType();
		porcentajeNivelRango.setValue(impuesto.getPorcentajeNivelRango());
		subTotalImpuestos.setTierRatePercent(porcentajeNivelRango);

		TransactionCurrencyTaxAmountType montoImpuestoMonedaTransaccion = new TransactionCurrencyTaxAmountType();
		estBasicas.getMonto(impuesto.getMontoImpuestoMonedaTransaccion(), montoImpuestoMonedaTransaccion);
		subTotalImpuestos.setTransactionCurrencyTaxAmount(montoImpuestoMonedaTransaccion);

		return subTotalImpuestos;
	}

	public MonetaryTotalType getTotales(TipoTotalMonetarioLegal totales) {

		MonetaryTotalType total = new MonetaryTotalType();

		AllowanceTotalAmountType montoTotalPermitido = new AllowanceTotalAmountType();
		estBasicas.getMonto(totales.getMontoTotalPermitido(), montoTotalPermitido);
		total.setAllowanceTotalAmount(montoTotalPermitido);

		ChargeTotalAmountType montoTotalCargado = new ChargeTotalAmountType();
		estBasicas.getMonto(totales.getMontoTotalCargado(), montoTotalCargado);
		total.setChargeTotalAmount(montoTotalCargado);

		LineExtensionAmountType montoExtensionLinea = new LineExtensionAmountType();
		estBasicas.getMonto(totales.getMontoExtensionLinea(), montoExtensionLinea);
		total.setLineExtensionAmount(montoExtensionLinea);

		PayableAmountType montoPagado = new PayableAmountType();
		estBasicas.getMonto(totales.getMontoPagado(), montoPagado);
		total.setPayableAmount(montoPagado);

		PayableRoundingAmountType montoRedondeadoPagado = new PayableRoundingAmountType();
		estBasicas.getMonto(totales.getMontoRedondeadoPagado(), montoRedondeadoPagado);
		total.setPayableRoundingAmount(montoRedondeadoPagado);

		PrepaidAmountType montoPagadoPorAdelantado = new PrepaidAmountType();
		estBasicas.getMonto(totales.getMontoPagadoPorAdelantado(), montoPagadoPorAdelantado);
		total.setPrepaidAmount(montoPagadoPorAdelantado);

		TaxExclusiveAmountType montoExclusivoImpuesto = new TaxExclusiveAmountType();
		estBasicas.getMonto(totales.getMontoExclusivoImpuesto(), montoExclusivoImpuesto);
		total.setTaxExclusiveAmount(montoExclusivoImpuesto);

		TaxInclusiveAmountType montoIncluyendoImpuesto = new TaxInclusiveAmountType();
		estBasicas.getMonto(totales.getMontoIncluyendoImpuesto(), montoIncluyendoImpuesto);
		total.setTaxInclusiveAmount(montoIncluyendoImpuesto);

		return total;
	}

	public InvoiceLineType getDetalleFactura(TipoDetalleFactura detalleFactura) {

		InvoiceLineType detalle = new InvoiceLineType();

		IDType id = new IDType();
		estBasicas.getIdentificador(detalleFactura.getID(), id);
		detalle.setID(id);

		UUIDType uuid = new UUIDType();
		estBasicas.getIdentificador(detalleFactura.getUUID(), uuid);
		detalle.setUUID(uuid);

		NoteType nota = new NoteType();
		estBasicas.getTexto(detalleFactura.getNota(), nota);
		detalle.setNote(nota);

		InvoicedQuantityType cantidadFactura = new InvoicedQuantityType();
		estBasicas.getCantidad(detalleFactura.getCantidadFactura(), cantidadFactura);
		detalle.setInvoicedQuantity(cantidadFactura);

		LineExtensionAmountType montoLineaExtension = new LineExtensionAmountType();
		estBasicas.getMonto(detalleFactura.getMontoLineaExtension(), montoLineaExtension);
		detalle.setLineExtensionAmount(montoLineaExtension);

		TaxPointDateType fechaImpuesto = new TaxPointDateType();
		fechaImpuesto.setValue(detalleFactura.getFechaImpuesto());
		detalle.setTaxPointDate(fechaImpuesto);

		AccountingCostCodeType codigoCosteContable = new AccountingCostCodeType();
		estBasicas.getCodigo(detalleFactura.getCodigoCosteContable(), codigoCosteContable);
		detalle.setAccountingCostCode(codigoCosteContable);

		AccountingCostType costoContable = new AccountingCostType();
		estBasicas.getTexto(detalleFactura.getCostoContable(), costoContable);
		detalle.setAccountingCost(costoContable);

		FreeOfChargeIndicatorType indicadorSinCargo = new FreeOfChargeIndicatorType();
		indicadorSinCargo.setValue(detalleFactura.isIndicadorSinCargo());
		detalle.setFreeOfChargeIndicator(indicadorSinCargo);

		for (TipoReferenciaLineaPedido linea : detalleFactura.getReferenciaLineaPedido()) {
			detalle.getOrderLineReference().add(estBasicas.getReferenciaLineaPedido(linea));
		}

		for (TipoLineaReferencia lineaReferencia : detalleFactura.getLineaReferenciaEnvio()) {
			detalle.getDespatchLineReference().add(estBasicas.getLineaReferencia(lineaReferencia));
		}

		for (TipoLineaReferencia lineaRef : detalleFactura.getReferenciaLineaRecepcion()) {
			detalle.getReceiptLineReference().add(estBasicas.getLineaReferencia(lineaRef));
		}

		for (TipoReferenciaFactura refFactura : detalleFactura.getReferenciaFactura()) {
			detalle.getBillingReference().add(estBasicas.getReferenciaFactura(refFactura));
		}

		for (TipoDocumentoReferencia referenciaDocumento : detalleFactura.getReferenciaDocumento()) {
			detalle.getDocumentReference().add(estBasicas.getDocumentoReferencia(referenciaDocumento));
		}

		detalle.setPricingReference(estBasicas.getReferenciaPrecios(detalleFactura.getReferenciaPrecios()));

		detalle.setOriginatorParty(estBasicas.getTercero(detalleFactura.getTerceroOriginador()));

		for (TipoEntrega entregad : detalleFactura.getEntrega()) {
			detalle.getDelivery().add(getCondicionesDeEntrega2(entregad));

		}

		for (TipoTerminosPago terminosDePago : detalleFactura.getCondicionesPago()) {
			detalle.getPaymentTerms().add(getTerminoDePago(terminosDePago));
		}

		for (TipoCargo cargo : detalleFactura.getCargo()) {
			detalle.getAllowanceCharge().add(estBasicas.getCargos(cargo));
		}

		for (TipoImpuestoTotal totalImpuesto : detalleFactura.getImpuestoTotal()) {

			detalle.getTaxTotal().add(getTotalImpuesto2(totalImpuesto));
		}

		detalle.setItem(getArticulo(detalleFactura.getArticulo()));

		detalle.setPrice(estBasicas.getPrecio(detalleFactura.getPrecio()));
		detalle.setDeliveryTerms(getTerminosEntrega2(detalleFactura.getTerminosEntrega()));

		return detalle;
	}

	private ItemType getArticulo(TipoArticulo articulo) {

		ItemType item = new ItemType();

		for (TipoTexto descripciones : articulo.getDescripcion()) {
			DescriptionType descripcion = new DescriptionType();
			estBasicas.getTexto(descripciones, descripcion);
			item.getDescription().add(descripcion);
		}

		PackQuantityType cantidadPaquete = new PackQuantityType();
		estBasicas.getCantidad(articulo.getCantidadPaquete(), cantidadPaquete);
		item.setPackQuantity(cantidadPaquete);

		PackSizeNumericType tamanoNumericoPaquete = new PackSizeNumericType();
		tamanoNumericoPaquete.setValue(articulo.getTamanoNumericoPaquete());
		item.setPackSizeNumeric(tamanoNumericoPaquete);

		CatalogueIndicatorType indicadorCatalogo = new CatalogueIndicatorType();
		indicadorCatalogo.setValue(articulo.isIndicadorCatalogo());
		item.setCatalogueIndicator(indicadorCatalogo);

		NameType nombre = new NameType();
		estBasicas.getNombre(articulo.getNombre(), nombre);
		item.setName(nombre);

		HazardousRiskIndicatorType indicadorRiesgo = new HazardousRiskIndicatorType();
		indicadorRiesgo.setValue(articulo.isIndicadorRiesgo());
		item.setHazardousRiskIndicator(indicadorRiesgo);

		AdditionalInformationType informacionAdicional = new AdditionalInformationType();
		estBasicas.getTexto(articulo.getInformacionAdicional(), informacionAdicional);
		item.setAdditionalInformation(informacionAdicional);

		for (TipoTexto key : articulo.getPalabraClave()) {
			KeywordType palabraClave = new KeywordType();
			estBasicas.getTexto(key, palabraClave);
			item.getKeyword().add(palabraClave);
		}

		for (String marc : articulo.getMarca()) {
			BrandNameType marca = new BrandNameType();
			estBasicas.getNombre(marc, marca);
			item.getBrandName().add(marca);

		}

		for (String marc : articulo.getNombreModelo()) {
			ModelNameType nombreModelo = new ModelNameType();
			estBasicas.getNombre(marc, nombreModelo);
			item.getModelName().add(nombreModelo);
		}

		item.setBuyersItemIdentification(
				estBasicas.getIdentificacionArticulos(articulo.getIdentificacionArticuloVendedores()));

		item.setSellersItemIdentification(
				estBasicas.getIdentificacionArticulos(articulo.getIdentificacionArticulosCompradores()));
		item.getManufacturersItemIdentification()
				.add(estBasicas.getIdentificacionArticulos(articulo.getIdentificacionArticuloVendedores()));

		item.setStandardItemIdentification(
				estBasicas.getIdentificacionArticulos(articulo.getIdentificacionArticuloEstandar()));
		item.setCatalogueItemIdentification(
				estBasicas.getIdentificacionArticulos(articulo.getIdentificacionArticuloCatalogo()));

		for (TipoIdentificacionArticulos art : articulo.getIdentificacionArticuloAdicional()) {
			item.getAdditionalItemIdentification().add(estBasicas.getIdentificacionArticulos(art));
		}

		item.setCatalogueDocumentReference(estBasicas.getDocumentoReferencia(articulo.getDocumentoRefereciaCatalogo()));

		for (TipoDocumentoReferencia ref : articulo.getReferenciaDocumentoEspecificacionArticulo()) {
			item.getItemSpecificationDocumentReference().add(estBasicas.getDocumentoReferencia(ref));
		}

		item.setOriginCountry(estBasicas.getPais(articulo.getPaisOrigen()));

		for (TipoClasificacionMercancia clasificacion : articulo.getClasificacionMercancia()) {
			item.getCommodityClassification().add(estBasicas.getClasificacionMercancia(clasificacion));
		}

		for (TipoCondicionesTransaccion tran : articulo.getCondicionesTransaccion()) {
			item.getTransactionConditions().add(estBasicas.getCondicionesTransaccion(tran));
		}

		for (TipoArticuloPeligroso articulos : articulo.getArticuloPeligroso()) {
			item.getHazardousItem().add(estBasicas.getArticuloPeligroso(articulos));
		}
		for (TipoImpuestoCategoria categoriaImp : articulo.getCategoriaImpuestoClasificado()) {
			item.getClassifiedTaxCategory().add(estBasicas.getImpuestoCategoria(categoriaImp));
		}

		for (TipoPropiedadArticulo artAdicional : articulo.getPropiedadArticuloAdicional()) {
			item.getAdditionalItemProperty().add(estBasicas.getPropiedadArticuloAdicional(artAdicional));

		}
		for (TipoTercero tercefav : articulo.getTerceroFabricante()) {
			item.getManufacturerParty().add(estBasicas.getTercero(tercefav));
		}

		item.setInformationContentProviderParty(
				estBasicas.getTercero(articulo.getTerceroProveedorContenidoInformacion()));

		for (TipoDireccion dir : articulo.getDireccionOriginal()) {
			item.getOriginAddress().add(getDireccion(dir));
		}
		for (TipoInstanciaArticulo instArticulo : articulo.getInstanciaArticulo()) {
			item.getItemInstance().add(estBasicas.getInstanciaArticulo(instArticulo));
		}

		return item;
	}
}

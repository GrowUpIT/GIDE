package co.gide.traslate;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.growupit.gideesquema.TipoArchivoAdjunto;
import com.growupit.gideesquema.TipoArticuloPeligroso;
import com.growupit.gideesquema.TipoAtriburoFisico;
import com.growupit.gideesquema.TipoCargo;
import com.growupit.gideesquema.TipoClasificacionMercancia;
import com.growupit.gideesquema.TipoCodigo;
import com.growupit.gideesquema.TipoComunicacion;
import com.growupit.gideesquema.TipoCondicionesTransaccion;
import com.growupit.gideesquema.TipoContacto;
import com.growupit.gideesquema.TipoCoordenadasUbicacion;
import com.growupit.gideesquema.TipoCuentaFinanciera;
import com.growupit.gideesquema.TipoCuentaTarjeta;
import com.growupit.gideesquema.TipoDimension;
import com.growupit.gideesquema.TipoDireccion;
import com.growupit.gideesquema.TipoDocumentoReferencia;
import com.growupit.gideesquema.TipoEntidadLegalTercero;
import com.growupit.gideesquema.TipoEnvio;
import com.growupit.gideesquema.TipoEsquemaImpuestosTercero;
import com.growupit.gideesquema.TipoEsquemaRegistroCorporativo;
import com.growupit.gideesquema.TipoExternalReference;
import com.growupit.gideesquema.TipoGrupoPropiedadesArticulo;
import com.growupit.gideesquema.TipoIdentificacionArticulos;
import com.growupit.gideesquema.TipoIdentificacionLote;
import com.growupit.gideesquema.TipoIdentificador;
import com.growupit.gideesquema.TipoImpuestoCategoria;
import com.growupit.gideesquema.TipoImpuestoTotal;
import com.growupit.gideesquema.TipoInstanciaArticulo;
import com.growupit.gideesquema.TipoLineaReferencia;
import com.growupit.gideesquema.TipoListaPrecios;
import com.growupit.gideesquema.TipoMedioPago;
import com.growupit.gideesquema.TipoObjetoBinario;
import com.growupit.gideesquema.TipoPais;
import com.growupit.gideesquema.TipoPeriodo;
import com.growupit.gideesquema.TipoPersona;
import com.growupit.gideesquema.TipoPrecio;
import com.growupit.gideesquema.TipoPropiedadArticulo;
import com.growupit.gideesquema.TipoReferenciaFactura;
import com.growupit.gideesquema.TipoReferenciaLineaFactura;
import com.growupit.gideesquema.TipoReferenciaLineaPedido;
import com.growupit.gideesquema.TipoReferenciaPedido;
import com.growupit.gideesquema.TipoReferenciaPrecios;
import com.growupit.gideesquema.TipoRegimenTriburario;
import com.growupit.gideesquema.TipoRiesgoSecundario;
import com.growupit.gideesquema.TipoSubtotalImpuesto;
import com.growupit.gideesquema.TipoSucursal;
import com.growupit.gideesquema.TipoTemperatura;
import com.growupit.gideesquema.TipoTercero;
import com.growupit.gideesquema.TipoTexto;
import com.growupit.gideesquema.TipoTransitoBienArriesgado;
import com.growupit.gideesquema.TipoUbicacion;
import com.growupit.gideesquema.TipoUbicacionCantidadArticulo;
import com.growupit.gideesquema.TipoUnidadEntrega;

import co.gov.dian.contratos.facturaelectronica.v1.DespatchType;
import co.gov.dian.contratos.facturaelectronica.v1.LocationType;
import co.gov.dian.contratos.facturaelectronica.v1.PartyLegalEntityType;
import co.gov.dian.contratos.facturaelectronica.v1.PartyTaxSchemeType;
import co.gov.dian.contratos.facturaelectronica.v1.PersonType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AttachmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.BillingReferenceLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.BillingReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.BranchType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CardAccountType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CommodityClassificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CommunicationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContactType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CorporateRegistrationSchemeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CountryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CreditAccountType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryUnitType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DimensionType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ExternalReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.FinancialAccountType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.FinancialInstitutionType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.HazardousGoodsTransitType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.HazardousItemType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemIdentificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemInstanceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemLocationQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyGroupType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LineReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationCoordinateType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LotIdentificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.OrderLineReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.OrderReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyIdentificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyNameType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PaymentMeansType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PhysicalAttributeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PriceListType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PriceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PricingReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SecondaryHazardType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSchemeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TemperatureType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransactionConditionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.*;
import oasis.names.specification.ubl.schema.xsd.qualifieddatatypes_2.LongitudeDirectionCodeType;
import un.unece.uncefact.codelist.specification.ianamimemediatype._2003.BinaryObjectMimeCodeContentType;
import un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.BinaryObjectType;
import un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.CodeType;

/**
 * 
 * 
 * 
 * */

public class EstructurasBasicas {

	// generico para identificador
	public void getIdentificador(TipoIdentificador identificador,
			un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.IdentifierType id) {
		id.setSchemeAgencyID(identificador.getAgenciaEsquemaId());
		id.setSchemeAgencyName(identificador.getNombreAgenciaEsquema());
		id.setSchemeDataURI(identificador.getEsquemaDatosURI());
		id.setSchemeID(identificador.getIdEsquema());
		id.setSchemeName(identificador.getNombreEsquema());
		id.setSchemeURI(identificador.getURIEsquema());
		id.setSchemeVersionID(identificador.getVersionEsquemaId());
		id.setValue(identificador.getValue());

	}

	public void getIdentificadorTercero(TipoIdentificador identificador, PartyIdentificationType id) {

		IDType Identificador = new IDType();
		getIdentificador(identificador, Identificador);
		id.setID(Identificador);

	}

	// Generico para codigo
	public void getCodigo(TipoCodigo codigo,
			un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.CodeType code) {

		code.setLanguageID(codigo.getIdIdioma());
		code.setListAgencyID(codigo.getIdListaAgencia());
		code.setListAgencyName(codigo.getNombreListaAgencia());
		code.setListID(codigo.getIdLista());
		code.setListName(codigo.getNombreLista());
		code.setListSchemeURI(codigo.getURIEsquemaLista());
		code.setListURI(codigo.getURILista());
		code.setListVersionID(codigo.getIdVersionLista());
		code.setName(codigo.getNombe());
		code.setValue(codigo.getValue());

	}

	// generico para, los tipos texto
	public void getTexto(TipoTexto texto,
			un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.TextType text) {

		text.setLanguageID(texto.getIdIdioma());
		text.setValue(texto.getValue());

	}

	public void getLineaDireccion(TipoTexto direccion, AddressLineType lineaDireccion) {

		LineType texto = new LineType();
		texto.setLanguageID(direccion.getIdIdioma());
		texto.setValue(direccion.getValue());
		lineaDireccion.setLine(texto);
	}

	public void getPeriodo(TipoPeriodo periodo,
			oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType period) {

		DurationMeasureType medida = new DurationMeasureType();
		getMedida(periodo.getMedidaDuracion(), medida);
		period.setDurationMeasure(medida);

		EndDateType diaFin = new EndDateType();
		diaFin.setValue(periodo.getFechaFin());
		period.setEndDate(diaFin);

		EndTimeType horaFin = new EndTimeType();
		horaFin.setValue(periodo.getHoraFin());
		period.setEndTime(horaFin);

		StartDateType diaInicio = new StartDateType();
		diaInicio.setValue(periodo.getFechaInicio());
		period.setStartDate(diaInicio);

		StartTimeType horaInicio = new StartTimeType();
		horaInicio.setValue(periodo.getHoraInicio());
		period.setStartTime(horaInicio);

		for (TipoTexto descripcion : periodo.getDescripcion()) {
			DescriptionType descriptionType = new DescriptionType();
			getTexto(descripcion, descriptionType);
			period.getDescription().add(descriptionType);
		}

		for (TipoCodigo codigoDescripcion : periodo.getCodigoDescripcion()) {

			DescriptionCodeType descriptionCodeType = new DescriptionCodeType();
			getCodigo(codigoDescripcion, descriptionCodeType);

			period.getDescriptionCode().add(descriptionCodeType);
		}

	}

	public void getMedida(BigDecimal duracion, DurationMeasureType medida) {

		medida.setValue(duracion);

	}

	public void getMedida(BigDecimal duracion, LongitudeMinutesMeasureType medidaLongitudMinutos) {

		medidaLongitudMinutos.setValue(duracion);

	}

	public void getMedida(TipoCodigo tipoCodigo, LongitudeDirectionCodeType codigoLongitudDireccion) {
		getCodigo(tipoCodigo, codigoLongitudDireccion);

	}

	public void getMedida(BigDecimal duracion, LongitudeDegreesMeasureType medidaLongitudGrados) {

		medidaLongitudGrados.setValue(duracion);

	}

	public void getMedida(BigDecimal duracion, LatitudeDegreesMeasureType medidaGradosLatitud) {

		medidaGradosLatitud.setValue(duracion);

	}

	public void getMedida(BigDecimal duracion, LatitudeMinutesMeasureType medidaMinutosLatitud) {

		medidaMinutosLatitud.setValue(duracion);

	}

	public void getMonto(BigDecimal monto,
			un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.AmountType Amount) {

		Amount.setValue(monto);

	}

	@SuppressWarnings("static-access")
	public void getObjetobinario(TipoObjetoBinario objetoBinario, BinaryObjectType objBinario) {

		objBinario.setCharacterSetCode(objetoBinario.getGrupoCaracteresCodigo());
		objBinario.setEncodingCode(objetoBinario.getCodigoCodigicado());
		objBinario.setFilename(objetoBinario.getNombreArchivo());
		objBinario.setFormat(objetoBinario.getFormato());
		BinaryObjectMimeCodeContentType codigoMime = null;
		objBinario.setMimeCode(codigoMime.valueOf(objetoBinario.getMimeCode()));
		objBinario.setUri(objetoBinario.getUri());
		objBinario.setValue(objetoBinario.getValue());

	}

	public ContactType getContacto(TipoContacto contactoContable) {

		ContactType contacto = new ContactType();
		IDType id = new IDType();
		getIdentificador(contactoContable.getID(), id);
		contacto.setID(id);
		NameType nombre = new NameType();
		getNombre(contactoContable.getNombre(), nombre);
		contacto.setName(nombre);
		TelefaxType teleFax = new TelefaxType();
		getTexto(contactoContable.getFax(), teleFax);
		contacto.setTelefax(teleFax);
		TelephoneType telefono = new TelephoneType();
		contacto.setTelephone(telefono);
		ElectronicMailType email = new ElectronicMailType();
		getTexto(contactoContable.getCorreoElectronico(), email);
		contacto.setElectronicMail(email);

		NoteType nota = new NoteType();
		nota.setValue(contactoContable.getNota().getValue());
		contacto.setNote(nota);

		for (TipoComunicacion comunicacion : contactoContable.getComunicacion()) {
			contacto.getOtherCommunication().add(getComunicacion(comunicacion));
		}

		return contacto;
	}

	private CommunicationType getComunicacion(TipoComunicacion tipoComunicacion) {

		CommunicationType comunicacion = new CommunicationType();

		ChannelType canal = new ChannelType();
		getTexto(tipoComunicacion.getCanal(), canal);
		comunicacion.setChannel(canal);
		ChannelCodeType codigoCanal = new ChannelCodeType();
		getCodigo(tipoComunicacion.getCodigoCanal(), codigoCanal);
		comunicacion.setChannelCode(codigoCanal);
		ValueType valor = new ValueType();
		getTexto(tipoComunicacion.getValor(), valor);
		comunicacion.setValue(valor);

		return comunicacion;
	}

	public LocationType getUbicacionFisica(TipoUbicacion ubicacion) {

		LocationType localizacion = new LocationType();
		co.gov.dian.contratos.facturaelectronica.v1.AddressType Direccion;
		localizacion.setAddress(getDireccion2(ubicacion.getDireccion()));

		ConditionsType condiciones = new ConditionsType();
		getTexto(ubicacion.getCondiciones(), condiciones);
		localizacion.setConditions(condiciones);

		CountrySubentityType subentidadPais = new CountrySubentityType();
		getTexto(ubicacion.getSubentidadPais(), subentidadPais);
		localizacion.setCountrySubentity(subentidadPais);

		CountrySubentityCodeType codigoSubentidadPais = new CountrySubentityCodeType();
		getCodigo(ubicacion.getCodigoSubentidadPais(), codigoSubentidadPais);
		localizacion.setCountrySubentityCode(codigoSubentidadPais);

		DescriptionType descripcion = new DescriptionType();
		getTexto(ubicacion.getDescripcion(), descripcion);
		localizacion.setDescription(descripcion);
		IDType id = new IDType();
		getIdentificador(ubicacion.getID(), id);
		localizacion.setID(id);

		for (TipoPeriodo periodos : ubicacion.getPeriodoValidez()) {
			PeriodType PeriodoValidez = new PeriodType();
			getPeriodo(periodos, PeriodoValidez);
			localizacion.getValidityPeriod().add(PeriodoValidez);
		}

		return localizacion;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType getUbicacionFisica2(
			TipoUbicacion ubicacion) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType localizacion = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType();
		co.gov.dian.contratos.facturaelectronica.v1.AddressType Direccion;
		localizacion.setAddress(getDireccion(ubicacion.getDireccion()));

		ConditionsType condiciones = new ConditionsType();
		getTexto(ubicacion.getCondiciones(), condiciones);
		localizacion.setConditions(condiciones);

		CountrySubentityType subentidadPais = new CountrySubentityType();
		getTexto(ubicacion.getSubentidadPais(), subentidadPais);
		localizacion.setCountrySubentity(subentidadPais);

		CountrySubentityCodeType codigoSubentidadPais = new CountrySubentityCodeType();
		getCodigo(ubicacion.getCodigoSubentidadPais(), codigoSubentidadPais);
		localizacion.setCountrySubentityCode(codigoSubentidadPais);

		DescriptionType descripcion = new DescriptionType();
		getTexto(ubicacion.getDescripcion(), descripcion);
		localizacion.setDescription(descripcion);
		IDType id = new IDType();
		getIdentificador(ubicacion.getID(), id);
		localizacion.setID(id);

		for (TipoPeriodo periodos : ubicacion.getPeriodoValidez()) {
			PeriodType PeriodoValidez = new PeriodType();
			getPeriodo(periodos, PeriodoValidez);
			localizacion.getValidityPeriod().add(PeriodoValidez);
		}

		return localizacion;
	}

	public AddressType getDireccion(TipoDireccion direccionPostal) {

		AddressType direccion = new AddressType();

		IDType id = new IDType();
		getIdentificador(direccionPostal.getID(), id);
		direccion.setID(id);

		AddressTypeCodeType tipoCodigoDireccion = new AddressTypeCodeType();
		getCodigo(direccionPostal.getTipoCodigoDireccion(), tipoCodigoDireccion);
		direccion.setAddressTypeCode(tipoCodigoDireccion);

		AddressFormatCodeType formatoCodigoDireccion = new AddressFormatCodeType();
		getCodigo(direccionPostal.getFormatoCodigoDireccion(), formatoCodigoDireccion);
		direccion.setAddressFormatCode(formatoCodigoDireccion);

		PostboxType buzon = new PostboxType();
		getTexto(direccionPostal.getBuzon(), buzon);
		direccion.setPostbox(buzon);
		FloorType piso = new FloorType();
		getTexto(direccionPostal.getPiso(), piso);
		direccion.setFloor(piso);

		RoomType cuarto = new RoomType();
		getTexto(direccionPostal.getCuarto(), cuarto);
		direccion.setRoom(cuarto);

		StreetNameType nombreCalle = new StreetNameType();
		getNombre(direccionPostal.getNombreCalle(), nombreCalle);
		direccion.setStreetName(nombreCalle);

		AdditionalStreetNameType nombreCalleAdicional = new AdditionalStreetNameType();
		getNombre(direccionPostal.getNombreCalleAdicional(), nombreCalleAdicional);
		direccion.setAdditionalStreetName(nombreCalleAdicional);

		BlockNameType nombreBloque = new BlockNameType();
		getNombre(direccionPostal.getNombreBloque(), nombreBloque);
		direccion.setBlockName(nombreBloque);

		BuildingNameType nombreEdificio = new BuildingNameType();
		getNombre(direccionPostal.getNombreEdificio(), nombreEdificio);
		direccion.setBuildingName(nombreEdificio);

		BuildingNumberType numeroEdificio = new BuildingNumberType();
		getTexto(direccionPostal.getNumeroEdificio(), numeroEdificio);
		direccion.setBuildingNumber(numeroEdificio);

		InhouseMailType correoInterno = new InhouseMailType();
		getTexto(direccionPostal.getCorreoInterno(), correoInterno);
		direccion.setInhouseMail(correoInterno);

		DepartmentType departamento = new DepartmentType();
		getTexto(direccionPostal.getDepartamento(), departamento);
		direccion.setDepartment(departamento);

		MarkAttentionType marcaAtencion = new MarkAttentionType();
		getTexto(direccionPostal.getMarcaAtencion(), marcaAtencion);
		direccion.setMarkAttention(marcaAtencion);

		MarkCareType marcaCuidado = new MarkCareType();
		getTexto(direccionPostal.getMarcaCuidado(), marcaCuidado);
		direccion.setMarkCare(marcaCuidado);

		PlotIdentificationType identificacionParcela = new PlotIdentificationType();
		getTexto(direccionPostal.getIdentificacionParcela(), identificacionParcela);
		direccion.setPlotIdentification(identificacionParcela);

		CitySubdivisionNameType nombreSubdivisionCiudad = new CitySubdivisionNameType();
		getNombre(direccionPostal.getNombreSubdivisionCiudad(), nombreSubdivisionCiudad);
		direccion.setCitySubdivisionName(nombreSubdivisionCiudad);

		CityNameType nombreCiudad = new CityNameType();
		getNombre(direccionPostal.getNombreCiudad(), nombreCiudad);
		direccion.setCityName(nombreCiudad);

		PostalZoneType zonaPostal = new PostalZoneType();
		getTexto(direccionPostal.getZonaPostal(), zonaPostal);
		direccion.setPostalZone(zonaPostal);

		CountrySubentityType subentidadPais = new CountrySubentityType();
		getTexto(direccionPostal.getSubentidadPais(), subentidadPais);
		direccion.setCountrySubentity(subentidadPais);

		CountrySubentityCodeType codigoSubentidadesPais = new CountrySubentityCodeType();
		getCodigo(direccionPostal.getCodigoSubentidadesPais(), codigoSubentidadesPais);
		direccion.setCountrySubentityCode(codigoSubentidadesPais);

		RegionType region = new RegionType();
		getTexto(direccionPostal.getRegion(), region);
		direccion.setRegion(region);

		DistrictType distrito = new DistrictType();
		getTexto(direccionPostal.getDistrito(), distrito);
		direccion.setDistrict(distrito);

		TimezoneOffsetType zonaHorariaOffset = new TimezoneOffsetType();
		getTexto(direccionPostal.getZonaHorariaOffset(), zonaHorariaOffset);
		direccion.setTimezoneOffset(zonaHorariaOffset);

		for (TipoTexto Dir : direccionPostal.getLineaDireccion()) {
			AddressLineType lineaDireccion = new AddressLineType();
			LineType lineaDir = new LineType();
			lineaDir.setLanguageID(Dir.getIdIdioma());
			lineaDir.setValue(Dir.getValue());
			lineaDireccion.setLine(lineaDir);
			direccion.getAddressLine().add(lineaDireccion);
		}

		direccion.setCountry(getPais(direccionPostal.getPais()));
		direccion.setLocationCoordinate(getCoordenadasUbicacion(direccionPostal.getCoordenadasUbicacion()));

		return direccion;
	}

	public LocationCoordinateType getCoordenadasUbicacion(TipoCoordenadasUbicacion coordenadasUbicacion) {

		LocationCoordinateType coordenadas = new LocationCoordinateType();

		CoordinateSystemCodeType codigoSistemaCoordenadas = new CoordinateSystemCodeType();
		getCodigo(coordenadasUbicacion.getCodigoSistemaCoordenadas(), codigoSistemaCoordenadas);
		coordenadas.setCoordinateSystemCode(codigoSistemaCoordenadas);

		LatitudeDegreesMeasureType medidaGradosLatitud = new LatitudeDegreesMeasureType();
		getMedida(coordenadasUbicacion.getMedidaGradosLatitud(), medidaGradosLatitud);
		coordenadas.setLatitudeDegreesMeasure(medidaGradosLatitud);

		LatitudeDirectionCodeType codigoDireccionLatitud = new LatitudeDirectionCodeType();
		getCodigo(coordenadasUbicacion.getCodigoDireccionLatitud(), codigoDireccionLatitud);
		coordenadas.setLatitudeDirectionCode(codigoDireccionLatitud);

		LatitudeMinutesMeasureType medidaMinutosLatitud = new LatitudeMinutesMeasureType();
		getMedida(coordenadasUbicacion.getMedidaMinutosLatitud(), medidaMinutosLatitud);
		coordenadas.setLatitudeMinutesMeasure(medidaMinutosLatitud);

		LongitudeDegreesMeasureType medidaLongitudGrados = new LongitudeDegreesMeasureType();
		getMedida(coordenadasUbicacion.getMedidaLongitudGrados(), medidaLongitudGrados);
		coordenadas.setLongitudeDegreesMeasure(medidaLongitudGrados);

		oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LongitudeDirectionCodeType codigoLongitudDireccion = new oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LongitudeDirectionCodeType();
		getMedida(coordenadasUbicacion.getCodigoLongitudDireccion(), codigoLongitudDireccion);
		coordenadas.setLongitudeDirectionCode(codigoLongitudDireccion);

		LongitudeMinutesMeasureType medidaLongitudMinutos = new LongitudeMinutesMeasureType();
		getMedida(coordenadasUbicacion.getMedidaLongitudMinutos(), medidaLongitudMinutos);
		coordenadas.setLongitudeMinutesMeasure(medidaLongitudMinutos);

		return coordenadas;
	}

	public CountryType getPais(TipoPais pais) {

		CountryType p = new CountryType();

		IdentificationCodeType codigo = new IdentificationCodeType();
		getIdentificacion(pais.getCodigoIdentificacion(), codigo);
		p.setIdentificationCode(codigo);
		NameType nombre = new NameType();
		getNombre(pais.getNombre(), nombre);
		p.setName(nombre);

		return p;
	}

	public co.gov.dian.contratos.facturaelectronica.v1.AddressType getDireccion2(TipoDireccion direccionPostal) {

		co.gov.dian.contratos.facturaelectronica.v1.AddressType direccion = new co.gov.dian.contratos.facturaelectronica.v1.AddressType();

		IDType id = new IDType();
		getIdentificador(direccionPostal.getID(), id);
		direccion.setID(id);

		AddressTypeCodeType tipoCodigoDireccion = new AddressTypeCodeType();
		getCodigo(direccionPostal.getTipoCodigoDireccion(), tipoCodigoDireccion);
		direccion.setAddressTypeCode(tipoCodigoDireccion);

		AddressFormatCodeType formatoCodigoDireccion = new AddressFormatCodeType();
		getCodigo(direccionPostal.getFormatoCodigoDireccion(), formatoCodigoDireccion);
		direccion.setAddressFormatCode(formatoCodigoDireccion);

		PostboxType buzon = new PostboxType();
		getTexto(direccionPostal.getBuzon(), buzon);
		direccion.setPostbox(buzon);
		FloorType piso = new FloorType();
		getTexto(direccionPostal.getPiso(), piso);
		direccion.setFloor(piso);

		RoomType cuarto = new RoomType();
		getTexto(direccionPostal.getCuarto(), cuarto);
		direccion.setRoom(cuarto);

		StreetNameType nombreCalle = new StreetNameType();
		getNombre(direccionPostal.getNombreCalle(), nombreCalle);
		direccion.setStreetName(nombreCalle);

		AdditionalStreetNameType nombreCalleAdicional = new AdditionalStreetNameType();
		getNombre(direccionPostal.getNombreCalleAdicional(), nombreCalleAdicional);
		direccion.setAdditionalStreetName(nombreCalleAdicional);

		BlockNameType nombreBloque = new BlockNameType();
		getNombre(direccionPostal.getNombreBloque(), nombreBloque);
		direccion.setBlockName(nombreBloque);

		BuildingNameType nombreEdificio = new BuildingNameType();
		getNombre(direccionPostal.getNombreEdificio(), nombreEdificio);
		direccion.setBuildingName(nombreEdificio);

		BuildingNumberType numeroEdificio = new BuildingNumberType();
		getTexto(direccionPostal.getNumeroEdificio(), numeroEdificio);
		direccion.setBuildingNumber(numeroEdificio);

		InhouseMailType correoInterno = new InhouseMailType();
		getTexto(direccionPostal.getCorreoInterno(), correoInterno);
		direccion.setInhouseMail(correoInterno);

		DepartmentType departamento = new DepartmentType();
		getTexto(direccionPostal.getDepartamento(), departamento);
		direccion.setDepartment(departamento);

		MarkAttentionType marcaAtencion = new MarkAttentionType();
		getTexto(direccionPostal.getMarcaAtencion(), marcaAtencion);
		direccion.setMarkAttention(marcaAtencion);

		MarkCareType marcaCuidado = new MarkCareType();
		getTexto(direccionPostal.getMarcaCuidado(), marcaCuidado);
		direccion.setMarkCare(marcaCuidado);

		PlotIdentificationType identificacionParcela = new PlotIdentificationType();
		getTexto(direccionPostal.getIdentificacionParcela(), identificacionParcela);
		direccion.setPlotIdentification(identificacionParcela);

		CitySubdivisionNameType nombreSubdivisionCiudad = new CitySubdivisionNameType();
		getNombre(direccionPostal.getNombreSubdivisionCiudad(), nombreSubdivisionCiudad);
		direccion.setCitySubdivisionName(nombreSubdivisionCiudad);

		CityNameType nombreCiudad = new CityNameType();
		getNombre(direccionPostal.getNombreCiudad(), nombreCiudad);
		direccion.setCityName(nombreCiudad);

		PostalZoneType zonaPostal = new PostalZoneType();
		getTexto(direccionPostal.getZonaPostal(), zonaPostal);
		direccion.setPostalZone(zonaPostal);

		CountrySubentityType subentidadPais = new CountrySubentityType();
		getTexto(direccionPostal.getSubentidadPais(), subentidadPais);
		direccion.setCountrySubentity(subentidadPais);

		CountrySubentityCodeType codigoSubentidadesPais = new CountrySubentityCodeType();
		getCodigo(direccionPostal.getCodigoSubentidadesPais(), codigoSubentidadesPais);
		direccion.setCountrySubentityCode(codigoSubentidadesPais);

		RegionType region = new RegionType();
		getTexto(direccionPostal.getRegion(), region);
		direccion.setRegion(region);

		DistrictType distrito = new DistrictType();
		getTexto(direccionPostal.getDistrito(), distrito);
		direccion.setDistrict(distrito);

		TimezoneOffsetType zonaHorariaOffset = new TimezoneOffsetType();
		getTexto(direccionPostal.getZonaHorariaOffset(), zonaHorariaOffset);
		direccion.setTimezoneOffset(zonaHorariaOffset);

		for (TipoTexto Dir : direccionPostal.getLineaDireccion()) {
			AddressLineType lineaDireccion = new AddressLineType();
			LineType lineaDir = new LineType();
			lineaDir.setLanguageID(Dir.getIdIdioma());
			lineaDir.setValue(Dir.getValue());
			lineaDireccion.setLine(lineaDir);
			direccion.getAddressLine().add(lineaDireccion);
		}

		direccion.setCountry(getPais(direccionPostal.getPais()));
		direccion.setLocationCoordinate(getCoordenadasUbicacion(direccionPostal.getCoordenadasUbicacion()));

		return direccion;
	}

	public void getNombres(String nombre, PartyNameType nombreTercero) {

		NameType nombres = new NameType();
		getNombre(nombre, nombres);
		nombreTercero.setName(nombres);
	}

	public void getNombre(String nombre,
			un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.NameType nombreTercero) {

		nombreTercero.setValue(nombre);
	}

	public void getIdentificacion(TipoCodigo codigoIdentificacion, IdentificationCodeType codigo) {

		getIdentificacion(codigoIdentificacion, codigo);

	}

	public void getCantidad(BigDecimal cantidad, QuantityType cantidades) {
		cantidades.setValue(cantidad);

	}

	public void getCantidad(BigDecimal cantidad, MaximumQuantityType cantidades) {
		cantidades.setValue(cantidad);
	}

	public void getCantidad(BigDecimal cantidad, MinimumQuantityType cantidades) {
		cantidades.setValue(cantidad);
	}

	public DespatchType getDespacho(TipoEnvio tipoEnvio) {

		DespatchType despacho = new DespatchType();
		IDType id = new IDType();

		getIdentificador(tipoEnvio.getID(), id);
		despacho.setID(id);

		RequestedDespatchDateType fechaEnvioSolicitud = new RequestedDespatchDateType();
		fechaEnvioSolicitud.setValue(tipoEnvio.getFechaEnvioSolicitado());
		despacho.setRequestedDespatchDate(fechaEnvioSolicitud);

		RequestedDespatchTimeType horaEnvioSolicitud = new RequestedDespatchTimeType();
		horaEnvioSolicitud.setValue(tipoEnvio.getHoraEnvioSolicitado());
		despacho.setRequestedDespatchTime(horaEnvioSolicitud);

		EstimatedDespatchDateType fechaEstimadaEnvio = new EstimatedDespatchDateType();
		fechaEstimadaEnvio.setValue(tipoEnvio.getFechaEstimadaEnvio());
		despacho.setEstimatedDespatchDate(fechaEstimadaEnvio);

		EstimatedDespatchTimeType horaEstimadaEnvio = new EstimatedDespatchTimeType();
		horaEstimadaEnvio.setValue(tipoEnvio.getHoraEstimadaEnvio());
		despacho.setEstimatedDespatchTime(horaEstimadaEnvio);

		ActualDespatchDateType fechaActualEnvio = new ActualDespatchDateType();
		fechaActualEnvio.setValue(tipoEnvio.getFechaActualEnvio());
		despacho.setActualDespatchDate(fechaActualEnvio);

		ActualDespatchTimeType horaActualEnvio = new ActualDespatchTimeType();
		horaActualEnvio.setValue(tipoEnvio.getHoraActualEnvio());
		despacho.setActualDespatchTime(horaActualEnvio);

		despacho.setDespatchAddress(getDireccion2(tipoEnvio.getDireccion()));
		despacho.setDespatchParty(getTerceroDIAN(tipoEnvio.getTercero()));
		despacho.setContact(getContacto(tipoEnvio.getContacto()));

		return despacho;
	}

	public PartyType getTercero(TipoTercero terceroTipo) {
		PartyType tercero = new PartyType();

		tercero.setAgentParty(getTercero(terceroTipo.getTerceroAgencia()));

		tercero.setContact(getContacto(terceroTipo.getContacto()));

		EndpointIDType puntoFinalID = new EndpointIDType();
		getIdentificador(terceroTipo.getPuntoFinalID(), puntoFinalID);
		tercero.setEndpointID(puntoFinalID);

		LogoReferenceIDType referenciaLogotipoID = new LogoReferenceIDType();
		getIdentificador(terceroTipo.getReferenciaLogotipoID(), referenciaLogotipoID);
		tercero.setLogoReferenceID(referenciaLogotipoID);

		MarkAttentionIndicatorType indicadorMarcaAtencion = new MarkAttentionIndicatorType();
		indicadorMarcaAtencion.setValue(terceroTipo.isIndicadorMarcaAtencion());
		tercero.setMarkAttentionIndicator(indicadorMarcaAtencion);

		MarkCareIndicatorType indicadorMarcaCuidado = new MarkCareIndicatorType();
		indicadorMarcaCuidado.setValue(terceroTipo.isIndicadorMarcaCuidado());
		tercero.setMarkCareIndicator(indicadorMarcaCuidado);

		tercero.setPhysicalLocation(getUbicacionFisica2(terceroTipo.getUbicacion()));

		tercero.setPostalAddress(getDireccion(terceroTipo.getDireccionPostal()));

		WebsiteURIType sitioWeb = new WebsiteURIType();
		getIdentificador(terceroTipo.getSitioWebURI(), sitioWeb);
		tercero.setWebsiteURI(sitioWeb);

		for (TipoEntidadLegalTercero entidad : terceroTipo.getEntidadLegalTercero()) {
			tercero.getPartyLegalEntity().add(getEntidadlegal2(entidad));
		}

		for (TipoIdentificador identificacion : terceroTipo.getIdentificacionTercero()) {
			PartyIdentificationType id = new PartyIdentificationType();
			getIdentificadorTercero(identificacion, id);
			tercero.getPartyIdentification().add(id);
		}

		for (String nombre : terceroTipo.getNombreTercero()) {

			PartyNameType nombreTercero = new PartyNameType();
			getNombres(nombre, nombreTercero);
			tercero.getPartyName().add(nombreTercero);
		}

		for (TipoEsquemaImpuestosTercero esquemaImpuestos : terceroTipo.getEsquemaImpuestosTercero()) {
			tercero.getPartyTaxScheme().add(getEsquemaImpuestosTercero2(esquemaImpuestos));
		}

		for (TipoPersona persona : terceroTipo.getPersona()) {

			tercero.setPerson(getPersona2(persona));
		}

		return tercero;
	}

	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PersonType getPersona2(
			TipoPersona personas) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PersonType persona = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PersonType();

		FamilyNameType apellidos = new FamilyNameType();
		getNombre(personas.getApellido(), apellidos);
		persona.setFamilyName(apellidos);

		FirstNameType primerNombre = new FirstNameType();
		getNombre(personas.getPrimerNombre(), primerNombre);
		persona.setFirstName(primerNombre);

		JobTitleType tituloProfesional = new JobTitleType();
		getTexto(personas.getTituloProfesional(), tituloProfesional);
		persona.setJobTitle(tituloProfesional);

		MiddleNameType segundoNombre = new MiddleNameType();
		getNombre(personas.getSegundoNombre(), segundoNombre);
		persona.setMiddleName(segundoNombre);

		NameSuffixType sufijoNombre = new NameSuffixType();
		getTexto(personas.getSufijoNombre(), sufijoNombre);
		persona.setNameSuffix(sufijoNombre);

		OrganizationDepartmentType departamentoOrganizacion = new OrganizationDepartmentType();
		getTexto(personas.getDepartamentoOrganizacion(), departamentoOrganizacion);
		persona.setOrganizationDepartment(departamentoOrganizacion);

		TitleType titulo = new TitleType();
		getTexto(personas.getTitulo(), titulo);
		persona.setTitle(titulo);

		return persona;
	}

	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyTaxSchemeType getEsquemaImpuestosTercero2(
			TipoEsquemaImpuestosTercero esquemaImpuestos) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyTaxSchemeType esquImpu = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyTaxSchemeType();

		CompanyIDType IDEmpresa = new CompanyIDType();
		getIdentificador(esquemaImpuestos.getIDEmpresa(), IDEmpresa);
		esquImpu.setCompanyID(IDEmpresa);

		ExemptionReasonType RazonExencion = new ExemptionReasonType();
		getTexto(esquemaImpuestos.getRazonExencion(), RazonExencion);
		esquImpu.setExemptionReason(RazonExencion);

		ExemptionReasonCodeType CodigoRazonExencion = new ExemptionReasonCodeType();
		getCodigo(esquemaImpuestos.getCodigoRazonExencion(), CodigoRazonExencion);
		esquImpu.setExemptionReasonCode(CodigoRazonExencion);

		esquImpu.setRegistrationAddress(getDireccion(esquemaImpuestos.getDireccionRegistro()));

		RegistrationNameType NombreRegistro = new RegistrationNameType();
		getNombre(esquemaImpuestos.getNombreRegistro(), NombreRegistro);
		esquImpu.setRegistrationName(NombreRegistro);

		TaxLevelCodeType CodigoNivelImpuestos = new TaxLevelCodeType();
		getCodigo(esquemaImpuestos.getCodigoNivelImpuestos(), CodigoNivelImpuestos);
		esquImpu.setTaxLevelCode(CodigoNivelImpuestos);

		esquImpu.setTaxScheme(getEsquemaImpuestos(esquemaImpuestos.getEsquemaImpuestos()));

		return esquImpu;
	}

	private TaxSchemeType getEsquemaImpuestos(TipoRegimenTriburario esquemaImpuestos) {

		TaxSchemeType esquImpu = new TaxSchemeType();

		CurrencyCodeType codigoDivisa = new CurrencyCodeType();
		getCodigo(esquemaImpuestos.getCodigoDivisa(), codigoDivisa);
		esquImpu.setCurrencyCode(codigoDivisa);

		IDType id = new IDType();
		getIdentificador(esquemaImpuestos.getId(), id);
		esquImpu.setID(id);

		NameType nombre = new NameType();
		getNombre(esquemaImpuestos.getNombre(), nombre);
		esquImpu.setName(nombre);

		TaxTypeCodeType tipoCodigoImpuesto = new TaxTypeCodeType();
		getCodigo(esquemaImpuestos.getTipoCodigoImpuesto(), tipoCodigoImpuesto);
		esquImpu.setTaxTypeCode(tipoCodigoImpuesto);

		for (TipoDireccion tipoDireccion : esquemaImpuestos.getDireccionJurisdiccionRegional()) {
			esquImpu.getJurisdictionRegionAddress().add(getDireccion(tipoDireccion));
		}

		return esquImpu;
	}

	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyLegalEntityType getEntidadlegal2(
			TipoEntidadLegalTercero entidad) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyLegalEntityType entidadLegal = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyLegalEntityType();
		entidadLegal.setCorporateRegistrationScheme(getschemaRegistrado(entidad.getEsquemaRegistroCorporativo()));

		entidadLegal.setRegistrationAddress(getDireccion(entidad.getDireccionRegistro()));
		RegistrationNameType nombreRegistrado = new RegistrationNameType();
		getNombre(entidad.getNombreRegistro(), nombreRegistrado);
		entidadLegal.setRegistrationName(nombreRegistrado);
		return entidadLegal;
	}

	private CorporateRegistrationSchemeType getschemaRegistrado(
			TipoEsquemaRegistroCorporativo esquemaRegistroCorporativo) {

		CorporateRegistrationSchemeType corporacion = new CorporateRegistrationSchemeType();

		CorporateRegistrationTypeCodeType tipoCodigoRegistroCorporativo = new CorporateRegistrationTypeCodeType();
		getCodigo(esquemaRegistroCorporativo.getTipoCodigoRegistroCorporativo(), tipoCodigoRegistroCorporativo);
		corporacion.setCorporateRegistrationTypeCode(tipoCodigoRegistroCorporativo);

		IDType id = new IDType();
		getIdentificador(esquemaRegistroCorporativo.getID(), id);
		corporacion.setID(id);

		NameType nombre = new NameType();
		getNombre(esquemaRegistroCorporativo.getNombre(), nombre);
		corporacion.setName(nombre);

		for (TipoDireccion direccion : esquemaRegistroCorporativo.getDireccionRegionJurisdiccion()) {
			corporacion.getJurisdictionRegionAddress().add(getDireccion(direccion));
		}

		return corporacion;
	}

	public co.gov.dian.contratos.facturaelectronica.v1.PartyType getTerceroDIAN(TipoTercero terceroTipo) {

		co.gov.dian.contratos.facturaelectronica.v1.PartyType tercero = new co.gov.dian.contratos.facturaelectronica.v1.PartyType();

		tercero.setAgentParty(getTercero(terceroTipo.getTerceroAgencia()));

		tercero.setContact(getContacto(terceroTipo.getContacto()));

		EndpointIDType puntoFinalID = new EndpointIDType();
		getIdentificador(terceroTipo.getPuntoFinalID(), puntoFinalID);
		tercero.setEndpointID(puntoFinalID);

		LogoReferenceIDType referenciaLogotipoID = new LogoReferenceIDType();
		getIdentificador(terceroTipo.getReferenciaLogotipoID(), referenciaLogotipoID);
		tercero.setLogoReferenceID(referenciaLogotipoID);

		MarkAttentionIndicatorType indicadorMarcaAtencion = new MarkAttentionIndicatorType();
		indicadorMarcaAtencion.setValue(terceroTipo.isIndicadorMarcaAtencion());
		tercero.setMarkAttentionIndicator(indicadorMarcaAtencion);

		MarkCareIndicatorType indicadorMarcaCuidado = new MarkCareIndicatorType();
		indicadorMarcaCuidado.setValue(terceroTipo.isIndicadorMarcaCuidado());
		tercero.setMarkCareIndicator(indicadorMarcaCuidado);

		tercero.setPhysicalLocation(getUbicacionFisica(terceroTipo.getUbicacion()));

		tercero.setPostalAddress(getDireccion(terceroTipo.getDireccionPostal()));

		WebsiteURIType sitioWeb = new WebsiteURIType();
		getIdentificador(terceroTipo.getSitioWebURI(), sitioWeb);
		tercero.setWebsiteURI(sitioWeb);

		for (TipoEntidadLegalTercero entidad : terceroTipo.getEntidadLegalTercero()) {
			tercero.getPartyLegalEntity().add(getEntidadlegal(entidad));
		}

		for (TipoIdentificador identificacion : terceroTipo.getIdentificacionTercero()) {
			PartyIdentificationType id = new PartyIdentificationType();
			getIdentificadorTercero(identificacion, id);
			tercero.getPartyIdentification().add(id);
		}

		for (String nombre : terceroTipo.getNombreTercero()) {

			PartyNameType nombreTercero = new PartyNameType();
			getNombres(nombre, nombreTercero);
			tercero.getPartyName().add(nombreTercero);
		}

		for (TipoEsquemaImpuestosTercero esquemaImpuestos : terceroTipo.getEsquemaImpuestosTercero()) {
			tercero.getPartyTaxScheme().add(getEsquemaImpuestosTercero(esquemaImpuestos));
		}

		for (TipoPersona persona : terceroTipo.getPersona()) {

			tercero.getPerson().add(getPersona(persona));
		}

		return tercero;
	}

	private PersonType getPersona(TipoPersona persona) {

		PersonType personas = new PersonType();

		FamilyNameType apellido = new FamilyNameType();
		getNombre(persona.getApellido(), apellido);
		personas.setFamilyName(apellido);

		FirstNameType primerNombre = new FirstNameType();
		getNombre(persona.getPrimerNombre(), primerNombre);
		personas.setFirstName(primerNombre);

		JobTitleType tituloProfesional = new JobTitleType();
		getTexto(persona.getTituloProfesional(), tituloProfesional);
		personas.setJobTitle(tituloProfesional);

		MiddleNameType segundoNombre = new MiddleNameType();
		getNombre(persona.getSegundoNombre(), segundoNombre);
		personas.setMiddleName(segundoNombre);

		NameSuffixType sufijoNombre = new NameSuffixType();
		getTexto(persona.getSufijoNombre(), sufijoNombre);
		personas.setNameSuffix(sufijoNombre);

		OrganizationDepartmentType departamentoOrganizacion = new OrganizationDepartmentType();
		getTexto(persona.getDepartamentoOrganizacion(), departamentoOrganizacion);
		personas.setOrganizationDepartment(departamentoOrganizacion);

		TitleType titulo = new TitleType();
		getTexto(persona.getTitulo(), titulo);
		personas.setTitle(titulo);

		return personas;

	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DespatchType getDespacho2(
			TipoEnvio tipoEnvio) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DespatchType despacho = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DespatchType();
		IDType id = new IDType();

		getIdentificador(tipoEnvio.getID(), id);
		despacho.setID(id);

		RequestedDespatchDateType fechaEnvioSolicitud = new RequestedDespatchDateType();
		fechaEnvioSolicitud.setValue(tipoEnvio.getFechaEnvioSolicitado());
		despacho.setRequestedDespatchDate(fechaEnvioSolicitud);

		RequestedDespatchTimeType horaEnvioSolicitud = new RequestedDespatchTimeType();
		horaEnvioSolicitud.setValue(tipoEnvio.getHoraEnvioSolicitado());
		despacho.setRequestedDespatchTime(horaEnvioSolicitud);

		EstimatedDespatchDateType fechaEstimadaEnvio = new EstimatedDespatchDateType();
		fechaEstimadaEnvio.setValue(tipoEnvio.getFechaEstimadaEnvio());
		despacho.setEstimatedDespatchDate(fechaEstimadaEnvio);

		EstimatedDespatchTimeType horaEstimadaEnvio = new EstimatedDespatchTimeType();
		horaEstimadaEnvio.setValue(tipoEnvio.getHoraEstimadaEnvio());
		despacho.setEstimatedDespatchTime(horaEstimadaEnvio);

		ActualDespatchDateType fechaActualEnvio = new ActualDespatchDateType();
		fechaActualEnvio.setValue(tipoEnvio.getFechaActualEnvio());
		despacho.setActualDespatchDate(fechaActualEnvio);

		ActualDespatchTimeType horaActualEnvio = new ActualDespatchTimeType();
		horaActualEnvio.setValue(tipoEnvio.getHoraActualEnvio());
		despacho.setActualDespatchTime(horaActualEnvio);

		despacho.setDespatchAddress(getDireccion(tipoEnvio.getDireccion()));
		despacho.setDespatchParty(getTercero(tipoEnvio.getTercero()));
		despacho.setContact(getContacto(tipoEnvio.getContacto()));

		return despacho;
	}

	public CardAccountType getcuentaTarjeta(TipoCuentaTarjeta cuentaTarjeta) {

		CardAccountType tarjeta = new CardAccountType();

		PrimaryAccountNumberIDType numeroCuentaPrincipalID = new PrimaryAccountNumberIDType();
		getIdentificador(cuentaTarjeta.getNumeroCuentaPrincipalID(), numeroCuentaPrincipalID);
		tarjeta.setPrimaryAccountNumberID(numeroCuentaPrincipalID);

		NetworkIDType redID = new NetworkIDType();
		getIdentificador(cuentaTarjeta.getRedID(), redID);
		tarjeta.setNetworkID(redID);

		CardTypeCodeType tipoCodigoTarjeta = new CardTypeCodeType();
		getCodigo(cuentaTarjeta.getTipoCodigoTarjeta(), tipoCodigoTarjeta);
		tarjeta.setCardTypeCode(tipoCodigoTarjeta);

		ValidityStartDateType fechaInicialValidez = new ValidityStartDateType();
		fechaInicialValidez.setValue(cuentaTarjeta.getFechaInicialValidez());
		tarjeta.setValidityStartDate(fechaInicialValidez);

		ExpiryDateType fechaCaducidad = new ExpiryDateType();
		fechaCaducidad.setValue(cuentaTarjeta.getFechaCaducidad());
		tarjeta.setExpiryDate(fechaCaducidad);

		IssuerIDType emisorID = new IssuerIDType();
		getIdentificador(cuentaTarjeta.getEmisorID(), emisorID);
		tarjeta.setIssuerID(emisorID);

		IssueNumberIDType numeroEmisorID = new IssueNumberIDType();
		getIdentificador(cuentaTarjeta.getNumeroEmisorID(), numeroEmisorID);
		tarjeta.setIssueNumberID(numeroEmisorID);

		CV2IDType cV2ID = new CV2IDType();
		getIdentificador(cuentaTarjeta.getCV2ID(), cV2ID);
		tarjeta.setCV2ID(cV2ID);

		CardChipCodeType codigoChipTarjeta = new CardChipCodeType();
		getCodigo(cuentaTarjeta.getCodigoChipTarjeta(), codigoChipTarjeta);
		tarjeta.setCardChipCode(codigoChipTarjeta);

		ChipApplicationIDType chipAplicacionID = new ChipApplicationIDType();
		getIdentificador(cuentaTarjeta.getChipAplicacionID(), chipAplicacionID);
		tarjeta.setChipApplicationID(chipAplicacionID);

		HolderNameType nombreTitular = new HolderNameType();
		getNombre(cuentaTarjeta.getNombreTitular(), nombreTitular);
		tarjeta.setHolderName(nombreTitular);
		return tarjeta;
	}

	public CreditAccountType getCuentaCredito(TipoIdentificador cuentaCredito) {
		CreditAccountType cuenta = new CreditAccountType();
		AccountIDType valor = new AccountIDType();
		getIdentificador(cuentaCredito, valor);
		cuenta.setAccountID(valor);
		return cuenta;
	}

	public FinancialAccountType getCuentaContribuyenteBeneficiario(TipoCuentaFinanciera cuentas) {

		FinancialAccountType cuenta = new FinancialAccountType();
		AccountTypeCodeType codigoCuenta = new AccountTypeCodeType();
		getCodigo(cuentas.getTipoCodigoCuenta(), codigoCuenta);
		cuenta.setAccountTypeCode(codigoCuenta);
		cuenta.setCountry(getPais(cuentas.getPais()));
		CurrencyCodeType codigoMoneda = new CurrencyCodeType();
		getCodigo(cuentas.getCodigoMoneda(), codigoMoneda);
		cuenta.setCurrencyCode(codigoMoneda);
		cuenta.setFinancialInstitutionBranch(
				getSucursualInstitucionFinanciera(cuentas.getSucursualInstitucionFinanciera()));
		IDType id = new IDType();
		getIdentificador(cuentas.getID(), id);
		cuenta.setID(id);
		NameType nombre = new NameType();
		getNombre(cuentas.getNombre(), nombre);
		cuenta.setName(nombre);
		for (TipoTexto nota : cuentas.getNotaPago()) {
			PaymentNoteType notaPago = new PaymentNoteType();
			getTexto(nota, notaPago);
			cuenta.getPaymentNote().add(notaPago);
		}

		return cuenta;
	}

	private BranchType getSucursualInstitucionFinanciera(TipoSucursal sucursualInstitucionFinanciera) {

		BranchType sucursal = new BranchType();

		sucursal.setAddress(getDireccion(sucursualInstitucionFinanciera.getDireccion()));
		FinancialInstitutionType institucionFinanciera = new FinancialInstitutionType();

		institucionFinanciera
				.setAddress(getDireccion(sucursualInstitucionFinanciera.getInstitucionFinanciera().getDireccion()));

		IDType id = new IDType();
		getIdentificador(sucursualInstitucionFinanciera.getInstitucionFinanciera().getID(), id);
		institucionFinanciera.setID(id);
		NameType nombre = new NameType();
		getNombre(sucursualInstitucionFinanciera.getInstitucionFinanciera().getNombre(), nombre);
		institucionFinanciera.setName(nombre);
		sucursal.setFinancialInstitution(institucionFinanciera);

		IDType id1 = new IDType();
		getIdentificador(sucursualInstitucionFinanciera.getID(), id1);
		sucursal.setID(id1);

		NameType nombre1 = new NameType();
		getNombre(sucursualInstitucionFinanciera.getNombre(), nombre1);
		sucursal.setName(nombre1);
		return sucursal;
	}

	public TaxTotalType getImpues(TipoImpuestoTotal impuestoTotal) {

		TaxTotalType total = new TaxTotalType();
		RoundingAmountType montoRedondeado = new RoundingAmountType();
		getMonto(impuestoTotal.getMontoRedondeado(), montoRedondeado);
		total.setRoundingAmount(montoRedondeado);
		TaxAmountType montoImpuesto = new TaxAmountType();
		getMonto(impuestoTotal.getMontoImpuesto(), montoImpuesto);
		total.setTaxAmount(montoImpuesto);
		TaxEvidenceIndicatorType indicadorEvidenciaImpuesto = new TaxEvidenceIndicatorType();
		indicadorEvidenciaImpuesto.setValue(impuestoTotal.isIndicadorEvidenciaImpuesto());
		total.setTaxEvidenceIndicator(indicadorEvidenciaImpuesto);

		for (TipoSubtotalImpuesto subTotal : impuestoTotal.getSubtotalImpuesto()) {
			total.getTaxSubtotal().add(getSubtotalImpuesto2(subTotal));
		}

		return total;
	}

	public co.gov.dian.contratos.facturaelectronica.v1.TaxSubtotalType getSubtotalImpuesto(
			TipoSubtotalImpuesto impuesto) {

		co.gov.dian.contratos.facturaelectronica.v1.TaxSubtotalType subTotalImpuestos = new co.gov.dian.contratos.facturaelectronica.v1.TaxSubtotalType();

		BaseUnitMeasureType baseUnidadMedida = new BaseUnitMeasureType();
		getMedida(impuesto.getBaseUnidadMedida(), baseUnidadMedida);
		subTotalImpuestos.setBaseUnitMeasure(baseUnidadMedida);

		CalculationSequenceNumericType calculoSecuenciaNumerica = new CalculationSequenceNumericType();
		calculoSecuenciaNumerica.setValue(impuesto.getCalculoSecuenciaNumerica());
		subTotalImpuestos.setCalculationSequenceNumeric(calculoSecuenciaNumerica);

		PercentType porcentaje = new PercentType();
		porcentaje.setValue(impuesto.getPorcentaje());
		subTotalImpuestos.setPercent(porcentaje);

		PerUnitAmountType montoPorUnidad = new PerUnitAmountType();
		getMonto(impuesto.getMontoPorUnidad(), montoPorUnidad);
		subTotalImpuestos.setPerUnitAmount(montoPorUnidad);

		TaxableAmountType montoGravable = new TaxableAmountType();
		getMonto(impuesto.getMontoGravable(), montoGravable);
		subTotalImpuestos.setTaxableAmount(montoGravable);

		TaxAmountType montoImpuesto = new TaxAmountType();
		getMonto(impuesto.getMontoImpuesto(), montoImpuesto);
		subTotalImpuestos.setTaxAmount(montoImpuesto);

		subTotalImpuestos.setTaxCategory(getImpuestoCategoria(impuesto.getImpuestoCategoria()));

		TierRangeType nivelRango = new TierRangeType();
		getTexto(impuesto.getNivelRango(), nivelRango);
		subTotalImpuestos.setTierRange(nivelRango);

		TierRatePercentType porcentajeNivelRango = new TierRatePercentType();
		porcentajeNivelRango.setValue(impuesto.getPorcentajeNivelRango());
		subTotalImpuestos.setTierRatePercent(porcentajeNivelRango);

		TransactionCurrencyTaxAmountType montoImpuestoMonedaTransaccion = new TransactionCurrencyTaxAmountType();
		getMonto(impuesto.getMontoImpuestoMonedaTransaccion(), montoImpuestoMonedaTransaccion);
		subTotalImpuestos.setTransactionCurrencyTaxAmount(montoImpuestoMonedaTransaccion);

		return subTotalImpuestos;
	}

	public void getMedida(BigDecimal baseUnidadMedida, BaseUnitMeasureType baseUnidadMedida2) {
		baseUnidadMedida2.setValue(baseUnidadMedida);
	}

	public TaxSubtotalType getSubtotalImpuesto2(TipoSubtotalImpuesto impuesto) {

		TaxSubtotalType subTotalImpuestos = new TaxSubtotalType();

		BaseUnitMeasureType baseUnidadMedida = new BaseUnitMeasureType();
		getMedida(impuesto.getBaseUnidadMedida(), baseUnidadMedida);
		subTotalImpuestos.setBaseUnitMeasure(baseUnidadMedida);

		CalculationSequenceNumericType calculoSecuenciaNumerica = new CalculationSequenceNumericType();
		calculoSecuenciaNumerica.setValue(impuesto.getCalculoSecuenciaNumerica());
		subTotalImpuestos.setCalculationSequenceNumeric(calculoSecuenciaNumerica);

		PercentType porcentaje = new PercentType();
		porcentaje.setValue(impuesto.getPorcentaje());
		subTotalImpuestos.setPercent(porcentaje);

		PerUnitAmountType montoPorUnidad = new PerUnitAmountType();
		getMonto(impuesto.getMontoPorUnidad(), montoPorUnidad);
		subTotalImpuestos.setPerUnitAmount(montoPorUnidad);

		TaxableAmountType montoGravable = new TaxableAmountType();
		getMonto(impuesto.getMontoGravable(), montoGravable);
		subTotalImpuestos.setTaxableAmount(montoGravable);

		TaxAmountType montoImpuesto = new TaxAmountType();
		getMonto(impuesto.getMontoImpuesto(), montoImpuesto);
		subTotalImpuestos.setTaxAmount(montoImpuesto);

		subTotalImpuestos.setTaxCategory(getImpuestoCategoria(impuesto.getImpuestoCategoria()));

		TierRangeType nivelRango = new TierRangeType();
		getTexto(impuesto.getNivelRango(), nivelRango);
		subTotalImpuestos.setTierRange(nivelRango);

		TierRatePercentType porcentajeNivelRango = new TierRatePercentType();
		porcentajeNivelRango.setValue(impuesto.getPorcentajeNivelRango());
		subTotalImpuestos.setTierRatePercent(porcentajeNivelRango);

		TransactionCurrencyTaxAmountType montoImpuestoMonedaTransaccion = new TransactionCurrencyTaxAmountType();
		getMonto(impuesto.getMontoImpuestoMonedaTransaccion(), montoImpuestoMonedaTransaccion);
		subTotalImpuestos.setTransactionCurrencyTaxAmount(montoImpuestoMonedaTransaccion);

		return subTotalImpuestos;
	}

	public TaxCategoryType getImpuestoCategoria(TipoImpuestoCategoria impuestoCategoria) {

		TaxCategoryType categoriImpuesto = new TaxCategoryType();

		BaseUnitMeasureType baseUnidadMedida = new BaseUnitMeasureType();
		getCantidadase(impuestoCategoria.getBaseUnidadMedida(), baseUnidadMedida);
		categoriImpuesto.setBaseUnitMeasure(baseUnidadMedida);

		IDType id = new IDType();
		getIdentificador(impuestoCategoria.getID(), id);
		categoriImpuesto.setID(id);

		NameType nombre = new NameType();
		getNombre(impuestoCategoria.getNombre(), nombre);
		categoriImpuesto.setName(nombre);

		PercentType porcentaje = new PercentType();
		porcentaje.setValue(impuestoCategoria.getPorcentaje());
		categoriImpuesto.setPercent(porcentaje);

		PerUnitAmountType montoPorUnidad = new PerUnitAmountType();
		getMonto(impuestoCategoria.getMontoPorUnidad(), montoPorUnidad);
		categoriImpuesto.setPerUnitAmount(montoPorUnidad);

		TaxExemptionReasonType razonExencionImpuestos = new TaxExemptionReasonType();
		getTexto(impuestoCategoria.getRazonExencionImpuestos(), razonExencionImpuestos);
		categoriImpuesto.setTaxExemptionReason(razonExencionImpuestos);

		TaxExemptionReasonCodeType codigoExencionImpuestos = new TaxExemptionReasonCodeType();
		getCodigo(impuestoCategoria.getCodigoExencionImpuestos(), codigoExencionImpuestos);
		categoriImpuesto.setTaxExemptionReasonCode(codigoExencionImpuestos);

		categoriImpuesto.setTaxScheme(getRegimenTriburario(impuestoCategoria.getRegimenTriburario()));
		TierRangeType nivelRango = new TierRangeType();
		getTexto(impuestoCategoria.getNivelRango(), nivelRango);
		categoriImpuesto.setTierRange(nivelRango);

		TierRatePercentType porcentajeNivelRango = new TierRatePercentType();
		porcentajeNivelRango.setValue(impuestoCategoria.getPorcentajeNivelRango());
		categoriImpuesto.setTierRatePercent(porcentajeNivelRango);

		return categoriImpuesto;
	}

	private void getCantidadase(BigDecimal baseUnidadMedida, BaseUnitMeasureType baseUnidadMedida2) {

		baseUnidadMedida2.setValue(baseUnidadMedida);
	}

	private TaxSchemeType getRegimenTriburario(TipoRegimenTriburario regimenTriburario) {

		TaxSchemeType regimen = new TaxSchemeType();

		CurrencyCodeType codigoDivisa = new CurrencyCodeType();
		getCodigo(regimenTriburario.getCodigoDivisa(), codigoDivisa);
		regimen.setCurrencyCode(codigoDivisa);

		IDType id = new IDType();
		getIdentificador(regimenTriburario.getId(), id);
		regimen.setID(id);

		NameType nombre = new NameType();
		getNombre(regimenTriburario.getNombre(), nombre);
		regimen.setName(nombre);

		TaxTypeCodeType tipoCodigoImpuesto = new TaxTypeCodeType();
		getCodigo(regimenTriburario.getTipoCodigoImpuesto(), tipoCodigoImpuesto);
		regimen.setTaxTypeCode(tipoCodigoImpuesto);

		for (TipoDireccion direccion : regimenTriburario.getDireccionJurisdiccionRegional()) {
			regimen.getJurisdictionRegionAddress().add(getDireccion(direccion));
		}

		return regimen;
	}

	public void getMedioDePago(TipoMedioPago medPago, PaymentMeansType medioPago) {

		IDType id = new IDType();
		getIdentificador(medPago.getId(), id);
		medioPago.setID(id);

		PaymentMeansCodeType codigoMedioPago = new PaymentMeansCodeType();
		getCodigo(medPago.getCodigoMedioPago(), codigoMedioPago);
		medioPago.setPaymentMeansCode(codigoMedioPago);

		PaymentDueDateType fechaVencimientoPago = new PaymentDueDateType();
		fechaVencimientoPago.setValue(medPago.getFechaVencimientoPago());
		medioPago.setPaymentDueDate(fechaVencimientoPago);

		PaymentChannelCodeType codigoCanalDePago = new PaymentChannelCodeType();
		getCodigo(medPago.getCodigoCanalPago(), codigoCanalDePago);
		medioPago.setPaymentChannelCode(codigoCanalDePago);

		InstructionIDType ordenID = new InstructionIDType();
		getIdentificador(medPago.getOrdenID(), ordenID);
		medioPago.setInstructionID(ordenID);

		for (TipoTexto nota : medPago.getNotaOrden()) {
			InstructionNoteType notaOrden = new InstructionNoteType();
			getTexto(nota, notaOrden);
			medioPago.getInstructionNote().add(notaOrden);
		}

		for (TipoIdentificador idPago : medPago.getIDPago()) {
			PaymentIDType iDPago = new PaymentIDType();
			getIdentificador(idPago, iDPago);
			medioPago.getPaymentID().add(iDPago);
		}
		medioPago.setCardAccount(getcuentaTarjeta(medPago.getCuentaTarjeta()));
		medioPago.setPayerFinancialAccount(
				getCuentaContribuyenteBeneficiario(medPago.getCuentaContribuyenteBeneficiario()));

		medioPago.setPayeeFinancialAccount(
				getCuentaContribuyenteBeneficiario(medPago.getCuentaContribuyenteFinanciero()));
		medioPago.setCreditAccount(getCuentaCredito(medPago.getCuentaCredito()));
	}

	public void getCantidad(BigDecimal cantidadFactura, InvoicedQuantityType cantidadFactu) {
		cantidadFactu.setValue(cantidadFactura);

	}

	public OrderLineReferenceType getReferenciaLineaPedido(TipoReferenciaLineaPedido linea) {

		OrderLineReferenceType lineaReferencia = new OrderLineReferenceType();
		LineIDType iD = new LineIDType();
		getIdentificador(linea.getIDLinea(), iD);
		lineaReferencia.setLineID(iD);

		SalesOrderLineIDType lineaPedidoVenta = new SalesOrderLineIDType();
		getIdentificador(linea.getLineaPedidoVentasID(), lineaPedidoVenta);
		lineaReferencia.setSalesOrderLineID(lineaPedidoVenta);
		UUIDType uuid = new UUIDType();
		getIdentificador(linea.getUUID(), uuid);
		lineaReferencia.setUUID(uuid);

		LineStatusCodeType codigoEstadoLinea = new LineStatusCodeType();
		getCodigo(linea.getCodigoEstadoLinea(), codigoEstadoLinea);
		lineaReferencia.setLineStatusCode(codigoEstadoLinea);

		lineaReferencia.setOrderReference(getReferenciaPedido(linea.getReferenciaPedido()));

		return lineaReferencia;
	}

	private AttachmentType getArchivoAdjunto(TipoArchivoAdjunto archivoAdjunto) {

		AttachmentType archiAdj = new AttachmentType();

		EmbeddedDocumentBinaryObjectType binario = new EmbeddedDocumentBinaryObjectType();
		getObjetobinario(archivoAdjunto.getObjetoBinario(), binario);
		archiAdj.setEmbeddedDocumentBinaryObject(binario);

		archiAdj.setExternalReference(getReferenciaExterna(archivoAdjunto.getReferenciaExterna()));

		return archiAdj;
	}

	private ExternalReferenceType getReferenciaExterna(TipoExternalReference referenciaExterna) {

		ExternalReferenceType refExterna = new ExternalReferenceType();

		DocumentHashType documentHash = new DocumentHashType();
		getTexto(referenciaExterna.getDocumentoHash(), documentHash);
		refExterna.setDocumentHash(documentHash);

		ExpiryDateType fechaExpiracion = new ExpiryDateType();
		fechaExpiracion.setValue(referenciaExterna.getFechaCaducidad());
		refExterna.setExpiryDate(fechaExpiracion);

		URIType uri = new URIType();
		getIdentificador(referenciaExterna.getURI(), uri);
		refExterna.setURI(uri);

		ExpiryTimeType horaExpiracion = new ExpiryTimeType();
		horaExpiracion.setValue(referenciaExterna.getHoraCaducidad());
		refExterna.setExpiryTime(horaExpiracion);

		return refExterna;
	}

	private OrderReferenceType getReferenciaPedido(TipoReferenciaPedido referenciaPedido) {

		OrderReferenceType refePedi = new OrderReferenceType();

		CopyIndicatorType esCopia = new CopyIndicatorType();
		esCopia.setValue(referenciaPedido.isIndicadorCopia());
		refePedi.setCopyIndicator(esCopia);

		CustomerReferenceType referenciaCliente = new CustomerReferenceType();
		getTexto(referenciaPedido.getReferenciaCliente(), referenciaCliente);
		refePedi.setCustomerReference(referenciaCliente);

		refePedi.setDocumentReference(getDocumentoReferencia(referenciaPedido.getDocumentoreferencia()));

		IDType id = new IDType();
		getIdentificador(referenciaPedido.getID(), id);
		refePedi.setID(id);

		IssueDateType fechaAsunto = new IssueDateType();
		fechaAsunto.setValue(referenciaPedido.getFechaAsunto());
		refePedi.setIssueDate(fechaAsunto);

		SalesOrderIDType idOrdenDeVenta = new SalesOrderIDType();
		getIdentificador(referenciaPedido.getIdOrdenesVenta(), idOrdenDeVenta);
		refePedi.setSalesOrderID(idOrdenDeVenta);

		IssueTimeType horaAsunto = new IssueTimeType();
		horaAsunto.setValue(referenciaPedido.getHoraAsunto());
		refePedi.setIssueTime(horaAsunto);

		/*
		 * UUIDType cufe = new UUIDType(); getIdentificador(CUFE, cufe);
		 * refePedi.setUUID(cufe);
		 */
		return refePedi;
	}

	public OrderReferenceType getReferenciaPedidos(TipoReferenciaPedido referenciaPedido, TipoIdentificador CUFE) {

		OrderReferenceType refePedi = new OrderReferenceType();

		CopyIndicatorType esCopia = new CopyIndicatorType();
		esCopia.setValue(referenciaPedido.isIndicadorCopia());
		refePedi.setCopyIndicator(esCopia);

		CustomerReferenceType referenciaCliente = new CustomerReferenceType();
		getTexto(referenciaPedido.getReferenciaCliente(), referenciaCliente);
		refePedi.setCustomerReference(referenciaCliente);

		refePedi.setDocumentReference(getDocumentoReferencia(referenciaPedido.getDocumentoreferencia()));

		IDType id = new IDType();
		getIdentificador(referenciaPedido.getID(), id);
		refePedi.setID(id);

		IssueDateType fechaAsunto = new IssueDateType();
		fechaAsunto.setValue(referenciaPedido.getFechaAsunto());
		refePedi.setIssueDate(fechaAsunto);

		SalesOrderIDType idOrdenDeVenta = new SalesOrderIDType();
		getIdentificador(referenciaPedido.getIdOrdenesVenta(), idOrdenDeVenta);
		refePedi.setSalesOrderID(idOrdenDeVenta);

		IssueTimeType horaAsunto = new IssueTimeType();
		horaAsunto.setValue(referenciaPedido.getHoraAsunto());
		refePedi.setIssueTime(horaAsunto);

		UUIDType cufe = new UUIDType();
		getIdentificador(CUFE, cufe);
		refePedi.setUUID(cufe);

		return refePedi;
	}

	public DocumentReferenceType getDocumentoReferencia(TipoDocumentoReferencia documentoReferencia) {

		DocumentReferenceType docuRefe = new DocumentReferenceType();

		docuRefe.setAttachment(getArchivoAdjunto(documentoReferencia.getArchivoAdjunto()));

		CopyIndicatorType esCopia = new CopyIndicatorType();
		esCopia.setValue(documentoReferencia.isCopiaIndicador());
		docuRefe.setCopyIndicator(esCopia);

		DocumentTypeType documento = new DocumentTypeType();
		getTexto(documentoReferencia.getTipoDocumento(), documento);
		docuRefe.setDocumentType(documento);

		DocumentTypeCodeType codigoDocumento = new DocumentTypeCodeType();
		getCodigo(documentoReferencia.getTipoCodigoDocumento(), codigoDocumento);
		docuRefe.setDocumentTypeCode(codigoDocumento);

		IDType id = new IDType();
		getIdentificador(documentoReferencia.getID(), id);
		docuRefe.setID(id);

		IssueDateType fechaAsunto = new IssueDateType();
		fechaAsunto.setValue(documentoReferencia.getFechaAsunto());
		docuRefe.setIssueDate(fechaAsunto);

		UUIDType uid = new UUIDType();
		getIdentificador(documentoReferencia.getUUID(), uid);
		docuRefe.setUUID(uid);

		for (TipoTexto xpath : documentoReferencia.getXPath()) {

			XPathType path = new XPathType();
			getTexto(xpath, path);
			docuRefe.getXPath().add(path);
		}

		return docuRefe;
	}

	public LineReferenceType getLineaReferencia(TipoLineaReferencia lineaReferencia) {

		LineReferenceType referencia = new LineReferenceType();
		referencia.setDocumentReference(getDocumentoReferencia(lineaReferencia.getDocumentoReferencia()));
		LineStatusCodeType codigoEstadoLinea = new LineStatusCodeType();
		getCodigo(lineaReferencia.getCodigoEstadoLinea(), codigoEstadoLinea);
		referencia.setLineStatusCode(codigoEstadoLinea);
		UUIDType uuid = new UUIDType();
		getIdentificador(lineaReferencia.getUUID(), uuid);
		referencia.setUUID(uuid);
		LineIDType iDLinea = new LineIDType();
		getIdentificador(lineaReferencia.getIDLinea(), iDLinea);
		referencia.setLineID(iDLinea);

		return referencia;
	}

	public BillingReferenceType getReferenciaFactura(TipoReferenciaFactura referenciaFactura) {

		BillingReferenceType refeFact = new BillingReferenceType();

		refeFact.setAdditionalDocumentReference(
				getDocumentoReferencia(referenciaFactura.getReferenciaDocumentoAdicional()));
		refeFact.setCreditNoteDocumentReference(
				getDocumentoReferencia(referenciaFactura.getReferenciaDocumentoNotaCredito()));
		refeFact.setDebitNoteDocumentReference(
				getDocumentoReferencia(referenciaFactura.getReferenciaDocumentoNotaDebito()));
		refeFact.setInvoiceDocumentReference(getDocumentoReferencia(referenciaFactura.getReferenciaDocumentoFactura()));
		refeFact.setReminderDocumentReference(
				getDocumentoReferencia(referenciaFactura.getRecordatorioDocumentonameerencia()));
		refeFact.setSelfBilledCreditNoteDocumentReference(
				getDocumentoReferencia(referenciaFactura.getReferenciaDocumentoNotaCreditoFacturada()));
		refeFact.setSelfBilledInvoiceDocumentReference(
				getDocumentoReferencia(referenciaFactura.getReferenciaDocumentoFacturaAutoFacturada()));

		for (TipoReferenciaLineaFactura lineaReferencia : referenciaFactura.getLineaReferenciaFactura()) {

			refeFact.getBillingReferenceLine().add(getLineaReferencia(lineaReferencia));
		}

		return refeFact;
	}

	private BillingReferenceLineType getLineaReferencia(TipoReferenciaLineaFactura lineaReferencia) {

		BillingReferenceLineType lineaRef = new BillingReferenceLineType();

		AmountType monto = new AmountType();
		getMonto(lineaReferencia.getMonto(), monto);
		lineaRef.setAmount(monto);

		IDType id = new IDType();
		getIdentificador(lineaReferencia.getID(), id);
		lineaRef.setID(id);

		for (TipoCargo cargo : lineaReferencia.getCargo()) {
			lineaRef.getAllowanceCharge().add(getCargos(cargo));
		}

		return lineaRef;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType getCargos(
			TipoCargo cargo) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType c = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType();

		AccountingCostType CostoContable = new AccountingCostType();
		getTexto(cargo.getCostoContable(), CostoContable);
		c.setAccountingCost(CostoContable);

		AccountingCostCodeType CodigoCostoContable = new AccountingCostCodeType();
		getCodigo(cargo.getCodigoCostoContable(), CodigoCostoContable);
		c.setAccountingCostCode(CodigoCostoContable);

		AllowanceChargeReasonType RazonAsignacionCargo = new AllowanceChargeReasonType();
		getTexto(cargo.getRazonAsignacionCargo(), RazonAsignacionCargo);
		c.setAllowanceChargeReason(RazonAsignacionCargo);

		AllowanceChargeReasonCodeType CodigoRazonAsignacionCargo = new AllowanceChargeReasonCodeType();
		getCodigo(cargo.getCodigoRazonAsignacionCargo(), CodigoRazonAsignacionCargo);
		c.setAllowanceChargeReasonCode(CodigoRazonAsignacionCargo);

		AmountType monto = new AmountType();
		getMonto(cargo.getMonto(), monto);
		c.setAmount(monto);

		BaseAmountType MontoBase = new BaseAmountType();
		getMonto(cargo.getMontoBase(), MontoBase);
		c.setBaseAmount(MontoBase);

		ChargeIndicatorType IndicadorCarga = new ChargeIndicatorType();
		IndicadorCarga.setValue(cargo.isIndicadorCarga());
		c.setChargeIndicator(IndicadorCarga);

		IDType id = new IDType();
		getIdentificador(cargo.getID(), id);
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

		c.setTaxTotal(getImpues(cargo.getImpuestoTotal()));

		for (TipoMedioPago medioPago : cargo.getMedioPago()) {
			PaymentMeansType MedioPago = new PaymentMeansType();
			getMedioDePago(medioPago, MedioPago);
			c.getPaymentMeans().add(MedioPago);
		}

		for (TipoImpuestoCategoria impuestos : cargo.getCategoriaImpuesto()) {
			c.getTaxCategory().add(getImpuestoCategoria(impuestos));
		}

		return c;
	}

	public PricingReferenceType getReferenciaPrecios(TipoReferenciaPrecios referenciaPrecios) {

		PricingReferenceType referenciaPrecio = new PricingReferenceType();
		ItemLocationQuantityType CantidadOriginalUbicacionArticulo;
		referenciaPrecio.setOriginalItemLocationQuantity(
				getCantidadOriginalArticulo(referenciaPrecios.getCantidadOriginalUbicacionArticulo()));
		for (TipoPrecio PrecioAlternativoCondicion : referenciaPrecios.getPrecioAlternativoCondicion()) {
			referenciaPrecio.getAlternativeConditionPrice().add(getPrecio2(PrecioAlternativoCondicion));

		}

		return referenciaPrecio;
	}

	public co.gov.dian.contratos.facturaelectronica.v1.PriceType getPrecio(TipoPrecio precios) {

		co.gov.dian.contratos.facturaelectronica.v1.PriceType precio = new co.gov.dian.contratos.facturaelectronica.v1.PriceType();

		BaseQuantityType cantidadBase = new BaseQuantityType();
		getCantidad(precios.getCantidadBase(), cantidadBase);
		precio.setBaseQuantity(cantidadBase);

		OrderableUnitFactorRateType precioFactorUnidad = new OrderableUnitFactorRateType();
		precioFactorUnidad.setValue(precios.getPrecioFactorUnidad());
		precio.setOrderableUnitFactorRate(precioFactorUnidad);

		PriceAmountType precioMonto = new PriceAmountType();
		getMonto(precios.getPrecioMonto(), precioMonto);
		precio.setPriceAmount(precioMonto);

		precio.setPriceList(getListaPrecios(precios.getListaPrecios()));

		precio.setPriceType(getTipoPrecio(precios.getTipoPrecio()));

		PriceTypeCodeType tipoCodigoPrecio = new PriceTypeCodeType();
		getCodigo(precios.getTipoCodigoPrecio(), tipoCodigoPrecio);
		precio.setPriceTypeCode(tipoCodigoPrecio);

		for (TipoCargo cargo : precios.getCargo()) {
			precio.getAllowanceCharge().add(getCargos(cargo));
		}

		for (TipoTexto razoncambio : precios.getRazonCambioPreio()) {
			PriceChangeReasonType razonCambioPreio = new PriceChangeReasonType();
			getTexto(razoncambio, razonCambioPreio);
			precio.getPriceChangeReason().add(razonCambioPreio);
		}

		for (TipoPeriodo periodo : precios.getPeriodoValidez()) {
			PeriodType periodoValidez = new PeriodType();
			getPeriodo(periodo, periodoValidez);
			precio.getValidityPeriod().add(periodoValidez);
		}
		return precio;
	}

	public PriceType getPrecio2(TipoPrecio precios) {

		PriceType precio = new PriceType();

		BaseQuantityType cantidadBase = new BaseQuantityType();
		getCantidad(precios.getCantidadBase(), cantidadBase);
		precio.setBaseQuantity(cantidadBase);

		OrderableUnitFactorRateType precioFactorUnidad = new OrderableUnitFactorRateType();
		precioFactorUnidad.setValue(precios.getPrecioFactorUnidad());
		precio.setOrderableUnitFactorRate(precioFactorUnidad);

		PriceAmountType precioMonto = new PriceAmountType();
		getMonto(precios.getPrecioMonto(), precioMonto);
		precio.setPriceAmount(precioMonto);

		precio.setPriceList(getListaPrecios(precios.getListaPrecios()));

		precio.setPriceType(getTipoPrecio(precios.getTipoPrecio()));

		PriceTypeCodeType tipoCodigoPrecio = new PriceTypeCodeType();
		getCodigo(precios.getTipoCodigoPrecio(), tipoCodigoPrecio);
		precio.setPriceTypeCode(tipoCodigoPrecio);

		for (TipoCargo cargo : precios.getCargo()) {
			precio.getAllowanceCharge().add(getCargos(cargo));
		}

		for (TipoTexto razoncambio : precios.getRazonCambioPreio()) {
			PriceChangeReasonType razonCambioPreio = new PriceChangeReasonType();
			getTexto(razoncambio, razonCambioPreio);
			precio.getPriceChangeReason().add(razonCambioPreio);
		}

		for (TipoPeriodo periodo : precios.getPeriodoValidez()) {
			PeriodType periodoValidez = new PeriodType();
			getPeriodo(periodo, periodoValidez);
			precio.getValidityPeriod().add(periodoValidez);
		}
		return precio;
	}

	private ItemLocationQuantityType getCantidadOriginalArticulo(TipoUbicacionCantidadArticulo c) {

		ItemLocationQuantityType cantidad = new ItemLocationQuantityType();

		HazardousRiskIndicatorType indicadorRiesgo = new HazardousRiskIndicatorType();
		indicadorRiesgo.setValue(c.isIndicadorRiesgo());
		cantidad.setHazardousRiskIndicator(indicadorRiesgo);

		LeadTimeMeasureType medidaPlazoEntrega = new LeadTimeMeasureType();
		getMedida(c.getMedidaPlazoEntrega(), medidaPlazoEntrega);
		cantidad.setLeadTimeMeasure(medidaPlazoEntrega);

		MaximumQuantityType cantidadMaxima = new MaximumQuantityType();
		getCantidad(c.getCantidadMaxima(), cantidadMaxima);
		cantidad.setMaximumQuantity(cantidadMaxima);

		MinimumQuantityType cantidadMinima = new MinimumQuantityType();
		getCantidad(c.getCantidadMinima(), cantidadMinima);
		cantidad.setMinimumQuantity(cantidadMinima);

		cantidad.setPrice(getPrecio2(c.getPrecio()));
		for (TipoImpuestoCategoria ci : c.getCategoriaImpuestoAplicable()) {
			cantidad.getApplicableTaxCategory().add(getImpuestoCategoria(ci));
		}

		for (TipoUnidadEntrega unidadEnt : c.getUnidadEntrega()) {
			cantidad.getDeliveryUnit().add(getUnidadEntrega(unidadEnt));
		}

		for (TipoTexto restricciones : c.getRestringcionesComerciales()) {
			TradingRestrictionsType restringcionesComerciales = new TradingRestrictionsType();
			getTexto(restricciones, restringcionesComerciales);
			cantidad.getTradingRestrictions().add(restringcionesComerciales);
		}

		for (TipoDireccion dirTerrAplic : c.getDireccionTerritorioAplicable()) {
			cantidad.getApplicableTerritoryAddress().add(getDireccion(dirTerrAplic));
		}

		return cantidad;
	}

	private DeliveryUnitType getUnidadEntrega(TipoUnidadEntrega unidadEnt) {

		DeliveryUnitType unidadDeEntrega = new DeliveryUnitType();
		BatchQuantityType cantidadLote = new BatchQuantityType();
		getCantidad(unidadEnt.getCantidadLote(), cantidadLote);
		unidadDeEntrega.setBatchQuantity(cantidadLote);

		ConsumerUnitQuantityType cantidadUnidadConsumo = new ConsumerUnitQuantityType();
		getCantidad(unidadEnt.getCantidadUnidadConsumo(), cantidadUnidadConsumo);
		unidadDeEntrega.setConsumerUnitQuantity(cantidadUnidadConsumo);

		HazardousRiskIndicatorType indicadorRiesgo = new HazardousRiskIndicatorType();
		indicadorRiesgo.setValue(unidadEnt.isIndicadorRiesgo());
		unidadDeEntrega.setHazardousRiskIndicator(indicadorRiesgo);
		return unidadDeEntrega;
	}

	private void getCantidad(BigDecimal cantidadUnidadConsumo, ConsumerUnitQuantityType cantidadConsumo) {
		cantidadConsumo.setValue(cantidadUnidadConsumo);

	}

	private void getCantidad(BigDecimal cantidadLote, BatchQuantityType cantidadLote2) {
		cantidadLote2.setValue(cantidadLote);

	}

	private void getMedida(BigDecimal medidaPlazoEntrega, LeadTimeMeasureType medidaPlazoEntrega2) {
		medidaPlazoEntrega2.setValue(medidaPlazoEntrega);

	}

	public void getCantidad(BigDecimal cantidadBase, BaseQuantityType cantidadBase2) {
		cantidadBase2.setValue(cantidadBase);

	}

	private PriceListType getListaPrecios(TipoListaPrecios listaPrecios) {

		PriceListType lista = new PriceListType();
		IDType id = new IDType();
		getIdentificador(listaPrecios.getID(), id);
		lista.setID(id);

		lista.setPreviousPriceList(getListaPrecios(listaPrecios.getListaPreciosPrevia()));
		StatusCodeType codigoDeEstado = new StatusCodeType();
		getCodigo(listaPrecios.getCodigoEstado(), codigoDeEstado);
		lista.setStatusCode(codigoDeEstado);
		return lista;
	}

	private PriceTypeType getTipoPrecio(TipoTexto tipoPrecio) {

		PriceTypeType precio = new PriceTypeType();
		precio.setLanguageID(tipoPrecio.getIdIdioma());
		precio.setValue(tipoPrecio.getValue());
		return precio;
	}

	public ItemIdentificationType getIdentificacionArticulos(TipoIdentificacionArticulos iden) {

		ItemIdentificationType idItem = new ItemIdentificationType();
		ExtendedIDType idExtendido = new ExtendedIDType();
		getIdentificador(iden.getIDProrroga(), idExtendido);
		idItem.setExtendedID(idExtendido);
		IDType id = new IDType();
		getIdentificador(iden.getId(), id);
		idItem.setID(id);

		idItem.setIssuerParty(getTercero(iden.getTerceroEmisor()));

		for (TipoDimension medida : iden.getDimensionMedida()) {
			DimensionType medidas = new DimensionType();
			getMedida(medida, medidas);
			idItem.getMeasurementDimension().add(medidas);
		}

		for (TipoAtriburoFisico atr : iden.getAtriburoFisico()) {

			idItem.getPhysicalAttribute().add(getAtributos(atr));
		}

		return idItem;
	}

	private PhysicalAttributeType getAtributos(TipoAtriburoFisico atr) {

		PhysicalAttributeType atributos = new PhysicalAttributeType();
		AttributeIDType id = new AttributeIDType();
		getIdentificador(atr.getIDAtriburo(), id);
		atributos.setAttributeID(id);
		DescriptionCodeType codigoDescripcion = new DescriptionCodeType();
		getCodigo(atr.getCodigoDescripcion(), codigoDescripcion);
		atributos.setDescriptionCode(codigoDescripcion);
		PositionCodeType codigoPosicion = new PositionCodeType();
		getCodigo(atr.getCodigoPosision(), codigoPosicion);
		atributos.setPositionCode(codigoPosicion);
		for (TipoTexto descr : atr.getDescripcion()) {

			DescriptionType descripcion = new DescriptionType();
			getTexto(descr, descripcion);
			atributos.getDescription().add(descripcion);
		}
		return atributos;
	}

	private void getMedida(TipoDimension medida, DimensionType medidas) {
		AttributeIDType id = new AttributeIDType();
		getIdentificador(medida.getIDAtriburo(), id);
		medidas.setAttributeID(id);
		MaximumMeasureType medidaMaxima = new MaximumMeasureType();
		getMedida(medida.getMedidaMaxima(), medidaMaxima);
		medidas.setMaximumMeasure(medidaMaxima);
		MeasureType medidaValor = new MeasureType();
		getMedida(medida.getMedida(), medidaValor);
		medidas.setMeasure(medidaValor);
		MinimumMeasureType medidaMinima = new MinimumMeasureType();
		getMedida(medida.getMedidaMinima(), medidaMinima);
		medidas.setMinimumMeasure(medidaMinima);

	}

	private void getMedida(BigDecimal medidaMin, MinimumMeasureType medidaMinima) {
		medidaMinima.setValue(medidaMin);

	}

	private void getMedida(BigDecimal medida, MeasureType medidaValor) {
		medidaValor.setValue(medida);

	}

	private void getMedida(BigDecimal medidaMax, MaximumMeasureType medidaMaxima) {
		medidaMaxima.setValue(medidaMax);

	}

	public CommodityClassificationType getClasificacionMercancia(TipoClasificacionMercancia mercancia) {

		CommodityClassificationType clasificacion = new CommodityClassificationType();
		CargoTypeCodeType tipoCodigoCargo = new CargoTypeCodeType();
		getCodigo(mercancia.getTipoCodigoCargo(), tipoCodigoCargo);
		clasificacion.setCargoTypeCode(tipoCodigoCargo);

		CommodityCodeType codigoMercancia = new CommodityCodeType();
		getCodigo(mercancia.getCodigoMercancia(), codigoMercancia);
		clasificacion.setCommodityCode(codigoMercancia);

		ItemClassificationCodeType codigoClasificacionArticulo = new ItemClassificationCodeType();
		getCodigo(mercancia.getCodigoClasificacionArticulo(), codigoClasificacionArticulo);
		clasificacion.setItemClassificationCode(codigoClasificacionArticulo);

		NatureCodeType codigoNatural = new NatureCodeType();
		getCodigo(mercancia.getCodigoNatural(), codigoNatural);
		clasificacion.setNatureCode(codigoNatural);

		return clasificacion;
	}

	public TransactionConditionsType getCondicionesTransaccion(TipoCondicionesTransaccion tran) {

		TransactionConditionsType transaccion = new TransactionConditionsType();
		ActionCodeType codigoAccion = new ActionCodeType();
		getCodigo(tran.getCodigoAccion(), codigoAccion);
		transaccion.setActionCode(codigoAccion);
		IDType id = new IDType();
		getIdentificador(tran.getID(), id);
		transaccion.setID(id);
		for (TipoTexto doc : tran.getDescripcion()) {
			DescriptionType descripcion = new DescriptionType();
			getTexto(doc, descripcion);
			transaccion.getDescription().add(descripcion);
		}
		for (TipoDocumentoReferencia ref : tran.getDocumentoReferencia()) {
			transaccion.getDocumentReference().add(getDocumentoReferencia(ref));
		}
		return transaccion;
	}

	public HazardousItemType getArticuloPeligroso(TipoArticuloPeligroso articulos) {

		HazardousItemType artPeligroso = new HazardousItemType();

		AdditionalInformationType informacionAdicional = new AdditionalInformationType();
		getTexto(articulos.getInformacionAdicional(), informacionAdicional);
		artPeligroso.setAdditionalInformation(informacionAdicional);

		CategoryNameType nombreCategoria = new CategoryNameType();
		getNombre(articulos.getNombreCategoria(), nombreCategoria);
		artPeligroso.setCategoryName(nombreCategoria);

		artPeligroso.setContactParty(getTercero(articulos.getContactoTercero()));

		EmergencyProceduresCodeType codigoProcedimientosEmergencia = new EmergencyProceduresCodeType();
		getCodigo(articulos.getCodigoProcedimientosEmergencia(), codigoProcedimientosEmergencia);
		artPeligroso.setEmergencyProceduresCode(codigoProcedimientosEmergencia);

		artPeligroso.setEmergencyTemperature(getTemperaturaEmergencia(articulos.getTemperaturaEmergencia()));
		artPeligroso.setFlashpointTemperature(getTemperaturaEmergencia(articulos.getTemperaturaPuntoCritico()));

		HazardClassIDType claseRiesgoID = new HazardClassIDType();
		getIdentificador(articulos.getClaseRiesgoID(), claseRiesgoID);
		artPeligroso.setHazardClassID(claseRiesgoID);

		HazardousCategoryCodeType codigoCategoriaRiesgo = new HazardousCategoryCodeType();
		getCodigo(articulos.getCodigoCategoriaRiesgo(), codigoCategoriaRiesgo);
		artPeligroso.setHazardousCategoryCode(codigoCategoriaRiesgo);

		IDType iD = new IDType();
		getIdentificador(articulos.getID(), iD);
		artPeligroso.setID(iD);

		LowerOrangeHazardPlacardIDType cartelRiesgoInferiorNaranjaID = new LowerOrangeHazardPlacardIDType();
		getIdentificador(articulos.getCartelRiesgoInferiorNaranjaID(), cartelRiesgoInferiorNaranjaID);
		artPeligroso.setLowerOrangeHazardPlacardID(cartelRiesgoInferiorNaranjaID);

		MarkingIDType marcaID = new MarkingIDType();
		getIdentificador(articulos.getMarcaID(), marcaID);
		artPeligroso.setMarkingID(marcaID);

		MedicalFirstAidGuideCodeType codigoGuiaPrimerosAuxiliosMedico = new MedicalFirstAidGuideCodeType();
		getCodigo(articulos.getCodigoGuiaPrimerosAuxiliosMedico(), codigoGuiaPrimerosAuxiliosMedico);
		artPeligroso.setMedicalFirstAidGuideCode(codigoGuiaPrimerosAuxiliosMedico);

		NetVolumeMeasureType medidaNetaVolumen = new NetVolumeMeasureType();
		getMedida(articulos.getMedidaNetaVolumen(), medidaNetaVolumen);
		artPeligroso.setNetVolumeMeasure(medidaNetaVolumen);

		NetWeightMeasureType medidaNetaPeso = new NetWeightMeasureType();
		getMedida(articulos.getMedidaNetaPeso(), medidaNetaPeso);
		artPeligroso.setNetWeightMeasure(medidaNetaPeso);

		PlacardEndorsementType aprobacionCartel = new PlacardEndorsementType();
		getTexto(articulos.getAprobacionCartel(), aprobacionCartel);
		artPeligroso.setPlacardEndorsement(aprobacionCartel);

		PlacardNotationType notaCartel = new PlacardNotationType();
		getTexto(articulos.getNotaCartel(), notaCartel);
		artPeligroso.setPlacardNotation(notaCartel);

		QuantityType cantidad = new QuantityType();
		getCantidad(articulos.getCantidad(), cantidad);
		artPeligroso.setQuantity(cantidad);

		TechnicalNameType nombreTecnico = new TechnicalNameType();
		getNombre(articulos.getNombreTecnico(), nombreTecnico);
		artPeligroso.setTechnicalName(nombreTecnico);

		UNDGCodeType codigoUNDG = new UNDGCodeType();
		getCodigo(articulos.getCodigoUNDG(), codigoUNDG);
		artPeligroso.setUNDGCode(codigoUNDG);

		UpperOrangeHazardPlacardIDType iDCartelRiesgoSuperiorNaranja = new UpperOrangeHazardPlacardIDType();
		getIdentificador(articulos.getIDCartelRiesgoSuperiorNaranja(), iDCartelRiesgoSuperiorNaranja);
		artPeligroso.setUpperOrangeHazardPlacardID(iDCartelRiesgoSuperiorNaranja);

		for (TipoTemperatura tempAd : articulos.getTemperaturaAdicional()) {
			artPeligroso.getAdditionalTemperature().add(getTemperaturaEmergencia(tempAd));
		}

		for (TipoTransitoBienArriesgado tranbienArriesgado : articulos.getTransitoBienesArriesgado()) {
			artPeligroso.getHazardousGoodsTransit().add(getTransitoBienesArriesgado(tranbienArriesgado));
		}

		for (TipoRiesgoSecundario riesgSecund : articulos.getRiesgoSecundario()) {
			artPeligroso.getSecondaryHazard().add(getRiesgoSecundario(riesgSecund));

		}

		return artPeligroso;
	}

	private SecondaryHazardType getRiesgoSecundario(TipoRiesgoSecundario riesgSecund) {

		SecondaryHazardType riesgo = new SecondaryHazardType();
		EmergencyProceduresCodeType codigoProcedimientoEmergencia = new EmergencyProceduresCodeType();
		getCodigo(riesgSecund.getCodigoProcedimientoEmergencia(), codigoProcedimientoEmergencia);
		riesgo.setEmergencyProceduresCode(codigoProcedimientoEmergencia);

		ExtensionType extension = new ExtensionType();
		getTexto(riesgSecund.getExtension(), extension);
		riesgo.setExtension(extension);

		IDType id = new IDType();
		getIdentificador(riesgSecund.getID(), id);
		riesgo.setID(id);

		PlacardEndorsementType aprobacionCartel = new PlacardEndorsementType();
		getTexto(riesgSecund.getAprobacionCartel(), aprobacionCartel);
		riesgo.setPlacardEndorsement(aprobacionCartel);

		PlacardNotationType notaCartel = new PlacardNotationType();
		getTexto(riesgSecund.getNotaCartel(), notaCartel);
		riesgo.setPlacardNotation(notaCartel);

		return riesgo;
	}

	private HazardousGoodsTransitType getTransitoBienesArriesgado(TipoTransitoBienArriesgado tranbienArriesgado) {

		HazardousGoodsTransitType ambiente = new HazardousGoodsTransitType();

		HazardousRegulationCodeType codigoRegularionArriesgado = new HazardousRegulationCodeType();
		getCodigo(tranbienArriesgado.getCodigoRegularionArriesgado(), codigoRegularionArriesgado);
		ambiente.setHazardousRegulationCode(codigoRegularionArriesgado);

		InhalationToxicityZoneCodeType codigoZonaToxicaInhalacion = new InhalationToxicityZoneCodeType();
		getCodigo(tranbienArriesgado.getCodigoZonaToxicaInhalacion(), codigoZonaToxicaInhalacion);
		ambiente.setInhalationToxicityZoneCode(codigoZonaToxicaInhalacion);

		ambiente.setMaximumTemperature(getTemperaturaEmergencia(tranbienArriesgado.getTemperaturaMaxima()));

		ambiente.setMinimumTemperature(getTemperaturaEmergencia(tranbienArriesgado.getTemperaturaMinima()));

		PackingCriteriaCodeType codigoCriterioPaquete = new PackingCriteriaCodeType();
		getCodigo(tranbienArriesgado.getCodigoCriterioPaquete(), codigoCriterioPaquete);
		ambiente.setPackingCriteriaCode(codigoCriterioPaquete);

		TransportAuthorizationCodeType codigoAutorizacionTransporte = new TransportAuthorizationCodeType();
		getCodigo(tranbienArriesgado.getCodigoAutorizacionTransporte(), codigoAutorizacionTransporte);
		ambiente.setTransportAuthorizationCode(codigoAutorizacionTransporte);

		TransportEmergencyCardCodeType transporteCodigoTarjetaEmergencia = new TransportEmergencyCardCodeType();
		getCodigo(tranbienArriesgado.getTransporteCodigoTarjetaEmergencia(), transporteCodigoTarjetaEmergencia);
		ambiente.setTransportEmergencyCardCode(transporteCodigoTarjetaEmergencia);

		return ambiente;

	}

	private void getMedida(BigDecimal medidaNetaPeso, NetWeightMeasureType medidaPeso) {
		medidaPeso.setValue(medidaNetaPeso);

	}

	private void getMedida(BigDecimal medidaNetaVolumen, NetVolumeMeasureType medidaNetaVolumen2) {
		medidaNetaVolumen2.setValue(medidaNetaVolumen);
	}

	private TemperatureType getTemperaturaEmergencia(TipoTemperatura temperaturaEmergencia) {

		TemperatureType temp = new TemperatureType();
		AttributeIDType id = new AttributeIDType();
		getIdentificador(temperaturaEmergencia.getIDAtributo(), id);
		temp.setAttributeID(id);

		MeasureType medida = new MeasureType();
		getMedida(temperaturaEmergencia.getMedida(), medida);
		temp.setMeasure(medida);
		for (TipoTexto desc : temperaturaEmergencia.getDescripcion()) {
			DescriptionType descripcion = new DescriptionType();
			getTexto(desc, descripcion);
			temp.getDescription().add(descripcion);
		}
		return temp;
	}

	public ItemPropertyType getPropiedadArticuloAdicional(TipoPropiedadArticulo artAdicional) {

		ItemPropertyType item = new ItemPropertyType();

		NameType nombre = new NameType();
		getNombre(artAdicional.getNombre(), nombre);
		item.setName(nombre);

		PeriodType periodoUsabilidad = new PeriodType();
		getPeriodo(artAdicional.getPeriodoUsabilidad(), periodoUsabilidad);
		item.setUsabilityPeriod(periodoUsabilidad);

		ValueType valor = new ValueType();
		getTexto(artAdicional.getValor(), valor);
		item.setValue(valor);

		for (TipoGrupoPropiedadesArticulo grupPropArt : artAdicional.getGrupoPropiedadesArticulo()) {

			ItemPropertyGroupType grupoPropiedadesArticulo = new ItemPropertyGroupType();

			IDType ids = new IDType();
			getIdentificador(grupPropArt.getID(), ids);
			grupoPropiedadesArticulo.setID(ids);

			NameType nombres = new NameType();
			getNombre(grupPropArt.getNombre(), nombres);
			grupoPropiedadesArticulo.setName(nombres);

			item.getItemPropertyGroup().add(grupoPropiedadesArticulo);
		}

		return item;
	}

	public ItemInstanceType getInstanciaArticulo(TipoInstanciaArticulo instArticulo) {

		ItemInstanceType item = new ItemInstanceType();

		LotIdentificationType identificacionLote = new LotIdentificationType();
		getIdentificadorLote(instArticulo.getIdentificacionLote(), identificacionLote);
		item.setLotIdentification(identificacionLote);

		ManufactureDateType fechaFabricacion = new ManufactureDateType();
		fechaFabricacion.setValue(instArticulo.getFechaFabricacion());
		item.setManufactureDate(fechaFabricacion);

		ManufactureTimeType horaFacturacion = new ManufactureTimeType();
		horaFacturacion.setValue(instArticulo.getHoraFacturacion());
		item.setManufactureTime(horaFacturacion);

		ProductTraceIDType rastroProductoID = new ProductTraceIDType();
		getIdentificador(instArticulo.getRastroProductoID(), rastroProductoID);
		item.setProductTraceID(rastroProductoID);

		RegistrationIDType iDRegistro = new RegistrationIDType();
		getIdentificador(instArticulo.getIDRegistro(), iDRegistro);
		item.setRegistrationID(iDRegistro);

		SerialIDType iDSerie = new SerialIDType();
		getIdentificador(instArticulo.getIDSerie(), iDSerie);
		item.setSerialID(iDSerie);

		for (TipoPropiedadArticulo propAdic : instArticulo.getPropiedadAdicionalArticulo()) {
			item.getAdditionalItemProperty().add(getPropiedadArticuloAdicional(propAdic));
		}
		return item;
	}

	private void getIdentificadorLote(TipoIdentificacionLote identificacionLote,
			LotIdentificationType identificacionLote2) {

		ExpiryDateType fechaExpiracion = new ExpiryDateType();
		fechaExpiracion.setValue(identificacionLote.getFechaVencimiento());
		identificacionLote2.setExpiryDate(fechaExpiracion);

		LotNumberIDType loteNumero = new LotNumberIDType();
		getIdentificador(identificacionLote.getIDNumeroLote(), loteNumero);
		identificacionLote2.setLotNumberID(loteNumero);
		for (TipoPropiedadArticulo item : identificacionLote.getPropiedadAdicionalArticulo()) {

			identificacionLote2.getAdditionalItemProperty().add(getPropiedadArticuloAdicional(item));
		}

	}

	public PartyLegalEntityType getEntidadlegal(TipoEntidadLegalTercero entidad) {

		PartyLegalEntityType entidadLegal = new PartyLegalEntityType();
		CorporateRegistrationSchemeType esquemaRegistroCorporativo = new CorporateRegistrationSchemeType();

		entidadLegal
				.setCorporateRegistrationScheme(getEsquemaRegistroCorporativo(entidad.getEsquemaRegistroCorporativo()));
		CompanyIDType iDEmpresa = new CompanyIDType();
		getIdentificador(entidad.getIDEmpresa(), iDEmpresa);
		entidadLegal.setCompanyID(iDEmpresa);
		entidadLegal.setRegistrationAddress(getDireccion(entidad.getDireccionRegistro()));
		RegistrationNameType nombreRegistro = new RegistrationNameType();
		getNombre(entidad.getNombreRegistro(), nombreRegistro);
		entidadLegal.setRegistrationName(nombreRegistro);

		return entidadLegal;
	}

	private CorporateRegistrationSchemeType getEsquemaRegistroCorporativo(TipoEsquemaRegistroCorporativo esquema) {

		CorporateRegistrationSchemeType corporacion = new CorporateRegistrationSchemeType();

		CorporateRegistrationTypeCodeType tipoCodigoRegistroCorporativo = new CorporateRegistrationTypeCodeType();
		getCodigo(esquema.getTipoCodigoRegistroCorporativo(), tipoCodigoRegistroCorporativo);
		corporacion.setCorporateRegistrationTypeCode(tipoCodigoRegistroCorporativo);

		IDType id = new IDType();
		getIdentificador(esquema.getID(), id);
		corporacion.setID(id);
		NameType nombre = new NameType();
		getNombre(esquema.getNombre(), nombre);
		corporacion.setName(nombre);
		for (TipoDireccion direccion : esquema.getDireccionRegionJurisdiccion()) {
			corporacion.getJurisdictionRegionAddress().add(getDireccion(direccion));
		}
		return corporacion;
	}

	public PartyTaxSchemeType getEsquemaImpuestosTercero(TipoEsquemaImpuestosTercero esquemaImpuestos) {
		PartyTaxSchemeType esquema = new PartyTaxSchemeType();

		CompanyIDType iDEmpresa = new CompanyIDType();
		getIdentificador(esquemaImpuestos.getIDEmpresa(), iDEmpresa);
		esquema.setCompanyID(iDEmpresa);

		ExemptionReasonType razonExencion = new ExemptionReasonType();
		getTexto(esquemaImpuestos.getRazonExencion(), razonExencion);
		esquema.setExemptionReason(razonExencion);

		ExemptionReasonCodeType codigoRazonExencion = new ExemptionReasonCodeType();
		getCodigo(esquemaImpuestos.getCodigoRazonExencion(), codigoRazonExencion);
		esquema.setExemptionReasonCode(codigoRazonExencion);

		esquema.setRegistrationAddress(getDireccion(esquemaImpuestos.getDireccionRegistro()));

		RegistrationNameType nombre = new RegistrationNameType();
		getNombre(esquemaImpuestos.getNombreRegistro(), nombre);
		esquema.setRegistrationName(nombre);

		TaxLevelCodeType codigoNivelImpuestos = new TaxLevelCodeType();
		getCodigo(esquemaImpuestos.getCodigoNivelImpuestos(), codigoNivelImpuestos);
		esquema.setTaxLevelCode(codigoNivelImpuestos);

		esquema.setTaxScheme(getEsquemaImpuestos(esquemaImpuestos.getEsquemaImpuestos()));

		return esquema;
	}

	public void getCantidad(BigDecimal cantidadPaquete, PackQuantityType cantidadPaquete2) {

		cantidadPaquete2.setValue(cantidadPaquete);

	}

}

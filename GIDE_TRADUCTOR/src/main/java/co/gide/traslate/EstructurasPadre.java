package co.gide.traslate;

import com.growupit.gideesquema.ArchivoElectronicoTipo;
import com.growupit.gideesquema.TipoCargo;
import com.growupit.gideesquema.TipoDetalleFactura;
import com.growupit.gideesquema.TipoDocumentoReferencia;
import com.growupit.gideesquema.TipoEntrega;
import com.growupit.gideesquema.TipoIdentificador;
import com.growupit.gideesquema.TipoImpuestoTotal;
import com.growupit.gideesquema.TipoMedioPago;
import com.growupit.gideesquema.TipoPago;
import com.growupit.gideesquema.TipoReferenciaFactura;
import com.growupit.gideesquema.TipoReferenciaPedido;
import com.growupit.gideesquema.TipoTerminosPago;
import com.growupit.gideesquema.TipoTexto;
import co.gov.dian.contratos.facturaelectronica.v1.CreditNoteType;
import co.gov.dian.contratos.facturaelectronica.v1.DebitNoteType;
import co.gov.dian.contratos.facturaelectronica.v1.InvoiceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoiceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineCountNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.UBLExtensionsType;

public class EstructurasPadre {
	private ArchivoElectronicoTipo objArchElec;
	private EstructurasBasicas estBasicas;
	private EstructurasAvanzadas estAvanz;

	public EstructurasPadre(ArchivoElectronicoTipo objArchElec) {

		this.objArchElec = objArchElec;
	}

	public InvoiceType getFactura() {

		InvoiceType invoice = new InvoiceType();

		// extensiones
		UBLExtensionsType exteniones = new UBLExtensionsType();
		invoice.setUBLExtensions(exteniones);

		// UBLVersionID

		UBLVersionIDType verision = new UBLVersionIDType();
		estBasicas.getIdentificador(objArchElec.getIdVersion(), verision);
		invoice.setUBLVersionID(verision);

		CustomizationIDType VersionID = new CustomizationIDType();
		estBasicas.getIdentificador(objArchElec.getIdPersonalizacion(), VersionID);
		invoice.setCustomizationID(VersionID);

		ProfileIDType perfilID = new ProfileIDType();
		estBasicas.getIdentificador(objArchElec.getIdPerfil(), perfilID);
		invoice.setProfileID(perfilID);

		IDType iD = new IDType();
		estBasicas.getIdentificador(objArchElec.getID(), iD);
		invoice.setID(iD);

		UUIDType codigoCUFE = new UUIDType();
		estBasicas.getIdentificador(objArchElec.getUUID(), codigoCUFE);
		invoice.setUUID(codigoCUFE);

		IssueDateType fechaEmision = new IssueDateType();
		fechaEmision.setValue(objArchElec.getFechaEmision());
		invoice.setIssueDate(fechaEmision);

		IssueTimeType horaEmision = new IssueTimeType();
		horaEmision.setValue(objArchElec.getHoraEmision());
		invoice.setIssueTime(horaEmision);

		InvoiceTypeCodeType tipoCodigoFactura = new InvoiceTypeCodeType();
		estBasicas.getCodigo(objArchElec.getTipoCodigoFactura(), tipoCodigoFactura);
		invoice.setInvoiceTypeCode(tipoCodigoFactura);

		NoteType notas = new NoteType();
		for (TipoTexto nota : objArchElec.getNota()) {
			estBasicas.getTexto(nota, notas);
			invoice.getNote().add(notas);
		}

		DocumentCurrencyCodeType codigoMoneda = new DocumentCurrencyCodeType();
		estBasicas.getCodigo(objArchElec.getCodigoMoneda(), codigoMoneda);
		invoice.setDocumentCurrencyCode(codigoMoneda);

		AccountingCostCodeType CodigoCentroDeCosto = new AccountingCostCodeType();
		estBasicas.getCodigo(objArchElec.getCodigoCentroDeCosto(), CodigoCentroDeCosto);
		invoice.setAccountingCostCode(CodigoCentroDeCosto);

		AccountingCostType CentroDeCosto = new AccountingCostType();
		estBasicas.getTexto(objArchElec.getCentroDeCosto(), CentroDeCosto);
		invoice.setAccountingCost(CentroDeCosto);

		LineCountNumericType numeroDeLineas = new LineCountNumericType();
		numeroDeLineas.setValue(objArchElec.getNumeroLineas());
		invoice.setLineCountNumeric(numeroDeLineas);

		PeriodType periodoFactura = new PeriodType();
		estBasicas.getPeriodo(objArchElec.getPeriodoFactura(), periodoFactura);
		invoice.setInvoicePeriod(periodoFactura);
		TipoIdentificador CUFE = new TipoIdentificador();
		String CodigoCUFE = null;/// se debe crear una funcion para calcular el cufe
		CUFE.setValue(CodigoCUFE);

		for (TipoReferenciaPedido ReferenciaPedido : objArchElec.getReferenciaPedido()) {

			invoice.getOrderReference().add(estAvanz.getReferenciaPedidos(ReferenciaPedido, CUFE));// se debe neviar el
																									// cufe
		}

		for (TipoReferenciaFactura ReferenciaFactura : objArchElec.getReferenciaFactura()) {
			invoice.getBillingReference().add(estBasicas.getReferenciaFactura(ReferenciaFactura));
		}

		for (TipoDocumentoReferencia DocumentoReferenciaDespacho : objArchElec.getDocumentoReferenciaDespacho()) {

			invoice.getDespatchDocumentReference().add(estBasicas.getDocumentoReferencia(DocumentoReferenciaDespacho));
		}

		for (TipoDocumentoReferencia DocumentoRefernciaRecepcion : objArchElec.getDocumentoRefernciaRecepcion()) {

			invoice.getReceiptDocumentReference().add(estBasicas.getDocumentoReferencia(DocumentoRefernciaRecepcion));
		}

		for (TipoDocumentoReferencia DocumentoReferenciaCreador : objArchElec.getDocumentoReferenciaCreador()) {

			invoice.getOriginatorDocumentReference().add(estBasicas.getDocumentoReferencia(DocumentoReferenciaCreador));
		}

		for (TipoDocumentoReferencia DocumentoReferenciaContrato : objArchElec.getDocumentoReferenciaContrato()) {

			invoice.getContractDocumentReference().add(estBasicas.getDocumentoReferencia(DocumentoReferenciaContrato));
		}

		for (TipoDocumentoReferencia DocumentoReferenciaAdicional : objArchElec.getDocumentoReferenciaAdicional()) {

			invoice.getAdditionalDocumentReference().add(estBasicas.getDocumentoReferencia(DocumentoReferenciaAdicional));
		}

		// zona clientes - vendedores

		invoice.setAccountingSupplierParty(estAvanz.getTerceroProveedor(objArchElec.getTerceroProveedor()));

		invoice.setAccountingCustomerParty(estAvanz.getTerceroCliente(objArchElec.getTerceroCliente()));

		invoice.setPayeeParty(estBasicas.getTercero(objArchElec.getTerceroBeneficiario()));

		invoice.setBuyerCustomerParty(estAvanz.getTerceroComprador(objArchElec.getTerceroComprador()));

		invoice.setSellerSupplierParty(estAvanz.getTerceroProveedorVendedor(objArchElec.getTerceroProveedorVendedor()));

		invoice.setTaxRepresentativeParty(estBasicas.getTercero(objArchElec.getTerceroRepresentanteFiscal()));

		// Terminos y condiciones de entrega
		for (TipoEntrega entrega : objArchElec.getEntrega()) {
			invoice.getDelivery().add(estAvanz.getCondicionesDeEntrega(entrega));

		}

		invoice.setDeliveryTerms(estAvanz.getTerminosEntrega(objArchElec.getTerminosEntrega()));

		for (TipoMedioPago medioDePago : objArchElec.getMedioPago()) {
			invoice.getPaymentMeans().add(estAvanz.getMedioDePago(medioDePago));
		}

		for (TipoTerminosPago TerminoDePago : objArchElec.getTerminosPago()) {
			invoice.getPaymentTerms().add(estAvanz.getTerminoDePago(TerminoDePago));

		}

		for (TipoPago PagoAnticipado : objArchElec.getPagosAnticipados()) {
			invoice.getPrepaidPayment().add(estAvanz.getPagoAnticipado(PagoAnticipado));

		}

		for (TipoCargo Cargo : objArchElec.getCargo()) {
			invoice.getAllowanceCharge().add(estAvanz.getCargo(Cargo));
		}

		invoice.setPaymentExchangeRate(estAvanz.getTasaCambioPago(objArchElec.getTasaCambioPago()));

		invoice.setPaymentAlternativeExchangeRate(
				estAvanz.getTasaCambioPago(objArchElec.getTasaCambioAlternativoPago()));

		for (TipoImpuestoTotal TotalImpuesto : objArchElec.getTotalImpuestos()) {
			invoice.getTaxTotal().add(estAvanz.getTotalImpuesto(TotalImpuesto));
		}

		invoice.setLegalMonetaryTotal(estAvanz.getTotales(objArchElec.getTotales()));

		for (TipoDetalleFactura DetalleFactura : objArchElec.getDetalleFactura()) {
			invoice.getInvoiceLine().add(estAvanz.getDetalleFactura(DetalleFactura));
		}

		return invoice;
	}

	public DebitNoteType getNotaDebito() {

		return null;
	}

	public CreditNoteType getNotaCredito() {

		return null;
	}

}

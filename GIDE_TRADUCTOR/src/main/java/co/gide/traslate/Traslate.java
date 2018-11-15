package co.gide.traslate;

import java.util.ArrayList;
import java.util.List;

import com.growupit.gideesquema.ArchivoElectronicoTipo;

import co.gov.dian.contratos.facturaelectronica.v1.CreditNoteType;
import co.gov.dian.contratos.facturaelectronica.v1.DebitNoteType;
import co.gov.dian.contratos.facturaelectronica.v1.InvoiceLineType;
import co.gov.dian.contratos.facturaelectronica.v1.InvoiceType;

public class Traslate {

	private InvoiceType factura;
	private DebitNoteType notaDebito;
	private CreditNoteType notaCredito;

	public String getDocElec(ArchivoElectronicoTipo objArchElec) {

		// <!-- 1 Factura - 2 Nota Debito - 3 Nota Credito-->

		
		EstructurasPadre estructura = new EstructurasPadre(objArchElec);
		
		
		if (objArchElec.getDatosDeControl().getTipoDocumentoElectronico() == 1) {
			factura = new InvoiceType();
			factura = estructura.getFactura();
		}
		if (objArchElec.getDatosDeControl().getTipoDocumentoElectronico() == 2) {
			notaDebito = new DebitNoteType();
			notaDebito = estructura.getNotaDebito();
		}
		if (objArchElec.getDatosDeControl().getTipoDocumentoElectronico() == 3) {
			notaCredito = new CreditNoteType();
			notaCredito = estructura.getNotaCredito();
			
		}

		return null;
	}
}

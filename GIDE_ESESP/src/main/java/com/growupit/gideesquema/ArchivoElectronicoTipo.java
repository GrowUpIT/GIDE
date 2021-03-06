//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:49:53 AM COT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;
import org.w3._2001.xmlschema.Adapter3;


/**
 * <p>Java class for ArchivoElectronicoTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchivoElectronicoTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatosDeControl" type="{http://www.growupit.com/gideEsquema}TipoDatosDeControl"/>
 *         &lt;element name="Extensiones" type="{http://www.growupit.com/gideEsquema}TipoExtensiones"/>
 *         &lt;element name="IdVersion" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="IdPersonalizacion" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="IdPerfil" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="ID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="UUID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="HoraEmision" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="TipoCodigoFactura" type="{http://www.growupit.com/gideEsquema}TipoCodigo"/>
 *         &lt;element name="Nota" type="{http://www.growupit.com/gideEsquema}TipoTexto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodigoMoneda" type="{http://www.growupit.com/gideEsquema}TipoCodigo"/>
 *         &lt;element name="CodigoCentroDeCosto" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="CentroDeCosto" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="NumeroLineas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PeriodoFactura" type="{http://www.growupit.com/gideEsquema}TipoPeriodo" minOccurs="0"/>
 *         &lt;element name="ReferenciaPedido" type="{http://www.growupit.com/gideEsquema}TipoReferenciaPedido" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferenciaFactura" type="{http://www.growupit.com/gideEsquema}TipoReferenciaFactura" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocumentoReferenciaDespacho" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocumentoRefernciaRecepcion" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocumentoReferenciaCreador" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocumentoReferenciaContrato" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocumentoReferenciaAdicional" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerceroProveedor" type="{http://www.growupit.com/gideEsquema}TipoProveedor"/>
 *         &lt;element name="TerceroCliente" type="{http://www.growupit.com/gideEsquema}TipoClienteTercero"/>
 *         &lt;element name="TerceroBeneficiario" type="{http://www.growupit.com/gideEsquema}TipoTercero" minOccurs="0"/>
 *         &lt;element name="TerceroComprador" type="{http://www.growupit.com/gideEsquema}TipoClienteTercero" minOccurs="0"/>
 *         &lt;element name="TerceroProveedorVendedor" type="{http://www.growupit.com/gideEsquema}TipoProveedor" minOccurs="0"/>
 *         &lt;element name="TerceroRepresentanteFiscal" type="{http://www.growupit.com/gideEsquema}TipoTercero" minOccurs="0"/>
 *         &lt;element name="Entrega" type="{http://www.growupit.com/gideEsquema}TipoEntrega" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerminosEntrega" type="{http://www.growupit.com/gideEsquema}TipoTerminosEntrega" minOccurs="0"/>
 *         &lt;element name="MedioPago" type="{http://www.growupit.com/gideEsquema}TipoMedioPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerminosPago" type="{http://www.growupit.com/gideEsquema}TipoTerminosPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PagosAnticipados" type="{http://www.growupit.com/gideEsquema}TipoPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cargo" type="{http://www.growupit.com/gideEsquema}TipoCargo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TasaCambioPago" type="{http://www.growupit.com/gideEsquema}TipoTasaCambio" minOccurs="0"/>
 *         &lt;element name="TasaCambioAlternativoPago" type="{http://www.growupit.com/gideEsquema}TipoTasaCambio" minOccurs="0"/>
 *         &lt;element name="TotalImpuestos" type="{http://www.growupit.com/gideEsquema}TipoImpuestoTotal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Totales" type="{http://www.growupit.com/gideEsquema}TipoTotalMonetarioLegal"/>
 *         &lt;element name="DetalleFactura" type="{http://www.growupit.com/gideEsquema}TipoDetalleFactura" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchivoElectronicoTipo", propOrder = {
    "datosDeControl",
    "extensiones",
    "idVersion",
    "idPersonalizacion",
    "idPerfil",
    "id",
    "uuid",
    "fechaEmision",
    "horaEmision",
    "tipoCodigoFactura",
    "nota",
    "codigoMoneda",
    "codigoCentroDeCosto",
    "centroDeCosto",
    "numeroLineas",
    "periodoFactura",
    "referenciaPedido",
    "referenciaFactura",
    "documentoReferenciaDespacho",
    "documentoRefernciaRecepcion",
    "documentoReferenciaCreador",
    "documentoReferenciaContrato",
    "documentoReferenciaAdicional",
    "terceroProveedor",
    "terceroCliente",
    "terceroBeneficiario",
    "terceroComprador",
    "terceroProveedorVendedor",
    "terceroRepresentanteFiscal",
    "entrega",
    "terminosEntrega",
    "medioPago",
    "terminosPago",
    "pagosAnticipados",
    "cargo",
    "tasaCambioPago",
    "tasaCambioAlternativoPago",
    "totalImpuestos",
    "totales",
    "detalleFactura"
})
public class ArchivoElectronicoTipo
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "DatosDeControl", required = true)
    protected TipoDatosDeControl datosDeControl;
    @XmlElement(name = "Extensiones", required = true)
    protected TipoExtensiones extensiones;
    @XmlElement(name = "IdVersion", required = true)
    protected TipoIdentificador idVersion;
    @XmlElement(name = "IdPersonalizacion")
    protected TipoIdentificador idPersonalizacion;
    @XmlElement(name = "IdPerfil", required = true)
    protected TipoIdentificador idPerfil;
    @XmlElement(name = "ID", required = true)
    protected TipoIdentificador id;
    @XmlElement(name = "UUID", required = true)
    protected TipoIdentificador uuid;
    @XmlElement(name = "FechaEmision", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fechaEmision;
    @XmlElement(name = "HoraEmision", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "time")
    protected Calendar horaEmision;
    @XmlElement(name = "TipoCodigoFactura", required = true)
    protected TipoCodigo tipoCodigoFactura;
    @XmlElement(name = "Nota")
    protected List<TipoTexto> nota;
    @XmlElement(name = "CodigoMoneda", required = true)
    protected TipoCodigo codigoMoneda;
    @XmlElement(name = "CodigoCentroDeCosto")
    protected TipoCodigo codigoCentroDeCosto;
    @XmlElement(name = "CentroDeCosto")
    protected TipoTexto centroDeCosto;
    @XmlElement(name = "NumeroLineas")
    protected BigDecimal numeroLineas;
    @XmlElement(name = "PeriodoFactura")
    protected TipoPeriodo periodoFactura;
    @XmlElement(name = "ReferenciaPedido")
    protected List<TipoReferenciaPedido> referenciaPedido;
    @XmlElement(name = "ReferenciaFactura")
    protected List<TipoReferenciaFactura> referenciaFactura;
    @XmlElement(name = "DocumentoReferenciaDespacho")
    protected List<TipoDocumentoReferencia> documentoReferenciaDespacho;
    @XmlElement(name = "DocumentoRefernciaRecepcion")
    protected List<TipoDocumentoReferencia> documentoRefernciaRecepcion;
    @XmlElement(name = "DocumentoReferenciaCreador")
    protected List<TipoDocumentoReferencia> documentoReferenciaCreador;
    @XmlElement(name = "DocumentoReferenciaContrato")
    protected List<TipoDocumentoReferencia> documentoReferenciaContrato;
    @XmlElement(name = "DocumentoReferenciaAdicional")
    protected List<TipoDocumentoReferencia> documentoReferenciaAdicional;
    @XmlElement(name = "TerceroProveedor", required = true)
    protected TipoProveedor terceroProveedor;
    @XmlElement(name = "TerceroCliente", required = true)
    protected TipoClienteTercero terceroCliente;
    @XmlElement(name = "TerceroBeneficiario")
    protected TipoTercero terceroBeneficiario;
    @XmlElement(name = "TerceroComprador")
    protected TipoClienteTercero terceroComprador;
    @XmlElement(name = "TerceroProveedorVendedor")
    protected TipoProveedor terceroProveedorVendedor;
    @XmlElement(name = "TerceroRepresentanteFiscal")
    protected TipoTercero terceroRepresentanteFiscal;
    @XmlElement(name = "Entrega")
    protected List<TipoEntrega> entrega;
    @XmlElement(name = "TerminosEntrega")
    protected TipoTerminosEntrega terminosEntrega;
    @XmlElement(name = "MedioPago")
    protected List<TipoMedioPago> medioPago;
    @XmlElement(name = "TerminosPago")
    protected List<TipoTerminosPago> terminosPago;
    @XmlElement(name = "PagosAnticipados")
    protected List<TipoPago> pagosAnticipados;
    @XmlElement(name = "Cargo")
    protected List<TipoCargo> cargo;
    @XmlElement(name = "TasaCambioPago")
    protected TipoTasaCambio tasaCambioPago;
    @XmlElement(name = "TasaCambioAlternativoPago")
    protected TipoTasaCambio tasaCambioAlternativoPago;
    @XmlElement(name = "TotalImpuestos")
    protected List<TipoImpuestoTotal> totalImpuestos;
    @XmlElement(name = "Totales", required = true)
    protected TipoTotalMonetarioLegal totales;
    @XmlElement(name = "DetalleFactura", required = true)
    protected List<TipoDetalleFactura> detalleFactura;

    /**
     * Gets the value of the datosDeControl property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDatosDeControl }
     *     
     */
    public TipoDatosDeControl getDatosDeControl() {
        return datosDeControl;
    }

    /**
     * Sets the value of the datosDeControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDatosDeControl }
     *     
     */
    public void setDatosDeControl(TipoDatosDeControl value) {
        this.datosDeControl = value;
    }

    /**
     * Gets the value of the extensiones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoExtensiones }
     *     
     */
    public TipoExtensiones getExtensiones() {
        return extensiones;
    }

    /**
     * Sets the value of the extensiones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoExtensiones }
     *     
     */
    public void setExtensiones(TipoExtensiones value) {
        this.extensiones = value;
    }

    /**
     * Gets the value of the idVersion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIdVersion() {
        return idVersion;
    }

    /**
     * Sets the value of the idVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIdVersion(TipoIdentificador value) {
        this.idVersion = value;
    }

    /**
     * Gets the value of the idPersonalizacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIdPersonalizacion() {
        return idPersonalizacion;
    }

    /**
     * Sets the value of the idPersonalizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIdPersonalizacion(TipoIdentificador value) {
        this.idPersonalizacion = value;
    }

    /**
     * Gets the value of the idPerfil property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIdPerfil() {
        return idPerfil;
    }

    /**
     * Sets the value of the idPerfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIdPerfil(TipoIdentificador value) {
        this.idPerfil = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setID(TipoIdentificador value) {
        this.id = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setUUID(TipoIdentificador value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the fechaEmision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Sets the value of the fechaEmision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(Calendar value) {
        this.fechaEmision = value;
    }

    /**
     * Gets the value of the horaEmision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getHoraEmision() {
        return horaEmision;
    }

    /**
     * Sets the value of the horaEmision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEmision(Calendar value) {
        this.horaEmision = value;
    }

    /**
     * Gets the value of the tipoCodigoFactura property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getTipoCodigoFactura() {
        return tipoCodigoFactura;
    }

    /**
     * Sets the value of the tipoCodigoFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setTipoCodigoFactura(TipoCodigo value) {
        this.tipoCodigoFactura = value;
    }

    /**
     * Gets the value of the nota property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nota property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNota().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoTexto }
     * 
     * 
     */
    public List<TipoTexto> getNota() {
        if (nota == null) {
            nota = new ArrayList<TipoTexto>();
        }
        return this.nota;
    }

    /**
     * Gets the value of the codigoMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Sets the value of the codigoMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoMoneda(TipoCodigo value) {
        this.codigoMoneda = value;
    }

    /**
     * Gets the value of the codigoCentroDeCosto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoCentroDeCosto() {
        return codigoCentroDeCosto;
    }

    /**
     * Sets the value of the codigoCentroDeCosto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoCentroDeCosto(TipoCodigo value) {
        this.codigoCentroDeCosto = value;
    }

    /**
     * Gets the value of the centroDeCosto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getCentroDeCosto() {
        return centroDeCosto;
    }

    /**
     * Sets the value of the centroDeCosto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setCentroDeCosto(TipoTexto value) {
        this.centroDeCosto = value;
    }

    /**
     * Gets the value of the numeroLineas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroLineas() {
        return numeroLineas;
    }

    /**
     * Sets the value of the numeroLineas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroLineas(BigDecimal value) {
        this.numeroLineas = value;
    }

    /**
     * Gets the value of the periodoFactura property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPeriodo }
     *     
     */
    public TipoPeriodo getPeriodoFactura() {
        return periodoFactura;
    }

    /**
     * Sets the value of the periodoFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPeriodo }
     *     
     */
    public void setPeriodoFactura(TipoPeriodo value) {
        this.periodoFactura = value;
    }

    /**
     * Gets the value of the referenciaPedido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenciaPedido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenciaPedido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoReferenciaPedido }
     * 
     * 
     */
    public List<TipoReferenciaPedido> getReferenciaPedido() {
        if (referenciaPedido == null) {
            referenciaPedido = new ArrayList<TipoReferenciaPedido>();
        }
        return this.referenciaPedido;
    }

    /**
     * Gets the value of the referenciaFactura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenciaFactura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenciaFactura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoReferenciaFactura }
     * 
     * 
     */
    public List<TipoReferenciaFactura> getReferenciaFactura() {
        if (referenciaFactura == null) {
            referenciaFactura = new ArrayList<TipoReferenciaFactura>();
        }
        return this.referenciaFactura;
    }

    /**
     * Gets the value of the documentoReferenciaDespacho property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoReferenciaDespacho property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoReferenciaDespacho().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDocumentoReferencia }
     * 
     * 
     */
    public List<TipoDocumentoReferencia> getDocumentoReferenciaDespacho() {
        if (documentoReferenciaDespacho == null) {
            documentoReferenciaDespacho = new ArrayList<TipoDocumentoReferencia>();
        }
        return this.documentoReferenciaDespacho;
    }

    /**
     * Gets the value of the documentoRefernciaRecepcion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoRefernciaRecepcion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoRefernciaRecepcion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDocumentoReferencia }
     * 
     * 
     */
    public List<TipoDocumentoReferencia> getDocumentoRefernciaRecepcion() {
        if (documentoRefernciaRecepcion == null) {
            documentoRefernciaRecepcion = new ArrayList<TipoDocumentoReferencia>();
        }
        return this.documentoRefernciaRecepcion;
    }

    /**
     * Gets the value of the documentoReferenciaCreador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoReferenciaCreador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoReferenciaCreador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDocumentoReferencia }
     * 
     * 
     */
    public List<TipoDocumentoReferencia> getDocumentoReferenciaCreador() {
        if (documentoReferenciaCreador == null) {
            documentoReferenciaCreador = new ArrayList<TipoDocumentoReferencia>();
        }
        return this.documentoReferenciaCreador;
    }

    /**
     * Gets the value of the documentoReferenciaContrato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoReferenciaContrato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoReferenciaContrato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDocumentoReferencia }
     * 
     * 
     */
    public List<TipoDocumentoReferencia> getDocumentoReferenciaContrato() {
        if (documentoReferenciaContrato == null) {
            documentoReferenciaContrato = new ArrayList<TipoDocumentoReferencia>();
        }
        return this.documentoReferenciaContrato;
    }

    /**
     * Gets the value of the documentoReferenciaAdicional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoReferenciaAdicional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoReferenciaAdicional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDocumentoReferencia }
     * 
     * 
     */
    public List<TipoDocumentoReferencia> getDocumentoReferenciaAdicional() {
        if (documentoReferenciaAdicional == null) {
            documentoReferenciaAdicional = new ArrayList<TipoDocumentoReferencia>();
        }
        return this.documentoReferenciaAdicional;
    }

    /**
     * Gets the value of the terceroProveedor property.
     * 
     * @return
     *     possible object is
     *     {@link TipoProveedor }
     *     
     */
    public TipoProveedor getTerceroProveedor() {
        return terceroProveedor;
    }

    /**
     * Sets the value of the terceroProveedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProveedor }
     *     
     */
    public void setTerceroProveedor(TipoProveedor value) {
        this.terceroProveedor = value;
    }

    /**
     * Gets the value of the terceroCliente property.
     * 
     * @return
     *     possible object is
     *     {@link TipoClienteTercero }
     *     
     */
    public TipoClienteTercero getTerceroCliente() {
        return terceroCliente;
    }

    /**
     * Sets the value of the terceroCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoClienteTercero }
     *     
     */
    public void setTerceroCliente(TipoClienteTercero value) {
        this.terceroCliente = value;
    }

    /**
     * Gets the value of the terceroBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTercero }
     *     
     */
    public TipoTercero getTerceroBeneficiario() {
        return terceroBeneficiario;
    }

    /**
     * Sets the value of the terceroBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTercero }
     *     
     */
    public void setTerceroBeneficiario(TipoTercero value) {
        this.terceroBeneficiario = value;
    }

    /**
     * Gets the value of the terceroComprador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoClienteTercero }
     *     
     */
    public TipoClienteTercero getTerceroComprador() {
        return terceroComprador;
    }

    /**
     * Sets the value of the terceroComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoClienteTercero }
     *     
     */
    public void setTerceroComprador(TipoClienteTercero value) {
        this.terceroComprador = value;
    }

    /**
     * Gets the value of the terceroProveedorVendedor property.
     * 
     * @return
     *     possible object is
     *     {@link TipoProveedor }
     *     
     */
    public TipoProveedor getTerceroProveedorVendedor() {
        return terceroProveedorVendedor;
    }

    /**
     * Sets the value of the terceroProveedorVendedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProveedor }
     *     
     */
    public void setTerceroProveedorVendedor(TipoProveedor value) {
        this.terceroProveedorVendedor = value;
    }

    /**
     * Gets the value of the terceroRepresentanteFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTercero }
     *     
     */
    public TipoTercero getTerceroRepresentanteFiscal() {
        return terceroRepresentanteFiscal;
    }

    /**
     * Sets the value of the terceroRepresentanteFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTercero }
     *     
     */
    public void setTerceroRepresentanteFiscal(TipoTercero value) {
        this.terceroRepresentanteFiscal = value;
    }

    /**
     * Gets the value of the entrega property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entrega property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntrega().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoEntrega }
     * 
     * 
     */
    public List<TipoEntrega> getEntrega() {
        if (entrega == null) {
            entrega = new ArrayList<TipoEntrega>();
        }
        return this.entrega;
    }

    /**
     * Gets the value of the terminosEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTerminosEntrega }
     *     
     */
    public TipoTerminosEntrega getTerminosEntrega() {
        return terminosEntrega;
    }

    /**
     * Sets the value of the terminosEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTerminosEntrega }
     *     
     */
    public void setTerminosEntrega(TipoTerminosEntrega value) {
        this.terminosEntrega = value;
    }

    /**
     * Gets the value of the medioPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medioPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedioPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoMedioPago }
     * 
     * 
     */
    public List<TipoMedioPago> getMedioPago() {
        if (medioPago == null) {
            medioPago = new ArrayList<TipoMedioPago>();
        }
        return this.medioPago;
    }

    /**
     * Gets the value of the terminosPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminosPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminosPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoTerminosPago }
     * 
     * 
     */
    public List<TipoTerminosPago> getTerminosPago() {
        if (terminosPago == null) {
            terminosPago = new ArrayList<TipoTerminosPago>();
        }
        return this.terminosPago;
    }

    /**
     * Gets the value of the pagosAnticipados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagosAnticipados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagosAnticipados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPago }
     * 
     * 
     */
    public List<TipoPago> getPagosAnticipados() {
        if (pagosAnticipados == null) {
            pagosAnticipados = new ArrayList<TipoPago>();
        }
        return this.pagosAnticipados;
    }

    /**
     * Gets the value of the cargo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoCargo }
     * 
     * 
     */
    public List<TipoCargo> getCargo() {
        if (cargo == null) {
            cargo = new ArrayList<TipoCargo>();
        }
        return this.cargo;
    }

    /**
     * Gets the value of the tasaCambioPago property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTasaCambio }
     *     
     */
    public TipoTasaCambio getTasaCambioPago() {
        return tasaCambioPago;
    }

    /**
     * Sets the value of the tasaCambioPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTasaCambio }
     *     
     */
    public void setTasaCambioPago(TipoTasaCambio value) {
        this.tasaCambioPago = value;
    }

    /**
     * Gets the value of the tasaCambioAlternativoPago property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTasaCambio }
     *     
     */
    public TipoTasaCambio getTasaCambioAlternativoPago() {
        return tasaCambioAlternativoPago;
    }

    /**
     * Sets the value of the tasaCambioAlternativoPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTasaCambio }
     *     
     */
    public void setTasaCambioAlternativoPago(TipoTasaCambio value) {
        this.tasaCambioAlternativoPago = value;
    }

    /**
     * Gets the value of the totalImpuestos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalImpuestos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalImpuestos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoImpuestoTotal }
     * 
     * 
     */
    public List<TipoImpuestoTotal> getTotalImpuestos() {
        if (totalImpuestos == null) {
            totalImpuestos = new ArrayList<TipoImpuestoTotal>();
        }
        return this.totalImpuestos;
    }

    /**
     * Gets the value of the totales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTotalMonetarioLegal }
     *     
     */
    public TipoTotalMonetarioLegal getTotales() {
        return totales;
    }

    /**
     * Sets the value of the totales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTotalMonetarioLegal }
     *     
     */
    public void setTotales(TipoTotalMonetarioLegal value) {
        this.totales = value;
    }

    /**
     * Gets the value of the detalleFactura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleFactura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleFactura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDetalleFactura }
     * 
     * 
     */
    public List<TipoDetalleFactura> getDetalleFactura() {
        if (detalleFactura == null) {
            detalleFactura = new ArrayList<TipoDetalleFactura>();
        }
        return this.detalleFactura;
    }

}

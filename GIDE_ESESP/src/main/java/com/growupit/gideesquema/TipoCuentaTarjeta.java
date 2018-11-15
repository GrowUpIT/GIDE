//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:49:53 AM COT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for TipoCuentaTarjeta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoCuentaTarjeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroCuentaPrincipalID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="RedID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="TipoCodigoTarjeta" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="FechaInicialValidez" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FechaCaducidad" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EmisorID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="NumeroEmisorID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="CV2ID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="CodigoChipTarjeta" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="ChipAplicacionID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="NombreTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoCuentaTarjeta", propOrder = {
    "numeroCuentaPrincipalID",
    "redID",
    "tipoCodigoTarjeta",
    "fechaInicialValidez",
    "fechaCaducidad",
    "emisorID",
    "numeroEmisorID",
    "cv2ID",
    "codigoChipTarjeta",
    "chipAplicacionID",
    "nombreTitular"
})
public class TipoCuentaTarjeta
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "NumeroCuentaPrincipalID", required = true)
    protected TipoIdentificador numeroCuentaPrincipalID;
    @XmlElement(name = "RedID", required = true)
    protected TipoIdentificador redID;
    @XmlElement(name = "TipoCodigoTarjeta")
    protected TipoCodigo tipoCodigoTarjeta;
    @XmlElement(name = "FechaInicialValidez", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fechaInicialValidez;
    @XmlElement(name = "FechaCaducidad", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fechaCaducidad;
    @XmlElement(name = "EmisorID")
    protected TipoIdentificador emisorID;
    @XmlElement(name = "NumeroEmisorID")
    protected TipoIdentificador numeroEmisorID;
    @XmlElement(name = "CV2ID")
    protected TipoIdentificador cv2ID;
    @XmlElement(name = "CodigoChipTarjeta")
    protected TipoCodigo codigoChipTarjeta;
    @XmlElement(name = "ChipAplicacionID")
    protected TipoIdentificador chipAplicacionID;
    @XmlElement(name = "NombreTitular")
    protected String nombreTitular;

    /**
     * Gets the value of the numeroCuentaPrincipalID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getNumeroCuentaPrincipalID() {
        return numeroCuentaPrincipalID;
    }

    /**
     * Sets the value of the numeroCuentaPrincipalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setNumeroCuentaPrincipalID(TipoIdentificador value) {
        this.numeroCuentaPrincipalID = value;
    }

    /**
     * Gets the value of the redID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getRedID() {
        return redID;
    }

    /**
     * Sets the value of the redID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setRedID(TipoIdentificador value) {
        this.redID = value;
    }

    /**
     * Gets the value of the tipoCodigoTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getTipoCodigoTarjeta() {
        return tipoCodigoTarjeta;
    }

    /**
     * Sets the value of the tipoCodigoTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setTipoCodigoTarjeta(TipoCodigo value) {
        this.tipoCodigoTarjeta = value;
    }

    /**
     * Gets the value of the fechaInicialValidez property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFechaInicialValidez() {
        return fechaInicialValidez;
    }

    /**
     * Sets the value of the fechaInicialValidez property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicialValidez(Calendar value) {
        this.fechaInicialValidez = value;
    }

    /**
     * Gets the value of the fechaCaducidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Sets the value of the fechaCaducidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCaducidad(Calendar value) {
        this.fechaCaducidad = value;
    }

    /**
     * Gets the value of the emisorID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getEmisorID() {
        return emisorID;
    }

    /**
     * Sets the value of the emisorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setEmisorID(TipoIdentificador value) {
        this.emisorID = value;
    }

    /**
     * Gets the value of the numeroEmisorID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getNumeroEmisorID() {
        return numeroEmisorID;
    }

    /**
     * Sets the value of the numeroEmisorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setNumeroEmisorID(TipoIdentificador value) {
        this.numeroEmisorID = value;
    }

    /**
     * Gets the value of the cv2ID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getCV2ID() {
        return cv2ID;
    }

    /**
     * Sets the value of the cv2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setCV2ID(TipoIdentificador value) {
        this.cv2ID = value;
    }

    /**
     * Gets the value of the codigoChipTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoChipTarjeta() {
        return codigoChipTarjeta;
    }

    /**
     * Sets the value of the codigoChipTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoChipTarjeta(TipoCodigo value) {
        this.codigoChipTarjeta = value;
    }

    /**
     * Gets the value of the chipAplicacionID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getChipAplicacionID() {
        return chipAplicacionID;
    }

    /**
     * Sets the value of the chipAplicacionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setChipAplicacionID(TipoIdentificador value) {
        this.chipAplicacionID = value;
    }

    /**
     * Gets the value of the nombreTitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Sets the value of the nombreTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
    }

}
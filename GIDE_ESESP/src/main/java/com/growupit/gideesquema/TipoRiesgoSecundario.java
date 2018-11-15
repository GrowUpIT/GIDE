//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:49:53 AM COT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoRiesgoSecundario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoRiesgoSecundario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="NotaCartel" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="AprobacionCartel" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="CodigoProcedimientoEmergencia" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoRiesgoSecundario", propOrder = {
    "id",
    "notaCartel",
    "aprobacionCartel",
    "codigoProcedimientoEmergencia",
    "extension"
})
public class TipoRiesgoSecundario
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "ID")
    protected TipoIdentificador id;
    @XmlElement(name = "NotaCartel")
    protected TipoTexto notaCartel;
    @XmlElement(name = "AprobacionCartel")
    protected TipoTexto aprobacionCartel;
    @XmlElement(name = "CodigoProcedimientoEmergencia")
    protected TipoCodigo codigoProcedimientoEmergencia;
    @XmlElement(name = "Extension")
    protected TipoTexto extension;

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
     * Gets the value of the notaCartel property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getNotaCartel() {
        return notaCartel;
    }

    /**
     * Sets the value of the notaCartel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setNotaCartel(TipoTexto value) {
        this.notaCartel = value;
    }

    /**
     * Gets the value of the aprobacionCartel property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getAprobacionCartel() {
        return aprobacionCartel;
    }

    /**
     * Sets the value of the aprobacionCartel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setAprobacionCartel(TipoTexto value) {
        this.aprobacionCartel = value;
    }

    /**
     * Gets the value of the codigoProcedimientoEmergencia property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoProcedimientoEmergencia() {
        return codigoProcedimientoEmergencia;
    }

    /**
     * Sets the value of the codigoProcedimientoEmergencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoProcedimientoEmergencia(TipoCodigo value) {
        this.codigoProcedimientoEmergencia = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setExtension(TipoTexto value) {
        this.extension = value;
    }

}

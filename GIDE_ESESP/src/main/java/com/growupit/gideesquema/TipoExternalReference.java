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
import org.w3._2001.xmlschema.Adapter3;


/**
 * <p>Java class for TipoExternalReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoExternalReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URI" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="DocumentoHash" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="FechaCaducidad" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HoraCaducidad" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoExternalReference", propOrder = {
    "uri",
    "documentoHash",
    "fechaCaducidad",
    "horaCaducidad"
})
public class TipoExternalReference
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "URI")
    protected TipoIdentificador uri;
    @XmlElement(name = "DocumentoHash")
    protected TipoTexto documentoHash;
    @XmlElement(name = "FechaCaducidad", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fechaCaducidad;
    @XmlElement(name = "HoraCaducidad", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "time")
    protected Calendar horaCaducidad;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setURI(TipoIdentificador value) {
        this.uri = value;
    }

    /**
     * Gets the value of the documentoHash property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getDocumentoHash() {
        return documentoHash;
    }

    /**
     * Sets the value of the documentoHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setDocumentoHash(TipoTexto value) {
        this.documentoHash = value;
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
     * Gets the value of the horaCaducidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getHoraCaducidad() {
        return horaCaducidad;
    }

    /**
     * Sets the value of the horaCaducidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraCaducidad(Calendar value) {
        this.horaCaducidad = value;
    }

}

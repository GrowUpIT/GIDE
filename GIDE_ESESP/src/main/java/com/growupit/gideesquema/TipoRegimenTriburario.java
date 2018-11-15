//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:49:53 AM COT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoRegimenTriburario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoRegimenTriburario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCodigoImpuesto" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="CodigoDivisa" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="DireccionJurisdiccionRegional" type="{http://www.growupit.com/gideEsquema}TipoDireccion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoRegimenTriburario", propOrder = {
    "id",
    "nombre",
    "tipoCodigoImpuesto",
    "codigoDivisa",
    "direccionJurisdiccionRegional"
})
public class TipoRegimenTriburario
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "Id")
    protected TipoIdentificador id;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "TipoCodigoImpuesto")
    protected TipoCodigo tipoCodigoImpuesto;
    @XmlElement(name = "CodigoDivisa")
    protected TipoCodigo codigoDivisa;
    @XmlElement(name = "DireccionJurisdiccionRegional")
    protected List<TipoDireccion> direccionJurisdiccionRegional;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getId() {
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
    public void setId(TipoIdentificador value) {
        this.id = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the tipoCodigoImpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getTipoCodigoImpuesto() {
        return tipoCodigoImpuesto;
    }

    /**
     * Sets the value of the tipoCodigoImpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setTipoCodigoImpuesto(TipoCodigo value) {
        this.tipoCodigoImpuesto = value;
    }

    /**
     * Gets the value of the codigoDivisa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoDivisa() {
        return codigoDivisa;
    }

    /**
     * Sets the value of the codigoDivisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoDivisa(TipoCodigo value) {
        this.codigoDivisa = value;
    }

    /**
     * Gets the value of the direccionJurisdiccionRegional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direccionJurisdiccionRegional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDireccionJurisdiccionRegional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDireccion }
     * 
     * 
     */
    public List<TipoDireccion> getDireccionJurisdiccionRegional() {
        if (direccionJurisdiccionRegional == null) {
            direccionJurisdiccionRegional = new ArrayList<TipoDireccion>();
        }
        return this.direccionJurisdiccionRegional;
    }

}

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
 * <p>Java class for TipoIdentificacionArticulos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoIdentificacionArticulos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="IDProrroga" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="AtriburoFisico" type="{http://www.growupit.com/gideEsquema}TipoAtriburoFisico" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DimensionMedida" type="{http://www.growupit.com/gideEsquema}TipoDimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerceroEmisor" type="{http://www.growupit.com/gideEsquema}TipoTercero" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoIdentificacionArticulos", propOrder = {
    "id",
    "idProrroga",
    "atriburoFisico",
    "dimensionMedida",
    "terceroEmisor"
})
public class TipoIdentificacionArticulos
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "Id", required = true)
    protected TipoIdentificador id;
    @XmlElement(name = "IDProrroga")
    protected TipoIdentificador idProrroga;
    @XmlElement(name = "AtriburoFisico")
    protected List<TipoAtriburoFisico> atriburoFisico;
    @XmlElement(name = "DimensionMedida")
    protected List<TipoDimension> dimensionMedida;
    @XmlElement(name = "TerceroEmisor")
    protected TipoTercero terceroEmisor;

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
     * Gets the value of the idProrroga property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIDProrroga() {
        return idProrroga;
    }

    /**
     * Sets the value of the idProrroga property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIDProrroga(TipoIdentificador value) {
        this.idProrroga = value;
    }

    /**
     * Gets the value of the atriburoFisico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atriburoFisico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtriburoFisico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAtriburoFisico }
     * 
     * 
     */
    public List<TipoAtriburoFisico> getAtriburoFisico() {
        if (atriburoFisico == null) {
            atriburoFisico = new ArrayList<TipoAtriburoFisico>();
        }
        return this.atriburoFisico;
    }

    /**
     * Gets the value of the dimensionMedida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionMedida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionMedida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDimension }
     * 
     * 
     */
    public List<TipoDimension> getDimensionMedida() {
        if (dimensionMedida == null) {
            dimensionMedida = new ArrayList<TipoDimension>();
        }
        return this.dimensionMedida;
    }

    /**
     * Gets the value of the terceroEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTercero }
     *     
     */
    public TipoTercero getTerceroEmisor() {
        return terceroEmisor;
    }

    /**
     * Sets the value of the terceroEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTercero }
     *     
     */
    public void setTerceroEmisor(TipoTercero value) {
        this.terceroEmisor = value;
    }

}

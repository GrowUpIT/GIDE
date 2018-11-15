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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoUbicacionCantidadArticulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoUbicacionCantidadArticulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MedidaPlazoEntrega" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CantidadMinima" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CantidadMaxima" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IndicadorRiesgo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestringcionesComerciales" type="{http://www.growupit.com/gideEsquema}TipoTexto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DireccionTerritorioAplicable" type="{http://www.growupit.com/gideEsquema}TipoDireccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Precio" type="{http://www.growupit.com/gideEsquema}TipoPrecio" minOccurs="0"/>
 *         &lt;element name="UnidadEntrega" type="{http://www.growupit.com/gideEsquema}TipoUnidadEntrega" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategoriaImpuestoAplicable" type="{http://www.growupit.com/gideEsquema}TipoImpuestoCategoria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoUbicacionCantidadArticulo", propOrder = {
    "medidaPlazoEntrega",
    "cantidadMinima",
    "cantidadMaxima",
    "indicadorRiesgo",
    "restringcionesComerciales",
    "direccionTerritorioAplicable",
    "precio",
    "unidadEntrega",
    "categoriaImpuestoAplicable"
})
public class TipoUbicacionCantidadArticulo
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "MedidaPlazoEntrega")
    protected BigDecimal medidaPlazoEntrega;
    @XmlElement(name = "CantidadMinima")
    protected BigDecimal cantidadMinima;
    @XmlElement(name = "CantidadMaxima")
    protected BigDecimal cantidadMaxima;
    @XmlElement(name = "IndicadorRiesgo")
    protected Boolean indicadorRiesgo;
    @XmlElement(name = "RestringcionesComerciales")
    protected List<TipoTexto> restringcionesComerciales;
    @XmlElement(name = "DireccionTerritorioAplicable")
    protected List<TipoDireccion> direccionTerritorioAplicable;
    @XmlElement(name = "Precio")
    protected TipoPrecio precio;
    @XmlElement(name = "UnidadEntrega")
    protected List<TipoUnidadEntrega> unidadEntrega;
    @XmlElement(name = "CategoriaImpuestoAplicable")
    protected List<TipoImpuestoCategoria> categoriaImpuestoAplicable;

    /**
     * Gets the value of the medidaPlazoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedidaPlazoEntrega() {
        return medidaPlazoEntrega;
    }

    /**
     * Sets the value of the medidaPlazoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedidaPlazoEntrega(BigDecimal value) {
        this.medidaPlazoEntrega = value;
    }

    /**
     * Gets the value of the cantidadMinima property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Sets the value of the cantidadMinima property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidadMinima(BigDecimal value) {
        this.cantidadMinima = value;
    }

    /**
     * Gets the value of the cantidadMaxima property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     * Sets the value of the cantidadMaxima property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidadMaxima(BigDecimal value) {
        this.cantidadMaxima = value;
    }

    /**
     * Gets the value of the indicadorRiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorRiesgo() {
        return indicadorRiesgo;
    }

    /**
     * Sets the value of the indicadorRiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorRiesgo(Boolean value) {
        this.indicadorRiesgo = value;
    }

    /**
     * Gets the value of the restringcionesComerciales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restringcionesComerciales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestringcionesComerciales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoTexto }
     * 
     * 
     */
    public List<TipoTexto> getRestringcionesComerciales() {
        if (restringcionesComerciales == null) {
            restringcionesComerciales = new ArrayList<TipoTexto>();
        }
        return this.restringcionesComerciales;
    }

    /**
     * Gets the value of the direccionTerritorioAplicable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direccionTerritorioAplicable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDireccionTerritorioAplicable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDireccion }
     * 
     * 
     */
    public List<TipoDireccion> getDireccionTerritorioAplicable() {
        if (direccionTerritorioAplicable == null) {
            direccionTerritorioAplicable = new ArrayList<TipoDireccion>();
        }
        return this.direccionTerritorioAplicable;
    }

    /**
     * Gets the value of the precio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPrecio }
     *     
     */
    public TipoPrecio getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPrecio }
     *     
     */
    public void setPrecio(TipoPrecio value) {
        this.precio = value;
    }

    /**
     * Gets the value of the unidadEntrega property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadEntrega property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadEntrega().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoUnidadEntrega }
     * 
     * 
     */
    public List<TipoUnidadEntrega> getUnidadEntrega() {
        if (unidadEntrega == null) {
            unidadEntrega = new ArrayList<TipoUnidadEntrega>();
        }
        return this.unidadEntrega;
    }

    /**
     * Gets the value of the categoriaImpuestoAplicable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoriaImpuestoAplicable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoriaImpuestoAplicable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoImpuestoCategoria }
     * 
     * 
     */
    public List<TipoImpuestoCategoria> getCategoriaImpuestoAplicable() {
        if (categoriaImpuestoAplicable == null) {
            categoriaImpuestoAplicable = new ArrayList<TipoImpuestoCategoria>();
        }
        return this.categoriaImpuestoAplicable;
    }

}

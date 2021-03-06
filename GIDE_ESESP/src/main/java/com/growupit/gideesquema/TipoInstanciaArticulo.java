//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:49:53 AM COT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
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
 * <p>Java class for TipoInstanciaArticulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInstanciaArticulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RastroProductoID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="FechaFabricacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HoraFacturacion" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="IDRegistro" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="IDSerie" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="PropiedadAdicionalArticulo" type="{http://www.growupit.com/gideEsquema}TipoPropiedadArticulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IdentificacionLote" type="{http://www.growupit.com/gideEsquema}TipoIdentificacionLote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInstanciaArticulo", propOrder = {
    "rastroProductoID",
    "fechaFabricacion",
    "horaFacturacion",
    "idRegistro",
    "idSerie",
    "propiedadAdicionalArticulo",
    "identificacionLote"
})
public class TipoInstanciaArticulo
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "RastroProductoID")
    protected TipoIdentificador rastroProductoID;
    @XmlElement(name = "FechaFabricacion", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fechaFabricacion;
    @XmlElement(name = "HoraFacturacion", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "time")
    protected Calendar horaFacturacion;
    @XmlElement(name = "IDRegistro")
    protected TipoIdentificador idRegistro;
    @XmlElement(name = "IDSerie")
    protected TipoIdentificador idSerie;
    @XmlElement(name = "PropiedadAdicionalArticulo")
    protected List<TipoPropiedadArticulo> propiedadAdicionalArticulo;
    @XmlElement(name = "IdentificacionLote")
    protected TipoIdentificacionLote identificacionLote;

    /**
     * Gets the value of the rastroProductoID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getRastroProductoID() {
        return rastroProductoID;
    }

    /**
     * Sets the value of the rastroProductoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setRastroProductoID(TipoIdentificador value) {
        this.rastroProductoID = value;
    }

    /**
     * Gets the value of the fechaFabricacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFechaFabricacion() {
        return fechaFabricacion;
    }

    /**
     * Sets the value of the fechaFabricacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFabricacion(Calendar value) {
        this.fechaFabricacion = value;
    }

    /**
     * Gets the value of the horaFacturacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getHoraFacturacion() {
        return horaFacturacion;
    }

    /**
     * Sets the value of the horaFacturacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFacturacion(Calendar value) {
        this.horaFacturacion = value;
    }

    /**
     * Gets the value of the idRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIDRegistro() {
        return idRegistro;
    }

    /**
     * Sets the value of the idRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIDRegistro(TipoIdentificador value) {
        this.idRegistro = value;
    }

    /**
     * Gets the value of the idSerie property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIDSerie() {
        return idSerie;
    }

    /**
     * Sets the value of the idSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIDSerie(TipoIdentificador value) {
        this.idSerie = value;
    }

    /**
     * Gets the value of the propiedadAdicionalArticulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propiedadAdicionalArticulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropiedadAdicionalArticulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPropiedadArticulo }
     * 
     * 
     */
    public List<TipoPropiedadArticulo> getPropiedadAdicionalArticulo() {
        if (propiedadAdicionalArticulo == null) {
            propiedadAdicionalArticulo = new ArrayList<TipoPropiedadArticulo>();
        }
        return this.propiedadAdicionalArticulo;
    }

    /**
     * Gets the value of the identificacionLote property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionLote }
     *     
     */
    public TipoIdentificacionLote getIdentificacionLote() {
        return identificacionLote;
    }

    /**
     * Sets the value of the identificacionLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionLote }
     *     
     */
    public void setIdentificacionLote(TipoIdentificacionLote value) {
        this.identificacionLote = value;
    }

}

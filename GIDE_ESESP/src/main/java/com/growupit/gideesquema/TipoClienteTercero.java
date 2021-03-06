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
 * <p>Java class for TipoClienteTercero complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoClienteTercero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CuentaAsignadaClienteID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="CuentaAsignadaProveedorID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="CuentaAdicionalID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="Tercero" type="{http://www.growupit.com/gideEsquema}TipoTercero"/>
 *         &lt;element name="ContactoEntrega" type="{http://www.growupit.com/gideEsquema}TipoContacto" minOccurs="0"/>
 *         &lt;element name="ContactoContable" type="{http://www.growupit.com/gideEsquema}TipoContacto" minOccurs="0"/>
 *         &lt;element name="ContactoComprador" type="{http://www.growupit.com/gideEsquema}TipoContacto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoClienteTercero", propOrder = {
    "cuentaAsignadaClienteID",
    "cuentaAsignadaProveedorID",
    "cuentaAdicionalID",
    "tercero",
    "contactoEntrega",
    "contactoContable",
    "contactoComprador"
})
public class TipoClienteTercero
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "CuentaAsignadaClienteID")
    protected TipoIdentificador cuentaAsignadaClienteID;
    @XmlElement(name = "CuentaAsignadaProveedorID")
    protected TipoIdentificador cuentaAsignadaProveedorID;
    @XmlElement(name = "CuentaAdicionalID", required = true)
    protected TipoIdentificador cuentaAdicionalID;
    @XmlElement(name = "Tercero", required = true)
    protected TipoTercero tercero;
    @XmlElement(name = "ContactoEntrega")
    protected TipoContacto contactoEntrega;
    @XmlElement(name = "ContactoContable")
    protected TipoContacto contactoContable;
    @XmlElement(name = "ContactoComprador")
    protected TipoContacto contactoComprador;

    /**
     * Gets the value of the cuentaAsignadaClienteID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getCuentaAsignadaClienteID() {
        return cuentaAsignadaClienteID;
    }

    /**
     * Sets the value of the cuentaAsignadaClienteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setCuentaAsignadaClienteID(TipoIdentificador value) {
        this.cuentaAsignadaClienteID = value;
    }

    /**
     * Gets the value of the cuentaAsignadaProveedorID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getCuentaAsignadaProveedorID() {
        return cuentaAsignadaProveedorID;
    }

    /**
     * Sets the value of the cuentaAsignadaProveedorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setCuentaAsignadaProveedorID(TipoIdentificador value) {
        this.cuentaAsignadaProveedorID = value;
    }

    /**
     * Gets the value of the cuentaAdicionalID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getCuentaAdicionalID() {
        return cuentaAdicionalID;
    }

    /**
     * Sets the value of the cuentaAdicionalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setCuentaAdicionalID(TipoIdentificador value) {
        this.cuentaAdicionalID = value;
    }

    /**
     * Gets the value of the tercero property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTercero }
     *     
     */
    public TipoTercero getTercero() {
        return tercero;
    }

    /**
     * Sets the value of the tercero property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTercero }
     *     
     */
    public void setTercero(TipoTercero value) {
        this.tercero = value;
    }

    /**
     * Gets the value of the contactoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContacto }
     *     
     */
    public TipoContacto getContactoEntrega() {
        return contactoEntrega;
    }

    /**
     * Sets the value of the contactoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContacto }
     *     
     */
    public void setContactoEntrega(TipoContacto value) {
        this.contactoEntrega = value;
    }

    /**
     * Gets the value of the contactoContable property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContacto }
     *     
     */
    public TipoContacto getContactoContable() {
        return contactoContable;
    }

    /**
     * Sets the value of the contactoContable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContacto }
     *     
     */
    public void setContactoContable(TipoContacto value) {
        this.contactoContable = value;
    }

    /**
     * Gets the value of the contactoComprador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContacto }
     *     
     */
    public TipoContacto getContactoComprador() {
        return contactoComprador;
    }

    /**
     * Sets the value of the contactoComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContacto }
     *     
     */
    public void setContactoComprador(TipoContacto value) {
        this.contactoComprador = value;
    }

}

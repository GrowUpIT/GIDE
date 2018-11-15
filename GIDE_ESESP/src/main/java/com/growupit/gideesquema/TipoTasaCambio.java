//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:49:53 AM COT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for TipoTasaCambio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoTasaCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMonedaFuente" type="{http://www.growupit.com/gideEsquema}TipoCodigo"/>
 *         &lt;element name="TasaBaseModenaFuente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoMonedaObjetivo" type="{http://www.growupit.com/gideEsquema}TipoCodigo"/>
 *         &lt;element name="TasaBaseMonedaObjetivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IDIntercambioMercado" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="TasaCalculada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoOperadorMatematico" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ContratoMonedaExtranjera" type="{http://www.growupit.com/gideEsquema}TipoContrato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoTasaCambio", propOrder = {
    "codigoMonedaFuente",
    "tasaBaseModenaFuente",
    "codigoMonedaObjetivo",
    "tasaBaseMonedaObjetivo",
    "idIntercambioMercado",
    "tasaCalculada",
    "codigoOperadorMatematico",
    "fecha",
    "contratoMonedaExtranjera"
})
public class TipoTasaCambio
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "CodigoMonedaFuente", required = true)
    protected TipoCodigo codigoMonedaFuente;
    @XmlElement(name = "TasaBaseModenaFuente")
    protected BigDecimal tasaBaseModenaFuente;
    @XmlElement(name = "CodigoMonedaObjetivo", required = true)
    protected TipoCodigo codigoMonedaObjetivo;
    @XmlElement(name = "TasaBaseMonedaObjetivo")
    protected BigDecimal tasaBaseMonedaObjetivo;
    @XmlElement(name = "IDIntercambioMercado")
    protected TipoIdentificador idIntercambioMercado;
    @XmlElement(name = "TasaCalculada")
    protected BigDecimal tasaCalculada;
    @XmlElement(name = "CodigoOperadorMatematico")
    protected TipoCodigo codigoOperadorMatematico;
    @XmlElement(name = "Fecha", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fecha;
    @XmlElement(name = "ContratoMonedaExtranjera")
    protected TipoContrato contratoMonedaExtranjera;

    /**
     * Gets the value of the codigoMonedaFuente property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoMonedaFuente() {
        return codigoMonedaFuente;
    }

    /**
     * Sets the value of the codigoMonedaFuente property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoMonedaFuente(TipoCodigo value) {
        this.codigoMonedaFuente = value;
    }

    /**
     * Gets the value of the tasaBaseModenaFuente property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaBaseModenaFuente() {
        return tasaBaseModenaFuente;
    }

    /**
     * Sets the value of the tasaBaseModenaFuente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaBaseModenaFuente(BigDecimal value) {
        this.tasaBaseModenaFuente = value;
    }

    /**
     * Gets the value of the codigoMonedaObjetivo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoMonedaObjetivo() {
        return codigoMonedaObjetivo;
    }

    /**
     * Sets the value of the codigoMonedaObjetivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoMonedaObjetivo(TipoCodigo value) {
        this.codigoMonedaObjetivo = value;
    }

    /**
     * Gets the value of the tasaBaseMonedaObjetivo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaBaseMonedaObjetivo() {
        return tasaBaseMonedaObjetivo;
    }

    /**
     * Sets the value of the tasaBaseMonedaObjetivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaBaseMonedaObjetivo(BigDecimal value) {
        this.tasaBaseMonedaObjetivo = value;
    }

    /**
     * Gets the value of the idIntercambioMercado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIDIntercambioMercado() {
        return idIntercambioMercado;
    }

    /**
     * Sets the value of the idIntercambioMercado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIDIntercambioMercado(TipoIdentificador value) {
        this.idIntercambioMercado = value;
    }

    /**
     * Gets the value of the tasaCalculada property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaCalculada() {
        return tasaCalculada;
    }

    /**
     * Sets the value of the tasaCalculada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaCalculada(BigDecimal value) {
        this.tasaCalculada = value;
    }

    /**
     * Gets the value of the codigoOperadorMatematico property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoOperadorMatematico() {
        return codigoOperadorMatematico;
    }

    /**
     * Sets the value of the codigoOperadorMatematico property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoOperadorMatematico(TipoCodigo value) {
        this.codigoOperadorMatematico = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(Calendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the contratoMonedaExtranjera property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContrato }
     *     
     */
    public TipoContrato getContratoMonedaExtranjera() {
        return contratoMonedaExtranjera;
    }

    /**
     * Sets the value of the contratoMonedaExtranjera property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContrato }
     *     
     */
    public void setContratoMonedaExtranjera(TipoContrato value) {
        this.contratoMonedaExtranjera = value;
    }

}
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
 * <p>Java class for TipoDireccion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoDireccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="TipoCodigoDireccion" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="FormatoCodigoDireccion" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="Buzon" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="Piso" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="Cuarto" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="NombreCalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreCalleAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreBloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreEdificio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroEdificio" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="CorreoInterno" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="MarcaAtencion" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="MarcaCuidado" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="IdentificacionParcela" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="NombreSubdivisionCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZonaPostal" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="SubentidadPais" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="CodigoSubentidadesPais" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="Distrito" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="ZonaHorariaOffset" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="LineaDireccion" type="{http://www.growupit.com/gideEsquema}TipoTexto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://www.growupit.com/gideEsquema}TipoPais" minOccurs="0"/>
 *         &lt;element name="CoordenadasUbicacion" type="{http://www.growupit.com/gideEsquema}TipoCoordenadasUbicacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDireccion", propOrder = {
    "id",
    "tipoCodigoDireccion",
    "formatoCodigoDireccion",
    "buzon",
    "piso",
    "cuarto",
    "nombreCalle",
    "nombreCalleAdicional",
    "nombreBloque",
    "nombreEdificio",
    "numeroEdificio",
    "correoInterno",
    "departamento",
    "marcaAtencion",
    "marcaCuidado",
    "identificacionParcela",
    "nombreSubdivisionCiudad",
    "nombreCiudad",
    "zonaPostal",
    "subentidadPais",
    "codigoSubentidadesPais",
    "region",
    "distrito",
    "zonaHorariaOffset",
    "lineaDireccion",
    "pais",
    "coordenadasUbicacion"
})
public class TipoDireccion
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "ID")
    protected TipoIdentificador id;
    @XmlElement(name = "TipoCodigoDireccion")
    protected TipoCodigo tipoCodigoDireccion;
    @XmlElement(name = "FormatoCodigoDireccion")
    protected TipoCodigo formatoCodigoDireccion;
    @XmlElement(name = "Buzon")
    protected TipoTexto buzon;
    @XmlElement(name = "Piso")
    protected TipoTexto piso;
    @XmlElement(name = "Cuarto")
    protected TipoTexto cuarto;
    @XmlElement(name = "NombreCalle")
    protected String nombreCalle;
    @XmlElement(name = "NombreCalleAdicional")
    protected String nombreCalleAdicional;
    @XmlElement(name = "NombreBloque")
    protected String nombreBloque;
    @XmlElement(name = "NombreEdificio")
    protected String nombreEdificio;
    @XmlElement(name = "NumeroEdificio")
    protected TipoTexto numeroEdificio;
    @XmlElement(name = "CorreoInterno")
    protected TipoTexto correoInterno;
    @XmlElement(name = "Departamento")
    protected TipoTexto departamento;
    @XmlElement(name = "MarcaAtencion")
    protected TipoTexto marcaAtencion;
    @XmlElement(name = "MarcaCuidado")
    protected TipoTexto marcaCuidado;
    @XmlElement(name = "IdentificacionParcela")
    protected TipoTexto identificacionParcela;
    @XmlElement(name = "NombreSubdivisionCiudad")
    protected String nombreSubdivisionCiudad;
    @XmlElement(name = "NombreCiudad")
    protected String nombreCiudad;
    @XmlElement(name = "ZonaPostal")
    protected TipoTexto zonaPostal;
    @XmlElement(name = "SubentidadPais")
    protected TipoTexto subentidadPais;
    @XmlElement(name = "CodigoSubentidadesPais")
    protected TipoCodigo codigoSubentidadesPais;
    @XmlElement(name = "Region")
    protected TipoTexto region;
    @XmlElement(name = "Distrito")
    protected TipoTexto distrito;
    @XmlElement(name = "ZonaHorariaOffset")
    protected TipoTexto zonaHorariaOffset;
    @XmlElement(name = "LineaDireccion")
    protected List<TipoTexto> lineaDireccion;
    @XmlElement(name = "Pais")
    protected TipoPais pais;
    @XmlElement(name = "CoordenadasUbicacion")
    protected TipoCoordenadasUbicacion coordenadasUbicacion;

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
     * Gets the value of the tipoCodigoDireccion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getTipoCodigoDireccion() {
        return tipoCodigoDireccion;
    }

    /**
     * Sets the value of the tipoCodigoDireccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setTipoCodigoDireccion(TipoCodigo value) {
        this.tipoCodigoDireccion = value;
    }

    /**
     * Gets the value of the formatoCodigoDireccion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getFormatoCodigoDireccion() {
        return formatoCodigoDireccion;
    }

    /**
     * Sets the value of the formatoCodigoDireccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setFormatoCodigoDireccion(TipoCodigo value) {
        this.formatoCodigoDireccion = value;
    }

    /**
     * Gets the value of the buzon property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getBuzon() {
        return buzon;
    }

    /**
     * Sets the value of the buzon property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setBuzon(TipoTexto value) {
        this.buzon = value;
    }

    /**
     * Gets the value of the piso property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getPiso() {
        return piso;
    }

    /**
     * Sets the value of the piso property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setPiso(TipoTexto value) {
        this.piso = value;
    }

    /**
     * Gets the value of the cuarto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getCuarto() {
        return cuarto;
    }

    /**
     * Sets the value of the cuarto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setCuarto(TipoTexto value) {
        this.cuarto = value;
    }

    /**
     * Gets the value of the nombreCalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCalle() {
        return nombreCalle;
    }

    /**
     * Sets the value of the nombreCalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCalle(String value) {
        this.nombreCalle = value;
    }

    /**
     * Gets the value of the nombreCalleAdicional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCalleAdicional() {
        return nombreCalleAdicional;
    }

    /**
     * Sets the value of the nombreCalleAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCalleAdicional(String value) {
        this.nombreCalleAdicional = value;
    }

    /**
     * Gets the value of the nombreBloque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBloque() {
        return nombreBloque;
    }

    /**
     * Sets the value of the nombreBloque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBloque(String value) {
        this.nombreBloque = value;
    }

    /**
     * Gets the value of the nombreEdificio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEdificio() {
        return nombreEdificio;
    }

    /**
     * Sets the value of the nombreEdificio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEdificio(String value) {
        this.nombreEdificio = value;
    }

    /**
     * Gets the value of the numeroEdificio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getNumeroEdificio() {
        return numeroEdificio;
    }

    /**
     * Sets the value of the numeroEdificio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setNumeroEdificio(TipoTexto value) {
        this.numeroEdificio = value;
    }

    /**
     * Gets the value of the correoInterno property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getCorreoInterno() {
        return correoInterno;
    }

    /**
     * Sets the value of the correoInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setCorreoInterno(TipoTexto value) {
        this.correoInterno = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setDepartamento(TipoTexto value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the marcaAtencion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getMarcaAtencion() {
        return marcaAtencion;
    }

    /**
     * Sets the value of the marcaAtencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setMarcaAtencion(TipoTexto value) {
        this.marcaAtencion = value;
    }

    /**
     * Gets the value of the marcaCuidado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getMarcaCuidado() {
        return marcaCuidado;
    }

    /**
     * Sets the value of the marcaCuidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setMarcaCuidado(TipoTexto value) {
        this.marcaCuidado = value;
    }

    /**
     * Gets the value of the identificacionParcela property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getIdentificacionParcela() {
        return identificacionParcela;
    }

    /**
     * Sets the value of the identificacionParcela property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setIdentificacionParcela(TipoTexto value) {
        this.identificacionParcela = value;
    }

    /**
     * Gets the value of the nombreSubdivisionCiudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSubdivisionCiudad() {
        return nombreSubdivisionCiudad;
    }

    /**
     * Sets the value of the nombreSubdivisionCiudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSubdivisionCiudad(String value) {
        this.nombreSubdivisionCiudad = value;
    }

    /**
     * Gets the value of the nombreCiudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    /**
     * Sets the value of the nombreCiudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCiudad(String value) {
        this.nombreCiudad = value;
    }

    /**
     * Gets the value of the zonaPostal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getZonaPostal() {
        return zonaPostal;
    }

    /**
     * Sets the value of the zonaPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setZonaPostal(TipoTexto value) {
        this.zonaPostal = value;
    }

    /**
     * Gets the value of the subentidadPais property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getSubentidadPais() {
        return subentidadPais;
    }

    /**
     * Sets the value of the subentidadPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setSubentidadPais(TipoTexto value) {
        this.subentidadPais = value;
    }

    /**
     * Gets the value of the codigoSubentidadesPais property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoSubentidadesPais() {
        return codigoSubentidadesPais;
    }

    /**
     * Sets the value of the codigoSubentidadesPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoSubentidadesPais(TipoCodigo value) {
        this.codigoSubentidadesPais = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setRegion(TipoTexto value) {
        this.region = value;
    }

    /**
     * Gets the value of the distrito property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getDistrito() {
        return distrito;
    }

    /**
     * Sets the value of the distrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setDistrito(TipoTexto value) {
        this.distrito = value;
    }

    /**
     * Gets the value of the zonaHorariaOffset property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getZonaHorariaOffset() {
        return zonaHorariaOffset;
    }

    /**
     * Sets the value of the zonaHorariaOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setZonaHorariaOffset(TipoTexto value) {
        this.zonaHorariaOffset = value;
    }

    /**
     * Gets the value of the lineaDireccion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineaDireccion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineaDireccion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoTexto }
     * 
     * 
     */
    public List<TipoTexto> getLineaDireccion() {
        if (lineaDireccion == null) {
            lineaDireccion = new ArrayList<TipoTexto>();
        }
        return this.lineaDireccion;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPais }
     *     
     */
    public TipoPais getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPais }
     *     
     */
    public void setPais(TipoPais value) {
        this.pais = value;
    }

    /**
     * Gets the value of the coordenadasUbicacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCoordenadasUbicacion }
     *     
     */
    public TipoCoordenadasUbicacion getCoordenadasUbicacion() {
        return coordenadasUbicacion;
    }

    /**
     * Sets the value of the coordenadasUbicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCoordenadasUbicacion }
     *     
     */
    public void setCoordenadasUbicacion(TipoCoordenadasUbicacion value) {
        this.coordenadasUbicacion = value;
    }

}

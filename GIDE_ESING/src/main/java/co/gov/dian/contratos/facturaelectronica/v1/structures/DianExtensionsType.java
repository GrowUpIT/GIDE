//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:50:18 AM COT 
//


package co.gov.dian.contratos.facturaelectronica.v1.structures;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CountryType;
import un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.IdentifierType;


/**
 * <p>Java class for DianExtensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DianExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceControl" type="{http://www.dian.gov.co/contratos/facturaelectronica/v1/Structures}InvoiceControl" minOccurs="0"/>
 *         &lt;element name="InvoiceSource" type="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CountryType"/>
 *         &lt;element name="SoftwareProvider" type="{http://www.dian.gov.co/contratos/facturaelectronica/v1/Structures}SoftwareProvider"/>
 *         &lt;element name="SoftwareSecurityCode" type="{urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2}IdentifierType"/>
 *         &lt;element name="AdditionalMonetaryTotal" type="{http://www.dian.gov.co/contratos/facturaelectronica/v1/Structures}AdditionalMonetaryTotal" minOccurs="0"/>
 *         &lt;element name="FinancialInformation" type="{http://www.dian.gov.co/contratos/facturaelectronica/v1/Structures}FinancialInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DianExtensionsType", propOrder = {
    "invoiceControl",
    "invoiceSource",
    "softwareProvider",
    "softwareSecurityCode",
    "additionalMonetaryTotal",
    "financialInformation"
})
public class DianExtensionsType
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "InvoiceControl")
    protected InvoiceControl invoiceControl;
    @XmlElement(name = "InvoiceSource", required = true)
    protected CountryType invoiceSource;
    @XmlElement(name = "SoftwareProvider", required = true)
    protected SoftwareProvider softwareProvider;
    @XmlElement(name = "SoftwareSecurityCode", required = true)
    protected IdentifierType softwareSecurityCode;
    @XmlElement(name = "AdditionalMonetaryTotal")
    protected AdditionalMonetaryTotal additionalMonetaryTotal;
    @XmlElement(name = "FinancialInformation")
    protected FinancialInformation financialInformation;

    /**
     * Gets the value of the invoiceControl property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceControl }
     *     
     */
    public InvoiceControl getInvoiceControl() {
        return invoiceControl;
    }

    /**
     * Sets the value of the invoiceControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceControl }
     *     
     */
    public void setInvoiceControl(InvoiceControl value) {
        this.invoiceControl = value;
    }

    /**
     * Gets the value of the invoiceSource property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getInvoiceSource() {
        return invoiceSource;
    }

    /**
     * Sets the value of the invoiceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setInvoiceSource(CountryType value) {
        this.invoiceSource = value;
    }

    /**
     * Gets the value of the softwareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareProvider }
     *     
     */
    public SoftwareProvider getSoftwareProvider() {
        return softwareProvider;
    }

    /**
     * Sets the value of the softwareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareProvider }
     *     
     */
    public void setSoftwareProvider(SoftwareProvider value) {
        this.softwareProvider = value;
    }

    /**
     * Gets the value of the softwareSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSoftwareSecurityCode() {
        return softwareSecurityCode;
    }

    /**
     * Sets the value of the softwareSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSoftwareSecurityCode(IdentifierType value) {
        this.softwareSecurityCode = value;
    }

    /**
     * Gets the value of the additionalMonetaryTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalMonetaryTotal }
     *     
     */
    public AdditionalMonetaryTotal getAdditionalMonetaryTotal() {
        return additionalMonetaryTotal;
    }

    /**
     * Sets the value of the additionalMonetaryTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalMonetaryTotal }
     *     
     */
    public void setAdditionalMonetaryTotal(AdditionalMonetaryTotal value) {
        this.additionalMonetaryTotal = value;
    }

    /**
     * Gets the value of the financialInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInformation }
     *     
     */
    public FinancialInformation getFinancialInformation() {
        return financialInformation;
    }

    /**
     * Sets the value of the financialInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInformation }
     *     
     */
    public void setFinancialInformation(FinancialInformation value) {
        this.financialInformation = value;
    }

}

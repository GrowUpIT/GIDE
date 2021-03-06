//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:50:18 AM COT 
//


package co.gov.dian.contratos.facturaelectronica.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CorporateRegistrationSchemeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;


/**
 * <p>Java class for PartyLegalEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyLegalEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistrationAddress" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CorporateRegistrationScheme" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyLegalEntityType", propOrder = {
    "registrationName",
    "companyID",
    "registrationAddress",
    "corporateRegistrationScheme"
})
public class PartyLegalEntityType
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected RegistrationNameType registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyIDType companyID;
    @XmlElement(name = "RegistrationAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected AddressType registrationAddress;
    @XmlElement(name = "CorporateRegistrationScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected CorporateRegistrationSchemeType corporateRegistrationScheme;

    /**
     * 
     * 						2.2.3.4 - Razón Social: Obligatorio en caso de
     * 						ser
     * 						una persona jurídica. Razón social de la
     * 						empresa
     * 					
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNameType }
     *     
     */
    public RegistrationNameType getRegistrationName() {
        return registrationName;
    }

    /**
     * Sets the value of the registrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNameType }
     *     
     */
    public void setRegistrationName(RegistrationNameType value) {
        this.registrationName = value;
    }

    /**
     * 
     * 						Opcional no usado por la
     * 						DIAN, las partes pueden
     * 						definir un significado o simplemente
     * 						omitirlo
     * 					
     * 
     * @return
     *     possible object is
     *     {@link CompanyIDType }
     *     
     */
    public CompanyIDType getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIDType }
     *     
     */
    public void setCompanyID(CompanyIDType value) {
        this.companyID = value;
    }

    /**
     * 
     * 						Opcional no usado por la
     * 						DIAN, las partes pueden
     * 						definir un significado o simplemente
     * 						omitirlo
     * 					
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Sets the value of the registrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * 
     * 						Opcional no usado por la
     * 						DIAN, las partes pueden
     * 						definir un significado o simplemente
     * 						omitirlo
     * 					
     * 
     * @return
     *     possible object is
     *     {@link CorporateRegistrationSchemeType }
     *     
     */
    public CorporateRegistrationSchemeType getCorporateRegistrationScheme() {
        return corporateRegistrationScheme;
    }

    /**
     * Sets the value of the corporateRegistrationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateRegistrationSchemeType }
     *     
     */
    public void setCorporateRegistrationScheme(CorporateRegistrationSchemeType value) {
        this.corporateRegistrationScheme = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:50:18 AM COT 
//


package co.gov.dian.contratos.facturaelectronica.v1.structures;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.dian.contratos.facturaelectronica.v1.structures package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DianExtensions_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1/Structures", "DianExtensions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.dian.contratos.facturaelectronica.v1.structures
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceControl }
     * 
     */
    public InvoiceControl createInvoiceControl() {
        return new InvoiceControl();
    }

    /**
     * Create an instance of {@link AdditionalMonetaryTotal }
     * 
     */
    public AdditionalMonetaryTotal createAdditionalMonetaryTotal() {
        return new AdditionalMonetaryTotal();
    }

    /**
     * Create an instance of {@link DianExtensionsType }
     * 
     */
    public DianExtensionsType createDianExtensionsType() {
        return new DianExtensionsType();
    }

    /**
     * Create an instance of {@link SoftwareProvider }
     * 
     */
    public SoftwareProvider createSoftwareProvider() {
        return new SoftwareProvider();
    }

    /**
     * Create an instance of {@link FinancialInformation }
     * 
     */
    public FinancialInformation createFinancialInformation() {
        return new FinancialInformation();
    }

    /**
     * Create an instance of {@link AuthrorizedInvoices }
     * 
     */
    public AuthrorizedInvoices createAuthrorizedInvoices() {
        return new AuthrorizedInvoices();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DianExtensionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1/Structures", name = "DianExtensions")
    public JAXBElement<DianExtensionsType> createDianExtensions(DianExtensionsType value) {
        return new JAXBElement<DianExtensionsType>(_DianExtensions_QNAME, DianExtensionsType.class, null, value);
    }

}

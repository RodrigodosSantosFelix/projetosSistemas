
package com.servico.calculadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.calculadora package. 
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

    private final static QName _Multiplica_QNAME = new QName("http://calculadora.servico.com/", "multiplica");
    private final static QName _MultiplicaResponse_QNAME = new QName("http://calculadora.servico.com/", "multiplicaResponse");
    private final static QName _Soma_QNAME = new QName("http://calculadora.servico.com/", "soma");
    private final static QName _SomaResponse_QNAME = new QName("http://calculadora.servico.com/", "somaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.calculadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Multiplica }
     * 
     */
    public Multiplica createMultiplica() {
        return new Multiplica();
    }

    /**
     * Create an instance of {@link MultiplicaResponse }
     * 
     */
    public MultiplicaResponse createMultiplicaResponse() {
        return new MultiplicaResponse();
    }

    /**
     * Create an instance of {@link Soma }
     * 
     */
    public Soma createSoma() {
        return new Soma();
    }

    /**
     * Create an instance of {@link SomaResponse }
     * 
     */
    public SomaResponse createSomaResponse() {
        return new SomaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.servico.com/", name = "multiplica")
    public JAXBElement<Multiplica> createMultiplica(Multiplica value) {
        return new JAXBElement<Multiplica>(_Multiplica_QNAME, Multiplica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.servico.com/", name = "multiplicaResponse")
    public JAXBElement<MultiplicaResponse> createMultiplicaResponse(MultiplicaResponse value) {
        return new JAXBElement<MultiplicaResponse>(_MultiplicaResponse_QNAME, MultiplicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.servico.com/", name = "soma")
    public JAXBElement<Soma> createSoma(Soma value) {
        return new JAXBElement<Soma>(_Soma_QNAME, Soma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.servico.com/", name = "somaResponse")
    public JAXBElement<SomaResponse> createSomaResponse(SomaResponse value) {
        return new JAXBElement<SomaResponse>(_SomaResponse_QNAME, SomaResponse.class, null, value);
    }

}

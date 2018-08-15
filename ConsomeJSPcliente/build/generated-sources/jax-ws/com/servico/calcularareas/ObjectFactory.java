
package com.servico.calcularareas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.calcularareas package. 
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

    private final static QName _Retangulo_QNAME = new QName("http://calcularareas.servico.com/", "retangulo");
    private final static QName _RetanguloResponse_QNAME = new QName("http://calcularareas.servico.com/", "retanguloResponse");
    private final static QName _Triangulo_QNAME = new QName("http://calcularareas.servico.com/", "triangulo");
    private final static QName _TrianguloResponse_QNAME = new QName("http://calcularareas.servico.com/", "trianguloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.calcularareas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Retangulo }
     * 
     */
    public Retangulo createRetangulo() {
        return new Retangulo();
    }

    /**
     * Create an instance of {@link RetanguloResponse }
     * 
     */
    public RetanguloResponse createRetanguloResponse() {
        return new RetanguloResponse();
    }

    /**
     * Create an instance of {@link Triangulo }
     * 
     */
    public Triangulo createTriangulo() {
        return new Triangulo();
    }

    /**
     * Create an instance of {@link TrianguloResponse }
     * 
     */
    public TrianguloResponse createTrianguloResponse() {
        return new TrianguloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcularareas.servico.com/", name = "retangulo")
    public JAXBElement<Retangulo> createRetangulo(Retangulo value) {
        return new JAXBElement<Retangulo>(_Retangulo_QNAME, Retangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetanguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcularareas.servico.com/", name = "retanguloResponse")
    public JAXBElement<RetanguloResponse> createRetanguloResponse(RetanguloResponse value) {
        return new JAXBElement<RetanguloResponse>(_RetanguloResponse_QNAME, RetanguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Triangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcularareas.servico.com/", name = "triangulo")
    public JAXBElement<Triangulo> createTriangulo(Triangulo value) {
        return new JAXBElement<Triangulo>(_Triangulo_QNAME, Triangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrianguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcularareas.servico.com/", name = "trianguloResponse")
    public JAXBElement<TrianguloResponse> createTrianguloResponse(TrianguloResponse value) {
        return new JAXBElement<TrianguloResponse>(_TrianguloResponse_QNAME, TrianguloResponse.class, null, value);
    }

}

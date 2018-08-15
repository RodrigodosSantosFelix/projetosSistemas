
package com.servico.boasvindas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.boasvindas package. 
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

    private final static QName _GerarMensagem_QNAME = new QName("http://boasvindas.servico.com/", "gerarMensagem");
    private final static QName _GerarMensagemResponse_QNAME = new QName("http://boasvindas.servico.com/", "gerarMensagemResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.boasvindas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarMensagem }
     * 
     */
    public GerarMensagem createGerarMensagem() {
        return new GerarMensagem();
    }

    /**
     * Create an instance of {@link GerarMensagemResponse }
     * 
     */
    public GerarMensagemResponse createGerarMensagemResponse() {
        return new GerarMensagemResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarMensagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boasvindas.servico.com/", name = "gerarMensagem")
    public JAXBElement<GerarMensagem> createGerarMensagem(GerarMensagem value) {
        return new JAXBElement<GerarMensagem>(_GerarMensagem_QNAME, GerarMensagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarMensagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boasvindas.servico.com/", name = "gerarMensagemResponse")
    public JAXBElement<GerarMensagemResponse> createGerarMensagemResponse(GerarMensagemResponse value) {
        return new JAXBElement<GerarMensagemResponse>(_GerarMensagemResponse_QNAME, GerarMensagemResponse.class, null, value);
    }

}

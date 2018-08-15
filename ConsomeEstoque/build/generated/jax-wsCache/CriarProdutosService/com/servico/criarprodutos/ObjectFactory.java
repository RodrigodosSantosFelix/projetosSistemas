
package com.servico.criarprodutos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.criarprodutos package. 
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

    private final static QName _GerarProduto_QNAME = new QName("http://criarprodutos.servico.com/", "gerarProduto");
    private final static QName _GerarProdutoResponse_QNAME = new QName("http://criarprodutos.servico.com/", "gerarProdutoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.criarprodutos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarProduto }
     * 
     */
    public GerarProduto createGerarProduto() {
        return new GerarProduto();
    }

    /**
     * Create an instance of {@link GerarProdutoResponse }
     * 
     */
    public GerarProdutoResponse createGerarProdutoResponse() {
        return new GerarProdutoResponse();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://criarprodutos.servico.com/", name = "gerarProduto")
    public JAXBElement<GerarProduto> createGerarProduto(GerarProduto value) {
        return new JAXBElement<GerarProduto>(_GerarProduto_QNAME, GerarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://criarprodutos.servico.com/", name = "gerarProdutoResponse")
    public JAXBElement<GerarProdutoResponse> createGerarProdutoResponse(GerarProdutoResponse value) {
        return new JAXBElement<GerarProdutoResponse>(_GerarProdutoResponse_QNAME, GerarProdutoResponse.class, null, value);
    }

}

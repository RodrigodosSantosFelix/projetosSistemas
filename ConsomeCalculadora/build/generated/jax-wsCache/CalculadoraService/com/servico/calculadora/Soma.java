
package com.servico.calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de soma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="soma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valorUm" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="valorDois" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soma", propOrder = {
    "valorUm",
    "valorDois"
})
public class Soma {

    protected float valorUm;
    protected float valorDois;

    /**
     * Obtém o valor da propriedade valorUm.
     * 
     */
    public float getValorUm() {
        return valorUm;
    }

    /**
     * Define o valor da propriedade valorUm.
     * 
     */
    public void setValorUm(float value) {
        this.valorUm = value;
    }

    /**
     * Obtém o valor da propriedade valorDois.
     * 
     */
    public float getValorDois() {
        return valorDois;
    }

    /**
     * Define o valor da propriedade valorDois.
     * 
     */
    public void setValorDois(float value) {
        this.valorDois = value;
    }

}

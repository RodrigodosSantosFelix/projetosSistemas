
package com.servico.calcularareas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de triangulo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="triangulo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "triangulo", propOrder = {
    "base",
    "altura"
})
public class Triangulo {

    protected double base;
    protected double altura;

    /**
     * Obtém o valor da propriedade base.
     * 
     */
    public double getBase() {
        return base;
    }

    /**
     * Define o valor da propriedade base.
     * 
     */
    public void setBase(double value) {
        this.base = value;
    }

    /**
     * Obtém o valor da propriedade altura.
     * 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define o valor da propriedade altura.
     * 
     */
    public void setAltura(double value) {
        this.altura = value;
    }

}


package br.gov.saude.servicos.schema.cadsus.v5r0.identificadorlocal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IdentificadorLocalType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificadorLocalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroIdentificadorLocal"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="identificadorSistema"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificadorLocalType", propOrder = {
    "numeroIdentificadorLocal",
    "identificadorSistema"
})
public class IdentificadorLocalType {

    @XmlElement(required = true)
    protected String numeroIdentificadorLocal;
    @XmlElement(required = true)
    protected String identificadorSistema;

    /**
     * Obtém o valor da propriedade numeroIdentificadorLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificadorLocal() {
        return numeroIdentificadorLocal;
    }

    /**
     * Define o valor da propriedade numeroIdentificadorLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificadorLocal(String value) {
        this.numeroIdentificadorLocal = value;
    }

    /**
     * Obtém o valor da propriedade identificadorSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorSistema() {
        return identificadorSistema;
    }

    /**
     * Define o valor da propriedade identificadorSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorSistema(String value) {
        this.identificadorSistema = value;
    }

}

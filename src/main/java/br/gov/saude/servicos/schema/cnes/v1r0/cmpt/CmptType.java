
package br.gov.saude.servicos.schema.cnes.v1r0.cmpt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cmptType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cmptType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cmpt"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="6"/&gt;
 *               &lt;maxLength value="6"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
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
@XmlType(name = "cmptType", propOrder = {
    "cmpt"
})
public class CmptType {

    @XmlElement(required = true)
    protected String cmpt;

    /**
     * Obtém o valor da propriedade cmpt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpt() {
        return cmpt;
    }

    /**
     * Define o valor da propriedade cmpt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpt(String value) {
        this.cmpt = value;
    }

}

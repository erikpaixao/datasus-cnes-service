
package br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IdentificadorCorporativoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificadorCorporativoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroIdentificadorCorporativo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
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
@XmlType(name = "IdentificadorCorporativoType", propOrder = {
    "numeroIdentificadorCorporativo"
})
public class IdentificadorCorporativoType {

    @XmlElement(required = true)
    protected String numeroIdentificadorCorporativo;

    /**
     * Obtém o valor da propriedade numeroIdentificadorCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificadorCorporativo() {
        return numeroIdentificadorCorporativo;
    }

    /**
     * Define o valor da propriedade numeroIdentificadorCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificadorCorporativo(String value) {
        this.numeroIdentificadorCorporativo = value;
    }

}

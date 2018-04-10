package br.gov.saude.servicos.schema.corporativo.endereco.v1r1.cep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de CEPType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="CEPType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroCEP"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="8"/&gt;
 *               &lt;maxLength value="8"/&gt;
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
@XmlType(name = "CEPType", propOrder = {
    "numeroCEP"
})
public class CEPType {

    @XmlElement(required = true)
    protected String numeroCEP;

    /**
     * Obtém o valor da propriedade numeroCEP.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumeroCEP() {
        return numeroCEP;
    }

    /**
     * Define o valor da propriedade numeroCEP.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumeroCEP(String value) {
        this.numeroCEP = value;
    }

}

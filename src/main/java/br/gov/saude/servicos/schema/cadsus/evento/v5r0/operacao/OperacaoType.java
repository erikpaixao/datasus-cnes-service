
package br.gov.saude.servicos.schema.cadsus.evento.v5r0.operacao;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperacaoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperacaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoOperacao" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="descricaoOperacao" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
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
@XmlType(name = "OperacaoType", propOrder = {
    "codigoOperacao",
    "descricaoOperacao"
})
public class OperacaoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger codigoOperacao;
    protected String descricaoOperacao;

    /**
     * Obtém o valor da propriedade codigoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoOperacao() {
        return codigoOperacao;
    }

    /**
     * Define o valor da propriedade codigoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoOperacao(BigInteger value) {
        this.codigoOperacao = value;
    }

    /**
     * Obtém o valor da propriedade descricaoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoOperacao() {
        return descricaoOperacao;
    }

    /**
     * Define o valor da propriedade descricaoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoOperacao(String value) {
        this.descricaoOperacao = value;
    }

}

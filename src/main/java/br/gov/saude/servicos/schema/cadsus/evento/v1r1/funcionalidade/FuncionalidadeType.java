
package br.gov.saude.servicos.schema.cadsus.evento.v1r1.funcionalidade;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FuncionalidadeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FuncionalidadeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoFuncionalidade" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="descricaoFuncionalidade" minOccurs="0"&gt;
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
@XmlType(name = "FuncionalidadeType", propOrder = {
    "codigoFuncionalidade",
    "descricaoFuncionalidade"
})
public class FuncionalidadeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger codigoFuncionalidade;
    protected String descricaoFuncionalidade;

    /**
     * Obtém o valor da propriedade codigoFuncionalidade.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoFuncionalidade() {
        return codigoFuncionalidade;
    }

    /**
     * Define o valor da propriedade codigoFuncionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoFuncionalidade(BigInteger value) {
        this.codigoFuncionalidade = value;
    }

    /**
     * Obtém o valor da propriedade descricaoFuncionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoFuncionalidade() {
        return descricaoFuncionalidade;
    }

    /**
     * Define o valor da propriedade descricaoFuncionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoFuncionalidade(String value) {
        this.descricaoFuncionalidade = value;
    }

}

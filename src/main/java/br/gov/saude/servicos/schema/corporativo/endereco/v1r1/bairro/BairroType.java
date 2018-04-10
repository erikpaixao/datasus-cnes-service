package br.gov.saude.servicos.schema.corporativo.endereco.v1r1.bairro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de BairroType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="BairroType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoBairro" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descricaoBairro" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="72"/&gt;
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
@XmlType(name = "BairroType", propOrder = {
    "codigoBairro",
    "descricaoBairro"
})
public class BairroType {

    protected String codigoBairro;
    protected String descricaoBairro;

    /**
     * Obtém o valor da propriedade codigoBairro.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoBairro() {
        return codigoBairro;
    }

    /**
     * Define o valor da propriedade codigoBairro.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoBairro(String value) {
        this.codigoBairro = value;
    }

    /**
     * Obtém o valor da propriedade descricaoBairro.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescricaoBairro() {
        return descricaoBairro;
    }

    /**
     * Define o valor da propriedade descricaoBairro.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescricaoBairro(String value) {
        this.descricaoBairro = value;
    }

}

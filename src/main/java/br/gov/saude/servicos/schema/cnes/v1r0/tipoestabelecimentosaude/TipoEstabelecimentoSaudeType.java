package br.gov.saude.servicos.schema.cnes.v1r0.tipoestabelecimentosaude;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.subtipoestabelecimentosaude.SubtipoEstabelecimentoSaudeType;

/**
 * <p>
 * Classe Java de TipoEstabelecimentoSaudeType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="TipoEstabelecimentoSaudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descricao"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/subtipoestabelecimentosaude}SubtipoEstabelecimentoSaude" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoEstabelecimentoSaudeType", propOrder = {
    "codigo",
    "descricao",
    "subtipoEstabelecimentoSaude"
})
public class TipoEstabelecimentoSaudeType {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(name = "SubtipoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/subtipoestabelecimentosaude", required = true)
    protected List<SubtipoEstabelecimentoSaudeType> subtipoEstabelecimentoSaude;

    /**
     * Obtém o valor da propriedade codigo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Subtipo do Estabelecimento de Saúde..Gets the value of the
     * subtipoEstabelecimentoSaude property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the subtipoEstabelecimentoSaude property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtipoEstabelecimentoSaude().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubtipoEstabelecimentoSaudeType }
     *
     *
     */
    public List<SubtipoEstabelecimentoSaudeType> getSubtipoEstabelecimentoSaude() {
        if (subtipoEstabelecimentoSaude == null) {
            subtipoEstabelecimentoSaude = new ArrayList<SubtipoEstabelecimentoSaudeType>();
        }
        return this.subtipoEstabelecimentoSaude;
    }

}

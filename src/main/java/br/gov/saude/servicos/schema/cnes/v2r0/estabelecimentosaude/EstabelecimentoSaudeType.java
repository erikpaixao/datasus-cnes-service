package br.gov.saude.servicos.schema.cnes.v2r0.estabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.identificacaoestabelecimentosaude.IdentificacaoEstabelecimentoSaudeType;

/**
 * <p>
 * Classe Java de EstabelecimentoSaudeType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="EstabelecimentoSaudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoCNES"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/identificacaoestabelecimentosaude}IdentificacaoEstabelecimentoSaude" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstabelecimentoSaudeType", propOrder = {
    "codigoCNES",
    "identificacaoEstabelecimentoSaude"
})
public class EstabelecimentoSaudeType {

    @XmlElement(required = true)
    protected String codigoCNES;
    @XmlElement(name = "IdentificacaoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/identificacaoestabelecimentosaude")
    protected IdentificacaoEstabelecimentoSaudeType identificacaoEstabelecimentoSaude;

    /**
     * Obtém o valor da propriedade codigoCNES.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoCNES() {
        return codigoCNES;
    }

    /**
     * Define o valor da propriedade codigoCNES.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoCNES(String value) {
        this.codigoCNES = value;
    }

    /**
     * Identificação do Estabelecimento de Saúde..
     *
     * @return possible object is {@link IdentificacaoEstabelecimentoSaudeType }
     *
     */
    public IdentificacaoEstabelecimentoSaudeType getIdentificacaoEstabelecimentoSaude() {
        return identificacaoEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade identificacaoEstabelecimentoSaude.
     *
     * @param value allowed object is
     *     {@link IdentificacaoEstabelecimentoSaudeType }
     *
     */
    public void setIdentificacaoEstabelecimentoSaude(IdentificacaoEstabelecimentoSaudeType value) {
        this.identificacaoEstabelecimentoSaude = value;
    }

}

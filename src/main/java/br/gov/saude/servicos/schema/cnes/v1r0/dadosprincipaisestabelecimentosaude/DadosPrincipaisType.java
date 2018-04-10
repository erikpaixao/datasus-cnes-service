package br.gov.saude.servicos.schema.cnes.v1r0.dadosprincipaisestabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.atividadeensino.AtividadeEnsinoType;
import br.gov.saude.servicos.schema.cnes.v1r0.tipoestabelecimentosaude.TipoEstabelecimentoSaudeType;

/**
 * <p>
 * Classe Java de DadosPrincipaisType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="DadosPrincipaisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/tipoestabelecimentosaude}TipoEstabelecimentoSaude"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/atividadeensino}AtividadeEnsino"/&gt;
 *         &lt;element name="sitioInternet" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
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
@XmlType(name = "DadosPrincipaisType", propOrder = {
    "tipoEstabelecimentoSaude",
    "atividadeEnsino",
    "sitioInternet"
})
public class DadosPrincipaisType {

    @XmlElement(name = "TipoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipoestabelecimentosaude", required = true)
    protected TipoEstabelecimentoSaudeType tipoEstabelecimentoSaude;
    @XmlElement(name = "AtividadeEnsino", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/atividadeensino", required = true)
    protected AtividadeEnsinoType atividadeEnsino;
    protected String sitioInternet;

    /**
     * Tipo do Estabelecimento de Saúde..
     *
     * @return possible object is {@link TipoEstabelecimentoSaudeType }
     *
     */
    public TipoEstabelecimentoSaudeType getTipoEstabelecimentoSaude() {
        return tipoEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade tipoEstabelecimentoSaude.
     *
     * @param value allowed object is {@link TipoEstabelecimentoSaudeType }
     *
     */
    public void setTipoEstabelecimentoSaude(TipoEstabelecimentoSaudeType value) {
        this.tipoEstabelecimentoSaude = value;
    }

    /**
     * Atividade de Ensino..
     *
     * @return possible object is {@link AtividadeEnsinoType }
     *
     */
    public AtividadeEnsinoType getAtividadeEnsino() {
        return atividadeEnsino;
    }

    /**
     * Define o valor da propriedade atividadeEnsino.
     *
     * @param value allowed object is {@link AtividadeEnsinoType }
     *
     */
    public void setAtividadeEnsino(AtividadeEnsinoType value) {
        this.atividadeEnsino = value;
    }

    /**
     * Obtém o valor da propriedade sitioInternet.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSitioInternet() {
        return sitioInternet;
    }

    /**
     * Define o valor da propriedade sitioInternet.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSitioInternet(String value) {
        this.sitioInternet = value;
    }

}

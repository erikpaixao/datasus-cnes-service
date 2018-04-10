package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de FiltroPesquisaVinculacaoType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="FiltroPesquisaVinculacaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificacaoProfissional" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacao}ProfissionalVinculacaoType"/&gt;
 *         &lt;element name="IdentificacaoEstabelecimento" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacao}EstabelecimentoVinculacaoType"/&gt;
 *         &lt;element name="IdentificacaoVinculacao" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacao}TipoVinculacaoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltroPesquisaVinculacaoType", propOrder = {
    "identificacaoProfissional",
    "identificacaoEstabelecimento",
    "identificacaoVinculacao"
})
public class FiltroPesquisaVinculacaoType {

    @XmlElement(name = "IdentificacaoProfissional", required = true)
    protected ProfissionalVinculacaoType identificacaoProfissional;
    @XmlElement(name = "IdentificacaoEstabelecimento", required = true)
    protected EstabelecimentoVinculacaoType identificacaoEstabelecimento;
    @XmlElement(name = "IdentificacaoVinculacao", required = true)
    protected TipoVinculacaoType identificacaoVinculacao;

    /**
     * Obtém o valor da propriedade identificacaoProfissional.
     *
     * @return possible object is {@link ProfissionalVinculacaoType }
     *
     */
    public ProfissionalVinculacaoType getIdentificacaoProfissional() {
        return identificacaoProfissional;
    }

    /**
     * Define o valor da propriedade identificacaoProfissional.
     *
     * @param value allowed object is {@link ProfissionalVinculacaoType }
     *
     */
    public void setIdentificacaoProfissional(ProfissionalVinculacaoType value) {
        this.identificacaoProfissional = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoEstabelecimento.
     *
     * @return possible object is {@link EstabelecimentoVinculacaoType }
     *
     */
    public EstabelecimentoVinculacaoType getIdentificacaoEstabelecimento() {
        return identificacaoEstabelecimento;
    }

    /**
     * Define o valor da propriedade identificacaoEstabelecimento.
     *
     * @param value allowed object is {@link EstabelecimentoVinculacaoType }
     *
     */
    public void setIdentificacaoEstabelecimento(EstabelecimentoVinculacaoType value) {
        this.identificacaoEstabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoVinculacao.
     *
     * @return possible object is {@link TipoVinculacaoType }
     *
     */
    public TipoVinculacaoType getIdentificacaoVinculacao() {
        return identificacaoVinculacao;
    }

    /**
     * Define o valor da propriedade identificacaoVinculacao.
     *
     * @param value allowed object is {@link TipoVinculacaoType }
     *
     */
    public void setIdentificacaoVinculacao(TipoVinculacaoType value) {
        this.identificacaoVinculacao = value;
    }

}

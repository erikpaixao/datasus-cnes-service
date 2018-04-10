package br.gov.saude.servicos.schema.cnes.v1r0.vinculacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosestabelecimento.DadosBasicosEstabelecimentoType;
import br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosprofissional.DadosBasicosProfissionalType;
import br.gov.saude.servicos.schema.cnes.v1r0.vinculacaocbotype.ListaVinculacaoCBOType;

/**
 * <p>
 * Classe Java de VinculacaoType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="VinculacaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Profissional" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosprofissional}DadosBasicosProfissionalType"/&gt;
 *         &lt;element name="Estabelecimento" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosestabelecimento}DadosBasicosEstabelecimentoType"/&gt;
 *         &lt;element name="indVinculacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoModVinculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desCodigoModVinculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoTipoModVinculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desTipoCodigoModVinculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoSubTipoModVinculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desSubTipoCodigoModVinculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CBOs" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacaocbotype}ListaVinculacaoCBOType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VinculacaoType", propOrder = {
    "profissional",
    "estabelecimento",
    "indVinculacao",
    "codigoModVinculo",
    "desCodigoModVinculo",
    "codigoTipoModVinculo",
    "desTipoCodigoModVinculo",
    "codigoSubTipoModVinculo",
    "desSubTipoCodigoModVinculo",
    "cbOs"
})
public class VinculacaoType {

    @XmlElement(name = "Profissional", required = true)
    protected DadosBasicosProfissionalType profissional;
    @XmlElement(name = "Estabelecimento", required = true)
    protected DadosBasicosEstabelecimentoType estabelecimento;
    @XmlElement(required = true)
    protected String indVinculacao;
    @XmlElement(required = true)
    protected String codigoModVinculo;
    @XmlElement(required = true)
    protected String desCodigoModVinculo;
    @XmlElement(required = true)
    protected String codigoTipoModVinculo;
    @XmlElement(required = true)
    protected String desTipoCodigoModVinculo;
    @XmlElement(required = true)
    protected String codigoSubTipoModVinculo;
    @XmlElement(required = true)
    protected String desSubTipoCodigoModVinculo;
    @XmlElement(name = "CBOs")
    protected ListaVinculacaoCBOType cbOs;

    /**
     * Obtém o valor da propriedade profissional.
     *
     * @return possible object is {@link DadosBasicosProfissionalType }
     *
     */
    public DadosBasicosProfissionalType getProfissional() {
        return profissional;
    }

    /**
     * Define o valor da propriedade profissional.
     *
     * @param value allowed object is {@link DadosBasicosProfissionalType }
     *
     */
    public void setProfissional(DadosBasicosProfissionalType value) {
        this.profissional = value;
    }

    /**
     * Obtém o valor da propriedade estabelecimento.
     *
     * @return possible object is {@link DadosBasicosEstabelecimentoType }
     *
     */
    public DadosBasicosEstabelecimentoType getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * Define o valor da propriedade estabelecimento.
     *
     * @param value allowed object is {@link DadosBasicosEstabelecimentoType }
     *
     */
    public void setEstabelecimento(DadosBasicosEstabelecimentoType value) {
        this.estabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade indVinculacao.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIndVinculacao() {
        return indVinculacao;
    }

    /**
     * Define o valor da propriedade indVinculacao.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIndVinculacao(String value) {
        this.indVinculacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoModVinculo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoModVinculo() {
        return codigoModVinculo;
    }

    /**
     * Define o valor da propriedade codigoModVinculo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoModVinculo(String value) {
        this.codigoModVinculo = value;
    }

    /**
     * Obtém o valor da propriedade desCodigoModVinculo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDesCodigoModVinculo() {
        return desCodigoModVinculo;
    }

    /**
     * Define o valor da propriedade desCodigoModVinculo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDesCodigoModVinculo(String value) {
        this.desCodigoModVinculo = value;
    }

    /**
     * Obtém o valor da propriedade codigoTipoModVinculo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoTipoModVinculo() {
        return codigoTipoModVinculo;
    }

    /**
     * Define o valor da propriedade codigoTipoModVinculo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoTipoModVinculo(String value) {
        this.codigoTipoModVinculo = value;
    }

    /**
     * Obtém o valor da propriedade desTipoCodigoModVinculo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDesTipoCodigoModVinculo() {
        return desTipoCodigoModVinculo;
    }

    /**
     * Define o valor da propriedade desTipoCodigoModVinculo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDesTipoCodigoModVinculo(String value) {
        this.desTipoCodigoModVinculo = value;
    }

    /**
     * Obtém o valor da propriedade codigoSubTipoModVinculo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoSubTipoModVinculo() {
        return codigoSubTipoModVinculo;
    }

    /**
     * Define o valor da propriedade codigoSubTipoModVinculo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoSubTipoModVinculo(String value) {
        this.codigoSubTipoModVinculo = value;
    }

    /**
     * Obtém o valor da propriedade desSubTipoCodigoModVinculo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDesSubTipoCodigoModVinculo() {
        return desSubTipoCodigoModVinculo;
    }

    /**
     * Define o valor da propriedade desSubTipoCodigoModVinculo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDesSubTipoCodigoModVinculo(String value) {
        this.desSubTipoCodigoModVinculo = value;
    }

    /**
     * Obtém o valor da propriedade cbOs.
     *
     * @return possible object is {@link ListaVinculacaoCBOType }
     *
     */
    public ListaVinculacaoCBOType getCBOs() {
        return cbOs;
    }

    /**
     * Define o valor da propriedade cbOs.
     *
     * @param value allowed object is {@link ListaVinculacaoCBOType }
     *
     */
    public void setCBOs(ListaVinculacaoCBOType value) {
        this.cbOs = value;
    }

}

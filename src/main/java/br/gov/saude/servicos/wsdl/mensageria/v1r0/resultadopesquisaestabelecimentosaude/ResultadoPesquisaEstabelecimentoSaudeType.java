package br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisaestabelecimentosaude;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.dadosgeraiscnes.DadosGeraisEstabelecimentoSaudeType;
import br.gov.saude.servicos.schema.cnes.v1r0.equipamento.EquipamentoType;
import br.gov.saude.servicos.schema.cnes.v1r0.habilitacao.HabilitacaoType;
import br.gov.saude.servicos.schema.cnes.v1r0.leito.LeitoType;
import br.gov.saude.servicos.schema.cnes.v1r0.samu.SamuType;
import br.gov.saude.servicos.schema.profissionalsaude.v1r0.profissionalsaude.ProfissionalSaudeType;

/**
 * <p>
 * Classe Java de ResultadoPesquisaEstabelecimentoSaudeType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="ResultadoPesquisaEstabelecimentoSaudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EstabelecimentoSaude" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes}DadosGeraisEstabelecimentoSaudeType" minOccurs="0"/&gt;
 *         &lt;element name="profissional" type="{http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/profissionalsaude}ProfissionalSaudeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="leito" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/leito}LeitoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="habilitacao" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/habilitacao}HabilitacaoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="equipamento" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/equipamento}EquipamentoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="samu" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/samu}SamuType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sumario" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisaestabelecimentosaude}SumarioEstabelecimentoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoPesquisaEstabelecimentoSaudeType", propOrder = {
    "estabelecimentoSaude",
    "profissional",
    "leito",
    "habilitacao",
    "equipamento",
    "samu",
    "sumario"
})
public class ResultadoPesquisaEstabelecimentoSaudeType {

    @XmlElement(name = "EstabelecimentoSaude")
    protected DadosGeraisEstabelecimentoSaudeType estabelecimentoSaude;
    protected List<ProfissionalSaudeType> profissional;
    protected List<LeitoType> leito;
    protected List<HabilitacaoType> habilitacao;
    protected List<EquipamentoType> equipamento;
    protected List<SamuType> samu;
    @XmlElement(required = true)
    protected SumarioEstabelecimentoType sumario;

    /**
     * Obtém o valor da propriedade estabelecimentoSaude.
     *
     * @return possible object is {@link DadosGeraisEstabelecimentoSaudeType }
     *
     */
    public DadosGeraisEstabelecimentoSaudeType getEstabelecimentoSaude() {
        return estabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade estabelecimentoSaude.
     *
     * @param value allowed object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *
     */
    public void setEstabelecimentoSaude(DadosGeraisEstabelecimentoSaudeType value) {
        this.estabelecimentoSaude = value;
    }

    /**
     * Gets the value of the profissional property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the profissional property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfissional().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfissionalSaudeType }
     *
     *
     */
    public List<ProfissionalSaudeType> getProfissional() {
        if (profissional == null) {
            profissional = new ArrayList<ProfissionalSaudeType>();
        }
        return this.profissional;
    }

    /**
     * Gets the value of the leito property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the leito property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeito().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeitoType }
     *
     *
     */
    public List<LeitoType> getLeito() {
        if (leito == null) {
            leito = new ArrayList<LeitoType>();
        }
        return this.leito;
    }

    /**
     * Gets the value of the habilitacao property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the habilitacao property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHabilitacao().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HabilitacaoType }
     *
     *
     */
    public List<HabilitacaoType> getHabilitacao() {
        if (habilitacao == null) {
            habilitacao = new ArrayList<HabilitacaoType>();
        }
        return this.habilitacao;
    }

    /**
     * Gets the value of the equipamento property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the equipamento property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipamento().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipamentoType }
     *
     *
     */
    public List<EquipamentoType> getEquipamento() {
        if (equipamento == null) {
            equipamento = new ArrayList<EquipamentoType>();
        }
        return this.equipamento;
    }

    /**
     * Gets the value of the samu property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the samu property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamu().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SamuType }
     *
     *
     */
    public List<SamuType> getSamu() {
        if (samu == null) {
            samu = new ArrayList<SamuType>();
        }
        return this.samu;
    }

    /**
     * Obtém o valor da propriedade sumario.
     *
     * @return possible object is {@link SumarioEstabelecimentoType }
     *
     */
    public SumarioEstabelecimentoType getSumario() {
        return sumario;
    }

    /**
     * Define o valor da propriedade sumario.
     *
     * @param value allowed object is {@link SumarioEstabelecimentoType }
     *
     */
    public void setSumario(SumarioEstabelecimentoType value) {
        this.sumario = value;
    }

}

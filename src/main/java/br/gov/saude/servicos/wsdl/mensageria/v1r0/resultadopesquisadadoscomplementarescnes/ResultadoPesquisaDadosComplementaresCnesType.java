
package br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisadadoscomplementarescnes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.cmpt.CmptType;
import br.gov.saude.servicos.schema.cnes.v1r0.complementoesferaadministrativa.ComplementoEsferaAdministrativaType;
import br.gov.saude.servicos.schema.cnes.v1r0.complementoestabelecimentosaude.ComplementoEstabelecimentoSaudeType;
import br.gov.saude.servicos.schema.cnes.v1r0.complementoprofissionalsaude.ComplementoProfissionalSaudeType;


/**
 * <p>Classe Java de ResultadoPesquisaDadosComplementaresCnesType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResultadoPesquisaDadosComplementaresCnesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/complementoestabelecimentosaude}ComplementoEstabelecimentoSaude" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/complementoesferaadministrativa}ComplementoEsferaAdministrativa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/complementoprofissionalsaude}ComplementoProfissionalSaude" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/cmpt}cmpt"/&gt;
 *         &lt;element name="sumario" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisadadoscomplementarescnes}SumarioDadosComplementaresType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoPesquisaDadosComplementaresCnesType", propOrder = {
    "complementoEstabelecimentoSaude",
    "complementoEsferaAdministrativa",
    "complementoProfissionalSaude",
    "cmpt",
    "sumario"
})
public class ResultadoPesquisaDadosComplementaresCnesType {

    @XmlElement(name = "ComplementoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/complementoestabelecimentosaude")
    protected List<ComplementoEstabelecimentoSaudeType> complementoEstabelecimentoSaude;
    @XmlElement(name = "ComplementoEsferaAdministrativa", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/complementoesferaadministrativa")
    protected List<ComplementoEsferaAdministrativaType> complementoEsferaAdministrativa;
    @XmlElement(name = "ComplementoProfissionalSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/complementoprofissionalsaude")
    protected List<ComplementoProfissionalSaudeType> complementoProfissionalSaude;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/cmpt", required = true)
    protected CmptType cmpt;
    @XmlElement(required = true)
    protected SumarioDadosComplementaresType sumario;

    /**
     * Dados Complementares do Estabelecimento de Saúde.Gets the value of the complementoEstabelecimentoSaude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementoEstabelecimentoSaude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementoEstabelecimentoSaude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplementoEstabelecimentoSaudeType }
     * 
     * 
     */
    public List<ComplementoEstabelecimentoSaudeType> getComplementoEstabelecimentoSaude() {
        if (complementoEstabelecimentoSaude == null) {
            complementoEstabelecimentoSaude = new ArrayList<ComplementoEstabelecimentoSaudeType>();
        }
        return this.complementoEstabelecimentoSaude;
    }

    /**
     * Dados Complementares da Esfera Administrativa.Gets the value of the complementoEsferaAdministrativa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementoEsferaAdministrativa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementoEsferaAdministrativa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplementoEsferaAdministrativaType }
     * 
     * 
     */
    public List<ComplementoEsferaAdministrativaType> getComplementoEsferaAdministrativa() {
        if (complementoEsferaAdministrativa == null) {
            complementoEsferaAdministrativa = new ArrayList<ComplementoEsferaAdministrativaType>();
        }
        return this.complementoEsferaAdministrativa;
    }

    /**
     * Dados Complementares dos Profissionais de Saúde.Gets the value of the complementoProfissionalSaude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementoProfissionalSaude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementoProfissionalSaude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplementoProfissionalSaudeType }
     * 
     * 
     */
    public List<ComplementoProfissionalSaudeType> getComplementoProfissionalSaude() {
        if (complementoProfissionalSaude == null) {
            complementoProfissionalSaude = new ArrayList<ComplementoProfissionalSaudeType>();
        }
        return this.complementoProfissionalSaude;
    }

    /**
     * Ano do Exercício.
     * 
     * @return
     *     possible object is
     *     {@link CmptType }
     *     
     */
    public CmptType getCmpt() {
        return cmpt;
    }

    /**
     * Define o valor da propriedade cmpt.
     * 
     * @param value
     *     allowed object is
     *     {@link CmptType }
     *     
     */
    public void setCmpt(CmptType value) {
        this.cmpt = value;
    }

    /**
     * Obtém o valor da propriedade sumario.
     * 
     * @return
     *     possible object is
     *     {@link SumarioDadosComplementaresType }
     *     
     */
    public SumarioDadosComplementaresType getSumario() {
        return sumario;
    }

    /**
     * Define o valor da propriedade sumario.
     * 
     * @param value
     *     allowed object is
     *     {@link SumarioDadosComplementaresType }
     *     
     */
    public void setSumario(SumarioDadosComplementaresType value) {
        this.sumario = value;
    }

}

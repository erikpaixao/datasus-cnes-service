package br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisaestabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de SumarioEstabelecimentoType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="SumarioEstabelecimentoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quantidadeProfissionaisSaude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantidadeCBOS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantidadeLeitos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantidadeHabilitacoes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantidadeEquipamentos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantidadeSamus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumarioEstabelecimentoType", propOrder = {
    "quantidadeProfissionaisSaude",
    "quantidadeCBOS",
    "quantidadeLeitos",
    "quantidadeHabilitacoes",
    "quantidadeEquipamentos",
    "quantidadeSamus"
})
public class SumarioEstabelecimentoType {

    protected int quantidadeProfissionaisSaude;
    protected int quantidadeCBOS;
    protected int quantidadeLeitos;
    protected int quantidadeHabilitacoes;
    protected int quantidadeEquipamentos;
    protected int quantidadeSamus;

    /**
     * Obtém o valor da propriedade quantidadeProfissionaisSaude.
     *
     */
    public int getQuantidadeProfissionaisSaude() {
        return quantidadeProfissionaisSaude;
    }

    /**
     * Define o valor da propriedade quantidadeProfissionaisSaude.
     *
     */
    public void setQuantidadeProfissionaisSaude(int value) {
        this.quantidadeProfissionaisSaude = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeCBOS.
     *
     */
    public int getQuantidadeCBOS() {
        return quantidadeCBOS;
    }

    /**
     * Define o valor da propriedade quantidadeCBOS.
     *
     */
    public void setQuantidadeCBOS(int value) {
        this.quantidadeCBOS = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeLeitos.
     *
     */
    public int getQuantidadeLeitos() {
        return quantidadeLeitos;
    }

    /**
     * Define o valor da propriedade quantidadeLeitos.
     *
     */
    public void setQuantidadeLeitos(int value) {
        this.quantidadeLeitos = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeHabilitacoes.
     *
     */
    public int getQuantidadeHabilitacoes() {
        return quantidadeHabilitacoes;
    }

    /**
     * Define o valor da propriedade quantidadeHabilitacoes.
     *
     */
    public void setQuantidadeHabilitacoes(int value) {
        this.quantidadeHabilitacoes = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeEquipamentos.
     *
     */
    public int getQuantidadeEquipamentos() {
        return quantidadeEquipamentos;
    }

    /**
     * Define o valor da propriedade quantidadeEquipamentos.
     *
     */
    public void setQuantidadeEquipamentos(int value) {
        this.quantidadeEquipamentos = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeSamus.
     *
     */
    public int getQuantidadeSamus() {
        return quantidadeSamus;
    }

    /**
     * Define o valor da propriedade quantidadeSamus.
     *
     */
    public void setQuantidadeSamus(int value) {
        this.quantidadeSamus = value;
    }

}

package br.gov.saude.servicos.schema.cnes.v1r0.habilitacao;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.cnes.v1r0.cmpt.CmptType;
import br.gov.saude.servicos.schema.cnes.v1r0.grupohabilitacao.GrupoHabilitacaoType;
import br.gov.saude.servicos.schema.cnes.v1r0.subgrupohabilitacao.SubGrupoHabilitacaoType;

/**
 * <p>
 * Classe Java de HabilitacaoType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="HabilitacaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/grupohabilitacao}grupoHabilitacao"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/subgrupohabilitacao}subGrupoHabilitacao"/&gt;
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="cmptInicio" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/cmpt}cmptType" minOccurs="0"/&gt;
 *         &lt;element name="cmptFim" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/cmpt}cmptType" minOccurs="0"/&gt;
 *         &lt;element name="nomePortaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataPortaria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeLeito" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HabilitacaoType", propOrder = {
    "grupoHabilitacao",
    "subGrupoHabilitacao",
    "dataAtualizacao",
    "cmptInicio",
    "cmptFim",
    "nomePortaria",
    "dataPortaria",
    "quantidadeLeito"
})
public class HabilitacaoType {

    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/grupohabilitacao", required = true)
    protected GrupoHabilitacaoType grupoHabilitacao;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/subgrupohabilitacao", required = true)
    protected SubGrupoHabilitacaoType subGrupoHabilitacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    protected CmptType cmptInicio;
    protected CmptType cmptFim;
    protected String nomePortaria;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPortaria;
    protected BigInteger quantidadeLeito;

    /**
     * Grupo de Habilitação do Estabelecimento de Saúde..
     *
     * @return possible object is {@link GrupoHabilitacaoType }
     *
     */
    public GrupoHabilitacaoType getGrupoHabilitacao() {
        return grupoHabilitacao;
    }

    /**
     * Define o valor da propriedade grupoHabilitacao.
     *
     * @param value allowed object is {@link GrupoHabilitacaoType }
     *
     */
    public void setGrupoHabilitacao(GrupoHabilitacaoType value) {
        this.grupoHabilitacao = value;
    }

    /**
     * Sub-Grupo de Habilitação do Estabelecimento de Saúde..
     *
     * @return possible object is {@link SubGrupoHabilitacaoType }
     *
     */
    public SubGrupoHabilitacaoType getSubGrupoHabilitacao() {
        return subGrupoHabilitacao;
    }

    /**
     * Define o valor da propriedade subGrupoHabilitacao.
     *
     * @param value allowed object is {@link SubGrupoHabilitacaoType }
     *
     */
    public void setSubGrupoHabilitacao(SubGrupoHabilitacaoType value) {
        this.subGrupoHabilitacao = value;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacao.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDataAtualizacao(XMLGregorianCalendar value) {
        this.dataAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade cmptInicio.
     *
     * @return possible object is {@link CmptType }
     *
     */
    public CmptType getCmptInicio() {
        return cmptInicio;
    }

    /**
     * Define o valor da propriedade cmptInicio.
     *
     * @param value allowed object is {@link CmptType }
     *
     */
    public void setCmptInicio(CmptType value) {
        this.cmptInicio = value;
    }

    /**
     * Obtém o valor da propriedade cmptFim.
     *
     * @return possible object is {@link CmptType }
     *
     */
    public CmptType getCmptFim() {
        return cmptFim;
    }

    /**
     * Define o valor da propriedade cmptFim.
     *
     * @param value allowed object is {@link CmptType }
     *
     */
    public void setCmptFim(CmptType value) {
        this.cmptFim = value;
    }

    /**
     * Obtém o valor da propriedade nomePortaria.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNomePortaria() {
        return nomePortaria;
    }

    /**
     * Define o valor da propriedade nomePortaria.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNomePortaria(String value) {
        this.nomePortaria = value;
    }

    /**
     * Obtém o valor da propriedade dataPortaria.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataPortaria() {
        return dataPortaria;
    }

    /**
     * Define o valor da propriedade dataPortaria.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDataPortaria(XMLGregorianCalendar value) {
        this.dataPortaria = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeLeito.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getQuantidadeLeito() {
        return quantidadeLeito;
    }

    /**
     * Define o valor da propriedade quantidadeLeito.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setQuantidadeLeito(BigInteger value) {
        this.quantidadeLeito = value;
    }

}


package br.gov.saude.servicos.wsdl.mensageria.v5r0.filtropesquisa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf.CPFType;
import br.gov.saude.servicos.schema.corporativo.documento.v5r0.tipodocumento.TipoDocumentoType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r0.nomefamilia.NomeFamiliaType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.nomecompleto.NomeCompletoType;
import br.gov.saude.servicos.schema.corporativo.v1r2.municipio.MunicipioType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomeCompleto" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType" minOccurs="0"/&gt;
 *         &lt;element name="nomeSocial" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r1/nomesocial}NomeSocialType" minOccurs="0"/&gt;
 *         &lt;element name="nomeFamilia" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r0/nomefamilia}NomeFamiliaType" minOccurs="0"/&gt;
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Mae" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType" minOccurs="0"/&gt;
 *         &lt;element name="Pai" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType" minOccurs="0"/&gt;
 *         &lt;element name="CPF" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf}CPFType" minOccurs="0"/&gt;
 *         &lt;element name="MunicipioNascimento" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}MunicipioType" minOccurs="0"/&gt;
 *         &lt;element name="TipoDocumento" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v5r0/tipodocumento}TipoDocumentoType" minOccurs="0"/&gt;
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPesquisa" type="{http://servicos.saude.gov.br/wsdl/mensageria/v5r0/filtropesquisa}TipoPesquisaType"/&gt;
 *         &lt;element name="situacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nomeCompleto",
    "nomeSocial",
    "nomeFamilia",
    "dataNascimento",
    "mae",
    "pai",
    "cpf",
    "municipioNascimento",
    "tipoDocumento",
    "numeroDocumento",
    "tipoPesquisa",
    "situacao"
})
@XmlRootElement(name = "FiltroPesquisa")
public class FiltroPesquisa {

    protected NomeCompletoType nomeCompleto;
    protected String nomeSocial;
    protected NomeFamiliaType nomeFamilia;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(name = "Mae")
    protected NomeCompletoType mae;
    @XmlElement(name = "Pai")
    protected NomeCompletoType pai;
    @XmlElement(name = "CPF")
    protected CPFType cpf;
    @XmlElement(name = "MunicipioNascimento")
    protected MunicipioType municipioNascimento;
    @XmlElement(name = "TipoDocumento")
    protected TipoDocumentoType tipoDocumento;
    protected String numeroDocumento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoPesquisaType tipoPesquisa;
    protected Boolean situacao;

    /**
     * Obtém o valor da propriedade nomeCompleto.
     * 
     * @return
     *     possible object is
     *     {@link NomeCompletoType }
     *     
     */
    public NomeCompletoType getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Define o valor da propriedade nomeCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeCompletoType }
     *     
     */
    public void setNomeCompleto(NomeCompletoType value) {
        this.nomeCompleto = value;
    }

    /**
     * Obtém o valor da propriedade nomeSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSocial() {
        return nomeSocial;
    }

    /**
     * Define o valor da propriedade nomeSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSocial(String value) {
        this.nomeSocial = value;
    }

    /**
     * Obtém o valor da propriedade nomeFamilia.
     * 
     * @return
     *     possible object is
     *     {@link NomeFamiliaType }
     *     
     */
    public NomeFamiliaType getNomeFamilia() {
        return nomeFamilia;
    }

    /**
     * Define o valor da propriedade nomeFamilia.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeFamiliaType }
     *     
     */
    public void setNomeFamilia(NomeFamiliaType value) {
        this.nomeFamilia = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade mae.
     * 
     * @return
     *     possible object is
     *     {@link NomeCompletoType }
     *     
     */
    public NomeCompletoType getMae() {
        return mae;
    }

    /**
     * Define o valor da propriedade mae.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeCompletoType }
     *     
     */
    public void setMae(NomeCompletoType value) {
        this.mae = value;
    }

    /**
     * Obtém o valor da propriedade pai.
     * 
     * @return
     *     possible object is
     *     {@link NomeCompletoType }
     *     
     */
    public NomeCompletoType getPai() {
        return pai;
    }

    /**
     * Define o valor da propriedade pai.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeCompletoType }
     *     
     */
    public void setPai(NomeCompletoType value) {
        this.pai = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link CPFType }
     *     
     */
    public CPFType getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link CPFType }
     *     
     */
    public void setCPF(CPFType value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade municipioNascimento.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioType }
     *     
     */
    public MunicipioType getMunicipioNascimento() {
        return municipioNascimento;
    }

    /**
     * Define o valor da propriedade municipioNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioType }
     *     
     */
    public void setMunicipioNascimento(MunicipioType value) {
        this.municipioNascimento = value;
    }

    /**
     * Obtém o valor da propriedade tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoType }
     *     
     */
    public TipoDocumentoType getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define o valor da propriedade tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoType }
     *     
     */
    public void setTipoDocumento(TipoDocumentoType value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtém o valor da propriedade numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define o valor da propriedade numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtém o valor da propriedade tipoPesquisa.
     * 
     * @return
     *     possible object is
     *     {@link TipoPesquisaType }
     *     
     */
    public TipoPesquisaType getTipoPesquisa() {
        return tipoPesquisa;
    }

    /**
     * Define o valor da propriedade tipoPesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPesquisaType }
     *     
     */
    public void setTipoPesquisa(TipoPesquisaType value) {
        this.tipoPesquisa = value;
    }

    /**
     * Obtém o valor da propriedade situacao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSituacao(Boolean value) {
        this.situacao = value;
    }

}

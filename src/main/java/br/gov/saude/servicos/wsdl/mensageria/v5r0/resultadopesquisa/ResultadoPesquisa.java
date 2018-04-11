
package br.gov.saude.servicos.wsdl.mensageria.v5r0.resultadopesquisa;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.cadsus.v5r0.grauqualidade.GrauQualidadeType;
import br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo.IdentificadorCorporativoType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r1.sexo.SexoType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.nomecompleto.NomeCompletoType;
import br.gov.saude.servicos.schema.corporativo.v1r2.municipio.MunicipioType;
import br.gov.saude.servicos.schema.corporativo.v1r2.pais.PaisType;


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
 *         &lt;element name="CNS" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}CNSType" minOccurs="0"/&gt;
 *         &lt;element name="NomeCompleto" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType" minOccurs="0"/&gt;
 *         &lt;element name="NomeSocial" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r1/nomesocial}NomeSocialType" minOccurs="0"/&gt;
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Mae" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType" minOccurs="0"/&gt;
 *         &lt;element name="Pai" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r1/sexo}SexoType" minOccurs="0"/&gt;
 *         &lt;element name="MunicipioNascimento" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}MunicipioType" minOccurs="0"/&gt;
 *         &lt;element name="PaisNascimento" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/pais}PaisType" minOccurs="0"/&gt;
 *         &lt;element name="MunicipioResidencia" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}MunicipioType" minOccurs="0"/&gt;
 *         &lt;element name="GrauQualidade" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/grauqualidade}GrauQualidadeType" minOccurs="0"/&gt;
 *         &lt;element name="scorePesquisa" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IdentificadorCorporativo" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo}IdentificadorCorporativoType" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "cns",
    "nomeCompleto",
    "nomeSocial",
    "dataNascimento",
    "mae",
    "pai",
    "sexo",
    "municipioNascimento",
    "paisNascimento",
    "municipioResidencia",
    "grauQualidade",
    "scorePesquisa",
    "identificadorCorporativo",
    "situacao"
})
@XmlRootElement(name = "ResultadoPesquisa")
public class ResultadoPesquisa {

    @XmlElement(name = "CNS")
    protected CNSType cns;
    @XmlElement(name = "NomeCompleto")
    protected NomeCompletoType nomeCompleto;
    @XmlElement(name = "NomeSocial")
    protected String nomeSocial;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(name = "Mae")
    protected NomeCompletoType mae;
    @XmlElement(name = "Pai")
    protected NomeCompletoType pai;
    @XmlElement(name = "Sexo")
    protected SexoType sexo;
    @XmlElement(name = "MunicipioNascimento")
    protected MunicipioType municipioNascimento;
    @XmlElement(name = "PaisNascimento")
    protected PaisType paisNascimento;
    @XmlElement(name = "MunicipioResidencia")
    protected MunicipioType municipioResidencia;
    @XmlElement(name = "GrauQualidade")
    protected GrauQualidadeType grauQualidade;
    protected BigInteger scorePesquisa;
    @XmlElement(name = "IdentificadorCorporativo")
    protected IdentificadorCorporativoType identificadorCorporativo;
    @XmlElement(name = "Situacao")
    protected Boolean situacao;

    /**
     * Obtém o valor da propriedade cns.
     * 
     * @return
     *     possible object is
     *     {@link CNSType }
     *     
     */
    public CNSType getCNS() {
        return cns;
    }

    /**
     * Define o valor da propriedade cns.
     * 
     * @param value
     *     allowed object is
     *     {@link CNSType }
     *     
     */
    public void setCNS(CNSType value) {
        this.cns = value;
    }

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
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link SexoType }
     *     
     */
    public SexoType getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link SexoType }
     *     
     */
    public void setSexo(SexoType value) {
        this.sexo = value;
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
     * Obtém o valor da propriedade paisNascimento.
     * 
     * @return
     *     possible object is
     *     {@link PaisType }
     *     
     */
    public PaisType getPaisNascimento() {
        return paisNascimento;
    }

    /**
     * Define o valor da propriedade paisNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link PaisType }
     *     
     */
    public void setPaisNascimento(PaisType value) {
        this.paisNascimento = value;
    }

    /**
     * Obtém o valor da propriedade municipioResidencia.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioType }
     *     
     */
    public MunicipioType getMunicipioResidencia() {
        return municipioResidencia;
    }

    /**
     * Define o valor da propriedade municipioResidencia.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioType }
     *     
     */
    public void setMunicipioResidencia(MunicipioType value) {
        this.municipioResidencia = value;
    }

    /**
     * Obtém o valor da propriedade grauQualidade.
     * 
     * @return
     *     possible object is
     *     {@link GrauQualidadeType }
     *     
     */
    public GrauQualidadeType getGrauQualidade() {
        return grauQualidade;
    }

    /**
     * Define o valor da propriedade grauQualidade.
     * 
     * @param value
     *     allowed object is
     *     {@link GrauQualidadeType }
     *     
     */
    public void setGrauQualidade(GrauQualidadeType value) {
        this.grauQualidade = value;
    }

    /**
     * Obtém o valor da propriedade scorePesquisa.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScorePesquisa() {
        return scorePesquisa;
    }

    /**
     * Define o valor da propriedade scorePesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScorePesquisa(BigInteger value) {
        this.scorePesquisa = value;
    }

    /**
     * Obtém o valor da propriedade identificadorCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadorCorporativoType }
     *     
     */
    public IdentificadorCorporativoType getIdentificadorCorporativo() {
        return identificadorCorporativo;
    }

    /**
     * Define o valor da propriedade identificadorCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadorCorporativoType }
     *     
     */
    public void setIdentificadorCorporativo(IdentificadorCorporativoType value) {
        this.identificadorCorporativo = value;
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

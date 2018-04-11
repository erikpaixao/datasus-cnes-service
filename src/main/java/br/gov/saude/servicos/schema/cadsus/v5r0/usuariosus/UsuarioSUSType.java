
package br.gov.saude.servicos.schema.cadsus.v5r0.usuariosus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.cadsus.v1r1.dadosprecadastro.DadosPreCadastroType;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.cadsus.v5r0.grauqualidade.GrauQualidadeType;
import br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo.IdentificadorCorporativoType;
import br.gov.saude.servicos.schema.cadsus.v5r0.identificadorlocal.IdentificadorLocalType;
import br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidoes.CertidoesType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf.CPFType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.documentos.DocumentosType;
import br.gov.saude.servicos.schema.corporativo.endereco.v1r2.endereco.EnderecoType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r1.dadosnacionalidade.DadosNacionalidadeType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r1.sexo.SexoType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.etniaindigena.EtniaIndigenaType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.nomecompleto.NomeCompletoType;
import br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.racacor.RacaCorType;
import br.gov.saude.servicos.schema.corporativo.telefone.v1r2.telefone.TelefoneType;
import br.gov.saude.servicos.schema.corporativo.v1r1.fotografia.FotografiaType;
import br.gov.saude.servicos.schema.corporativo.v1r2.municipio.MunicipioType;
import br.gov.saude.servicos.schema.corporativo.v5r0.emails.EmailsType;


/**
 * <p>Classe Java de UsuarioSUSType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UsuarioSUSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cartoes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CNS" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}CNSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPF" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf}CPFType" minOccurs="0"/&gt;
 *         &lt;element name="NomeCompleto" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType"/&gt;
 *         &lt;element name="NomeSocial" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r1/nomesocial}NomeSocialType" minOccurs="0"/&gt;
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Mae" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType"/&gt;
 *         &lt;element name="Pai" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType"/&gt;
 *         &lt;element name="dataObito" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r1/sexo}SexoType"/&gt;
 *         &lt;element name="RacaCor" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/racacor}RacaCorType"/&gt;
 *         &lt;element name="EtniaIndigena" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/etniaindigena}EtniaIndigenaType" minOccurs="0"/&gt;
 *         &lt;element name="TipoSanguineo" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r1/tiposanguineo}TipoSanguineoType" minOccurs="0"/&gt;
 *         &lt;element name="DadosNacionalidade" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r1/dadosnacionalidade}DadosNacionalidadeType"/&gt;
 *         &lt;element name="MunicipioNascimento" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}MunicipioType" minOccurs="0"/&gt;
 *         &lt;element name="Documentos" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/documentos}DocumentosType" minOccurs="0"/&gt;
 *         &lt;element name="Certidoes" type="{http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r1/certidoes}CertidoesType" minOccurs="0"/&gt;
 *         &lt;element name="Enderecos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Endereco" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco}EnderecoType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telefones"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Telefone" type="{http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone}TelefoneType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Emails" type="{http://servicos.saude.gov.br/schema/corporativo/v5r0/emails}EmailsType" minOccurs="0"/&gt;
 *         &lt;element name="Fotografias" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fotografia" type="{http://servicos.saude.gov.br/schema/corporativo/v1r1/fotografia}FotografiaType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IdentificadorLocal" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorlocal}IdentificadorLocalType" minOccurs="0"/&gt;
 *         &lt;element name="IdentificadorCorporativo" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo}IdentificadorCorporativoType" minOccurs="0"/&gt;
 *         &lt;element name="GrauQualidade" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/grauqualidade}GrauQualidadeType" minOccurs="0"/&gt;
 *         &lt;element name="originalRFB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nomade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DadosPreCadastro" type="{http://servicos.saude.gov.br/schema/cadsus/v1r1/dadosprecadastro}DadosPreCadastroType" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="motivoAlteracaoSituacao" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Vip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="motivoAlteracaoVip" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="protecaoTestemunha" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descricaoProtecaoTestemunha" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="motivoNaoHigienizado" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="vivo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioSUSType", propOrder = {
    "cartoes",
    "cpf",
    "nomeCompleto",
    "nomeSocial",
    "dataNascimento",
    "mae",
    "pai",
    "dataObito",
    "sexo",
    "racaCor",
    "etniaIndigena",
    "tipoSanguineo",
    "dadosNacionalidade",
    "municipioNascimento",
    "documentos",
    "certidoes",
    "enderecos",
    "telefones",
    "emails",
    "fotografias",
    "identificadorLocal",
    "identificadorCorporativo",
    "grauQualidade",
    "originalRFB",
    "nomade",
    "dadosPreCadastro",
    "situacao",
    "motivoAlteracaoSituacao",
    "vip",
    "motivoAlteracaoVip",
    "protecaoTestemunha",
    "descricaoProtecaoTestemunha",
    "motivoNaoHigienizado",
    "vivo"
})
public class UsuarioSUSType {

    @XmlElement(name = "Cartoes")
    protected UsuarioSUSType.Cartoes cartoes;
    @XmlElement(name = "CPF")
    protected CPFType cpf;
    @XmlElement(name = "NomeCompleto", required = true)
    protected NomeCompletoType nomeCompleto;
    @XmlElement(name = "NomeSocial")
    protected String nomeSocial;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(name = "Mae", required = true)
    protected NomeCompletoType mae;
    @XmlElement(name = "Pai", required = true)
    protected NomeCompletoType pai;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataObito;
    @XmlElement(name = "Sexo", required = true)
    protected SexoType sexo;
    @XmlElement(name = "RacaCor", required = true)
    protected RacaCorType racaCor;
    @XmlElement(name = "EtniaIndigena")
    protected EtniaIndigenaType etniaIndigena;
    @XmlElement(name = "TipoSanguineo")
    protected String tipoSanguineo;
    @XmlElement(name = "DadosNacionalidade", required = true)
    protected DadosNacionalidadeType dadosNacionalidade;
    @XmlElement(name = "MunicipioNascimento")
    protected MunicipioType municipioNascimento;
    @XmlElement(name = "Documentos")
    protected DocumentosType documentos;
    @XmlElement(name = "Certidoes")
    protected CertidoesType certidoes;
    @XmlElement(name = "Enderecos")
    protected UsuarioSUSType.Enderecos enderecos;
    @XmlElement(name = "Telefones", required = true)
    protected UsuarioSUSType.Telefones telefones;
    @XmlElement(name = "Emails")
    protected EmailsType emails;
    @XmlElement(name = "Fotografias")
    protected UsuarioSUSType.Fotografias fotografias;
    @XmlElement(name = "IdentificadorLocal")
    protected IdentificadorLocalType identificadorLocal;
    @XmlElement(name = "IdentificadorCorporativo")
    protected IdentificadorCorporativoType identificadorCorporativo;
    @XmlElement(name = "GrauQualidade")
    protected GrauQualidadeType grauQualidade;
    protected Boolean originalRFB;
    protected Boolean nomade;
    @XmlElement(name = "DadosPreCadastro")
    protected DadosPreCadastroType dadosPreCadastro;
    @XmlElement(name = "Situacao")
    protected Boolean situacao;
    protected String motivoAlteracaoSituacao;
    @XmlElement(name = "Vip")
    protected Boolean vip;
    protected String motivoAlteracaoVip;
    protected Boolean protecaoTestemunha;
    protected String descricaoProtecaoTestemunha;
    protected String motivoNaoHigienizado;
    protected Boolean vivo;

    /**
     * Obtém o valor da propriedade cartoes.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioSUSType.Cartoes }
     *     
     */
    public UsuarioSUSType.Cartoes getCartoes() {
        return cartoes;
    }

    /**
     * Define o valor da propriedade cartoes.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioSUSType.Cartoes }
     *     
     */
    public void setCartoes(UsuarioSUSType.Cartoes value) {
        this.cartoes = value;
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
     * Obtém o valor da propriedade dataObito.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataObito() {
        return dataObito;
    }

    /**
     * Define o valor da propriedade dataObito.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataObito(XMLGregorianCalendar value) {
        this.dataObito = value;
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
     * Obtém o valor da propriedade racaCor.
     * 
     * @return
     *     possible object is
     *     {@link RacaCorType }
     *     
     */
    public RacaCorType getRacaCor() {
        return racaCor;
    }

    /**
     * Define o valor da propriedade racaCor.
     * 
     * @param value
     *     allowed object is
     *     {@link RacaCorType }
     *     
     */
    public void setRacaCor(RacaCorType value) {
        this.racaCor = value;
    }

    /**
     * Obtém o valor da propriedade etniaIndigena.
     * 
     * @return
     *     possible object is
     *     {@link EtniaIndigenaType }
     *     
     */
    public EtniaIndigenaType getEtniaIndigena() {
        return etniaIndigena;
    }

    /**
     * Define o valor da propriedade etniaIndigena.
     * 
     * @param value
     *     allowed object is
     *     {@link EtniaIndigenaType }
     *     
     */
    public void setEtniaIndigena(EtniaIndigenaType value) {
        this.etniaIndigena = value;
    }

    /**
     * Obtém o valor da propriedade tipoSanguineo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    /**
     * Define o valor da propriedade tipoSanguineo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSanguineo(String value) {
        this.tipoSanguineo = value;
    }

    /**
     * Obtém o valor da propriedade dadosNacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link DadosNacionalidadeType }
     *     
     */
    public DadosNacionalidadeType getDadosNacionalidade() {
        return dadosNacionalidade;
    }

    /**
     * Define o valor da propriedade dadosNacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosNacionalidadeType }
     *     
     */
    public void setDadosNacionalidade(DadosNacionalidadeType value) {
        this.dadosNacionalidade = value;
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
     * Obtém o valor da propriedade documentos.
     * 
     * @return
     *     possible object is
     *     {@link DocumentosType }
     *     
     */
    public DocumentosType getDocumentos() {
        return documentos;
    }

    /**
     * Define o valor da propriedade documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentosType }
     *     
     */
    public void setDocumentos(DocumentosType value) {
        this.documentos = value;
    }

    /**
     * Obtém o valor da propriedade certidoes.
     * 
     * @return
     *     possible object is
     *     {@link CertidoesType }
     *     
     */
    public CertidoesType getCertidoes() {
        return certidoes;
    }

    /**
     * Define o valor da propriedade certidoes.
     * 
     * @param value
     *     allowed object is
     *     {@link CertidoesType }
     *     
     */
    public void setCertidoes(CertidoesType value) {
        this.certidoes = value;
    }

    /**
     * Obtém o valor da propriedade enderecos.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioSUSType.Enderecos }
     *     
     */
    public UsuarioSUSType.Enderecos getEnderecos() {
        return enderecos;
    }

    /**
     * Define o valor da propriedade enderecos.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioSUSType.Enderecos }
     *     
     */
    public void setEnderecos(UsuarioSUSType.Enderecos value) {
        this.enderecos = value;
    }

    /**
     * Obtém o valor da propriedade telefones.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioSUSType.Telefones }
     *     
     */
    public UsuarioSUSType.Telefones getTelefones() {
        return telefones;
    }

    /**
     * Define o valor da propriedade telefones.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioSUSType.Telefones }
     *     
     */
    public void setTelefones(UsuarioSUSType.Telefones value) {
        this.telefones = value;
    }

    /**
     * Obtém o valor da propriedade emails.
     * 
     * @return
     *     possible object is
     *     {@link EmailsType }
     *     
     */
    public EmailsType getEmails() {
        return emails;
    }

    /**
     * Define o valor da propriedade emails.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailsType }
     *     
     */
    public void setEmails(EmailsType value) {
        this.emails = value;
    }

    /**
     * Obtém o valor da propriedade fotografias.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioSUSType.Fotografias }
     *     
     */
    public UsuarioSUSType.Fotografias getFotografias() {
        return fotografias;
    }

    /**
     * Define o valor da propriedade fotografias.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioSUSType.Fotografias }
     *     
     */
    public void setFotografias(UsuarioSUSType.Fotografias value) {
        this.fotografias = value;
    }

    /**
     * Obtém o valor da propriedade identificadorLocal.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadorLocalType }
     *     
     */
    public IdentificadorLocalType getIdentificadorLocal() {
        return identificadorLocal;
    }

    /**
     * Define o valor da propriedade identificadorLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadorLocalType }
     *     
     */
    public void setIdentificadorLocal(IdentificadorLocalType value) {
        this.identificadorLocal = value;
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
     * Obtém o valor da propriedade originalRFB.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginalRFB() {
        return originalRFB;
    }

    /**
     * Define o valor da propriedade originalRFB.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalRFB(Boolean value) {
        this.originalRFB = value;
    }

    /**
     * Obtém o valor da propriedade nomade.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNomade() {
        return nomade;
    }

    /**
     * Define o valor da propriedade nomade.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNomade(Boolean value) {
        this.nomade = value;
    }

    /**
     * Obtém o valor da propriedade dadosPreCadastro.
     * 
     * @return
     *     possible object is
     *     {@link DadosPreCadastroType }
     *     
     */
    public DadosPreCadastroType getDadosPreCadastro() {
        return dadosPreCadastro;
    }

    /**
     * Define o valor da propriedade dadosPreCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosPreCadastroType }
     *     
     */
    public void setDadosPreCadastro(DadosPreCadastroType value) {
        this.dadosPreCadastro = value;
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

    /**
     * Obtém o valor da propriedade motivoAlteracaoSituacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoAlteracaoSituacao() {
        return motivoAlteracaoSituacao;
    }

    /**
     * Define o valor da propriedade motivoAlteracaoSituacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoAlteracaoSituacao(String value) {
        this.motivoAlteracaoSituacao = value;
    }

    /**
     * Obtém o valor da propriedade vip.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVip() {
        return vip;
    }

    /**
     * Define o valor da propriedade vip.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVip(Boolean value) {
        this.vip = value;
    }

    /**
     * Obtém o valor da propriedade motivoAlteracaoVip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoAlteracaoVip() {
        return motivoAlteracaoVip;
    }

    /**
     * Define o valor da propriedade motivoAlteracaoVip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoAlteracaoVip(String value) {
        this.motivoAlteracaoVip = value;
    }

    /**
     * Obtém o valor da propriedade protecaoTestemunha.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtecaoTestemunha() {
        return protecaoTestemunha;
    }

    /**
     * Define o valor da propriedade protecaoTestemunha.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtecaoTestemunha(Boolean value) {
        this.protecaoTestemunha = value;
    }

    /**
     * Obtém o valor da propriedade descricaoProtecaoTestemunha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoProtecaoTestemunha() {
        return descricaoProtecaoTestemunha;
    }

    /**
     * Define o valor da propriedade descricaoProtecaoTestemunha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoProtecaoTestemunha(String value) {
        this.descricaoProtecaoTestemunha = value;
    }

    /**
     * Obtém o valor da propriedade motivoNaoHigienizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNaoHigienizado() {
        return motivoNaoHigienizado;
    }

    /**
     * Define o valor da propriedade motivoNaoHigienizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNaoHigienizado(String value) {
        this.motivoNaoHigienizado = value;
    }

    /**
     * Obtém o valor da propriedade vivo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVivo() {
        return vivo;
    }

    /**
     * Define o valor da propriedade vivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVivo(Boolean value) {
        this.vivo = value;
    }


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
     *         &lt;element name="CNS" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}CNSType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "cns"
    })
    public static class Cartoes {

        @XmlElement(name = "CNS")
        protected List<CNSType> cns;

        /**
         * Gets the value of the cns property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cns property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCNS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CNSType }
         * 
         * 
         */
        public List<CNSType> getCNS() {
            if (cns == null) {
                cns = new ArrayList<CNSType>();
            }
            return this.cns;
        }

    }


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
     *         &lt;element name="Endereco" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco}EnderecoType"/&gt;
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
        "endereco"
    })
    public static class Enderecos {

        @XmlElement(name = "Endereco", required = true)
        protected EnderecoType endereco;

        /**
         * Obtém o valor da propriedade endereco.
         * 
         * @return
         *     possible object is
         *     {@link EnderecoType }
         *     
         */
        public EnderecoType getEndereco() {
            return endereco;
        }

        /**
         * Define o valor da propriedade endereco.
         * 
         * @param value
         *     allowed object is
         *     {@link EnderecoType }
         *     
         */
        public void setEndereco(EnderecoType value) {
            this.endereco = value;
        }

    }


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
     *         &lt;element name="Fotografia" type="{http://servicos.saude.gov.br/schema/corporativo/v1r1/fotografia}FotografiaType" maxOccurs="unbounded"/&gt;
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
        "fotografia"
    })
    public static class Fotografias {

        @XmlElement(name = "Fotografia", required = true)
        protected List<FotografiaType> fotografia;

        /**
         * Gets the value of the fotografia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fotografia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFotografia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FotografiaType }
         * 
         * 
         */
        public List<FotografiaType> getFotografia() {
            if (fotografia == null) {
                fotografia = new ArrayList<FotografiaType>();
            }
            return this.fotografia;
        }

    }


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
     *         &lt;element name="Telefone" type="{http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone}TelefoneType" maxOccurs="unbounded"/&gt;
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
        "telefone"
    })
    public static class Telefones {

        @XmlElement(name = "Telefone", required = true)
        protected List<TelefoneType> telefone;

        /**
         * Gets the value of the telefone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the telefone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTelefone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TelefoneType }
         * 
         * 
         */
        public List<TelefoneType> getTelefone() {
            if (telefone == null) {
                telefone = new ArrayList<TelefoneType>();
            }
            return this.telefone;
        }

    }

}

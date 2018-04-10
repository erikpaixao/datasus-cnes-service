package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprofissionalsaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf.CPFType;
import br.gov.saude.servicos.schema.profissionalsaude.v1r0.registroprofissionalsaude.RegistroProfissionalSaudeType;

/**
 * <p>
 * Classe Java de FiltroPesquisaProfissionalSaudeType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="FiltroPesquisaProfissionalSaudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}CNS" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf}CPF" minOccurs="0"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/registroprofissionalsaude}RegistroProfissionalSaude" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltroPesquisaProfissionalSaudeType", propOrder = {
    "cns",
    "cpf",
    "registroProfissionalSaude"
})
public class FiltroPesquisaProfissionalSaudeType {

    @XmlElement(name = "CNS", namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/cns")
    protected CNSType cns;
    @XmlElement(name = "CPF", namespace = "http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf")
    protected CPFType cpf;
    @XmlElement(name = "RegistroProfissionalSaude", namespace = "http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/registroprofissionalsaude")
    protected RegistroProfissionalSaudeType registroProfissionalSaude;

    /**
     * CNS do Profissional de Saúde
     *
     * @return possible object is {@link CNSType }
     *
     */
    public CNSType getCNS() {
        return cns;
    }

    /**
     * Define o valor da propriedade cns.
     *
     * @param value allowed object is {@link CNSType }
     *
     */
    public void setCNS(CNSType value) {
        this.cns = value;
    }

    /**
     * CPF do Profissional de Saúde
     *
     * @return possible object is {@link CPFType }
     *
     */
    public CPFType getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     *
     * @param value allowed object is {@link CPFType }
     *
     */
    public void setCPF(CPFType value) {
        this.cpf = value;
    }

    /**
     * Registro do Profissional de Saúde
     *
     * @return possible object is {@link RegistroProfissionalSaudeType }
     *
     */
    public RegistroProfissionalSaudeType getRegistroProfissionalSaude() {
        return registroProfissionalSaude;
    }

    /**
     * Define o valor da propriedade registroProfissionalSaude.
     *
     * @param value allowed object is {@link RegistroProfissionalSaudeType }
     *
     */
    public void setRegistroProfissionalSaude(RegistroProfissionalSaudeType value) {
        this.registroProfissionalSaude = value;
    }

}

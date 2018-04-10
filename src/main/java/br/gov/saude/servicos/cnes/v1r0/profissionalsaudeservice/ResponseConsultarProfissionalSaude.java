package br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.profissionalsaude.v2r0.profissionalsaude.ProfissionalSaudeType;

/**
 * <p>
 * Classe Java de anonymous complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/profissionalsaude/v2r0/profissionalsaude}ProfissionalSaude"/&gt;
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
    "profissionalSaude"
})
@XmlRootElement(name = "responseConsultarProfissionalSaude")
public class ResponseConsultarProfissionalSaude {

    @XmlElement(name = "ProfissionalSaude", namespace = "http://servicos.saude.gov.br/schema/profissionalsaude/v2r0/profissionalsaude", required = true)
    protected ProfissionalSaudeType profissionalSaude;

    /**
     * Obtém o valor da propriedade profissionalSaude.
     *
     * @return possible object is {@link ProfissionalSaudeType }
     *
     */
    public ProfissionalSaudeType getProfissionalSaude() {
        return profissionalSaude;
    }

    /**
     * Define o valor da propriedade profissionalSaude.
     *
     * @param value allowed object is {@link ProfissionalSaudeType }
     *
     */
    public void setProfissionalSaude(ProfissionalSaudeType value) {
        this.profissionalSaude = value;
    }

}

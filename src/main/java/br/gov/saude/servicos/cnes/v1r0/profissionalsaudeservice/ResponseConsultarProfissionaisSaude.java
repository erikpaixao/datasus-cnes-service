
package br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.profissionalsaude.v2r0.profissionalsaude.ProfissionalSaudeType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/profissionalsaude/v2r0/profissionalsaude}ProfissionalSaude" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlRootElement(name = "responseConsultarProfissionaisSaude")
public class ResponseConsultarProfissionaisSaude {

    @XmlElement(name = "ProfissionalSaude", namespace = "http://servicos.saude.gov.br/schema/profissionalsaude/v2r0/profissionalsaude")
    protected List<ProfissionalSaudeType> profissionalSaude;

    /**
     * Gets the value of the profissionalSaude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profissionalSaude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfissionalSaude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfissionalSaudeType }
     * 
     * 
     */
    public List<ProfissionalSaudeType> getProfissionalSaude() {
        if (profissionalSaude == null) {
            profissionalSaude = new ArrayList<ProfissionalSaudeType>();
        }
        return this.profissionalSaude;
    }

}

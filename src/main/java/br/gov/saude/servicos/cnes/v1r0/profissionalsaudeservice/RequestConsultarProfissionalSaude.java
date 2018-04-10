package br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprofissionalsaude.FiltroPesquisaProfissionalSaudeType;

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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprofissionalsaude}FiltroPesquisaProfissionalSaude"/&gt;
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
    "filtroPesquisaProfissionalSaude"
})
@XmlRootElement(name = "requestConsultarProfissionalSaude")
public class RequestConsultarProfissionalSaude {

    @XmlElement(name = "FiltroPesquisaProfissionalSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprofissionalsaude", required = true)
    protected FiltroPesquisaProfissionalSaudeType filtroPesquisaProfissionalSaude;

    /**
     * Filtro de Pesquisa do Profissional por CNS e CPF.
     *
     * @return possible object is {@link FiltroPesquisaProfissionalSaudeType }
     *
     */
    public FiltroPesquisaProfissionalSaudeType getFiltroPesquisaProfissionalSaude() {
        return filtroPesquisaProfissionalSaude;
    }

    /**
     * Define o valor da propriedade filtroPesquisaProfissionalSaude.
     *
     * @param value allowed object is
     *     {@link FiltroPesquisaProfissionalSaudeType }
     *
     */
    public void setFiltroPesquisaProfissionalSaude(FiltroPesquisaProfissionalSaudeType value) {
        this.filtroPesquisaProfissionalSaude = value;
    }

}

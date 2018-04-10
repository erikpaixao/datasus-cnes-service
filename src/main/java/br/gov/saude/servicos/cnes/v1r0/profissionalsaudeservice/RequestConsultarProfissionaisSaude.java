
package br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaestabelecimentosaude.FiltroPesquisaEstabelecimentoSaudeType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaestabelecimentosaude}FiltroPesquisaEstabelecimentoSaude"/&gt;
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
    "filtroPesquisaEstabelecimentoSaude"
})
@XmlRootElement(name = "requestConsultarProfissionaisSaude")
public class RequestConsultarProfissionaisSaude {

    @XmlElement(name = "FiltroPesquisaEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaestabelecimentosaude", required = true)
    protected FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaude;

    /**
     * Filtro de Pesquisa dos Profissionais por CNES e CNPJ.
     * 
     * @return
     *     possible object is
     *     {@link FiltroPesquisaEstabelecimentoSaudeType }
     *     
     */
    public FiltroPesquisaEstabelecimentoSaudeType getFiltroPesquisaEstabelecimentoSaude() {
        return filtroPesquisaEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade filtroPesquisaEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroPesquisaEstabelecimentoSaudeType }
     *     
     */
    public void setFiltroPesquisaEstabelecimentoSaude(FiltroPesquisaEstabelecimentoSaudeType value) {
        this.filtroPesquisaEstabelecimentoSaude = value;
    }

}

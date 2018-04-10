
package br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao.FiltroPesquisaVinculacaoType;


/**
 * <p>Classe Java de RequestVinculacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RequestVinculacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacao}FiltroPesquisaVinculacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestVinculacao", propOrder = {
    "filtroPesquisaVinculacao"
})
public class RequestVinculacao {

    @XmlElement(name = "FiltroPesquisaVinculacao", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacao")
    protected FiltroPesquisaVinculacaoType filtroPesquisaVinculacao;

    /**
     * Obtém o valor da propriedade filtroPesquisaVinculacao.
     * 
     * @return
     *     possible object is
     *     {@link FiltroPesquisaVinculacaoType }
     *     
     */
    public FiltroPesquisaVinculacaoType getFiltroPesquisaVinculacao() {
        return filtroPesquisaVinculacao;
    }

    /**
     * Define o valor da propriedade filtroPesquisaVinculacao.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroPesquisaVinculacaoType }
     *     
     */
    public void setFiltroPesquisaVinculacao(FiltroPesquisaVinculacaoType value) {
        this.filtroPesquisaVinculacao = value;
    }

}

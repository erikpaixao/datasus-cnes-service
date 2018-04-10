
package br.gov.saude.servicos.horus.v1r0.estoqueservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.paginacao.PaginacaoType;


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
 *         &lt;element name="cnes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paginacao" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}PaginacaoType"/&gt;
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
    "cnes",
    "paginacao"
})
@XmlRootElement(name = "requestConsultarProdutoPorCNESDispensacaoPaginado")
public class RequestConsultarProdutoPorCNESDispensacaoPaginado {

    protected int cnes;
    @XmlElement(required = true)
    protected PaginacaoType paginacao;

    /**
     * Obtém o valor da propriedade cnes.
     * 
     */
    public int getCnes() {
        return cnes;
    }

    /**
     * Define o valor da propriedade cnes.
     * 
     */
    public void setCnes(int value) {
        this.cnes = value;
    }

    /**
     * Obtém o valor da propriedade paginacao.
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoType }
     *     
     */
    public PaginacaoType getPaginacao() {
        return paginacao;
    }

    /**
     * Define o valor da propriedade paginacao.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoType }
     *     
     */
    public void setPaginacao(PaginacaoType value) {
        this.paginacao = value;
    }

}

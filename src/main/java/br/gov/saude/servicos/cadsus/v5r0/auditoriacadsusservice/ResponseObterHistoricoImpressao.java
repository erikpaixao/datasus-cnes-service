
package br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.resultadohistoricoimpressao.ResultadoHistoricoImpressao;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v5r0/resultadohistoricoimpressao}ResultadoHistoricoImpressao" minOccurs="0"/&gt;
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
    "resultadoHistoricoImpressao"
})
@XmlRootElement(name = "responseObterHistoricoImpressao")
public class ResponseObterHistoricoImpressao {

    @XmlElement(name = "ResultadoHistoricoImpressao", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/resultadohistoricoimpressao")
    protected ResultadoHistoricoImpressao resultadoHistoricoImpressao;

    /**
     * Obtém o valor da propriedade resultadoHistoricoImpressao.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoHistoricoImpressao }
     *     
     */
    public ResultadoHistoricoImpressao getResultadoHistoricoImpressao() {
        return resultadoHistoricoImpressao;
    }

    /**
     * Define o valor da propriedade resultadoHistoricoImpressao.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoHistoricoImpressao }
     *     
     */
    public void setResultadoHistoricoImpressao(ResultadoHistoricoImpressao value) {
        this.resultadoHistoricoImpressao = value;
    }

}

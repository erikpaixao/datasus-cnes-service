
package br.gov.saude.servicos.cadsus.v5r0.cadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.v5r0.grauqualidade.GrauQualidadeType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cadsus/v5r0/grauqualidade}GrauQualidade"/&gt;
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
    "grauQualidade"
})
@XmlRootElement(name = "responseCalcularGrauDeQualidade")
public class ResponseCalcularGrauDeQualidade {

    @XmlElement(name = "GrauQualidade", namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/grauqualidade", required = true)
    protected GrauQualidadeType grauQualidade;

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

}

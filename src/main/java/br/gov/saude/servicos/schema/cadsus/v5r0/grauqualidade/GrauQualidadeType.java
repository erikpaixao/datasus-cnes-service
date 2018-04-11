
package br.gov.saude.servicos.schema.cadsus.v5r0.grauqualidade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GrauQualidadeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GrauQualidadeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="percentualQualidade"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrauQualidadeType", propOrder = {
    "percentualQualidade"
})
public class GrauQualidadeType {

    protected int percentualQualidade;

    /**
     * Obtém o valor da propriedade percentualQualidade.
     * 
     */
    public int getPercentualQualidade() {
        return percentualQualidade;
    }

    /**
     * Define o valor da propriedade percentualQualidade.
     * 
     */
    public void setPercentualQualidade(int value) {
        this.percentualQualidade = value;
    }

}

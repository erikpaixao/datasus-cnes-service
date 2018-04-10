
package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoVinculacaoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TipoVinculacaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoVinculacao"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;pattern value="[1-9]*"/&gt;
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
@XmlType(name = "TipoVinculacaoType", propOrder = {
    "tipoVinculacao"
})
public class TipoVinculacaoType {

    @XmlElement(required = true)
    protected String tipoVinculacao;

    /**
     * Obtém o valor da propriedade tipoVinculacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVinculacao() {
        return tipoVinculacao;
    }

    /**
     * Define o valor da propriedade tipoVinculacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVinculacao(String value) {
        this.tipoVinculacao = value;
    }

}

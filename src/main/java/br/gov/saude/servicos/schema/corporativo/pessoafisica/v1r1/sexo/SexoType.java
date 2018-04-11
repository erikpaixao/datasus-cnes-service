
package br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r1.sexo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SexoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SexoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoSexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricaoSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SexoType", propOrder = {
    "codigoSexo",
    "descricaoSexo"
})
public class SexoType {

    @XmlElement(required = true)
    protected String codigoSexo;
    protected String descricaoSexo;

    /**
     * Obtém o valor da propriedade codigoSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSexo() {
        return codigoSexo;
    }

    /**
     * Define o valor da propriedade codigoSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSexo(String value) {
        this.codigoSexo = value;
    }

    /**
     * Obtém o valor da propriedade descricaoSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoSexo() {
        return descricaoSexo;
    }

    /**
     * Define o valor da propriedade descricaoSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoSexo(String value) {
        this.descricaoSexo = value;
    }

}

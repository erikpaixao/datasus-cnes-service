
package br.gov.saude.servicos.schema.cnes.v1r0.vinculacao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VinculacaosType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VinculacaosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vinculacao" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacao}VinculacaoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VinculacaosType", propOrder = {
    "vinculacao"
})
public class VinculacaosType {

    @XmlElement(name = "Vinculacao")
    protected List<VinculacaoType> vinculacao;

    /**
     * Gets the value of the vinculacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vinculacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVinculacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VinculacaoType }
     * 
     * 
     */
    public List<VinculacaoType> getVinculacao() {
        if (vinculacao == null) {
            vinculacao = new ArrayList<VinculacaoType>();
        }
        return this.vinculacao;
    }

}

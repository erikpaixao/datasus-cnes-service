
package br.gov.saude.servicos.schema.cnes.v1r0.vinculacaocbotype;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ListaVinculacaoCBOType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ListaVinculacaoCBOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CBO" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacaocbotype}VinculacaoCBOType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaVinculacaoCBOType", propOrder = {
    "cbo"
})
public class ListaVinculacaoCBOType {

    @XmlElement(name = "CBO", required = true)
    protected List<VinculacaoCBOType> cbo;

    /**
     * Gets the value of the cbo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cbo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VinculacaoCBOType }
     * 
     * 
     */
    public List<VinculacaoCBOType> getCBO() {
        if (cbo == null) {
            cbo = new ArrayList<VinculacaoCBOType>();
        }
        return this.cbo;
    }

}

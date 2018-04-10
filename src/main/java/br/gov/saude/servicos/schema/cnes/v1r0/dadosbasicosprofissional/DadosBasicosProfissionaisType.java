
package br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosprofissional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DadosBasicosProfissionaisType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosBasicosProfissionaisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DadosBasicosProfissional" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosprofissional}DadosBasicosProfissionalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosBasicosProfissionaisType", propOrder = {
    "dadosBasicosProfissional"
})
public class DadosBasicosProfissionaisType {

    @XmlElement(name = "DadosBasicosProfissional")
    protected List<DadosBasicosProfissionalType> dadosBasicosProfissional;

    /**
     * Gets the value of the dadosBasicosProfissional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosBasicosProfissional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosBasicosProfissional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosBasicosProfissionalType }
     * 
     * 
     */
    public List<DadosBasicosProfissionalType> getDadosBasicosProfissional() {
        if (dadosBasicosProfissional == null) {
            dadosBasicosProfissional = new ArrayList<DadosBasicosProfissionalType>();
        }
        return this.dadosBasicosProfissional;
    }

}

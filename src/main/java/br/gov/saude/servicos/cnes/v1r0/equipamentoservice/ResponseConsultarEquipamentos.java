
package br.gov.saude.servicos.cnes.v1r0.equipamentoservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.equipamento.EquipamentoType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/equipamento}Equipamento" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "equipamento"
})
@XmlRootElement(name = "responseConsultarEquipamentos")
public class ResponseConsultarEquipamentos {

    @XmlElement(name = "Equipamento", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/equipamento")
    protected List<EquipamentoType> equipamento;

    /**
     * Gets the value of the equipamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipamentoType }
     * 
     * 
     */
    public List<EquipamentoType> getEquipamento() {
        if (equipamento == null) {
            equipamento = new ArrayList<EquipamentoType>();
        }
        return this.equipamento;
    }

}

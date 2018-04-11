
package br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ListaIdentificadoresCorporativosType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ListaIdentificadoresCorporativosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo}IdentificadorCorporativo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaIdentificadoresCorporativosType", propOrder = {
    "identificadorCorporativo"
})
public class ListaIdentificadoresCorporativosType {

    @XmlElement(name = "IdentificadorCorporativo", required = true)
    protected List<IdentificadorCorporativoType> identificadorCorporativo;

    /**
     * Gets the value of the identificadorCorporativo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificadorCorporativo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificadorCorporativo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificadorCorporativoType }
     * 
     * 
     */
    public List<IdentificadorCorporativoType> getIdentificadorCorporativo() {
        if (identificadorCorporativo == null) {
            identificadorCorporativo = new ArrayList<IdentificadorCorporativoType>();
        }
        return this.identificadorCorporativo;
    }

}

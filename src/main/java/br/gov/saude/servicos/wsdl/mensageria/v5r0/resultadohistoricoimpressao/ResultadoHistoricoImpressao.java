
package br.gov.saude.servicos.wsdl.mensageria.v5r0.resultadohistoricoimpressao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.evento.v5r0.evento.EventoType;


/**
 * <p>Classe Java de ResultadoHistoricoImpressao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResultadoHistoricoImpressao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Evento" type="{http://servicos.saude.gov.br/schema/cadsus/evento/v5r0/evento}EventoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoHistoricoImpressao", propOrder = {
    "evento"
})
public class ResultadoHistoricoImpressao {

    @XmlElement(name = "Evento")
    protected List<EventoType> evento;

    /**
     * Gets the value of the evento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventoType }
     * 
     * 
     */
    public List<EventoType> getEvento() {
        if (evento == null) {
            evento = new ArrayList<EventoType>();
        }
        return this.evento;
    }

}


package br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="dataHoraUltimaModificacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "dataHoraUltimaModificacao"
})
@XmlRootElement(name = "responseObterUltimaDataAlteracaoUsuarioSUS")
public class ResponseObterUltimaDataAlteracaoUsuarioSUS {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraUltimaModificacao;

    /**
     * Obtém o valor da propriedade dataHoraUltimaModificacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraUltimaModificacao() {
        return dataHoraUltimaModificacao;
    }

    /**
     * Define o valor da propriedade dataHoraUltimaModificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraUltimaModificacao(XMLGregorianCalendar value) {
        this.dataHoraUltimaModificacao = value;
    }

}

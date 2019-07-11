
package br.jus.cnj.tipos_servico_intercomunicacao_2_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.jus.cnj.intercomunicacao_2_2.TipoAvisoComunicacaoPendente;


/**
 * <p>Classe Java de tipoConsultarAvisosPendentesResposta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoConsultarAvisosPendentesResposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sucesso" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/&gt;
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="aviso" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}tipoAvisoComunicacaoPendente" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoConsultarAvisosPendentesResposta", propOrder = {
    "sucesso",
    "mensagem",
    "aviso"
})
public class TipoConsultarAvisosPendentesResposta {

    protected boolean sucesso;
    @XmlElement(required = true)
    protected String mensagem;
    @XmlElement(nillable = true)
    protected List<TipoAvisoComunicacaoPendente> aviso;

    /**
     * Obtém o valor da propriedade sucesso.
     * 
     */
    public boolean isSucesso() {
        return sucesso;
    }

    /**
     * Define o valor da propriedade sucesso.
     * 
     */
    public void setSucesso(boolean value) {
        this.sucesso = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Gets the value of the aviso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aviso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAviso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAvisoComunicacaoPendente }
     * 
     * 
     */
    public List<TipoAvisoComunicacaoPendente> getAviso() {
        if (aviso == null) {
            aviso = new ArrayList<TipoAvisoComunicacaoPendente>();
        }
        return this.aviso;
    }

}


package br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.cadsus.auditoria.v5r0.usuariosusvinculado.UsuarioSUSVinculadoType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/cadsus/auditoria/v5r0/usuariosusvinculado}UsuarioSUSVinculado" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "usuarioSUSVinculado"
})
@XmlRootElement(name = "responseObterHistoricoUnificacaoUsuarioSUS")
public class ResponseObterHistoricoUnificacaoUsuarioSUS {

    @XmlElement(name = "UsuarioSUSVinculado", namespace = "http://servicos.saude.gov.br/wsdl/cadsus/auditoria/v5r0/usuariosusvinculado")
    protected List<UsuarioSUSVinculadoType> usuarioSUSVinculado;

    /**
     * Gets the value of the usuarioSUSVinculado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarioSUSVinculado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuarioSUSVinculado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioSUSVinculadoType }
     * 
     * 
     */
    public List<UsuarioSUSVinculadoType> getUsuarioSUSVinculado() {
        if (usuarioSUSVinculado == null) {
            usuarioSUSVinculado = new ArrayList<UsuarioSUSVinculadoType>();
        }
        return this.usuarioSUSVinculado;
    }

}

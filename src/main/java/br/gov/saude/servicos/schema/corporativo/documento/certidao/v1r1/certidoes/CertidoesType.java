
package br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidoes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidaoantiga.CertidaoAntigaType;
import br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r2.certidao.CertidaoType;


/**
 * <p>Classe Java de CertidoesType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CertidoesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Certidao" type="{http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r2/certidao}CertidaoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CertidaoAntiga" type="{http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r1/certidaoantiga}CertidaoAntigaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertidoesType", propOrder = {
    "certidao",
    "certidaoAntiga"
})
public class CertidoesType {

    @XmlElement(name = "Certidao")
    protected List<CertidaoType> certidao;
    @XmlElement(name = "CertidaoAntiga")
    protected List<CertidaoAntigaType> certidaoAntiga;

    /**
     * Gets the value of the certidao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certidao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertidao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertidaoType }
     * 
     * 
     */
    public List<CertidaoType> getCertidao() {
        if (certidao == null) {
            certidao = new ArrayList<CertidaoType>();
        }
        return this.certidao;
    }

    /**
     * Gets the value of the certidaoAntiga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certidaoAntiga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertidaoAntiga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertidaoAntigaType }
     * 
     * 
     */
    public List<CertidaoAntigaType> getCertidaoAntiga() {
        if (certidaoAntiga == null) {
            certidaoAntiga = new ArrayList<CertidaoAntigaType>();
        }
        return this.certidaoAntiga;
    }

}

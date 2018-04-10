
package br.gov.saude.servicos.schema.profissionalsaude.v1r0.registroprofissionalsaude;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.orgaoemissor.OrgaoEmissorType;
import br.gov.saude.servicos.schema.corporativo.v1r1.uf.UFType;


/**
 * <p>Classe Java de RegistroProfissionalSaudeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RegistroProfissionalSaudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="OrgaoEmissor" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/orgaoemissor}OrgaoEmissorType"/&gt;
 *         &lt;element name="uf" type="{http://servicos.saude.gov.br/schema/corporativo/v1r1/uf}UFType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroProfissionalSaudeType", propOrder = {
    "identificador",
    "orgaoEmissor",
    "uf"
})
public class RegistroProfissionalSaudeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    @XmlElement(name = "OrgaoEmissor", required = true)
    protected OrgaoEmissorType orgaoEmissor;
    @XmlElement(required = true)
    protected UFType uf;

    /**
     * Obtém o valor da propriedade identificador.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificador() {
        return identificador;
    }

    /**
     * Define o valor da propriedade identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificador(BigInteger value) {
        this.identificador = value;
    }

    /**
     * Obtém o valor da propriedade orgaoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link OrgaoEmissorType }
     *     
     */
    public OrgaoEmissorType getOrgaoEmissor() {
        return orgaoEmissor;
    }

    /**
     * Define o valor da propriedade orgaoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgaoEmissorType }
     *     
     */
    public void setOrgaoEmissor(OrgaoEmissorType value) {
        this.orgaoEmissor = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link UFType }
     *     
     */
    public UFType getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link UFType }
     *     
     */
    public void setUf(UFType value) {
        this.uf = value;
    }

}

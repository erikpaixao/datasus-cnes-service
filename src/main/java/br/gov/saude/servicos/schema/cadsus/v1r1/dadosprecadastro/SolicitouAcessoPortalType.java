
package br.gov.saude.servicos.schema.cadsus.v1r1.dadosprecadastro;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SolicitouAcessoPortalType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SolicitouAcessoPortalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SolicitouAcessoPortalType")
@XmlEnum
public enum SolicitouAcessoPortalType {

    S,
    N;

    public String value() {
        return name();
    }

    public static SolicitouAcessoPortalType fromValue(String v) {
        return valueOf(v);
    }

}

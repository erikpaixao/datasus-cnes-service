
package br.gov.saude.servicos.schema.cadsus.v5r0.cns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoCNSType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCNSType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoCNSType")
@XmlEnum
public enum TipoCNSType {

    D,
    P;

    public String value() {
        return name();
    }

    public static TipoCNSType fromValue(String v) {
        return valueOf(v);
    }

}

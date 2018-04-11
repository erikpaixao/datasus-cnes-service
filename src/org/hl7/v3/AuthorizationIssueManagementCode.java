
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AuthorizationIssueManagementCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationIssueManagementCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EMAUTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationIssueManagementCode")
@XmlEnum
public enum AuthorizationIssueManagementCode {

    EMAUTH;

    public String value() {
        return name();
    }

    public static AuthorizationIssueManagementCode fromValue(String v) {
        return valueOf(v);
    }

}

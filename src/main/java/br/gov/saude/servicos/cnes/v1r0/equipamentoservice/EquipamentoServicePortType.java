package br.gov.saude.servicos.cnes.v1r0.equipamentoservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-10T14:07:26.535-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/equipamentoservice", name = "EquipamentoServicePortType")
@XmlSeeAlso({br.gov.saude.servicos.schema.cnes.v1r0.equipamento.ObjectFactory.class, ObjectFactory.class, br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.ObjectFactory.class, br.gov.saude.servicos.schema.cnes.v1r0.tipoequipamento.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.mensagem.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EquipamentoServicePortType {

    @WebMethod
    @WebResult(name = "responseConsultarEquipamentos", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/equipamentoservice", partName = "responseConsultarEquipamentos")
    public ResponseConsultarEquipamentos consultarEquipamentos(
        @WebParam(partName = "requestConsultarEquipamentos", name = "requestConsultarEquipamentos", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/equipamentoservice")
        RequestConsultarEquipamentos requestConsultarEquipamentos
    ) throws CnesFault;
}

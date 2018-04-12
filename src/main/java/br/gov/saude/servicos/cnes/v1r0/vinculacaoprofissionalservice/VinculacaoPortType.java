package br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-12T09:06:00.612-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", name = "VinculacaoPortType")
@XmlSeeAlso({br.gov.saude.servicos.schema.cadsus.v5r0.cns.ObjectFactory.class, br.gov.saude.servicos.schema.cnes.v1r0.vinculacao.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao.ObjectFactory.class, br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.ObjectFactory.class, ObjectFactory.class, br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnpj.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.mensagem.ObjectFactory.class, br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosprofissional.ObjectFactory.class, br.gov.saude.servicos.schema.cnes.v1r0.vinculacaocbotype.ObjectFactory.class, br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.v1.paginacao.ObjectFactory.class, br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosestabelecimento.ObjectFactory.class, br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.nomejuridico.ObjectFactory.class, br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.nomecompleto.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacaos.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface VinculacaoPortType {

    /**
     * detalharVinculacaoProfissionalSaude 
     * 			
     */
    @WebMethod
    @WebResult(name = "ResponseVinculacao", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", partName = "ResponseVinculacao")
    public ResponseVinculacao detalharVinculacaoProfissionalSaude(
        @WebParam(partName = "RequestVinculacao", name = "RequestVinculacao", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice")
        RequestVinculacao requestVinculacao
    ) throws VinculacaoFault;

    /**
     * pesquisarVinculacaoProfissionalSaude 
     * 			
     */
    @WebMethod
    @WebResult(name = "ResponseVinculacaos", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", partName = "ResponseVinculacaos")
    public ResponseVinculacaos pesquisarVinculacaoProfissionalSaude(
        @WebParam(partName = "RequestVinculacaos", name = "RequestVinculacaos", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice")
        RequestVinculacaos requestVinculacaos
    ) throws VinculacaoFault;
}

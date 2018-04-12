package br.gov.saude.servicos.horus.v1r0.estoqueservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-12T09:06:49.045-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService", name = "EstoqueServicePortType")
@XmlSeeAlso({br.gov.saude.servicos.schema.horus.v1r0.posicaoestoque.ObjectFactory.class, br.gov.saude.servicos.schema.corporativo.v1r1.uf.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.ObjectFactory.class, ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.mensagem.ObjectFactory.class, br.gov.saude.servicos.schema.corporativo.v1r2.municipio.ObjectFactory.class, br.gov.saude.servicos.wsdl.mensageria.v1r0.paginacao.ObjectFactory.class, br.gov.saude.servicos.schema.horus.v1r0.produto.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EstoqueServicePortType {

    /**
     * Retorna a posição de estoque por número CNES do estabelecimento de Saúde.
     */
    @WebMethod
    @WebResult(name = "responseConsultarPosicaoEstoquePorCNES", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService", partName = "responseConsultarPosicaoEstoquePorCNES")
    public ResponseConsultarPosicaoEstoquePorCNES consultarPosicaoEstoquePorCNES(
        @WebParam(partName = "requestConsultarPosicaoEstoquePorCNES", name = "requestConsultarPosicaoEstoquePorCNES", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService")
        RequestConsultarPosicaoEstoquePorCNES requestConsultarPosicaoEstoquePorCNES
    ) throws EstoqueFault;

    /**
     * Retorna a posição de estoque por número CNES do estabelecimento de Saúde, de forma paginada.
     */
    @WebMethod
    @WebResult(name = "responseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService", partName = "responseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado")
    public ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado consultarPosicaoEstoquePorCNESPrincipioAtivoPaginado(
        @WebParam(partName = "requestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado", name = "requestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService")
        RequestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado requestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado
    ) throws EstoqueFault;

    /**
     * Retorna a posição de estoque por número CNES que dispensou o medicamento.
     */
    @WebMethod
    @WebResult(name = "responseConsultarProdutoPorCNESDispensacao", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService", partName = "responseConsultarProdutoPorCNESDispensacao")
    public ResponseConsultarProdutoPorCNESDispensacao consultarProdutoPorCNESDispensacao(
        @WebParam(partName = "requestConsultarProdutoPorCNESDispensacao", name = "requestConsultarProdutoPorCNESDispensacao", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService")
        RequestConsultarProdutoPorCNESDispensacao requestConsultarProdutoPorCNESDispensacao
    ) throws EstoqueFault;

    /**
     * Retorna a posição de estoque por número CNES do estabelecimento de Saúde.
     */
    @WebMethod
    @WebResult(name = "responseConsultarPosicaoEstoquePorCNESPrincipioAtivo", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService", partName = "responseConsultarPosicaoEstoquePorCNESPrincipioAtivo")
    public ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivo consultarPosicaoEstoquePorCNESPrincipioAtivo(
        @WebParam(partName = "requestConsultarPosicaoEstoquePorCNESPrincipioAtivo", name = "requestConsultarPosicaoEstoquePorCNESPrincipioAtivo", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService")
        RequestConsultarPosicaoEstoquePorCNESPrincipioAtivo requestConsultarPosicaoEstoquePorCNESPrincipioAtivo
    ) throws EstoqueFault;

    /**
     * Retorna a posição de estoque por número CNES que dispensou o medicamento, de forma Paginada.
     */
    @WebMethod
    @WebResult(name = "responseConsultarProdutoPorCNESDispensacaoPaginado", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService", partName = "responseConsultarProdutoPorCNESDispensacaoPaginado")
    public ResponseConsultarProdutoPorCNESDispensacaoPaginado consultarProdutoPorCNESDispensacaoPaginado(
        @WebParam(partName = "requestConsultarProdutoPorCNESDispensacaoPaginado", name = "requestConsultarProdutoPorCNESDispensacaoPaginado", targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService")
        RequestConsultarProdutoPorCNESDispensacaoPaginado requestConsultarProdutoPorCNESDispensacaoPaginado
    ) throws EstoqueFault;
}

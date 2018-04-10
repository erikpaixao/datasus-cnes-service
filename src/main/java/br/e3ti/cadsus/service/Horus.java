/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.e3ti.cadsus.service;

import br.e3ti.cadsus.handlers.ClientHandlerHorus;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.EstoqueFault;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.EstoqueService;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.EstoqueServicePortType;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.RequestConsultarPosicaoEstoquePorCNES;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.RequestConsultarPosicaoEstoquePorCNESPrincipioAtivo;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.RequestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.RequestConsultarProdutoPorCNESDispensacao;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.RequestConsultarProdutoPorCNESDispensacaoPaginado;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.ResponseConsultarPosicaoEstoquePorCNES;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivo;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.ResponseConsultarProdutoPorCNESDispensacao;
import br.gov.saude.servicos.horus.v1r0.estoqueservice.ResponseConsultarProdutoPorCNESDispensacaoPaginado;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.paginacao.PaginacaoType;

/**
 *
 * @author erik
 */
public class Horus {

    public ResponseConsultarPosicaoEstoquePorCNES consultarPosicaoEstoquePorCNES(int cnes) throws EstoqueFault {

        // Call Web Cnes Operation
        EstoqueService service = new EstoqueService();
        ClientHandlerHorus handlerResolver = new ClientHandlerHorus();
        service.setHandlerResolver(handlerResolver);
        EstoqueServicePortType port = service.getEstoqueServicePort();
        RequestConsultarPosicaoEstoquePorCNES pesquisarEstoques = new RequestConsultarPosicaoEstoquePorCNES();

        pesquisarEstoques.setCnes(cnes);

        return port.consultarPosicaoEstoquePorCNES(pesquisarEstoques);

    }

    public ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivo consultarPosicaoEstoquePorCNESPrincipioAtivo(int cnes, String principioAtivo) throws EstoqueFault {

        // Call Web Cnes Operation
        EstoqueService service = new EstoqueService();
        ClientHandlerHorus handlerResolver = new ClientHandlerHorus();
        service.setHandlerResolver(handlerResolver);
        EstoqueServicePortType port = service.getEstoqueServicePort();
        RequestConsultarPosicaoEstoquePorCNESPrincipioAtivo pesquisarEstoques = new RequestConsultarPosicaoEstoquePorCNESPrincipioAtivo();

        pesquisarEstoques.setCnes(cnes);
        pesquisarEstoques.setPrincipioAtivo(principioAtivo);

        return port.consultarPosicaoEstoquePorCNESPrincipioAtivo(pesquisarEstoques);

    }

    public ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado consultarPosicaoEstoquePorCNESPrincipioAtivoPaginado(int cnes, String principioAtivo, PaginacaoType paginacaoType) throws EstoqueFault {

        // Call Web Cnes Operation
        EstoqueService service = new EstoqueService();
        ClientHandlerHorus handlerResolver = new ClientHandlerHorus();
        service.setHandlerResolver(handlerResolver);
        EstoqueServicePortType port = service.getEstoqueServicePort();
        RequestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado pesquisarEstoques = new RequestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado();

        pesquisarEstoques.setCnes(cnes);
        pesquisarEstoques.setPrincipioAtivo(principioAtivo);
        pesquisarEstoques.setPaginacao(paginacaoType);

        return port.consultarPosicaoEstoquePorCNESPrincipioAtivoPaginado(pesquisarEstoques);

    }

    public ResponseConsultarProdutoPorCNESDispensacao consultarProdutoPorCNESDispensacao(int cnes) throws EstoqueFault {

        // Call Web Cnes Operation
        EstoqueService service = new EstoqueService();
        ClientHandlerHorus handlerResolver = new ClientHandlerHorus();
        service.setHandlerResolver(handlerResolver);
        EstoqueServicePortType port = service.getEstoqueServicePort();
        RequestConsultarProdutoPorCNESDispensacao pesquisarEstoques = new RequestConsultarProdutoPorCNESDispensacao();

        pesquisarEstoques.setCnes(cnes);

        return port.consultarProdutoPorCNESDispensacao(pesquisarEstoques);

    }

    public ResponseConsultarProdutoPorCNESDispensacaoPaginado consultarProdutoPorCNESDispensacao(int cnes, PaginacaoType paginacaoType) throws EstoqueFault {

        // Call Web Cnes Operation
        EstoqueService service = new EstoqueService();
        ClientHandlerHorus handlerResolver = new ClientHandlerHorus();
        service.setHandlerResolver(handlerResolver);
        EstoqueServicePortType port = service.getEstoqueServicePort();
        RequestConsultarProdutoPorCNESDispensacaoPaginado pesquisarEstoques = new RequestConsultarProdutoPorCNESDispensacaoPaginado();

        pesquisarEstoques.setCnes(cnes);
        pesquisarEstoques.setPaginacao(paginacaoType);

        return port.consultarProdutoPorCNESDispensacaoPaginado(pesquisarEstoques);

    }
}

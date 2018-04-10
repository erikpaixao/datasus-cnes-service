/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.e3ti.cadsus.service;

import br.e3ti.cadsus.handlers.ClientHandlerSigTapResolver;
import br.gov.saude.servicos.sigtap.v1.procedimentoservice.ProcedimentoService;
import br.gov.saude.servicos.sigtap.v1.procedimentoservice.ProcedimentoServicePortType;
import br.gov.saude.servicos.sigtap.v1.procedimentoservice.RequestDetalharProcedimento;
import br.gov.saude.servicos.sigtap.v1.procedimentoservice.RequestDetalharProcedimento.DetalhesAdicionais;
import br.gov.saude.servicos.sigtap.v1.procedimentoservice.RequestPesquisarProcedimentos;
import br.gov.saude.servicos.sigtap.v1.procedimentoservice.ResponseDetalharProcedimento;
import br.gov.saude.servicos.sigtap.v1.procedimentoservice.ResponsePesquisarProcedimentos;
import br.gov.saude.servicos.sigtap.v1.procedimentoservice.SIGTAPFault;
import br.gov.saude.servicos.wsdl.mensageria.v1.paginacao.PaginacaoType;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erik
 */
public class SigTAP {

    public ResponsePesquisarProcedimentos pesquisarProcedimentos(
            String codigo,
            String codigoSubGrupo,
            String competencia,
            PaginacaoType paginacaoType
    ) {

        // Call Web Cnes Operation
        ProcedimentoService service = new ProcedimentoService();
        ClientHandlerSigTapResolver handlerResolver = new ClientHandlerSigTapResolver();
        service.setHandlerResolver(handlerResolver);
        ProcedimentoServicePortType port = service.getProcedimentoServicePort();
        RequestPesquisarProcedimentos pesquisarProcedimentos = new RequestPesquisarProcedimentos();

        if (Objects.nonNull(codigo)) {
            pesquisarProcedimentos.setCodigoGrupo(codigo);
        }

        if (Objects.nonNull(codigoSubGrupo)) {
            pesquisarProcedimentos.setCodigoSubgrupo(codigoSubGrupo);
        }

        if (Objects.nonNull(competencia)) {
            pesquisarProcedimentos.setCompetencia(competencia);
        }

        if (Objects.nonNull(paginacaoType)) {
            pesquisarProcedimentos.setPaginacao(paginacaoType);
        }

        try {
            return port.pesquisarProcedimentos(pesquisarProcedimentos);
        } catch (SIGTAPFault ex) {
            Logger.getLogger(SigTAP.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ResponseDetalharProcedimento detalharProcedimento(
            String codigo,
            String competencia,
            DetalhesAdicionais detalhesAdicionais
    ) {

        // Call Web Cnes Operation
        ProcedimentoService service = new ProcedimentoService();
        ClientHandlerSigTapResolver handlerResolver = new ClientHandlerSigTapResolver();
        service.setHandlerResolver(handlerResolver);
        ProcedimentoServicePortType port = service.getProcedimentoServicePort();
        RequestDetalharProcedimento detalharProcedimento = new RequestDetalharProcedimento();

        if (Objects.nonNull(codigo)) {
            detalharProcedimento.setCodigoProcedimento(codigo);
        }

        if (Objects.nonNull(detalhesAdicionais)) {
            detalharProcedimento.setDetalhesAdicionais(detalhesAdicionais);
        }

        if (Objects.nonNull(competencia)) {
            detalharProcedimento.setCompetencia(competencia);
        }

        try {
            return port.detalharProcedimento(detalharProcedimento);
        } catch (SIGTAPFault ex) {
            Logger.getLogger(SigTAP.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}

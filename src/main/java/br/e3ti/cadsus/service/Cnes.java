/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.e3ti.cadsus.service;

import br.gov.saude.servicos.cnes.v1r0.cnesservice.CnesFault;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.CnesService;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.CnesServicePortType;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.RequestConsultarEstabelecimentoSaude;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.ResponseConsultarEstabelecimentoSaude;
import br.gov.saude.servicos.cnes.v1r0.equipamentoservice.EquipamentoService;
import br.gov.saude.servicos.cnes.v1r0.equipamentoservice.EquipamentoServicePortType;
import br.gov.saude.servicos.cnes.v1r0.equipamentoservice.RequestConsultarEquipamentos;
import br.gov.saude.servicos.cnes.v1r0.equipamentoservice.ResponseConsultarEquipamentos;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeFault;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeService;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeServicePortType;
import br.gov.saude.servicos.cnes.v1r0.leitoservice.LeitoFault;
import br.gov.saude.servicos.cnes.v1r0.leitoservice.LeitoService;
import br.gov.saude.servicos.cnes.v1r0.leitoservice.LeitoServicePortType;
import br.gov.saude.servicos.cnes.v1r0.leitoservice.RequestConsultarLeitosCNES;
import br.gov.saude.servicos.cnes.v1r0.leitoservice.ResponseConsultarLeitosCNES;
import br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice.ProfissionalSaudeFault;
import br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice.ProfissionalSaudeService;
import br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice.ProfissionalSaudeServicePortType;
import br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice.RequestConsultarProfissionaisSaude;
import br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice.RequestConsultarProfissionalSaude;
import br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice.ResponseConsultarProfissionaisSaude;
import br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice.ResponseConsultarProfissionalSaude;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.CodigoCNESType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf.CPFType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnpj.CNPJType;
import br.gov.saude.servicos.schema.profissionalsaude.v1r0.registroprofissionalsaude.RegistroProfissionalSaudeType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaestabelecimentosaude.FiltroPesquisaEstabelecimentoSaudeType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprofissionalsaude.FiltroPesquisaProfissionalSaudeType;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.handler.HandlerResolver;

/**
 *
 * @author erik
 */
public class Cnes extends BaseService {

    public ResponseConsultarEstabelecimentoSaude getEstabelecimentoSaudeServiceByCnes(String cnes) {

        try { // Call Web Cnes Operation
            CnesService service = new CnesService();
            HandlerResolver handlerResolver = new ClientHandlerResolver();
            service.setHandlerResolver(handlerResolver);

            CnesServicePortType port = service.getCnesServicePort();

            RequestConsultarEstabelecimentoSaude requestConsultarEstabelecimentoSaude = new RequestConsultarEstabelecimentoSaude();

            CodigoCNESType cNESType = new CodigoCNESType();

            cNESType.setCodigo(cnes);

            requestConsultarEstabelecimentoSaude.setCodigoCNES(cNESType);

            return port.consultarEstabelecimentoSaude(requestConsultarEstabelecimentoSaude);

        } catch (CnesFault ex) {
            LOG.log(Level.SEVERE, "Error = {0}", ex.getMessage());
            return null;
        }
    }

    public ResponseConsultarEquipamentos getEquipamentoServiceByCnes(String cnes) {

        // Call Web Cnes Operation
        EquipamentoService service = new EquipamentoService();
        HandlerResolver handlerResolver = new ClientHandlerResolver();
        service.setHandlerResolver(handlerResolver);
        EquipamentoServicePortType port = service.getEquipamentoServicePort();
        RequestConsultarEquipamentos consultarEquipamentos = new RequestConsultarEquipamentos();
        CodigoCNESType cNESType = new CodigoCNESType();
        cNESType.setCodigo(cnes);
        consultarEquipamentos.setCodigoCNES(cNESType);
        try {
            return port.consultarEquipamentos(consultarEquipamentos);
        } catch (br.gov.saude.servicos.cnes.v1r0.equipamentoservice.CnesFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            return null;
        }
    }

    public br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.ResponseConsultarEstabelecimentoSaude getEstabelecimentoServiceByCnes(String cnes, String cnpj) {

        // Call Web Cnes Operation
        EstabelecimentoSaudeService service = new EstabelecimentoSaudeService();
        HandlerResolver handlerResolver = new ClientHandlerResolver();
        service.setHandlerResolver(handlerResolver);
        EstabelecimentoSaudeServicePortType port = service.getEstabelecimentoSaudeServicePort();
        br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.RequestConsultarEstabelecimentoSaude requestConsultarEstabelecimentoSaude = new br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.RequestConsultarEstabelecimentoSaude();
        FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaudeType = new FiltroPesquisaEstabelecimentoSaudeType();

        if (Objects.nonNull(cnpj)) {
            CodigoCNESType cNESType = new CodigoCNESType();
            cNESType.setCodigo(cnes);
            filtroPesquisaEstabelecimentoSaudeType.setCodigoCNES(cNESType);
        }

        if (Objects.nonNull(cnes)) {
            CNPJType cNPJType = new CNPJType();
            cNPJType.setNumeroCNPJ(cnpj);
            filtroPesquisaEstabelecimentoSaudeType.setCNPJ(cNPJType);
        }

        requestConsultarEstabelecimentoSaude.setFiltroPesquisaEstabelecimentoSaude(filtroPesquisaEstabelecimentoSaudeType);
        try {
            return port.consultarEstabelecimentoSaude(requestConsultarEstabelecimentoSaude);
        } catch (EstabelecimentoSaudeFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            return null;
        }

    }

    public ResponseConsultarLeitosCNES getLeitosByCnes(String cnes) {

        // Call Web Cnes Operation
        LeitoService service = new LeitoService();
        HandlerResolver handlerResolver = new ClientHandlerResolver();
        service.setHandlerResolver(handlerResolver);
        LeitoServicePortType port = service.getLeitoServicePort();
        RequestConsultarLeitosCNES requestConsultarLeito = new RequestConsultarLeitosCNES();
        CodigoCNESType cNESType = new CodigoCNESType();
        cNESType.setCodigo(cnes);

        requestConsultarLeito.setCodigoCNES(cNESType);
        try {
            return port.consultarLeitosCNES(requestConsultarLeito);
        } catch (LeitoFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            return null;
        }

    }

    public ResponseConsultarProfissionalSaude getProfissionalByCnes(CNSType cns, CPFType cpf, RegistroProfissionalSaudeType registroProfissional) {

        // Call Web Cnes Operation
        ProfissionalSaudeService service = new ProfissionalSaudeService();
        HandlerResolver handlerResolver = new ClientHandlerResolver();
        service.setHandlerResolver(handlerResolver);
        ProfissionalSaudeServicePortType port = service.getProfissionalSaudeServicePort();
        RequestConsultarProfissionalSaude requestConsultarProfissionalSaude = new RequestConsultarProfissionalSaude();

        FiltroPesquisaProfissionalSaudeType filtroPesquisaProfissionalSaudeType = new FiltroPesquisaProfissionalSaudeType();

        if (Objects.nonNull(cns)) {
            filtroPesquisaProfissionalSaudeType.setCNS(cns);
        }

        if (Objects.nonNull(cpf)) {
            filtroPesquisaProfissionalSaudeType.setCPF(cpf);
        }

        if (Objects.nonNull(registroProfissional)) {
            filtroPesquisaProfissionalSaudeType.setRegistroProfissionalSaude(registroProfissional);
        }

        requestConsultarProfissionalSaude.setFiltroPesquisaProfissionalSaude(filtroPesquisaProfissionalSaudeType);

        try {
            return port.consultarProfissionalSaude(requestConsultarProfissionalSaude);
        } catch (ProfissionalSaudeFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            return null;
        }
    }

    public ResponseConsultarProfissionaisSaude getProfissionaisByCnes(String cnes, String cnpj) {

        // Call Web Cnes Operation
        ProfissionalSaudeService service = new ProfissionalSaudeService();
        HandlerResolver handlerResolver = new ClientHandlerResolver();
        service.setHandlerResolver(handlerResolver);
        ProfissionalSaudeServicePortType port = service.getProfissionalSaudeServicePort();
        RequestConsultarProfissionaisSaude requestConsultarProfissionalSaude = new RequestConsultarProfissionaisSaude();

        FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaudeType = new FiltroPesquisaEstabelecimentoSaudeType();

        if (Objects.nonNull(cnpj)) {
            CodigoCNESType cNESType = new CodigoCNESType();
            cNESType.setCodigo(cnes);
            filtroPesquisaEstabelecimentoSaudeType.setCodigoCNES(cNESType);
        }

        if (Objects.nonNull(cnes)) {
            CNPJType cNPJType = new CNPJType();
            cNPJType.setNumeroCNPJ(cnpj);
            filtroPesquisaEstabelecimentoSaudeType.setCNPJ(cNPJType);
        }

        requestConsultarProfissionalSaude.setFiltroPesquisaEstabelecimentoSaude(filtroPesquisaEstabelecimentoSaudeType);

        try {
            return port.consultarProfissionaisSaude(requestConsultarProfissionalSaude);
        } catch (ProfissionalSaudeFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            return null;
        }

    }

}

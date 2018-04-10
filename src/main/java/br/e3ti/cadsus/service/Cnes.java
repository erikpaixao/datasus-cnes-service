/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.e3ti.cadsus.service;

import br.e3ti.cadsus.handlers.ClientHandlerCnes;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.CnesFault;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.CnesService;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.CnesServicePortType;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.RequestConsultarDadosComplementaresEstabelecimentoSaude;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.RequestConsultarEstabelecimentoSaude;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.RequestConsultarEstabelecimentoSaudePorMunicipio;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.ResponseConsultarDadosComplementaresEstabelecimentoSaude;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.ResponseConsultarEstabelecimentoSaude;
import br.gov.saude.servicos.cnes.v1r0.cnesservice.ResponseConsultarEstabelecimentoSaudePorMunicipio;
import br.gov.saude.servicos.cnes.v1r0.equipamentoservice.EquipamentoService;
import br.gov.saude.servicos.cnes.v1r0.equipamentoservice.EquipamentoServicePortType;
import br.gov.saude.servicos.cnes.v1r0.equipamentoservice.RequestConsultarEquipamentos;
import br.gov.saude.servicos.cnes.v1r0.equipamentoservice.ResponseConsultarEquipamentos;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeFault;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeService;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeServicePortType;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.RequestConsultarPrecadastroCNES;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.RequestLocalizarEstabelecimentoSaude;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.ResponseConsultarPrecadastroCNES;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.ResponseLocalizarEstabelecimentoSaude;
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
import br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice.RequestVinculacao;
import br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice.RequestVinculacaos;
import br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice.ResponseVinculacao;
import br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice.ResponseVinculacaos;
import br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice.VinculacaoFault;
import br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice.VinculacaoPortType;
import br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice.VinculacaoProfissionalService;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.cnes.v1r0.cmpt.CmptType;
import br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.CodigoCNESType;
import br.gov.saude.servicos.schema.cnes.v1r0.localizacao.LocalizacaoType;
import br.gov.saude.servicos.schema.cnes.v1r0.tipounidade.TipoUnidadeType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf.CPFType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnpj.CNPJType;
import br.gov.saude.servicos.schema.corporativo.v1r2.municipio.MunicipioType;
import br.gov.saude.servicos.schema.profissionalsaude.v1r0.registroprofissionalsaude.RegistroProfissionalSaudeType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtrolocalizacaoestabelecimentosaude.FiltroLocalizacaoEstabelecimentoSaudeType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaestabelecimentosaude.FiltroPesquisaEstabelecimentoSaudeType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprecadastrocnes.FiltroPesquisaPrecadastroCnesType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprofissionalsaude.FiltroPesquisaProfissionalSaudeType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao.EstabelecimentoVinculacaoType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao.FiltroPesquisaVinculacaoType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao.TipoVinculacaoType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacaos.FiltroPesquisaVinculacaosType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacaos.ProfissionalVinculacaoType;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.handler.HandlerResolver;

/**
 *
 * @author erik
 */
public class Cnes extends BaseService {

    public ResponseConsultarEstabelecimentoSaude consultarEstabelecimentoSaude(String cnes) {

        try { // Call Web Cnes Operation
            CnesService service = new CnesService();
            HandlerResolver handlerResolver = new ClientHandlerCnes();
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

    public ResponseConsultarDadosComplementaresEstabelecimentoSaude consultarDadosComplementaresEstabelecimentoSaude(MunicipioType municipioType, CmptType cmptType) {

        try { // Call Web Cnes Operation
            CnesService service = new CnesService();
            HandlerResolver handlerResolver = new ClientHandlerCnes();
            service.setHandlerResolver(handlerResolver);

            CnesServicePortType port = service.getCnesServicePort();

            RequestConsultarDadosComplementaresEstabelecimentoSaude complementaresEstabelecimentoSaude = new RequestConsultarDadosComplementaresEstabelecimentoSaude();

            if (Objects.nonNull(cmptType)) {
                complementaresEstabelecimentoSaude.setCmpt(cmptType);
            }

            if (Objects.nonNull(municipioType)) {
                complementaresEstabelecimentoSaude.setMunicipioCNES(municipioType);
            }

            return port.consultarDadosComplementaresEstabelecimentoSaude(complementaresEstabelecimentoSaude);

        } catch (CnesFault ex) {
            LOG.log(Level.SEVERE, "Error = {0}", ex.getMessage());
            return null;
        }
    }

    public ResponseConsultarEstabelecimentoSaudePorMunicipio consultarEstabelecimentoSaudePorMunicipio(MunicipioType municipioType) {

        try { // Call Web Cnes Operation
            CnesService service = new CnesService();
            HandlerResolver handlerResolver = new ClientHandlerCnes();
            service.setHandlerResolver(handlerResolver);

            CnesServicePortType port = service.getCnesServicePort();

            RequestConsultarEstabelecimentoSaudePorMunicipio consultarEstabelecimentoSaudePorMunicipio = new RequestConsultarEstabelecimentoSaudePorMunicipio();

            if (Objects.nonNull(municipioType)) {
                consultarEstabelecimentoSaudePorMunicipio.setMunicipio(municipioType);
            }

            return port.consultarEstabelecimentoSaudePorMunicipio(consultarEstabelecimentoSaudePorMunicipio);

        } catch (CnesFault ex) {
            LOG.log(Level.SEVERE, "Error = {0}", ex.getMessage());
            return null;
        }
    }

    public ResponseConsultarEquipamentos consultarEquipamentos(String cnes) {

        // Call Web Cnes Operation
        EquipamentoService service = new EquipamentoService();
        HandlerResolver handlerResolver = new ClientHandlerCnes();
        service.setHandlerResolver(handlerResolver);
        EquipamentoServicePortType port = service.getEquipamentoServicePort();
        RequestConsultarEquipamentos consultarEquipamentos = new RequestConsultarEquipamentos();

        CodigoCNESType cNESType = new CodigoCNESType();
        cNESType.setCodigo(cnes);

        consultarEquipamentos.setCodigoCNES(cNESType);
        try {
            return port.consultarEquipamentos(consultarEquipamentos);
        } catch (br.gov.saude.servicos.cnes.v1r0.equipamentoservice.CnesFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.ResponseConsultarEstabelecimentoSaude consultarEstabelecimentoSaude(String cnes, String cnpj) {

        // Call Web Cnes Operation
        EstabelecimentoSaudeService service = new EstabelecimentoSaudeService();
        HandlerResolver handlerResolver = new ClientHandlerCnes();
        service.setHandlerResolver(handlerResolver);
        EstabelecimentoSaudeServicePortType port = service.getEstabelecimentoSaudeServicePort();
        br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.RequestConsultarEstabelecimentoSaude requestConsultarEstabelecimentoSaude = new br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.RequestConsultarEstabelecimentoSaude();
        FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaudeType = new FiltroPesquisaEstabelecimentoSaudeType();

        if (Objects.nonNull(cnes)) {
            CodigoCNESType cNESType = new CodigoCNESType();
            cNESType.setCodigo(cnes);
            filtroPesquisaEstabelecimentoSaudeType.setCodigoCNES(cNESType);
        }

        if (Objects.nonNull(cnpj)) {
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

    public ResponseConsultarPrecadastroCNES consultarPrecadastroCNES(String cnes, JAXBElement<String> situacao) {

        // Call Web Cnes Operation
        EstabelecimentoSaudeService service = new EstabelecimentoSaudeService();
        HandlerResolver handlerResolver = new ClientHandlerCnes();
        service.setHandlerResolver(handlerResolver);
        EstabelecimentoSaudeServicePortType port = service.getEstabelecimentoSaudeServicePort();
        RequestConsultarPrecadastroCNES requestConsultarEstabelecimentoSaude = new RequestConsultarPrecadastroCNES();
        FiltroPesquisaPrecadastroCnesType filtroPesquisaPrecadastroCnesType = new FiltroPesquisaPrecadastroCnesType();

        if (Objects.nonNull(cnes)) {
            CodigoCNESType cNESType = new CodigoCNESType();
            cNESType.setCodigo(cnes);
            filtroPesquisaPrecadastroCnesType.setCodigoCNES(cNESType);
        }

        if (Objects.nonNull(situacao)) {
            filtroPesquisaPrecadastroCnesType.setSituacao(situacao);
        }

        requestConsultarEstabelecimentoSaude.setFiltroPesquisaPrecadastroCnes(filtroPesquisaPrecadastroCnesType);
        try {
            return port.consultarPrecadastroCNES(requestConsultarEstabelecimentoSaude);
        } catch (EstabelecimentoSaudeFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            return null;
        }

    }

    public ResponseLocalizarEstabelecimentoSaude localizarEstabelecimentoSaude(LocalizacaoType localizacaoType, br.gov.saude.servicos.wsdl.mensageria.v1r0.paginacao.PaginacaoType paginacaoType, TipoUnidadeType tipoUnidadeType) {

        // Call Web Cnes Operation
        EstabelecimentoSaudeService service = new EstabelecimentoSaudeService();
        HandlerResolver handlerResolver = new ClientHandlerCnes();
        service.setHandlerResolver(handlerResolver);
        EstabelecimentoSaudeServicePortType port = service.getEstabelecimentoSaudeServicePort();
        RequestLocalizarEstabelecimentoSaude localizarEstabelecimentoSaude = new RequestLocalizarEstabelecimentoSaude();
        FiltroLocalizacaoEstabelecimentoSaudeType filtroLocalizacaoEstabelecimentoSaudeType = new FiltroLocalizacaoEstabelecimentoSaudeType();

        if (Objects.nonNull(localizacaoType)) {
            filtroLocalizacaoEstabelecimentoSaudeType.setLocalizacao(localizacaoType);
        }

        if (Objects.nonNull(paginacaoType)) {
            filtroLocalizacaoEstabelecimentoSaudeType.setPaginacao(paginacaoType);
        }

        if (Objects.nonNull(tipoUnidadeType)) {
            filtroLocalizacaoEstabelecimentoSaudeType.setTipoUnidade(tipoUnidadeType);
        }

        localizarEstabelecimentoSaude.setFiltroLocalizacaoEstabelecimentoSaude(filtroLocalizacaoEstabelecimentoSaudeType);
        try {
            return port.localizarEstabelecimentoSaude(localizarEstabelecimentoSaude);
        } catch (EstabelecimentoSaudeFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            return null;
        }

    }

    public ResponseConsultarLeitosCNES consultarLeitosCNES(String cnes) {

        // Call Web Cnes Operation
        LeitoService service = new LeitoService();
        HandlerResolver handlerResolver = new ClientHandlerCnes();
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

    public ResponseConsultarProfissionalSaude consultarProfissionalSaude(CNSType cns, CPFType cpf, RegistroProfissionalSaudeType registroProfissional) {

        // Call Web Cnes Operation
        ProfissionalSaudeService service = new ProfissionalSaudeService();
        HandlerResolver handlerResolver = new ClientHandlerCnes();
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

    public ResponseConsultarProfissionaisSaude consultarProfissionaisSaude(String cnes, String cnpj) {

        // Call Web Cnes Operation
        ProfissionalSaudeService service = new ProfissionalSaudeService();
        HandlerResolver handlerResolver = new ClientHandlerCnes();
        service.setHandlerResolver(handlerResolver);
        ProfissionalSaudeServicePortType port = service.getProfissionalSaudeServicePort();
        RequestConsultarProfissionaisSaude requestConsultarProfissionalSaude = new RequestConsultarProfissionaisSaude();

        FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaudeType = new FiltroPesquisaEstabelecimentoSaudeType();

        if (Objects.nonNull(cnes)) {
            CodigoCNESType cNESType = new CodigoCNESType();
            cNESType.setCodigo(cnes);
            filtroPesquisaEstabelecimentoSaudeType.setCodigoCNES(cNESType);
        }

        if (Objects.nonNull(cnpj)) {
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

    public ResponseVinculacaos pesquisarVinculacaoProfissionalSaude(br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacaos.EstabelecimentoVinculacaoType estabelecimentoVinculacaoType, ProfissionalVinculacaoType profissionalVinculacaoType) {

        try {
            // Call Web Cnes Operation
            VinculacaoProfissionalService service = new VinculacaoProfissionalService();
            HandlerResolver handlerResolver = new ClientHandlerCnes();
            service.setHandlerResolver(handlerResolver);
            VinculacaoPortType port = service.getVinculacaoProfissionalServicePort();
            RequestVinculacaos requestVinculacaos = new RequestVinculacaos();

            FiltroPesquisaVinculacaosType filtroPesquisaVinculacaosType = new FiltroPesquisaVinculacaosType();

            if (Objects.nonNull(profissionalVinculacaoType)) {

                filtroPesquisaVinculacaosType.setIdentificacaoProfissional(profissionalVinculacaoType);
            }

            if (Objects.nonNull(estabelecimentoVinculacaoType)) {

                filtroPesquisaVinculacaosType.setIdentificacaoEstabelecimento(estabelecimentoVinculacaoType);
            }

            requestVinculacaos.setFiltroPesquisaVinculacaos(filtroPesquisaVinculacaosType);

            return port.pesquisarVinculacaoProfissionalSaude(requestVinculacaos);
        } catch (VinculacaoFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ResponseVinculacao detalharVinculacaoProfissionalSaude(
            EstabelecimentoVinculacaoType estabelecimentoVinculacaoType,
            br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao.ProfissionalVinculacaoType profissionalVinculacaoType,
            TipoVinculacaoType tipoVinculacaoType) {

        try {
            // Call Web Cnes Operation
            VinculacaoProfissionalService service = new VinculacaoProfissionalService();
            HandlerResolver handlerResolver = new ClientHandlerCnes();
            service.setHandlerResolver(handlerResolver);
            VinculacaoPortType port = service.getVinculacaoProfissionalServicePort();
            RequestVinculacao requestVinculacao = new RequestVinculacao();

            FiltroPesquisaVinculacaoType filtroPesquisaVinculacaosType = new FiltroPesquisaVinculacaoType();

            if (Objects.nonNull(profissionalVinculacaoType)) {
                filtroPesquisaVinculacaosType.setIdentificacaoProfissional(profissionalVinculacaoType);
            }

            if (Objects.nonNull(estabelecimentoVinculacaoType)) {
                filtroPesquisaVinculacaosType.setIdentificacaoEstabelecimento(estabelecimentoVinculacaoType);
            }

            if (Objects.nonNull(tipoVinculacaoType)) {
                filtroPesquisaVinculacaosType.setIdentificacaoVinculacao(tipoVinculacaoType);
            }

            requestVinculacao.setFiltroPesquisaVinculacao(filtroPesquisaVinculacaosType);

            return port.detalharVinculacaoProfissionalSaude(requestVinculacao);
        } catch (VinculacaoFault ex) {
            Logger.getLogger(Cnes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}

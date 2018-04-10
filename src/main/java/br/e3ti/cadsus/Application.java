package br.e3ti.cadsus;

import br.e3ti.cadsus.service.Cnes;
import br.e3ti.cadsus.service.SigTAP;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeFault;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.NumeroCNSType;
import br.gov.saude.servicos.wsdl.mensageria.v1.paginacao.PaginacaoType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao.ProfissionalVinculacaoType;
import com.google.gson.Gson;
import java.math.BigInteger;
import java.net.MalformedURLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws EstabelecimentoSaudeFault, MalformedURLException {
        SpringApplication.run(Application.class, args);
        Cnes cnes = new Cnes();
        SigTAP sigTAP = new SigTAP();
        Gson gson = new Gson();

        String json = gson.toJson(cnes.consultarEstabelecimentoSaude("7161158"));

        System.out.println("Teste de getEstabelecimentoSaudeServiceByCnes ====================> " + json);

        //String json1 = gson.toJson(cnes.consultarEquipamentos("7161158"));
        //System.out.println("Teste de getEquipamentoServiceByCnes ====================> " + json1);
        String json2 = gson.toJson(cnes.consultarEstabelecimentoSaude("7161158", null));

        System.out.println("Teste de getEstabelecimentoServiceByCnes ====================> " + json2);

        String json6 = gson.toJson(cnes.consultarProfissionaisSaude("7161158", null));

        System.out.println("Teste de consultarProfissionaisSaude ====================> " + json6);

        CNSType cNSType = new CNSType();
        cNSType.setNumeroCNS("210157960540003");
        String json7 = gson.toJson(cnes.consultarProfissionalSaude(cNSType, null, null));

        System.out.println("Teste de consultarProfissionalSaude ====================> " + json7);

        String json4 = gson.toJson(cnes.consultarLeitosCNES("7161158"));

        System.out.println("Teste de getLeitosByCnes ====================> " + json4);

        ProfissionalVinculacaoType profissionalVinculacaoType = new ProfissionalVinculacaoType();
        NumeroCNSType numeroCNSType = new NumeroCNSType();
        numeroCNSType.setNumeroCNS("210157960540003");
        profissionalVinculacaoType.setCns(numeroCNSType);

        //String json10 = gson.toJson(cnes.detalharVinculacaoProfissionalSaude(null, profissionalVinculacaoType, null));
        //System.out.println("Teste de detalharVinculacaoProfissionalSaude ====================> " + json10);
        
        PaginacaoType paginacaoType = new PaginacaoType();
        paginacaoType.setRegistroInicial(BigInteger.ONE);
        paginacaoType.setQuantidadeRegistros(20);

        String json11 = gson.toJson(sigTAP.pesquisarProcedimentos("05", "04", "201501", paginacaoType));

        System.out.println("Teste de pesquisarProcedimentos ====================> " + json11);

    }

}

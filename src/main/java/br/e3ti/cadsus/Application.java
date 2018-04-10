package br.e3ti.cadsus;

import br.e3ti.cadsus.service.Cnes;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeFault;
import com.google.gson.Gson;
import java.net.MalformedURLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws EstabelecimentoSaudeFault, MalformedURLException {
        SpringApplication.run(Application.class, args);
        Cnes cnes = new Cnes();
        Gson gson = new Gson();

        String json = gson.toJson(cnes.consultarEstabelecimentoSaude("7161158"));

        System.out.println("Teste de getEstabelecimentoSaudeServiceByCnes ====================> " + json);

        String json1 = gson.toJson(cnes.consultarEquipamentos("7161158"));

        System.out.println("Teste de getEquipamentoServiceByCnes ====================> " + json1);

        String json2 = gson.toJson(cnes.consultarEstabelecimentoSaude("7161158", null));

        System.out.println("Teste de getEstabelecimentoServiceByCnes ====================> " + json2);

        String json4 = gson.toJson(cnes.consultarLeitosCNES("7161158"));

        System.out.println("Teste de getLeitosByCnes ====================> " + json4);

    }

}

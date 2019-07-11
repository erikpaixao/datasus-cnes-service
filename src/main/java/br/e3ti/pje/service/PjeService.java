package br.e3ti.pje.service;

import br.jus.cnj.intercomunicacao_2_2.*;
import br.jus.cnj.servico_intercomunicacao_2_2_2.ServicoIntercomunicacao222;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.xml.ws.Holder;
import java.util.List;

@Service
public class PjeService implements ServicoIntercomunicacao222 {

    @Override
    public void consultarAlteracao(String idConsultante, String senhaConsultante, String numeroProcesso, Holder<Boolean> sucesso, Holder<String> mensagem, Holder<String> hashCabecalho, Holder<String> hashMovimentacoes, Holder<String> hashDocumentos) {

    }

    @Override
    public void confirmarRecebimento(String idRecebedor,
                                     String senhaRecebedor,
                                     String protocolo,
                                     Holder<Boolean> sucesso,
                                     Holder<String> mensagem) {

    }

    @Override
    public void consultarAvisosPendentes(String idRepresentado,
                                         String idConsultante,
                                         String senhaConsultante,
                                         String dataReferencia,
                                         Holder<Boolean> sucesso,
                                         Holder<String> mensagem,
                                         Holder<List<TipoAvisoComunicacaoPendente>> aviso) {

    }

    @Override
    public void consultarProcesso(String idConsultante,
                                  String senhaConsultante,
                                  String numeroProcesso,
                                  String dataReferencia,
                                  Boolean movimentos,
                                  Boolean incluirCabecalho,
                                  Boolean incluirDocumentos,
                                  List<String> documento,
                                  Holder<Boolean> sucesso,
                                  Holder<String> mensagem,
                                  Holder<TipoProcessoJudicial> processo) {

    }

    @Override
    public void consultarTeorComunicacao(String idConsultante,
                                         String senhaConsultante,
                                         String numeroProcesso,
                                         String identificadorAviso,
                                         Holder<Boolean> sucesso,
                                         Holder<String> mensagem,
                                         Holder<List<TipoComunicacaoProcessual>> comunicacao) {

    }

    @Override
    public void entregarManifestacaoProcessual(String idManifestante,
                                               String senhaManifestante,
                                               String numeroProcesso,
                                               TipoCabecalhoProcesso dadosBasicos,
                                               List<TipoDocumento> documento,
                                               String dataEnvio,
                                               List<TipoParametro> parametros,
                                               Holder<Boolean> sucesso,
                                               Holder<String> mensagem,
                                               Holder<String> protocoloRecebimento,
                                               Holder<String> dataOperacao,
                                               Holder<DataHandler> recibo,
                                               Holder<List<TipoParametro>> parametro) {

    }
}

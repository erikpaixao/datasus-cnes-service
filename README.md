# datasus-cnes-service
Implementacao do serviço SOAP Cnes DataSus com SpringBoot


Exemplo de uso:

Cnes cnes = new Cnes();
cnes.consultarEstabelecimentoSaude([codCNES]);

cnes.consultarProfissionaisSaude([codCNES], [codCNPJ]);

Dentre outros

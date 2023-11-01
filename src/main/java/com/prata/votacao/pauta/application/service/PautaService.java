package com.prata.votacao.pauta.application.service;

import com.prata.votacao.pauta.application.api.NovaPautaRequest;
import com.prata.votacao.pauta.application.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
}

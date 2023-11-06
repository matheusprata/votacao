package com.prata.votacao.pauta.application.service;

import com.prata.votacao.pauta.application.api.NovaPautaRequest;
import com.prata.votacao.pauta.application.api.PautaCadastradaResponse;
import com.prata.votacao.pauta.domain.Pauta;

import java.util.UUID;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
    Pauta getPautaPorId(UUID idPauta);
}

package com.prata.votacao.pauta.application.service;

import com.prata.votacao.pauta.domain.Pauta;

public interface PautaRepository {
    Pauta salva(Pauta pauta);
}
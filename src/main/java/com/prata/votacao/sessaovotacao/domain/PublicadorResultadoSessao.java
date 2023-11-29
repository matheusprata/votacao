package com.prata.votacao.sessaovotacao.domain;

import com.prata.votacao.sessaovotacao.application.api.ResultadoSessaoResponse;

public interface PublicadorResultadoSessao {
    void publica(ResultadoSessaoResponse resultadoSessaoResponse);
}
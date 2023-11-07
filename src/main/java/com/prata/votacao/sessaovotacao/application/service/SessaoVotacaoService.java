package com.prata.votacao.sessaovotacao.application.service;

import com.prata.votacao.sessaovotacao.application.api.*;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
    ResultadoSessaoResponse obtemResultado(UUID idSessao);
}
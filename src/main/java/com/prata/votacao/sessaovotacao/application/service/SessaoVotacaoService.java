package com.prata.votacao.sessaovotacao.application.service;

import com.prata.votacao.sessaovotacao.application.api.SessaoAberturaRequest;
import com.prata.votacao.sessaovotacao.application.api.SessaoAberturaResponse;
import com.prata.votacao.sessaovotacao.application.api.VotoRequest;
import com.prata.votacao.sessaovotacao.application.api.VotoResponse;
import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
}
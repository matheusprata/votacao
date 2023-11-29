package com.prata.votacao.sessaovotacao.application.service;

import com.prata.votacao.sessaovotacao.domain.SessaoVotacao;

import java.util.List;
import java.util.UUID;

public interface SessaoVotacaoRepository {
    SessaoVotacao salva(SessaoVotacao sessaoVotacao);
    SessaoVotacao buscaPorId(UUID idSessao);
    List<SessaoVotacao> buscaAbertas();
}

package com.prata.votacao.sessaovotacao.infra;

import com.prata.votacao.sessaovotacao.domain.SessaoVotacao;
import com.prata.votacao.sessaovotacao.domain.StatusSessaoVotacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SessaoVotacaoSpringDataJPARepository extends JpaRepository<SessaoVotacao, UUID> {
    List<SessaoVotacao> findByStatus(StatusSessaoVotacao statusSessaoVotacao);
}
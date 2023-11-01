package com.prata.votacao.pauta.application.service;

import com.prata.votacao.pauta.application.api.NovaPautaRequest;
import com.prata.votacao.pauta.application.api.PautaCadastradaResponse;
import com.prata.votacao.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    private final PautaRepository pautaRepository;

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[start] PautaApplicationService - cadastraPauta");
        log.info("[novaPauta] {}",novaPauta);
        Pauta pauta = pautaRepository.salva(new Pauta(novaPauta));
        log.info("[finish] PautaApplicationService - cadastraPauta");
        return new PautaCadastradaResponse(pauta);
    }
}
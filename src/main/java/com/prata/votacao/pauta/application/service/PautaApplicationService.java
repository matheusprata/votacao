package com.prata.votacao.pauta.application.service;

import com.prata.votacao.pauta.application.api.NovaPautaRequest;
import com.prata.votacao.pauta.application.api.PautaCadastradaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[start] PautaApplicationService - cadastraPauta");
        log.info("[novaPauta] {}",novaPauta);
        log.info("[finish] PautaApplicationService - cadastraPauta");
        return null;
    }
}
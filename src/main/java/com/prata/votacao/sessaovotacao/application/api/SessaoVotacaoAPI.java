package com.prata.votacao.sessaovotacao.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/sessao")
public interface SessaoVotacaoAPI {

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/abertura")
    SessaoAberturaResponse abreSessao (@RequestBody SessaoAberturaRequest sessaoAberturaRequest);

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/{idSessao}/voto")
    VotoResponse recebeVoto(@PathVariable UUID idSessao, @RequestBody VotoRequest novoVoto);

    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/{idSessao}/resultado")
    ResultadoSessaoResponse obtemResultado(@PathVariable UUID idSessao);
}
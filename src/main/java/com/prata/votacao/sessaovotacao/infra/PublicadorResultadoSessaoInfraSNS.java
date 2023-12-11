package com.prata.votacao.sessaovotacao.infra;

import com.prata.votacao.config.AwsConfigProperties;
import com.prata.votacao.sessaovotacao.application.api.ResultadoSessaoResponse;
import com.prata.votacao.sessaovotacao.domain.PublicadorResultadoSessao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log4j2
public class PublicadorResultadoSessaoInfraSNS implements PublicadorResultadoSessao {
    private final NotificationMessagingTemplate publicadorResultadosSNS;
    private final AwsConfigProperties awsSnsProperties;

    @Override
    public void publica(ResultadoSessaoResponse resultadoSessaoResponse) {
        log.debug("[start] PublicadorResultadoSessaoInfraSNS - publica");
        publicadorResultadosSNS.sendNotification(awsSnsProperties.getResultadoSessaoTopic(),resultadoSessaoResponse,resultadoSessaoResponse.getIdPauta().toString());
        log.debug("[finish] PublicadorResultadoSessaoInfraSNS - publica");
    }
}
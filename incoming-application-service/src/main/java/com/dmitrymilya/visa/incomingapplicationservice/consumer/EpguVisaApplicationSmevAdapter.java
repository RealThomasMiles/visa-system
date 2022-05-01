package com.dmitrymilya.visa.incomingapplicationservice.consumer;

import com.dmitrymilya.visa.incomingapplicationservice.converter.VisaApplicationUnmarshaller;
import com.dmitrymilya.visa.incomingapplicationservice.model.VisaApplication;
import com.dmitrymilya.visa.incomingapplicationservice.service.ApplicationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EpguVisaApplicationSmevAdapter {

    private final VisaApplicationUnmarshaller visaApplicationUnmarshaller;

    private final ApplicationSender applicationSender;

    @KafkaListener(topics = "${application.kafka.incoming-application-topic-name}")
    public void consume(String messageString) {
        VisaApplication visaApplication = visaApplicationUnmarshaller.unmarshallApplication(messageString);

        applicationSender.sendToProcessing(visaApplication);
    }

}
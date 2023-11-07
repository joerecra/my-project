package com.customers.springboot;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.stereotype.Service;

@Service
public class KafkaStreamsService {

    @Value("${kafka.topic.input}")
    private String inputTopic;

    @Value("${kafka.topic.output}")
    private String outputTopic;

    @Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
    public StreamsBuilder streamsBuilder() {
        StreamsBuilder builder = new StreamsBuilder();

        // Define your Kafka Streams processing logic here
        KStream<String, String> inputStream = builder.stream(inputTopic);
        KStream<String, String> outputStream = inputStream.mapValues(value -> value.toUpperCase());
        outputStream.to(outputTopic);

        return builder;
    }

    // Kafka listener to start the Kafka Streams application
    @KafkaListener(topics = "${kafka.topic.input}", groupId = "kafka-streams-listener")
    public void startKafkaStreams(String message) {
        System.out.println(message);
    }
}

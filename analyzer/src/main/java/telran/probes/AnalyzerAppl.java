package telran.probes;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import telran.probes.dto.ProbeData;
import telran.probes.service.RangeProviderClient;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j

public class AnalyzerAppl {
	
	@Value("${app.analyzer.producer.binding.name:analyzerProducer-in-0}")
	String producerBindingName;
	
	final RangeProviderClient servise;
	final StreamBridge bridge;

	public static void main(String[] args) {
		SpringApplication.run(AnalyzerAppl.class, args);
	}
	
	@Bean
	Consumer<ProbeData> analyzerConsumer(){
		return ProbeData ->{
			log.trace("recived probe: {}", ProbeData);
			//TODO
			log.debug("deviation: {}");
			//TODO
			log.debug("devitation data {} send to {}");
		};
	}

}
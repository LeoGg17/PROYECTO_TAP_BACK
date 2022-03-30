package com.proyecto.ProyectoTAP;

import com.proyecto.ProyectoTAP.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Import(SwaggerConfiguration.class)
@SpringBootApplication
public class ProyectoTapApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoTapApplication.class, args);
	}

}


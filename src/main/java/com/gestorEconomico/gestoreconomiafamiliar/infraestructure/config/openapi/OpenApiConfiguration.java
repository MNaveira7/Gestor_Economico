package com.gestorEconomico.gestoreconomiafamiliar.infraestructure.config.openapi;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Económica")
                        .version("1.0")
                        .description("API para gestionar el dinero de cualquier persona."));
    }
}

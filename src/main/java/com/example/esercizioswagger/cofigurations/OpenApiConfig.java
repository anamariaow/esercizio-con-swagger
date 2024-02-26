package com.example.esercizioswagger.cofigurations;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI myOpenAPI() {
        Info info = new Info()
                .title("Titolo")
                .version("1.0")
                .contact(new Contact().name("Ana").email("new_annemarie@yahoo.com"))
                .description("descrizione").termsOfService("https://google.com")
                .license(new License().name("MIT licence").url("https://en.wikipedia.org/wiki/MIT_License"));

        return new OpenAPI().info(info);
    }

}

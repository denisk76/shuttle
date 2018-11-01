package ru.bmsgroup.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class FlightRouter {
    @Bean
    public RouterFunction<ServerResponse> route(FlightHandler flightHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/flight").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), flightHandler::flight);
    }
}

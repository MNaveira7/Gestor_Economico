package com.gestorEconomico.gestoreconomiafamiliar.infraestructure.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samuIgnore")
public class MyController {

    @GetMapping
    @Operation(summary = "Endpoint para que Samu ignore a la gente en horario laboral", description = "Mensaje standard para cuando llame Albitre")
    @ApiResponse(responseCode = "200", description = "Samu ignora a Albitre")
    public String getSomething() {
        return "No me ralles";
    }
}
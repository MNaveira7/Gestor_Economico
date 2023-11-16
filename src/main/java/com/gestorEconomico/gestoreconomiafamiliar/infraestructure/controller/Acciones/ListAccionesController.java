package com.gestorEconomico.gestoreconomiafamiliar.infraestructure.controller.Acciones;

import com.gestorEconomico.gestoreconomiafamiliar.application.service.acciones.ListAccionesService;
import com.gestorEconomico.gestoreconomiafamiliar.shared.dto.AccionesDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Acciones", description = "Operaciones relacionadas con Acciones")
@RequestMapping("/acciones")
public class ListAccionesController {

    private final ListAccionesService listAccionesService;

    public ListAccionesController(ListAccionesService listAccionesService) {
        this.listAccionesService = listAccionesService;
    }

    @GetMapping(path = "/findAcciones")
    @Operation(summary = "Obtiene todas las acciones", tags = {"Acciones"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Acciones encontradas",
                    content = @Content(schema = @Schema(implementation = AccionesDTO.class))),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Acciones no encontradas",
                    content = @Content)})
    public ResponseEntity<List<AccionesDTO>> getAllAcciones() {
        List<AccionesDTO> acciones = listAccionesService.list();
        return ResponseEntity.ok(acciones);
    }

}

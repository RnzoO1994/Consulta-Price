package com.servicio.ServicioConsulta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.ServicioConsulta.model.ConsultaPrecioRequest;
import com.servicio.ServicioConsulta.model.ConsultaPrecioResponse;
import com.servicio.ServicioConsulta.service.ConsultaPriceService;

@RestController

public class PriceController {
	@Autowired
	private ConsultaPriceService consultaPriceService;

	@PostMapping(value = "/price")
	public ResponseEntity<ConsultaPrecioResponse> consultaPrice(@RequestBody ConsultaPrecioRequest request) {
		ConsultaPrecioResponse consultaPrecioResponse = null;
		consultaPrecioResponse = consultaPriceService.consultaPrice(request);
		if (consultaPrecioResponse != null) {
			return ResponseEntity.ok(consultaPrecioResponse);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

}

package com.servicio.ServicioConsulta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.ServicioConsulta.model.Prices;
import com.servicio.ServicioConsulta.model.ConsultaPrecioRequest;
import com.servicio.ServicioConsulta.model.ConsultaPrecioResponse;
import com.servicio.ServicioConsulta.repository.PriceRepository;

@Service
public class ConsultaPriceService {
	@Autowired
	private PriceRepository  consultaPriceRepository;
	
	public ConsultaPrecioResponse consultaPrice(ConsultaPrecioRequest request) {
		ConsultaPrecioResponse salida = new ConsultaPrecioResponse();
		 // Consultar los precios en base al brandId, productId y dateApplication proporcionados en la solicitud

		List<Prices> prices = consultaPriceRepository.findPricesByBrandIdProductIdCurrentDate(request.getBrandId(), request.getProductId(), request.getDateApplication());		

		if (prices != null) {
			Prices maxPrice = null;
			  // Bucle para encontrar el precio con la prioridad más alta
			for (Prices price : prices) {
	            // Si no hay un precio máximo o si la prioridad del precio actual es mayor que 
				//la prioridad del precio máximo encontrado hasta ahora, actualizar el precio máximo
			    if (maxPrice == null || price.getPriority() > maxPrice.getPriority()) {
			        maxPrice = price;
			    }
			}
			salida.setBrandId(maxPrice.getBrands().getId());
			salida.setProductId(maxPrice.getId());
			salida.setPrice(maxPrice.getPriceList());
			salida.setApplicationDate(request.getDateApplication());
			salida.setFinalPrice(maxPrice.getPrice());		
		}	
		return salida;	
	}
}

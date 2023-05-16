package com.servicio.ServicioConsulta.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.servicio.ServicioConsulta.model.Prices;

@Repository
public interface PriceRepository extends CrudRepository<Prices, Long> {


@Query("SELECT prices FROM Prices prices JOIN prices.brands brands WHERE brands.id = ?1 AND prices.productId = "
		+ "?2 AND (?3 BETWEEN prices.startDate AND prices.endDate) ORDER BY prices.priority ASC")

	    List<Prices> findPricesByBrandIdProductIdCurrentDate(int brandId, int productId, LocalDateTime currentDate);

}

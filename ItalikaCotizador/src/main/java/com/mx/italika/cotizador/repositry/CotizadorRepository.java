package com.mx.italika.cotizador.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.italika.cotizador.model.entity.Tutorial;


@Repository
public interface CotizadorRepository extends JpaRepository<Tutorial, Integer> {
	

	  List<Tutorial> findByTitleContaining(String title);

}

package com.mx.italika.cotizador.service;

import java.util.List;

import com.mx.italika.cotizador.model.entity.Tutorial;

public interface CotizadorService {
	
	  List<Tutorial> findByTitleContaining(String title);
	  List<Tutorial> findAll();
	   
	  
	  Tutorial insert(Tutorial t);



}

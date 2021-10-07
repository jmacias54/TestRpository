package com.mx.italika.cotizador.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.italika.cotizador.model.entity.Tutorial;
import com.mx.italika.cotizador.repositry.CotizadorRepository;
import com.mx.italika.cotizador.service.CotizadorService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CotizadorServiceImpl implements CotizadorService{
	
	
	@Autowired
	private CotizadorRepository cotizadorRepository;

	@Override
	public List<Tutorial> findByTitleContaining(String title) {
        log.info(" --- findByTitleContaining ---");
		return cotizadorRepository.findByTitleContaining(title);
	}

	@Override
	public List<Tutorial> findAll() {
		  log.info(" --- findAll ---");
			return cotizadorRepository.findAll();
	}

	@Override
	public Tutorial insert(Tutorial t) {
		// TODO Auto-generated method stub
		return cotizadorRepository.save(t);

		
	}

}

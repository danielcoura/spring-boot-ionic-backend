package com.danielcoura.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielcoura.cursomc.domain.Pedido;
import com.danielcoura.cursomc.repositories.PedidoRepository;
import com.danielcoura.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		if(obj == null || obj.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
					+ ", Tipo: " + Pedido.class.getName());
		}
		
		return obj.orElse(null);
	}
}

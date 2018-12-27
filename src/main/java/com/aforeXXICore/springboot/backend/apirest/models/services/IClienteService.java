package com.aforeXXICore.springboot.backend.apirest.models.services;

import java.util.List;

import com.aforeXXICore.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	
	public Cliente findByid(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
		
}

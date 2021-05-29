package br.com.atvcamadaspackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.atvcamadaspackage.dao.CategoriaRepository;
import br.com.atvcamadaspackage.dominio.*;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public void salvar(Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	public void update(Categoria categoria) {
		categoriaRepository.saveAndFlush(categoria);
	}
	
	public List<Categoria> listAll(){
		return categoriaRepository.findAll();
	}
	
	public Categoria getById(Integer id) {
		return categoriaRepository.getById(id);
	}

}

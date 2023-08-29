package LivrosApi.Livros;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {
	
	@Autowired
	private LivrosRepository livrosRep;
	
	public Iterable<Livros> getLivrosDb(){
		return livrosRep.findAll();
	}

	public Optional<Livros> getLivrosById(Integer id){
		return livrosRep.findById(id);
	}

	public List<Livros> getLivroByGenero(String genero){
		return livrosRep.findByGenero(genero);
	}

	public List<Livros> getLivroByAno(int anopublicacao){
		return livrosRep.findByAnopublicacao(anopublicacao);
	}
}

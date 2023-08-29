package LivrosApi.Livros;


import LivrosApi.ExceptionsConfig.ExceptionConfig;
import LivrosApi.Livros.Exception.ObjectNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {

	@Autowired
	private LivrosRepository livrosRep;

	public Iterable<Livros> getLivrosDb() {
		return livrosRep.findAll();
	}

	public Optional<Livros> getLivrosById(Integer id) {
		return livrosRep.findById(id);
	}

	public List<Livros> getLivroByGenero(String genero) {
		return livrosRep.findByGenero(genero);
	}

	public List<Livros> getLivroByAno(int anopublicacao) {
		return livrosRep.findByAnopublicacao(anopublicacao);
	}

	public Livros insert(Livros livros) {
		Assert.isNull(livros.getIdlivros(), "Não foi possível inserir carro");
		return livrosRep.save(livros);
	}

	public Livros update(Livros livros, Integer id) {
		Optional<Livros> livro = livrosRep.findById(id);

		if (livro.isPresent()) {
			Livros db = livro.get();
			db.setNome(livros.getNome());
			db.setGenero(livros.getGenero());
			db.setNumpaginas(livros.getNumpaginas());
			db.setEditora(livros.getEditora());
			db.setAnopublicacao(livros.getAnopublicacao());

			livrosRep.save(db);
			return db;
		}
		throw new RuntimeException("Carro não Atualizado");
	}

	public void delete(Integer id){
		if(getLivrosById(id).isPresent()){
			livrosRep.deleteById(id);
		}
		throw new ObjectNotFound("Livro não encontrado");
	}
}

package LivrosApi.Livros;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivrosService {
	
	@Autowired
	private LivrosRepository livrosRep;
	
	public Iterable<Livros> getLivrosDb(){
		return livrosRep.findAll();
	}
}

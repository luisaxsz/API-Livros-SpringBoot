package LivrosApi.Livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
@RestController // Caracteristica do controller
@RequestMapping("/api/v1/livros") // Nome do recurso
public class LivrosController {
	
	
	@Autowired
	private LivrosService service;
	
	@GetMapping()
	public Iterable<Livros> get(){
		return service.getLivrosDb();
	}
	
	@GetMapping("/{id}")
	public Optional<Livros> getLivroId(@PathVariable("id") Integer id){
		return service.getLivrosById(id);
	}
	
	@GetMapping("/genero/{genero}")
	public Iterable<Livros> getByGenero(@PathVariable("genero") String genero){
		return service.getLivroByGenero(genero);
	}
	@GetMapping("/ano/{anopublicacao}")
	public Iterable<Livros> getByAno(@PathVariable("anopublicacao") int anopublicacao){
		return service.getLivroByAno(anopublicacao);
	}
	
	@PostMapping()
	public ResponseEntity<?> post(){
		return null;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> put(@PathVariable("id") Integer id){
		return null;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id){
		return null;
	}
}

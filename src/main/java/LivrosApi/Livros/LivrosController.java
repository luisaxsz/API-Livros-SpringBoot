package LivrosApi.Livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
	public ResponseEntity<?> post(@RequestBody Livros livros){
		Livros l = service.insert(livros);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public void put(@RequestBody Livros livros, @PathVariable("id") Integer id){
		 service.update(livros,id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id){
		service.delete(id);
		return ResponseEntity.ok().build();
	}
}

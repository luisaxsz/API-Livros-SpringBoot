package LivrosApi.Livros;

import LivrosApi.ExceptionsConfig.ExceptionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController // Caracteristica do controller
@RequestMapping("/api/v1/livros") // Nome do recurso
@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,})
public class LivrosController {
	
	
	@Autowired
	private LivrosService service;
	@GetMapping()
	public Iterable<Livros> get(){
		return service.getLivrosDb();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getLivroId(@PathVariable("id") Integer id){
		Optional<Livros> livroOptional = service.getLivrosById(id);

		if (livroOptional.isPresent()) {
			return ResponseEntity.ok(livroOptional);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/genero/{genero}")
	public Iterable<Livros> getByGenero(@PathVariable("genero") String genero){
		return service.getLivroByGenero(genero);
	}
	@GetMapping("/ano/{anopublicacao}")
	public Iterable<Livros> getByAno(@PathVariable("anopublicacao") int anopublicacao){
		return service.getLivroByAno(anopublicacao);
	}
	@CrossOrigin
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
		if(service.delete(id)){
			return ResponseEntity.ok().build();
		}else{
			return ResponseEntity.notFound().build();
		}

	}
}

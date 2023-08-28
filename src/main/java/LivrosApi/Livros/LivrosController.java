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
	public ResponseEntity<?> getLivroId(@PathVariable("id") Integer id){
		return null;
	}
	
	@GetMapping("/{genero}")
	public ResponseEntity<?> getByGenero(@PathVariable("genero") String genero){
		return null;
	}
	@GetMapping("/{ano}")
	public ResponseEntity<?> getByAno(@PathVariable("ano") int ano){
		return null;
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

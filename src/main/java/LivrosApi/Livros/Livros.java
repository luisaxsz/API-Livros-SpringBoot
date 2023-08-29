package LivrosApi.Livros;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
public class Livros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idlivros;
	
	private String nome;
	private String genero;
	private int numpaginas;
	private String editora;
	private int anopublicacao;
}

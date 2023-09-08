package LivrosApi.Livros;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "livros", name="livros")
public class Livros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer idlivros;
	
	private String nome;
	private String genero;
	private int numpaginas;
	private String editora;
	private int anopublicacao;
}

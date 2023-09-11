package LivrosApi.Livros;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.lang.model.element.Name;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LIVROS", schema = "LIVROS")
public class Livros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDLIVROS")
	private Integer idlivros;

	@Column(name = "NOME")
	private String nome;
	@Column(name = "GENERO")
	private String genero;
	@Column(name = "NUMPAGINAS")
	private int numpaginas;
	@Column(name = "EDITORA")
	private String editora;
	@Column(name = "ANOPUBLICACAO")
	private int anopublicacao;
}

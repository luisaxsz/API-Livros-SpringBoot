package LivrosApi.Livros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface LivrosRepository extends JpaRepository<Livros,Integer>{
	List<Livros> findByGenero(String genero);

	List<Livros> findByAnopublicacao(int anopublicacao);
}

package LivrosApi.Livros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<Livros,Integer>{
	///List<Livros> findByGenero(String genero);
	
	///List<Livros> findByAno(int ano);
}

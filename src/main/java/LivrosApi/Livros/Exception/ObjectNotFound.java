package LivrosApi.Livros.Exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ObjectNotFound extends EntityNotFoundException {
    public ObjectNotFound(String massage){
        super(massage);
    }
}

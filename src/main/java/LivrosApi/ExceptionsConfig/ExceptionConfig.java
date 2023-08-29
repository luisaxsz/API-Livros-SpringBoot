package LivrosApi.ExceptionsConfig;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "LivrosApi")
public class ExceptionConfig extends RuntimeException {
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(
            {EmptyResultDataAccessException.class}
    )
    public ResponseEntity<Object> errorNotFound(){
        return ResponseEntity.notFound().build();
    }
}

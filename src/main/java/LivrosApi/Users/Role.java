package LivrosApi.Users;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.annotation.processing.Generated;

@Entity
@Data
@Table(name = "roles", schema = "LIVROS")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NOME")
    private String role;


    @Override
    public String getAuthority() {
        return role;
    }
}

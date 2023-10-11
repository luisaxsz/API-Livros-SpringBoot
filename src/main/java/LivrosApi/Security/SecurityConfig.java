package LivrosApi.Security;

import LivrosApi.Users.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig implements WebMvcConfigurer {

    @Autowired
    @Qualifier("userDetailImpl")
    private UserDetailsImpl userDetailsImpl;
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((authz) -> authz
                .requestMatchers(HttpMethod.GET).permitAll())
                .csrf().disable();

        http.authorizeHttpRequests((authz) -> authz
                .requestMatchers(HttpMethod.POST).permitAll()
                .requestMatchers(HttpMethod.PUT).hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE).hasRole("ADMIN")
                .anyRequest().authenticated()
        );

        http.cors();

        http.httpBasic(withDefaults());

        return http.build();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }


    protected void userDetailsService(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsImpl).passwordEncoder(passwordEncoder());

        /*
         * UserBuilder users = User.withDefaultPasswordEncoder(); UserDetails admin =
         * users.username("admin").password("admin").roles("ADMIN").build(); UserDetails
         * user = users.username("user").password("user").roles("USER").build(); return
         * new InMemoryUserDetailsManager(admin, user);
         */

    }

    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

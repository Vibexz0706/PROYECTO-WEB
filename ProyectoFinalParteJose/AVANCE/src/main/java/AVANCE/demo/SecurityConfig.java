package AVANCE.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
    
    @Bean
    public InMemoryUserDetailsManager users() {
            UserDetails admin=User.builder()
            .username("johan")
            .password("{noop}123")
            .roles("USER","VENDEDOR","ADMIN")
            .build();
             UserDetails sales=User.builder()
            .username("rebeca")
            .password("{noop}456")
            .roles("VENDEDOR","USER")
            .build();
              UserDetails user=User.builder()
            .username("pedro")
            .password("{noop}789")
            .roles("USER")
            .build();
             return new InMemoryUserDetailsManager(user,sales,admin);
    }   
    
    
    @Bean
    
   
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
    throws Exception {
        http
                .authorizeHttpRequests((request) -> request
                        .requestMatchers("/",
                                "/index",
                                "/css/style.css",
                                "/css/styleTable.css",
                                "/factura",
                                "/factura/listado",
                                "/layout/plantilla",
                                "/errores/**",
                                "/webjars/**",
                                "/plantilla",
                                "").permitAll()
                        .requestMatchers(
                                "/factura/nuevo",
                                "/css/style",
                                "/css/styleTable",
                                "/factura/guardar",
                                "/factura/modificar/**",
                                "/factura/eliminar/**"
                                
                                ).hasRole("ADMIN")
                        .requestMatchers(
                                "/factura/listado",
                                "/css/style.css",
                                "/css/styleTable.css"
                                
                        ).hasAnyRole("ADMIN","VENDEDOR")
                )
                .formLogin((form) -> form
                .loginPage("/login").permitAll())
                .logout((logout) -> logout.permitAll())
                .exceptionHandling()
                .accessDeniedPage("/errores/403");
        return http.build();
    }
    
}
package it.raffo.raffopizza.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http)
    throws Exception {
        http.authorizeHttpRequests()
        .requestMatchers("/user").hasAnyAuthority("USER")
        .requestMatchers("/admin").hasAnyAuthority("ADMIN")
        .requestMatchers("/").permitAll()
        .and().formLogin()
        .and().logout()
    return http.build();
        
    }

    // SLIDE 16

}

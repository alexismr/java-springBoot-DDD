package amr.ddd;
// import javax.persistence.EntityManagerFactory;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("amr.ddd.Infrastructure.Data")
class ApplicationConfiguration {

  // @Bean
  // EntityManagerFactory entityManagerFactory() {
  //   // …
  // }
}

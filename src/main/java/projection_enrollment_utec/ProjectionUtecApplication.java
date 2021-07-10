package projection_enrollment_utec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"controller", "business", "config"})
@EntityScan("data")
@EnableJpaRepositories("data.repositories")
@SpringBootApplication
public class ProjectionUtecApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectionUtecApplication.class, args);
    }

}

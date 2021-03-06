package projection_enrollment_utec;

import config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"controller", "business", "config", "exception", "payload", "security" , "util"})
@EntityScan("data")
@EnableJpaRepositories("data.repositories")
@EnableConfigurationProperties(AppProperties.class)
@SpringBootApplication
public class ProjectionUtecApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectionUtecApplication.class, args);
    }

}

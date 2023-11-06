package hw.ait.config;

import hw.ait.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student createStudent() {
        return new Student("John", 27);
    }
}

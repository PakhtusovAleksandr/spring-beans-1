package ru.be_prog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.be_prog.model.color.Green;
import ru.be_prog.model.color.Orange;


@Configuration
@ComponentScan(basePackages = "ru.be_prog")
public class ApplicationConfiguration {

    @Bean
    public Orange getOrangeBean() {
        return new Orange();
    }

    @Bean
    public Green getGreenBean() {
        return new Green();
    }
}

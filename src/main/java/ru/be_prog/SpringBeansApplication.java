package ru.be_prog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.be_prog.model.Driver;
import ru.be_prog.model.Pilot;
import ru.be_prog.model.TransportDriver;

public class SpringBeansApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        TransportDriver driver = context.getBean(Driver.class);
        TransportDriver pilot = context.getBean(Pilot.class);
        driver.getTransport().move();
        pilot.getTransport().move();
    }
}

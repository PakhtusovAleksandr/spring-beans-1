package ru.be_prog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import ru.be_prog.model.*;

//@SpringJUnitConfig(classes = ApplicationConfiguration.class)
//public class SpringBeansTest2 {
//
//    @Autowired
//    private ApplicationContext context;
//
//    @Test
//    public void shouldDriverControlCar() {
//        TransportDriver driver = context.getBean(Driver.class);
//        Transport transport = driver.getTransport();
//        Assertions.assertInstanceOf(Car.class, transport, "Тест не пройдет, водитель управляет не машиной.");
//    }
//
//    @Test
//    public void shouldPilotControlAirplane() {
//        TransportDriver pilot = context.getBean(Pilot.class);
//        Transport transport = pilot.getTransport();
//        Assertions.assertInstanceOf(Airplane.class, transport, "Тест не пройдет, пилот управляет не самолетом.");
//    }
//}

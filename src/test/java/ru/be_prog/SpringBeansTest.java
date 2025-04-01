package ru.be_prog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;
import static ru.be_prog.ApplicationConfiguration.CAR_BRANDS;

@SpringJUnitConfig(classes = ApplicationConfiguration.class)
public class SpringBeansTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldHelloBeanIsSingleton() {
        SpringHelloWorld first = context.getBean(SpringHelloWorld.class);
        SpringHelloWorld second = context.getBean(SpringHelloWorld.class);

        assertSame(first, second, "Тест для SpringHelloWorld бина не пройден, проверьте правильность конфигурации бина");
    }

    @Test
    public void shouldCarBeanIsPrototype() {
        Car first = context.getBean(Car.class);
        Car second = context.getBean(Car.class);

        assertNotSame(first, second, "Тест для Car бина не пройден, проверьте правильность конфигурации бина");
    }

    @Test
    public void shouldPersonBeanIsPrototype() {
        Person firstPerson = context.getBean(Person.class);
        Car firstCar = firstPerson.getCar();
        Person secondPerson = context.getBean(Person.class);
        Car secondCar = secondPerson.getCar();

        assertNotSame(firstPerson, secondPerson, "Тест для Person бина не пройден, проверьте правильность конфигурации бина");
        assertNotSame(firstCar, secondCar, "Тест для Person бина не пройден, Car должны быть разными у разных Person, проверьте правильность конфигурации бина");
        assertTrue(CAR_BRANDS.contains(firstCar.getBrand()), "Тест не пройдет, марка машины не соответствует марке из допустимого списка");
    }
}

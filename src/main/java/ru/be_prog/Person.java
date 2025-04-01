package ru.be_prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Car Car;

    public ru.be_prog.Car getCar() {
        return Car;
    }
    @Autowired
    public void setCar(ru.be_prog.Car car) {
        this.Car = car;
    }




}

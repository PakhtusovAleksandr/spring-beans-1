package ru.be_prog.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pilot implements TransportDriver {

    private final Transport transport;
    @Autowired
    public Pilot(@Qualifier("airplane") Transport transport) {
        this.transport = transport;
    }

    @Override
    public Transport getTransport() {
        return transport;
    }
}

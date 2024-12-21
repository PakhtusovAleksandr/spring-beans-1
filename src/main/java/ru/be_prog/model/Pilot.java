package ru.be_prog.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pilot implements TransportDriver {

    private final Transport transport;

    public Pilot(Transport transport) {
        this.transport = transport;
    }

    @Override
    public Transport getTransport() {
        return transport;
    }
}

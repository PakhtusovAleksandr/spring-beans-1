package ru.be_prog.model.color;

import org.springframework.stereotype.Component;

@Component
public class Purple implements Color {
    @Override
    public String getColor() {
        return "Фиолетовый";
    }

    @Override
    public String getMnemonicWord() {
        return "фазан.";
    }
}

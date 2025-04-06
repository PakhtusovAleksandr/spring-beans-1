package ru.be_prog.model.color;

import org.springframework.stereotype.Component;

@Component
public class LightBlue implements Color {
    @Override
    public String getColor() {
        return "Голубой ";
    }

    @Override
    public String getMnemonicWord() {
        return "где ";
    }
}

package ru.be_prog.model.rainbow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.be_prog.model.color.*;

import java.util.Arrays;

@Component
@Primary
public class RainbowSimple extends AbstractRainbow {

    private Red red;
    private Orange orange;

    //Первый способ
    private Blue blue;

    //Второй способ
    private Green green;

    //Третий способ
    @Autowired
    private LightBlue lightBlue;
    @Autowired
    private Purple purple;

    @Autowired
    private Yellow yellow;

    @Autowired
    public RainbowSimple(@Qualifier("red") Red red, @Qualifier("blue") Blue blue) {
        this.red = red;
        this.blue = blue;
    }


    @Autowired
    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    @Autowired
    public void setGreen(Green green) {
        this.green = green;
    }

    @Override
    public String getRainbowColors() {
        return buildStringFromColors(Arrays.asList(red, orange, yellow, green, lightBlue, blue, purple), Color::getColor);
    }

    @Override
    public String getRainbowMnemonic() {
        return buildStringFromColors(Arrays.asList(red, orange, yellow, green, lightBlue, blue, purple), Color::getMnemonicWord);
    }
}

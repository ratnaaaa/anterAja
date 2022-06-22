package tasks;

import anterAjaPageObjects.anterAjaPageObj;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class clickOn {
    public static Performable button(String buttonType) throws Exception{
        Target button;

        switch (buttonType){
            case "cek ongkir button":
                button = anterAjaPageObj.cekOngkirbtn;
                break;

            default :
                throw new Exception("There is no button type: " + buttonType);
        }
        WaitUntil.the(button, isVisible()).forNoMoreThan(100).seconds();
        return Task.where("{0} click " + buttonType + "button",
                Click.on(button)
        );
    }
}

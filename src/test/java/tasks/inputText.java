package tasks;

import anterAjaPageObjects.anterAjaPageObj;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class inputText {
    public static Performable onField(String fieldType, String value) throws Exception{
        Target field;
        switch (fieldType){
            case "origin field":
                field = anterAjaPageObj.originField;
                break;
            case "destination field":
                field = anterAjaPageObj.destinationField;
                break;

            default:
                throw new Exception("There is no field type: " +fieldType);
        }
        return Task.where("{0} input: " + value+ "",
                Enter.theValue(value)
                        .into(field)
        );
    }
}

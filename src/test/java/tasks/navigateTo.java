package tasks;

import anterAjaPageObjects.anterAjaPageObj;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class navigateTo {
    public static Performable theURL(String urlType) throws Exception {
        Class url;

        switch (urlType) {
            case "anterAja":
                url = anterAjaPageObj.class;
                break;
            default:
                throw new Exception("There is no url type: " + urlType);
        }
        return Task.where("{0} access the login url",
                Open.browserOn().the(url));
    }
}

package anterAjaPageObjects;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://anteraja.id/cek-ongkir")
public class anterAjaPageObj extends PageObject {

    public static Target originField = Target.the("Destination Field")
            .locatedBy("#mat-input-0");

    public static Target destinationField = Target.the("Destination Field")
            .locatedBy("#mat-input-1");

    public static Target cekOngkirbtn = Target.the("button cek ongkir")
            .locatedBy("/html/body/app-root/app-cek-ongkir/div/div[2]/div/div/div[1]/div[4]/div/button");

}

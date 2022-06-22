package anterAjaPageObjects;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://anteraja.id/cek-ongkir")
public class verifDisplayedPageObj {

        public static Target getTitleHargaOngkir = Target.the("Harga Ongkir")
                .locatedBy("/html/body/app-root/app-cek-ongkir/div/div[2]/div/div/div[1]/div[5]/div/div/table/thead/tr[1]/th");

}

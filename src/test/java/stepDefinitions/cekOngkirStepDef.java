package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import tasks.clickOn;
import tasks.inputText;
import tasks.navigateTo;
import tasks.verifyDisplayed;

public class cekOngkirStepDef {

    @Given("{actor} open anterAja cek ongkir web page")
    public void loadAnterAja(Actor actor) throws Exception {
        actor.wasAbleTo(navigateTo.theURL("anterAja"));

    }

    @When("{actor} input origin field")
    public void clickLayanan(Actor actor) throws Exception {


        actor.attemptsTo(
                inputText.onField("origin field", "Setiabudi, Jakarta Selatan, DKI Jakarta")
        );
    }

    @And("{actor} input destination field")
    public void originField(Actor actor) throws Exception {
        actor.attemptsTo(
                inputText.onField("destination field", "Pasar Minggu, Jakarta Selatan, DKI Jakarta")
        );

    }

    @And("{actor} click cek ongkir button")
    public void cekOngkirBtn(Actor actor) throws Exception {
        actor.attemptsTo(
                clickOn.button("cek ongkir button")
        );
    }
    @Then("successfully to view table price ongkir")
    public void verifyDisplayedTabel(Actor actor) throws Exception{
        actor.attemptsTo(
                verifyDisplayed.element("Employee List")
        );
    }
}

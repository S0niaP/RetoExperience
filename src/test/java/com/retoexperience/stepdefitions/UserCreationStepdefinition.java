package com.retoexperience.stepdefitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.retoexperience.questions.ValidateUserName;
import com.retoexperience.tasks.CreateUser;
import com.retoexperience.tasks.Fill;


import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class UserCreationStepdefinition {
	
	Actor user = Actor.named("Juan");
	
	@Managed(driver= "chrome")
	WebDriver driver;
	
	@Before
	public void config() {
		user.can(BrowseTheWeb.with(driver));
	}
	
	@Given("^The user start the navigator$")
	public void theUserStartTheNavigator() {
		user.wasAbleTo(Open.url("http://automationpractice.com/index.php"));
	}


	@Given("^The user can sing in he inserts his mail \"([^\"]*)\"$")
	public void theUserCanSingInHeInsertsHisMail(String eMail) {
	    user.attemptsTo(CreateUser.createAccount(eMail));
	    
	    
	}

	@When("^he fills the form$")
	public void heFillsTheForm(DataTable userData) {
		List<Map<String, String>> rows = userData.asMaps(String.class, String.class);
		Map<String, String> data = rows.get(0);
		user.attemptsTo(Fill.theForm(data));
	}

	@Then("^he can see his name in the page \"([^\"]*)\"$")
	public void heCanSeeHisNameInThePage(String userName) {
		user.should(seeThat(ValidateUserName.inUserAccount() , Matchers.is(userName)));
		
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

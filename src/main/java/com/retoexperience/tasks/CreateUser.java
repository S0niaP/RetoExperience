package com.retoexperience.tasks;



import com.retoexperience.userinterfaces.AutenticationPage;
import com.retoexperience.userinterfaces.MainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreateUser implements Task{
	
	private String eMail;
	

	public CreateUser(String eMail) {
		this.eMail = eMail;
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
			Click.on(MainPage.BTN_LOGIN),
			Enter.theValue(eMail).into(AutenticationPage.INP_EMAIL),
			Click.on(AutenticationPage.BTN_CREATE)
	    );
		
	}
	
	public static CreateUser createAccount(String eMail) {
		return new CreateUser(eMail);
	}

}

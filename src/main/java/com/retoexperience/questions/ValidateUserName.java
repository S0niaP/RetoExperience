package com.retoexperience.questions;

import com.retoexperience.userinterfaces.UserAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateUserName implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(UserAccount.SPN_USER).viewedBy(actor).asString();
	}
	
	public static ValidateUserName inUserAccount() {
		return new ValidateUserName();
	}

}

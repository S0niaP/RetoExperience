package com.retoexperience.tasks;

import java.util.Map;

import com.retoexperience.userinterfaces.CreateAnAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Fill implements Task {
	
	Map<String, String> personalData;

	public Fill(Map<String, String> personalData) {
		this.personalData = personalData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		switch (personalData.get("Gender")) {
		case "Ms":
			actor.attemptsTo(Click.on(CreateAnAccount.INP_MS));
			break;
		case "Mr":
			actor.attemptsTo(Click.on(CreateAnAccount.INP_MR));
			break;
		default:
			break;
		}
		actor.attemptsTo(
			Enter.theValue(personalData.get("First Name")).into(CreateAnAccount.INP_FIRST_NAME),
			Enter.theValue(personalData.get("Last Name")).into(CreateAnAccount.INP_LAST_NAME),
			Enter.theValue(personalData.get("Password")).into(CreateAnAccount.INP_PASSWORD),
			SelectFromOptions.byValue(personalData.get("Birth Day")).from(CreateAnAccount.SEL_BIRTH_DAY),
			SelectFromOptions.byValue(personalData.get("Birth Month")).from(CreateAnAccount.SEL_BIRTH_MONTH),
			SelectFromOptions.byValue(personalData.get("Birth Year")).from(CreateAnAccount.SEL_BIRTH_YEAR),
			Click.on(CreateAnAccount.INP_NEWSLETTER),
			Click.on(CreateAnAccount.INP_OFFERS),
			Enter.theValue(personalData.get("Company")).into(CreateAnAccount.INP_COMPANY),
			Enter.theValue(personalData.get("Address")).into(CreateAnAccount.INP_ADDRESS),
			Enter.theValue(personalData.get("City")).into(CreateAnAccount.INP_CITY),
			SelectFromOptions.byVisibleText(personalData.get("State")).from(CreateAnAccount.INP_STATE),
			Enter.theValue(personalData.get("Postal Code")).into(CreateAnAccount.INP_POSTAL_CODE),
			SelectFromOptions.byVisibleText(personalData.get("Country")).from(CreateAnAccount.SEL_COUNTRY),
			Enter.theValue(personalData.get("Mobile Phone")).into(CreateAnAccount.INP_MOBILE_PHONE),
			Enter.theValue(personalData.get("Address Alias")).into(CreateAnAccount.INP_ADDRESS_ALIAS),
			Click.on(CreateAnAccount.BTN_REGISTER)
		);
		
	}
	
	public static Fill theForm(Map<String, String> personalData ) {
		return new Fill(personalData);
	}

}

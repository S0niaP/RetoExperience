package com.retoexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutenticationPage {
	
	public static final Target INP_EMAIL = Target.the("Input for the mail").locatedBy("//input[@id='email_create']");
	public static final Target BTN_CREATE = Target.the("Button for create the account").locatedBy("//button[@class='btn btn-default button button-medium exclusive']");

}

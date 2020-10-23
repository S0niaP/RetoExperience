package com.retoexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UserAccount {
	public static final Target SPN_USER = Target.the("User name options").locatedBy("//div[@class='header_user_info']/a[@class='account']/span");
}

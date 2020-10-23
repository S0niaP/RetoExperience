package com.retoexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateAnAccount {

	 public static final Target INP_MR = Target.the("Radio button for male").locatedBy("//input[@id='id_gender1']");
	 public static final Target INP_MS = Target.the("Radio button for female").locatedBy("//input[@id='id_gender2']");
	 public static final Target INP_FIRST_NAME = Target.the("Input for user first name").locatedBy("//input[@id='customer_firstname']");
	 public static final Target INP_LAST_NAME = Target.the("Input for user last name").locatedBy("//input[@id='customer_lastname']");
	 public static final Target INP_NEWSLETTER = Target.the("Input for  the newsletter").locatedBy("//input[@id='newsletter']");
	 public static final Target INP_OFFERS = Target.the("Input for  the offers").locatedBy("//input[@id='optin']");
	 public static final Target INP_PASSWORD = Target.the("Input for user password").locatedBy("//input[@id='passwd']");
	 public static final Target SEL_BIRTH_DAY = Target.the("Selector for user birth day").locatedBy("//select[@id='days']");
	 public static final Target SEL_BIRTH_MONTH= Target.the("Selector for user birth month").locatedBy("//select[@id='months']");
	 public static final Target SEL_BIRTH_YEAR = Target.the("Selector for user birth year").locatedBy("//select[@id='years']");
	 public static final Target INP_COMPANY = Target.the("Input for user company").locatedBy("//input[@id='company']");
	 public static final Target INP_ADDRESS = Target.the("Input for user address").locatedBy("//input[@id='address1']");
	 public static final Target INP_CITY = Target.the("Input for user city").locatedBy("//input[@id='city']");
	 public static final Target INP_STATE = Target.the("Input for user state").locatedBy("//select[@id='id_state']");
	 public static final Target INP_POSTAL_CODE = Target.the("Input for user postal code").locatedBy("//input[@id='postcode']");
	 public static final Target SEL_COUNTRY = Target.the("Selector for user country").locatedBy("//select[@id='id_country']");
	 public static final Target INP_MOBILE_PHONE = Target.the("Input for user mobile phone").locatedBy("//input[@id='phone_mobile']");
	 public static final Target INP_ADDRESS_ALIAS = Target.the("Input for user address alias").locatedBy("//input[@id='alias']");
	 public static final Target BTN_REGISTER = Target.the("Button for register the form").locatedBy("//button[@id='submitAccount']");
}

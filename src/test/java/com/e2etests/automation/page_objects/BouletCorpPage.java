package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;

public class BouletCorpPage {

	private Validations validations;
	private ConfigFileReader configfilereader;

	final static String APROPOS_BUTTON = "//a[@href='/about']";
	final static String TWITCH_WIDGET = "//img[@src='/buttons/twitch.png']";
	final static String OCTODON_WIDGET = "//img[@src='/buttons/masto.png']";
	final static String INSTAGRAM_WIDGET = "//img[@src='/buttons/insta.png']";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = APROPOS_BUTTON)
	public static WebElement aProposbutton;

	@FindBy(how = How.XPATH, using = TWITCH_WIDGET)
	public static WebElement twitchWidget;

	@FindBy(how = How.XPATH, using = OCTODON_WIDGET)
	public static WebElement octodonWidget;

	@FindBy(how = How.XPATH, using = INSTAGRAM_WIDGET)
	public static WebElement instagramWidget;

	public BouletCorpPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.validations = new Validations();
		this.configfilereader = new ConfigFileReader();
	}

	// public void clickApropos() {
	// aProposbutton.click();
//	}

	//public void CheckUrlChanged() {

	//	String actualUrl = Setup.getDriver().getCurrentUrl();
	//	System.out.println("title of the page is , " + actualUrl);
	//	String url = configfilereader.getProperties("bouletcorp.url");
	//	if (actualUrl.equals(url)) {
		//	System.out.println("Echec -url n'a pas été changé");
	//	} else {
		//	System.out.println("Réussite -url a  été changé");

	//}

}
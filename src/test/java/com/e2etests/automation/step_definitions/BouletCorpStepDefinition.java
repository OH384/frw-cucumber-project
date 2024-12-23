package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.e2etests.automation.page_objects.BouletCorpPage;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonné;
import io.cucumber.java.fr.Quand;

public class BouletCorpStepDefinition extends BasePage {

	private BouletCorpPage bouletcorppage;
	private Validations validations;
	private ConfigFileReader configfilereader;
	private SeleniumUtils utils;

	public BouletCorpStepDefinition() {
		this.bouletcorppage = new BouletCorpPage();
		this.validations = new Validations();
		this.configfilereader = new ConfigFileReader();
		this.utils = new SeleniumUtils();
	}

	@Etantdonné("Je me rend sur le site bouletcorp {string}")
	public void jeMeRendSurLeSiteBouletcorp(String url) {
	//	Setup.getDriver().get(configfilereader.getProperties(url));
		utils.get(configfilereader.getProperties(url));
	}

	@Quand("Je clique sur l'onglet Apropos")
	public void jeCliqueSurLOngletApropos() {
	//bouletcorppage.clickApropos();
		utils.click(bouletcorppage.aProposbutton);
	}

	@Alors("La page a changé")
	public void laPageAChangé() {
	//	bouletcorppage.CheckUrlChanged();
		validations.assertNotEquals(configfilereader.getProperties("bouletcorp.url"), utils.getCurrentUrl());
	}

	@Alors("Les widgets twitch octodon et instagram sont bien affiches")
	public void lesWidgetsTwitchOctodonEtInstagramSontBienAffiches() {
		boolean twitch = BouletCorpPage.twitchWidget.isDisplayed();
		validations.assertTrue(twitch);
		boolean octodon = BouletCorpPage.octodonWidget.isDisplayed();
		validations.assertTrue(octodon);
		boolean instagram = BouletCorpPage.instagramWidget.isDisplayed();
		validations.assertTrue(instagram);
		
		
	}
}
package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import util.WebDriverHelper;

/**
 *
 * This test class works as Runner class .
 *
 * @author swghosh
 */


@CucumberOptions(features = "src/test/resource/Feature", glue = { "stepdef" },tags ={"@webViewerPictureControls"},
        plugin = { "pretty",
		"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.JSON" },monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {

	//@BeforeTest@ViewDocumentWindowDisplay
	public static void setupSuite() throws Throwable {
		WebDriverHelper.launchBrowser();
		System.out.println("Before");
	}

	//@AfterTest
	public static void tearDownAfterSuite() throws Throwable {
		try {
			WebDriverHelper.tearDown();
			System.out.println("After");
		} catch (Exception e) {
			System.out.println("Test Failed");
		}

	}
}

//@IndexTableCreation,@SearchFormCreation

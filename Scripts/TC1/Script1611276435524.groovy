import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.webui.driver.DriverFactory

String chromeDriverPath = DriverFactory.getChromeDriverPath()
System.setProperty('webdriver.chrome.driver', chromeDriverPath)

WebDriver driver = new ChromeDriver()

CustomKeywords.'kaywords.Keyword.login'(driver, 
		"https://katalon-demo-cura.herokuapp.com/profile.php#login",
		'John Doe',
		'ThisIsNotAPassword')

CustomKeywords.'kaywords.Keyword.logout'(driver)
// or similarly
//new kaywords.Keyword().logout(driver)
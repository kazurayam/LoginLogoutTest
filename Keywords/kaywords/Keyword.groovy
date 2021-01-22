package kaywords

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

public class Keyword {

	def login(WebDriver driver, String url, String login, String pw) {
		driver.manage().window().maximize()
		driver.get(url)
		driver.findElement(By.name("username")).sendKeys(login);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
	}

	def logout(WebDriver driver) {
		Thread.sleep(2000)
		driver.quit()
	}
}

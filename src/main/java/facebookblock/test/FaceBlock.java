package facebookblock.test;

import org.openqa.selenium.chrome.ChromeDriver;

import model.Login;


public class FaceBlock {

	public ChromeDriver driver;
	
	public void run() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ConstantesFaceBlock.URL_FB_LOGIN);
		try {
			new Login(driver).runLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}

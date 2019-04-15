package facebookblock.test;

import javax.swing.JTextField;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import view.InterfaceLogin;

public class FaceBlock {

	public static ChromeDriver driver;
	public static JTextField inputText;
	public InterfaceLogin firstView = new InterfaceLogin();
	
	public void run() {
		firstView.formLogin(); // Chama a primeira tela
		firstView.adicionarEventoLogin();
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ConstantesFaceBlock.URL_FB_LOGIN);
		
	}
	
	public void preencherCampos() {
		WebElement login = driver.findElementById(ConstantesFaceBlock.EMAIL);
		WebElement senha = driver.findElementById(ConstantesFaceBlock.EMAIL);
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}

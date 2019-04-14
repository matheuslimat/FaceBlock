package facebookblock.test;

import static org.junit.Assert.*;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegador {

	public static FaceBlock faceBlock = new FaceBlock();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		faceBlock.run();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close(); fecha a aba que ele usou para testar o sistema.
//		driver.quit(); // fecha o browser por completo após testar o sistema.
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//WebElement elemento = driver.findElementById("email");
		//elemento.sendKeys(keysToSend);
	}

}

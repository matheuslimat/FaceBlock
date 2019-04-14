package facebookblock.test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBlock {

	public static ChromeDriver driver;
	public static JTextField inputText;
	
	public void run() {
//		myFrame = new JFrame();
//		myFrame.setSize(800, 600);
//		myFrame.setVisible(true);
		inputText = new JTextField();
		inputText.setSize(100, 150);
		inputText.setText("Digite aqui o seu nome");
		inputText.getText();
		inputText.setVisible(true);
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ConstantesFaceBlock.URL_FB_LOGIN);
	}
	
	public void formLogin() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JTextField(), BorderLayout.NORTH); //Essa linha insere o JTextField
		frame.setSize(300, 300);		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import facebookblock.test.ConstantesFaceBlock;
import facebookblock.test.FaceBlock;

public class InterfaceLogin implements ActionListener {

	private JFrame frame = new JFrame();
	private JButton btnLogin = new JButton();
	private JTextField textLogin = new JTextField();
	private JTextField textPassword = new JTextField();
	private JPanel painel = new JPanel();
	public FaceBlock faceBlock = new FaceBlock();
	private String login;
	private String senha;
	private Boolean click = false;
	
	
	public void formLogin() {
		frame.addWindowListener(new WindowListener() {

			public void windowActivated(java.awt.event.WindowEvent arg0) {}

			public void windowClosed(java.awt.event.WindowEvent arg0) {
				new FaceBlock().quitBrowser();
				System.exit(0);
			}

			public void windowClosing(java.awt.event.WindowEvent arg0) {}

			public void windowDeactivated(java.awt.event.WindowEvent arg0) {}

			public void windowDeiconified(java.awt.event.WindowEvent arg0) {}

			public void windowIconified(java.awt.event.WindowEvent arg0) {}

			public void windowOpened(java.awt.event.WindowEvent arg0) {}
		});
		
		ajustaPosicaoLayout();
		preencheTextoDefault();
		adicionaElementos();
 	}
	
	public void preencheTextoDefault() {
		textLogin.setText("Digite seu email aqui!");
		textPassword.setText("Aqui vai sua senha!");
		btnLogin.setText("Entrar");
	}
	
	public void ajustaPosicaoLayout() {
		frame.setSize(300, 200);
	}
	
	public void adicionaElementos() {
		painel.add(textLogin);
		painel.add(textPassword);
		painel.add(btnLogin);
		
		frame.add(painel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 		frame.setVisible(true);
	}
	
	public void adicionarEventoLogin() {
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setLogin(textLogin.getText());
					setSenha(textPassword.getText());
					frame.setVisible(false);
					setClick(true);
					
			}
		});
	}
	
	public void preencherCamposLogin(ChromeDriver driver) {
		WebElement login = driver.findElement(By.id(ConstantesFaceBlock.EMAIL));
		login.sendKeys(getLogin());
		WebElement senha = driver.findElement(By.id(ConstantesFaceBlock.PASS));
		senha.sendKeys(getSenha());
		clickLogin(driver);
	}
	
	public void clickLogin(ChromeDriver driver) {
		WebElement btnLogin = driver.findElement(By.id(ConstantesFaceBlock.BTNLOGIN));
		btnLogin.click();
	}
	
	public void visibleLogin() {
		//frame.setVisible(true);
		frame.toFront();
	}

	public Boolean getClick() {
		return click;
	}

	public void setClick(Boolean click) {
		this.click = click;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void actionPerformed(ActionEvent arg0) {}

}

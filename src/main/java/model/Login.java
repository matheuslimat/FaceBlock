package model;


import org.openqa.selenium.chrome.ChromeDriver;

import view.InterfaceLogin;

public class Login {
	
	private InterfaceLogin firstView = new InterfaceLogin();
	public ChromeDriver driver;
	
	public Login(ChromeDriver driver) {
		this.driver = driver;
	}


	public void runLogin() throws InterruptedException {
		firstView.formLogin(); // Chama a primeira tela
		firstView.adicionarEventoLogin(driver);
		
		while(!firstView.getClick()) {
			//pode gastar mto processamento função achar maneira melhor
			firstView.visibleLogin();
		}
		
		firstView.preencherCamposLogin(driver);
		
	}
	

}

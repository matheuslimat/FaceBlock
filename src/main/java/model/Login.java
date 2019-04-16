package model;


import org.openqa.selenium.chrome.ChromeDriver;

import facebookblock.test.ConstantesFaceBlock;
import view.InterfaceLogin;

public class Login {
	
	public ChromeDriver driver;
	private InterfaceLogin firstView = new InterfaceLogin();
	private Boolean isSecondView = false;
	
	public Login(ChromeDriver driver) {
		this.driver = driver;
	}


	public void runLogin() throws InterruptedException {
		firstView.formLogin(); // Chama a primeira tela
		firstView.adicionarEventoLogin();
		
		while(!firstView.getClick()) {
			//pode gastar mto processamento função achar maneira melhor
			firstView.visibleLogin();
		}
		
		firstView.preencherCamposLogin(driver);
		
		if(validaLogin()) {
			// Chama secondView a ideia é colocar fotos q o selenium pegar do perfil e etc...
		}
		
	}
	
	public Boolean validaLogin() {
		if(driver.getCurrentUrl().toString().equals(ConstantesFaceBlock.URL_SUCESS)) {
			isSecondView = true;
		}
		
		return isSecondView;
	}
	

}

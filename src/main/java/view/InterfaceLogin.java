package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfaceLogin implements ActionListener{

	private JFrame frame = new JFrame();
	private JButton btnLogin = new JButton();
	private JTextField textLogin = new JTextField();
	private JTextField textPassword = new JTextField();
	private JPanel painel = new JPanel();
	private String login;
	private String senha;
	
	public void formLogin() {
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
			}
		});
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

	public void actionPerformed(ActionEvent e) {}

}

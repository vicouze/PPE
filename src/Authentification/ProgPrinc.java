package Authentification;

public class ProgPrinc {

	public static void main(String[] args) {
		Login login = new Login();
		login.setVisible(true);
		Connexion_BDD.connection();

	}

}

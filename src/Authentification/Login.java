package Authentification;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Toolkit;
public class Login extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2150717668256388409L;
	private JTextField identifiant;
	private JTextField password;
	public Login()  {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Documents\\stade_de_france\\icons\\icovisf.png"));
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setSize(new Dimension(645, 500));
		setResizable(false);
		setLocationRelativeTo(null);
		identifiant = new JTextField();
		identifiant.setBounds(139, 61, 147, 28);
		getContentPane().add(identifiant);
		identifiant.setColumns(10);

		password = new JPasswordField();
		password.setBounds(139, 100, 147, 28);
		getContentPane().add(password);
		password.setColumns(10);
		


		JButton Valider = new JButton("Se connecter");
		Valider.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				connection();
			}
		});
		Valider.setBounds(65, 169, 126, 23);
		Valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(Valider);

		JLabel lblIdentifiant = new JLabel("Identifiant :");
		lblIdentifiant.setBounds(64, 61, 66, 20);
		getContentPane().add(lblIdentifiant);
		

		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setBounds(47, 107, 82, 14);
		getContentPane().add(lblMotDePasse);

		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});

		btnQuitter.setBounds(201, 169, 126, 23);
		getContentPane().add(btnQuitter);
		
		
		erreurID = new JLabel("Identifiant ou mot de passe incorrect(s)");
		erreurID.setBounds(104, 144, 245, 14);
		getContentPane().add(erreurID);
		erreurID.setVisible(false);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Documents\\stade_de_france\\icons\\logo-stade-de-France-rouge.jpg"));
		lblNewLabel.setBounds(26, 22, 576, 417);
		getContentPane().add(lblNewLabel);
	}
 public JLabel erreurID;
	public void connection(){
		
		try {
			PreparedStatement req = Connexion_BDD.getConnection().prepareStatement("SELECT id_user FROM users WHERE login_user ='"+identifiant.getText()+"' AND mdp_user = '"+password.getText()+"'");
			ResultSet rs = req.executeQuery();
			if(rs.next())
			{
				setVisible(false);
				GUI gui = new GUI();
				gui.setVisible(true);

			}else{
				erreurID.setVisible(true);

			}
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

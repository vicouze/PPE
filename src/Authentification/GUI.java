package Authentification;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Dimension;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Toolkit;
import org.jfree.chart.*;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.plot.*;
import org.jfree.data.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.ChartPanel;
public class GUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3950780158642369766L;
	
	
	private Label label_date;
	
	public GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Documents\\stade_de_france\\icons\\icovisf.png"));
		getContentPane().setBackground(Color.DARK_GRAY);
		setSize(new Dimension(1386, 788));
		setResizable(false);
		getContentPane().setForeground(new Color(255, 140, 0));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 1386, 42);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton bt_connec = new JButton("Déconnexion");
		bt_connec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		
/*		bt_connec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login login = new Login();
				login.setVisible(true);
			}
		});
		
*/
		bt_connec.setIcon(new ImageIcon("C:\\Users\\admin\\Documents\\stade_de_france\\icons\\login_logo.png"));
		bt_connec.setBackground(new Color(255, 140, 0));
		bt_connec.setBounds(1224, 11, 130, 23);
		panel.add(bt_connec);
		
		JButton btnNewButton = new JButton("Accueil");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\admin\\Documents\\stade_de_france\\icons\\home_logo.png"));
		btnNewButton.setBounds(10, 9, 130, 26);
		panel.add(btnNewButton);
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 140, 0));
		
		
		
		
		
		JButton btnOnglet = new JButton("Gérer Tickets");
		btnOnglet.setIcon(new ImageIcon("C:\\Users\\admin\\Documents\\stade_de_france\\icons\\ticket-btn.png"));
		btnOnglet.setBounds(150, 9, 149, 26);
		panel.add(btnOnglet);
		btnOnglet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOnglet.setBorder(null);
		btnOnglet.setBackground(new Color(255, 140, 0));
		
		 
	    //create a dataset...
//________________|HommeFemme|________________________________________________________________________
	    DefaultPieDataset camsexe=new DefaultPieDataset();
	    camsexe.setValue("Homme",50);
	    camsexe.setValue("Femme",50);
	 

		PieDataset data = camsexe;
	    JFreeChart chart=ChartFactory.createPieChart( "Répartition Homme/Femme", data, true/*legend?*/,true/*tooltips?*/, false/*URLs?*/);
		
		JPanel stat1 = new ChartPanel(chart);
		stat1.setBounds(31, 74, 1327, 632);
		
		getContentPane().add(stat1);
//________________|STAT2|________________________________________________________________________
		
		DefaultPieDataset STAT2=new DefaultPieDataset();
		STAT2.setValue("Homme",19);
		STAT2.setValue("Femme",21);
		STAT2.setValue("gfgfd",60);
	 

		PieDataset data2 = STAT2;
	    JFreeChart chart2=ChartFactory.createPieChart( "teststat2", data2, true/*legend?*/,true/*tooltips?*/, false/*URLs?*/);
		
		JPanel stat2 = new ChartPanel(chart2);
		stat2.setBounds(31, 74, 1327, 632);
		
		getContentPane().add(stat2);
		
//________________|STAT3|________________________________________________________________________
		
		DefaultPieDataset STAT3=new DefaultPieDataset();
		STAT3.setValue("Homme",50);
		STAT3.setValue("Femme",50);
	 

		PieDataset data3 = STAT3;
	    JFreeChart chart3=ChartFactory.createPieChart( "TEST STAT3", data3, true/*legend?*/,true/*tooltips?*/, false/*URLs?*/);
		
		JPanel stat3 = new ChartPanel(chart3);
		stat3.setBounds(31, 74, 1327, 632);
		
		getContentPane().add(stat3);
		
//________________|STAT4|________________________________________________________________________
		
		DefaultPieDataset STAT4=new DefaultPieDataset();
		STAT4.setValue("Homme",50);
		STAT4.setValue("Femme",50);
	 

		PieDataset data4 = STAT4;
	    JFreeChart chart4=ChartFactory.createPieChart( "TEST STAT4", data4, true/*legend?*/,true/*tooltips?*/, false/*URLs?*/);
		
		JPanel stat4 = new ChartPanel(chart4);
		stat4.setBounds(31, 74, 1327, 632);
		
		getContentPane().add(stat4);
		
//________________________________________________________________________________________
		
		label_date = new Label("New label");
		label_date.setBounds(1110, 725, 237, 22);
		getContentPane().add(label_date);
		Date date = new Date();
		DateFormat formatdate = new SimpleDateFormat("EEEE dd/MM/yyyy", new Locale("FR","fr"));
    	DateFormat formatdate2 = new SimpleDateFormat("HH':'mm':'ss", new Locale("FR","fr"));
		
		label_date.setText((formatdate.format(date)+" - "+formatdate2.format(date)));
		
		JPanel content = new JPanel();
		content.setBounds(32, 53, 1315, 660);
		getContentPane().add(content);
		content.setLayout(null);
		
		JPanel statistique3 = new JPanel();
		stat3.setBounds(10, 351, 575, 298);
		content.add(stat3);
		
		JPanel statistique2 = new JPanel();
		stat2.setBounds(730, 11, 575, 298);
		content.add(stat2);
		
		JPanel statistique1 = new JPanel();
		stat1.setBounds(10, 11, 575, 298);
		content.add(stat1);
		
		JPanel statistique4 = new JPanel();
		stat4.setBounds(730, 351, 575, 298);
		content.add(stat4);
		
		mettreAjourDate();
	}
	
	
	private void mettreAjourDate(){
		 //Le second thread
	    new Thread(new Runnable(){
	    	
	      public void run(){
	    	 
	    	 while (!guiVisible()) {
	    		 try {
	 	            Thread.sleep(1000);
	 	          } catch (InterruptedException e) {
	 	            e.printStackTrace();
	 	          }
	    	 }
	    	  
	        while(guiVisible()) {
	          try {
	            Thread.sleep(1000);
	          } catch (InterruptedException e) {
	            e.printStackTrace();
	          }
	          //Modification de notre composant dans l'EDT
          	  
	          Thread fred = new Thread(new Runnable(){
	            public void run(){
	            	Date date = new Date();
	            	DateFormat formatdate = new SimpleDateFormat("EEEE dd/MM/yyyy",new Locale("FR","fr"));
	            	DateFormat formatdate2 = new SimpleDateFormat("HH':'mm':'ss",new Locale("FR","fr"));
	            	
	            	label_date.setText((formatdate.format(date)+" - "+formatdate2.format(date)));
	            }
	          });
	          if(SwingUtilities.isEventDispatchThread()) {
	        	  fred.start();
		          	
	          } else {
	            SwingUtilities.invokeLater(fred);
	          }
	        }
	      }
	    }).start();      
	}
	
	private boolean guiVisible(){
		return this.isVisible();
	}
}

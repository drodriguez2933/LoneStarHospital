import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Hospital extends JFrame{
	
	JFrame base;
	JPanel basePane;
	JPanel leftPanel;
	JPanel centerPanel;
	
	Font font = new Font("Times New Roman", Font.BOLD, 50);
	Font font1 = new Font("Times New Roman", Font.BOLD, 20);
	
	JFrame login;
	JLabel usernameLabel;
	JLabel passwordLabel;
	JPanel loginPanel;
	JButton loginButton;
	JTextField username;
	JPasswordField password;
	JLabel a;
	
	JPanel menu;
	JLabel welcomeLabel;
	JButton add;
	JButton delete;
	JButton search;
	JButton update;
	JButton checkIn;
	JButton checkOut;
	
	JPanel addPage;
	JTextField firstField;
	JLabel firstLabel;
	JTextField lastField;
	JLabel lastLabel;
	JTextField middleField;
	JLabel middleLabel;
	JTextField ssnField;
	JLabel ssnLabel;
	JTextField weightField;
	JLabel weightLabel;
	JTextField heightField;
	JLabel heightLabel;
	JLabel bloodLabel;
	JRadioButton blooda;
	JRadioButton bloodb;
	JRadioButton bloodab;
	JRadioButton bloodo;
	ButtonGroup rbg;
	JButton addPatient;
	
	
	
	
	
	public Hospital(){
		buildPage();
	}
	
	public void buildPage(){
		login = new JFrame();
		login.setLayout(new BorderLayout());
		login.setVisible(true);
		login.setPreferredSize(new Dimension(800,600));
		login.setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		centerPanel = new JPanel(new GridBagLayout());
		centerPanel.setBackground(new Color(255,255,255));
		centerPanel.setVisible(true);
		
		login.add(centerPanel,BorderLayout.CENTER);
		
		
		GridBagConstraints e = new GridBagConstraints();
// LOGINPAGE=============================================================	
		e.gridx = 0;
		e.gridy = 0;
		
		a = new JLabel("Lone Star Hospital");
		a.setFont(font);
		a.setForeground(new Color(139,0,0));
		e.gridwidth = 2;
		e.insets = new Insets(0,0,100,0);
		centerPanel.add(a, e);
		
		usernameLabel = new JLabel("Username: ");
		e.gridwidth = 1;
		e.gridy++;
		e.insets = new Insets(5,0,5,0);
		e.anchor = GridBagConstraints.LINE_END;
		centerPanel.add(usernameLabel, e);
		
		username = new JTextField();
		e.ipadx = 200;
		e.gridx++;
		e.anchor = GridBagConstraints.CENTER;
		centerPanel.add(username, e);
		
		passwordLabel = new JLabel("Password: ");
		e.ipadx = 0;
		e.gridy++;
		e.gridx--;
		e.anchor = GridBagConstraints.LINE_END;
		centerPanel.add(passwordLabel, e);
		
		password = new JPasswordField();
		e.gridx++;
		e.ipadx = 200;
		e.anchor = GridBagConstraints.CENTER;
		centerPanel.add(password, e);
		
		loginButton = new JButton("Login");
		e.gridy++;
		e.ipadx = 0;
		centerPanel.add(loginButton, e);
		
		loginButton.addActionListener(new login());
		
		login.pack();
		}
	
	public void buildAdd(){
		//add a patient========================================================
		
				addPage = new JPanel(new GridBagLayout());
				GridBagConstraints g = new GridBagConstraints();
				addPage.setBackground(new Color(255,255,255));
				addPage.setVisible(false);
				login.add(addPage);
				
				
				g.insets = new Insets(10,10,10,10);
				g.gridy = 0;
				g.gridx = 0;
				
				g.anchor = GridBagConstraints.LINE_START;
				
				firstLabel = new JLabel("First Name: ");
				addPage.add(firstLabel, g);
				
				firstField = new JTextField();
				g.gridx++;
				g.ipadx = 100;
				addPage.add(firstField, g);
				
				middleLabel = new JLabel("Middle Initial: ");
				g.gridx--;
				g.gridy++;
				g.ipadx = 0;
				addPage.add(middleLabel, g);
				
				middleField = new JTextField();
				g.gridx++;
				g.ipadx = 25;
				addPage.add(middleField, g);
				
				lastLabel = new JLabel("Last Name: ");
				g.gridx--;
				g.gridy++;
				g.ipadx = 0;
				addPage.add(lastLabel, g);
				
				lastField = new JTextField();
				g.gridx++;
				g.ipadx = 100;
				addPage.add(lastField, g);
				
				ssnLabel = new JLabel("SSN");
				g.gridy++;
				g.gridx--;
				g.ipadx = 0;
				addPage.add(ssnLabel, g);
				
				ssnField = new JTextField();
				g.gridx++;
				g.ipadx = 100;
				addPage.add(ssnField, g);
				
				weightLabel = new JLabel("Weight");
				g.gridy++;
				g.gridx--;
				g.ipadx = 0;
				addPage.add(weightLabel, g);
				
				weightField = new JTextField();
				g.gridx++;
				g.ipadx = 100;
				addPage.add(weightField, g);
				
				heightLabel = new JLabel("Height");
				g.gridy++;
				g.gridx--;
				g.ipadx = 0;
				addPage.add(heightLabel, g);
				
				heightField = new JTextField();
				g.gridx++;
				g.ipadx = 100;
				addPage.add(heightField, g);
				
				bloodLabel = new JLabel("BloodType");
				g.gridy++;
				g.gridx--;
				g.ipadx = 0;
				addPage.add(bloodLabel, g);
				
				blooda = new JRadioButton("A");
				g.gridx++;
				addPage.add(blooda, g);
				
				bloodb = new JRadioButton("B");
				g.gridx++;
				addPage.add(bloodb, g);
				
				bloodab = new JRadioButton("AB");
				g.gridx--;
				g.gridy++;
				addPage.add(bloodab, g);
				
				bloodo = new JRadioButton("O");
				g.gridx++;
				addPage.add(bloodo, g);
				
				addPatient = new JButton("Add Patient");
				g.gridy++;
				g.gridx--;
				g.gridwidth = 2;
				addPage.add(addPatient, g);
				
				rbg = new ButtonGroup();
				rbg.add(blooda);
				rbg.add(bloodb);
				rbg.add(bloodab);
				rbg.add(bloodo);
				login.pack();
	}
	
	public void buildMenu(){
		//MenuPage===========================================================
		
				menu = new JPanel(new GridBagLayout());
				GridBagConstraints a = new GridBagConstraints();
				menu.setBackground(new Color(255,255,255));
				menu.setVisible(false);
				login.add(menu,BorderLayout.CENTER);
				
				
				
				a.gridy = 0;
				a.gridx = 0;
				a.insets = new Insets(0,0,25,0);
				
				welcomeLabel = new JLabel("Hello Daniel, What would you like to do?");
				welcomeLabel.setFont(font1);
				a.gridwidth = 2;
				menu.add(welcomeLabel, a);
				
				add = new JButton("Add Patient");
				a.insets = new Insets(10,10,10,10);
				a.anchor = GridBagConstraints.CENTER;
				a.gridy++;
				a.gridwidth = 1;
				menu.add(add, a);
				
				search = new JButton("Search for Patient");
				a.gridx++;
				menu.add(search, a);
				
				checkIn = new JButton("Check In");
				a.gridy++;
				a.gridx--;
				menu.add(checkIn, a);
				
				checkOut = new JButton("Check Out");
				a.gridx++;
				menu.add(checkOut, a);
				
				add.addActionListener(new menuButton());
				search.addActionListener(new menuButton());
				checkIn.addActionListener(new menuButton());
				checkOut.addActionListener(new menuButton());
				
				login.pack();
	}
	
	public class login implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			char [] a = password.getPassword();
			String stringPass = String.valueOf(a);
			if(e.getSource() == loginButton){
				if("username".equals(username.getText()) && "password".equals(stringPass)){
					int i = 1;
					while(i < 3){
					if(i == 1){
					centerPanel.setVisible(false);
					i++;
					}
					else if(i == 2){
					buildMenu();
					menu.setVisible(true);
					i++;
					}
					}
					
					login.pack();
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Invalid Password or Username");
				}
			}
			
		}
		
	}
	
	public class menuButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			int i = 1;
			if(e.getSource() == add){
				while(i < 3){
					if(i == 1){
						menu.setVisible(false);
						i++;
					}
					else if(i == 2){
						buildAdd();
						addPage.setVisible(true);
						i++;
					}
				}
				
				
			}
			else if(e.getSource() == delete){
				JOptionPane.showMessageDialog(null, "Delete");
			}
			else if(e.getSource() == update){
				JOptionPane.showMessageDialog(null, "Update");
			}
			else if(e.getSource() == search){
				JOptionPane.showMessageDialog(null,"Search");
			}
			else if(e.getSource() == checkIn){
				JOptionPane.showMessageDialog(null, "Check In");
			}
			else if(e.getSource() == checkOut){
				JOptionPane.showMessageDialog(null, "Check Out");
			}
		}
		
	}
	
	public static void main(String aRgs[]){
		new Hospital();
	}
}

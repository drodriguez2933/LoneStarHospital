package help;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class help extends JFrame {
	JFrame login;
	
	Border border = BorderFactory.createLineBorder(Color.BLUE);
	JPanel searchPatient;
	JTextField info;
	JTable table;
	JButton patientDelete;
	
	String[] column_headers = {"First","Mint","Last","DOB","SSN","Height","Weight","Blood Type","Department","Reason"};
	String[][] patients = {{"Daniel","A","Rodriguez","04/29/1994","6543219874","6ft 11in","235","A","ER","Broken Arm"}};

	public help() {
		login = new JFrame();
		login.setLayout(new FlowLayout());
		login.setVisible(true);
		login.setPreferredSize(new Dimension(800,600));
		login.setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		searchPatient = new JPanel();
		searchPatient.setBackground(Color.WHITE);
		searchPatient.setLayout(new GridBagLayout());
		
		login.add(searchPatient);
		
		
		GridBagConstraints z = new GridBagConstraints();
		
		z.gridy = 0;
		z.gridx = 0;
		
		table = new JTable(patients, column_headers);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane js = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		table.setRowSelectionAllowed(true);
		
		
		patientDelete = new JButton("Delete");
		z.gridy++;
		
		searchPatient.add(patientDelete, z);
		searchPatient.add(js,z);
		login.pack();
		
	}

	public static void main(String args[]) {

		new help();

	}

}
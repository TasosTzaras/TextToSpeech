package windowPack;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Window {

	private JFrame frmWefwef;
	static String openDocName;
	public static String docName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmWefwef.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWefwef = new JFrame();
		frmWefwef.setTitle("Text2Speech");
		frmWefwef.setBounds(100, 100, 731, 440);
		frmWefwef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWefwef.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose one to proceed");
		lblNewLabel.setBounds(287, 11, 234, 46);
		frmWefwef.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Open");
		lblNewLabel_1.setBounds(88, 197, 58, 23);
		frmWefwef.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edit");
		lblNewLabel_2.setBounds(317, 206, 46, 14);
		frmWefwef.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Create");
		lblNewLabel_3.setBounds(552, 206, 46, 14);
		frmWefwef.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Document");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Open x = new Open();
				x.OpenScreen();
				try{
					FileReader fr=new FileReader(openDocName);
					docName = Open.docName;
					System.out.println(docName);
				}catch (FileNotFoundException o) {
					o.printStackTrace();
				} 
			}
		});
		btnNewButton.setBounds(33, 231, 147, 23);
		frmWefwef.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Document");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit x = new Edit();
				x.EditScreen();
				try{
					FileReader fr=new FileReader(openDocName.toString());
				}catch (FileNotFoundException o) {
					o.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(250, 231, 157, 23);
		frmWefwef.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Document");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Create x = new Create();
				x.CreateScreen();
				try{
					FileReader fr=new FileReader(openDocName.toString());
				}catch (FileNotFoundException o) {
					o.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(501, 231, 157, 23);
		frmWefwef.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Window.class.getResource("/play__1590165490_25273__1590165490_72565.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayButton x = new PlayButton();
				x.PlayButtonScreen();
				
			}
		});
		btnNewButton_3.setBounds(317, 325, 35, 31);
		frmWefwef.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("Play Document");
		lblNewLabel_4.setBounds(292, 300, 138, 14);
		frmWefwef.getContentPane().add(lblNewLabel_4);
	}
}
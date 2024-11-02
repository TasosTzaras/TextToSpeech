package windowPack;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import commands.EditDocument;

import java.awt.event.KeyAdapter;


public class Edit {

	private JFrame frmOpenDocument;
	public static JTextField openDocName; 
	public static String docName = "";


     
	/**
	 * Launch the application.
	 */
	public static void EditScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit window = new Edit();
					window.frmOpenDocument.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOpenDocument = new JFrame();
		frmOpenDocument.setTitle("Edit Document");
		frmOpenDocument.setBounds(100, 100, 450, 300);
		frmOpenDocument.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Give Doc Name");
		lblNewLabel.setBounds(169, 27, 113, 25);
		frmOpenDocument.getContentPane().add(lblNewLabel);
		
		openDocName = new JTextField();
		openDocName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		            System.out.println("pathsa enter");
		            typeenEdit x = new typeenEdit();
					x.selectencode();
				}
			}
		});
		openDocName.setToolTipText("");
		openDocName.setBounds(10, 93, 414, 28);
		frmOpenDocument.getContentPane().add(openDocName);
		openDocName.setColumns(10);
		
		JButton btn2 = new JButton("Next");
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (btn2.isEnabled()) {
		            System.out.println("Add Button is pressed");
		            openDocName.setVisible(true);
		            docName = openDocName.getText();
		    		typeenEdit x = new typeenEdit();
					x.selectencode();
					EditDocument y = new EditDocument();
					y.actionPerformed(e);
		        }
			}
		});
		btn2.setBounds(335, 227, 89, 23);
		frmOpenDocument.getContentPane().add(btn2);
	}
}


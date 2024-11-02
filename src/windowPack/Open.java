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

import commands.OpenDocument;

import java.awt.event.KeyAdapter;


public class Open {

	private JFrame frmOpenDocument;
	static JTextField openDocName;
	public static String docName;
	
	
	/**
	 * Launch the application.
	 */
	public static void OpenScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Open window = new Open();
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
	public Open() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOpenDocument = new JFrame();
		frmOpenDocument.setTitle("Open Document");
		frmOpenDocument.setBounds(100, 100, 450, 300);
		frmOpenDocument.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Give Doc Name");
		lblNewLabel.setBounds(169, 27, 113, 25);
		frmOpenDocument.getContentPane().add(lblNewLabel);
		
		openDocName = new JTextField();
		openDocName.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		            System.out.println("pathsa enter");
		            openDocName.setVisible(true);
		            docName = openDocName.getText();
		            typeenOpen x = new typeenOpen();
					x.selectencode();
					OpenDocument y = new OpenDocument();
					try {
						y.actionPerformed(e);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		openDocName.setToolTipText("");
		openDocName.setBounds(10, 93, 414, 28);
		frmOpenDocument.getContentPane().add(openDocName);
		openDocName.setColumns(10);
		
		JButton btn = new JButton("Next");
		btn.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				if (btn.isEnabled()) {
		            System.out.println("Add Button is pressed");
		            openDocName.setVisible(true);
		            docName = openDocName.getText();
		    		typeenOpen x = new typeenOpen();
					x.selectencode();
					OpenDocument y = new OpenDocument();
					try {
						y.actionPerformed(e);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
		        }
				
			}
		});
		btn.setBounds(335, 227, 89, 23);
		frmOpenDocument.getContentPane().add(btn);
	}
}


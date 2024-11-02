package windowPack;

import java.awt.EventQueue;
import java.io.File; 
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

import commands.OpenDocument;
import encodingstrategies.AtBashEncoding;
import encodingstrategies.Rot13Encoding;
import text2speechapis.FakeTextToSpeechAPI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class typeenOpen {

	private JFrame frmTypeOfEncode;
	private JRadioButton varrot13;
	private JRadioButton varatbash;
	private JRadioButton varother;
	private int flag = -1;
	
	
	/**
	 * Launch the application.
	 */
	public static void selectencode() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					typeenOpen window = new typeenOpen();
					window.frmTypeOfEncode.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public typeenOpen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTypeOfEncode = new JFrame();
		frmTypeOfEncode.setTitle("Type of Encode");
		frmTypeOfEncode.setBounds(100, 100, 450, 300);
		frmTypeOfEncode.getContentPane().setLayout(null);
		
		varrot13 = new JRadioButton("Rot13");
		varrot13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(varrot13.isSelected()) {
					varatbash.setSelected(false);
					varother.setSelected(false);
				}
				flag = 0;

			}
		});
		varrot13.setBounds(55, 31, 109, 23);
		frmTypeOfEncode.getContentPane().add(varrot13);
		
		varatbash = new JRadioButton("Atbash");
		varatbash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(varatbash.isSelected()) {
					varrot13.setSelected(false);
					varother.setSelected(false);
				}
				flag = 1 ;
			}
		});
		varatbash.setBounds(55, 88, 109, 23);
		frmTypeOfEncode.getContentPane().add(varatbash);
		
		varother = new JRadioButton("No Encode");
		varother.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(varother.isSelected()) {
					varrot13.setSelected(false);
					varatbash.setSelected(false);
				}
				flag = 2; 
			}
		});
		varother.setBounds(55, 145, 109, 23);
		frmTypeOfEncode.getContentPane().add(varother);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				System.out.print(Open.docName + " with");
				if(flag == 0) {
					System.out.println(" rot13");
					Rot13Encoding z = new Rot13Encoding();
					z.encode(Open.docName);

				}
				if(flag == 1) {
					System.out.println(" atbash");
					AtBashEncoding x = new AtBashEncoding();
					x.encode(Open.docName);
				}
				else if (flag == 2) {
					System.out.println("out encode");
				}
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		frmTypeOfEncode.getContentPane().add(btnNewButton);
	}
}
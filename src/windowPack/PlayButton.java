package windowPack;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import text2speechapis.FakeTextToSpeechAPI;
import text2speechapis.FreeTTSAdapter;

public class PlayButton {

	private JFrame frame;
	private JTextField textField;
	private String finalD;

	/**
	 * Launch the application.
	 */
	public static void PlayButtonScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayButton window = new PlayButton();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlayButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                                    Give the document you want to hear!");
		lblNewLabel.setBounds(10, 11, 414, 35);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 83, 414, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finalD = textField.getText();
				FakeTextToSpeechAPI x = new FakeTextToSpeechAPI();
				x.Arxeio(finalD);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(PlayButton.class.getResource("/play1..png")));
		btnNewButton.setBounds(181, 154, 80, 65);
		frame.getContentPane().add(btnNewButton);
	}
}

package com.ecetech.b2.handle.gui;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

import com.ecetech.b2.handle.gui.GUI_home;

public class connexion {

	private JFrame frame;
	private JTextField textField;
	protected String a;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	

	/**
	 * Create the application.
	 */
	public connexion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elian\\git\\Handle\\handle\\img\\logo handle.PNG"));
		frame.setBounds(100, 100, 435, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 102));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBackground(new Color(0, 102, 102));
		textField.setBounds(184, 143, 210, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\lock_100px.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(25, 212, 100, 109);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\customer_100px.png"));
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setBounds(25, 102, 100, 109);
		panel.add(label);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.setForeground(new Color(255, 255, 255));
		btnSignIn.setBackground(new Color(0, 102, 102));
		btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSignIn.setBounds(135, 350, 177, 35);
		panel.add(btnSignIn);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblLogin.setBounds(146, 24, 147, 77);
		panel.add(lblLogin);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBackground(new Color(0, 102, 102));
		passwordField.setBounds(184, 271, 210, 34);
		panel.add(passwordField);
		
		/*test commit */
		
		btnSignIn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed (ActionEvent e) {
				if(e.getSource()== btnSignIn) {
					String a = textField.getText().trim();
					String b = passwordField.getText().trim();
					if (a.equals("elian") && b.equals("1234"))
					{
						JOptionPane.showMessageDialog(null, "Connexion reussi");
						connexion.setVisible(false);
						GUI_home fen = new GUI_home();
						fen.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Mauvais identifiant ou mot de passe");
					}
					
				}
			}


		});
	}

	public static void main(String[] args) throws IOException {
		File file = new File("D://Users//elian//Desktop/fichier.txt");
		if(!file.exists()) 
		{
			try {
				file.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		else
		{
			try {
				InputStream ips=new FileInputStream(file); 
				InputStreamReader ipsr=new InputStreamReader(ips);
				BufferedReader br=new BufferedReader(ipsr);
				String ligne;
				
				while ((ligne=br.readLine())!=null){
					if (ligne.contains("elian"))
					{
						System.out.println("Connexion reussi");
					}
				}
				br.close(); 
			}		
			catch (Exception e){
				System.out.println(e.toString());
			}
		}
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					connexion window = new connexion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

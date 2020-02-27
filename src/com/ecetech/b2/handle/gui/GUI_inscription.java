package com.ecetech.b2.handle.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import com.ecetech.b2.handle.beans.Session;
import com.ecetech.b2.handle.utils.XMLProcessing;

public class GUI_inscription extends JFrame {

	private JPanel contentPane;
	private JTextField text_passwordField;
	private JTextField textField_username;
	int xx,xy;
	public JFrame frame;
	private JPasswordField passwordField_1;
	private JTextField text_email;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_inscription frame = new GUI_inscription();
					frame.setUndecorated(true);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_inscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel north = new JPanel();
		north.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		north.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent f) {
				int x = f.getXOnScreen();
				int y = f.getYOnScreen();
				GUI_inscription.this.setLocation(x - xx,y -  xy);
			}
		});
		north.setBackground(new Color(0, 128, 128));
		north.setBounds(0, 0, 515, 65);
		contentPane.add(north);
		north.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("Inscription");
		lblLoginForm.setForeground(new Color(240, 248, 255));
		lblLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLoginForm.setBounds(27, 0, 191, 65);
		north.add(lblLoginForm);
		
		JButton fermer = new JButton("");//
		fermer.setBackground(new Color(255, 165, 0));
		fermer.setIcon(new ImageIcon(GUI_inscription.class.getResource("/img/close.png")));
		fermer.setBounds(441, 10, 40, 45);
		fermer.setContentAreaFilled(false);
		fermer.setOpaque(false);
		fermer.setBorderPainted(false);
		north.add(fermer);
		
		JButton Reduire = new JButton("");
		Reduire.setIcon(new ImageIcon(GUI_inscription.class.getResource("/img/icons8-fl\u00E8che-r\u00E9duire-48.png")));
		Reduire.setBounds(378, 10, 40, 45);
		Reduire.setContentAreaFilled(false);
		Reduire.setOpaque(false);
		Reduire.setBorderPainted(false);
		north.add(Reduire);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(0, 61, 515, 578);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		text_passwordField = new JPasswordField();
		text_passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_passwordField.setColumns(10);
		text_passwordField.setBackground(new Color(144, 238, 144));
		text_passwordField.setBounds(202, 243, 244, 35);
		panel_1.add(text_passwordField);
		
		textField_username = new JTextField();
		textField_username.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_username.setColumns(10);
		textField_username.setBackground(new Color(144, 238, 144));
		textField_username.setBounds(202, 179, 244, 35);
		panel_1.add(textField_username);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(240, 255, 240));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPassword.setBounds(60, 243, 129, 35);
		panel_1.add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(240, 255, 240));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblUsername.setBounds(60, 179, 129, 35);
		panel_1.add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GUI_connexion.class.getResource("/img/logo handle.PNG")));
		lblNewLabel.setBounds(184, 10, 122, 150);
		panel_1.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(240, 255, 240));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblEmail.setBounds(60, 376, 129, 35);
		panel_1.add(lblEmail);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField_1.setColumns(10);
		passwordField_1.setBackground(new Color(144, 238, 144));
		passwordField_1.setBounds(202, 306, 244, 35);
		panel_1.add(passwordField_1);
		
		JLabel lblConfirmPwd = new JLabel("Confirm:");
		lblConfirmPwd.setForeground(new Color(240, 255, 240));
		lblConfirmPwd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConfirmPwd.setBounds(60, 306, 129, 35);
		panel_1.add(lblConfirmPwd);
		
		text_email = new JTextField();
		text_email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_email.setColumns(10);
		text_email.setBackground(new Color(144, 238, 144));
		text_email.setBounds(202, 376, 244, 35);
		panel_1.add(text_email);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(245, 245, 245));
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(71, 432, 163, 35);
		panel_1.add(btnCancel);
		
		JButton btnLogin = new JButton("S'inscrire");
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setForeground(new Color(245, 255, 250));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(275, 432, 163, 35);
		panel_1.add(btnLogin);
		
		JButton btnInscription = new JButton("Retour Login");
		btnInscription.setForeground(new Color(245, 245, 245));
		btnInscription.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnInscription.setBackground(new Color(0, 139, 139));
		btnInscription.setBounds(173, 477, 163, 35);
		panel_1.add(btnInscription);
		
		fermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_inscription.this.dispose();
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_inscription.this.dispose();
			}
		});
		
		Reduire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(GUI_inscription.ICONIFIED);
			}
		});
		
		btnInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_inscription.this.dispose();
				GUI_connexion f = new GUI_connexion();
				f.setUndecorated(true);
				f.setVisible(true);
			}
		});
		
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed (ActionEvent e) {
				if(e.getSource()== btnLogin) {
					String a = textField_username.getText().trim();
					String b = text_passwordField.getText().trim();
					String c = text_email.getText().trim();
					Session newS = new Session(a,b,c);
					try {
						XMLProcessing.createNodeAndNewXMLFile("file_sessions.xml",newS);
						XMLProcessing.createNodeInExistingXMLFile("file_sessions.xml",newS);
					} catch (ParserConfigurationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (TransformerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SAXException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
				}
			}


		});
	}
}

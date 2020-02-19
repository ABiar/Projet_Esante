package com.ecetech.b2.handle.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

public class GUI_connexion extends JFrame {
	
	private JPanel contentPane;
	public JButton close;
	int xx,xy;
	private JTextField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_connexion frame1 = new GUI_connexion();
					frame1.setUndecorated(true);
					frame1.setVisible(true);
					frame1.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_connexion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 489);
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
				GUI_connexion.this.setLocation(x - xx,y -  xy);
			}
		});
		north.setBackground(new Color(0, 128, 128));
		north.setBounds(0, 0, 515, 65);
		contentPane.add(north);
		north.setLayout(null);
		
		JButton fermer = new JButton("");//
		fermer.setBackground(new Color(255, 165, 0));
		fermer.setIcon(new ImageIcon(GUI_connexion.class.getResource("/img/close.png")));
		fermer.setBounds(441, 10, 40, 45);
		fermer.setContentAreaFilled(false);
		fermer.setOpaque(false);
		fermer.setBorderPainted(false);
		north.add(fermer);
		
		JButton Reduire = new JButton("");
		Reduire.setIcon(new ImageIcon(GUI_connexion.class.getResource("/img/icons8-fl\u00E8che-r\u00E9duire-48.png")));
		Reduire.setBounds(378, 10, 40, 45);
		Reduire.setContentAreaFilled(false);
		Reduire.setOpaque(false);
		Reduire.setBorderPainted(false);
		north.add(Reduire);
		
		JLabel lblLoginForm = new JLabel("Login Form");
		lblLoginForm.setForeground(new Color(240, 248, 255));
		lblLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLoginForm.setBounds(27, 0, 191, 65);
		north.add(lblLoginForm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(0, 64, 515, 457);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(240, 255, 240));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPassword.setBounds(60, 249, 129, 35);
		panel_1.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBackground(new Color(144, 238, 144));
		passwordField.setBounds(202, 249, 244, 35);
		panel_1.add(passwordField);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(144, 238, 144));
		textField.setBounds(202, 179, 244, 35);
		panel_1.add(textField);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(240, 255, 240));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblUsername.setBounds(60, 179, 129, 35);
		panel_1.add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GUI_connexion.class.getResource("/img/logo handle.PNG")));
		lblNewLabel.setBounds(184, 10, 122, 150);
		panel_1.add(lblNewLabel);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(245, 245, 245));
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(67, 313, 163, 35);
		panel_1.add(btnCancel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setForeground(new Color(245, 255, 250));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(271, 313, 163, 35);
		panel_1.add(btnLogin);
		
		JButton btnInscription = new JButton("Inscription");
		btnInscription.setForeground(new Color(245, 245, 245));
		btnInscription.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnInscription.setBackground(new Color(0, 139, 139));
		btnInscription.setBounds(169, 358, 163, 35);
		panel_1.add(btnInscription);
		
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed (ActionEvent e) {
				if(e.getSource()== btnLogin) {
					String a = textField.getText().trim();
					String b = passwordField.getText().trim();
					if (a.equals("elian") && b.equals("1234"))
					{
						JOptionPane.showMessageDialog(null, "Connexion reussi");
						GUI_connexion.this.dispose();
						GUI_home window = new GUI_home();
						window.framebis.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Mauvais identifiant ou mot de passe");
					}
					
				}
			}


		});
		
		fermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_connexion.this.dispose();
			}
		});
		
		Reduire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(GUI_connexion.ICONIFIED);
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_connexion.this.dispose();
			}
		});
		
		btnInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_connexion.this.dispose();
				GUI_inscription f = new GUI_inscription();
				f.setUndecorated(true);
				f.setVisible(true);
			}
		});
	}
}

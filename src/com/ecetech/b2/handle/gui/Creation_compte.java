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
import java.awt.Window;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Creation_compte extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creation_compte frame = new Creation_compte();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Creation_compte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 509);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 102));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInscription = new JLabel("Inscription");
		lblInscription.setBounds(100, 11, 224, 45);
		lblInscription.setForeground(Color.WHITE);
		lblInscription.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblInscription.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblInscription);
		
		textField = new JTextField();
		textField.setBounds(27, 109, 171, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 161, 224, 20);
		contentPane.add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(235, 109, 171, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(100, 320, 224, 20);
		contentPane.add(textField_5);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(86, 83, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setBounds(301, 84, 46, 14);
		contentPane.add(lblPrnom);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(197, 136, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setBounds(186, 188, 46, 14);
		contentPane.add(lblMotDePasse);
		
		JRadioButton rdbtnHomme = new JRadioButton("Homme");
		rdbtnHomme.setBounds(217, 240, 109, 23);
		contentPane.add(rdbtnHomme);
		
		JRadioButton rdbtnFemme = new JRadioButton("Femme");
		rdbtnFemme.setBounds(100, 240, 109, 23);
		contentPane.add(rdbtnFemme);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 213, 224, 20);
		contentPane.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(135, 289, 34, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(186, 289, 34, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(235, 289, 78, 20);
		contentPane.add(comboBox_2);
	}
}

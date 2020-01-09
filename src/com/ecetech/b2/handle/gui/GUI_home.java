package com.ecetech.b2.handle.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

public class GUI_home {

	public JFrame framebis;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	
	/* test commentaire  test*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_home window = new GUI_home();
					window.framebis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framebis = new JFrame();
		framebis.setBounds(100, 100, 1277, 682);
		framebis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framebis.setResizable(false);
		
		JPanel panel = new JPanel();
		framebis.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(258, 0, 1005, 103);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(888, 37, 107, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Users\\elian\\eclipse\\handle\\img\\icons8_search_32px.png"));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\icons8_search_32px.png"));
		lblNewLabel_2.setBounds(848, 0, 157, 97);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(new Color(32, 178, 170));
		panel_2.setBounds(0, 0, 259, 645);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\logo handle.PNG"));
		lblNewLabel.setBounds(58, 0, 122, 155);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Accueil");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\icons8_home_50px.png"));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(42, 206, 167, 48);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblProfil = new JLabel("Profil");
		lblProfil.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\icons8_gender_neutral_user_50px.png"));
		lblProfil.setVerticalAlignment(SwingConstants.BOTTOM);
		lblProfil.setForeground(Color.WHITE);
		lblProfil.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblProfil.setBounds(42, 282, 167, 48);
		panel_2.add(lblProfil);
		
		JLabel lblExamen = new JLabel("Examen");
		lblExamen.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\icons8_medical_doctor_50px.png"));
		lblExamen.setVerticalAlignment(SwingConstants.BOTTOM);
		lblExamen.setForeground(Color.WHITE);
		lblExamen.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblExamen.setBounds(42, 356, 178, 48);
		panel_2.add(lblExamen);
		
		JLabel lblDiagnostique = new JLabel("Diagnostique");
		lblDiagnostique.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\icons8_combo_chart_50px.png"));
		lblDiagnostique.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDiagnostique.setForeground(Color.WHITE);
		lblDiagnostique.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDiagnostique.setBounds(10, 432, 268, 48);
		panel_2.add(lblDiagnostique);
		
		JLabel lblAide = new JLabel("Aide");
		lblAide.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\icons8_help_50px.png"));
		lblAide.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAide.setForeground(Color.WHITE);
		lblAide.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAide.setBounds(42, 511, 178, 48);
		panel_2.add(lblAide);
		
		JButton accueilbutton = new JButton("");
		accueilbutton.setForeground(SystemColor.desktop);
		accueilbutton.setBackground(new Color(255, 255, 255));
		accueilbutton.setBounds(42, 210, 167, 44);
		accueilbutton.setOpaque(false);
		accueilbutton.setContentAreaFilled(false);
		accueilbutton.setBorderPainted(false);
		panel_2.add(accueilbutton);
		
		JButton profilbutton = new JButton("");
		profilbutton.setOpaque(false);
		profilbutton.setForeground(Color.BLACK);
		profilbutton.setContentAreaFilled(false);
		profilbutton.setBorderPainted(false);
		profilbutton.setBackground(Color.WHITE);
		profilbutton.setBounds(42, 282, 167, 44);
		panel_2.add(profilbutton);
		
		JButton examenbutton = new JButton("");
		examenbutton.setOpaque(false);
		examenbutton.setForeground(Color.BLACK);
		examenbutton.setContentAreaFilled(false);
		examenbutton.setBorderPainted(false);
		examenbutton.setBackground(Color.WHITE);
		examenbutton.setBounds(42, 356, 167, 44);
		panel_2.add(examenbutton);
		
		JButton diagnostiquebutton = new JButton("");
		diagnostiquebutton.setOpaque(false);
		diagnostiquebutton.setForeground(Color.BLACK);
		diagnostiquebutton.setContentAreaFilled(false);
		diagnostiquebutton.setBorderPainted(false);
		diagnostiquebutton.setBackground(Color.WHITE);
		diagnostiquebutton.setBounds(13, 432, 236, 44);
		panel_2.add(diagnostiquebutton);
		
		JButton aidebutton = new JButton("");
		aidebutton.setOpaque(false);
		aidebutton.setForeground(Color.BLACK);
		aidebutton.setContentAreaFilled(false);
		aidebutton.setBorderPainted(false);
		aidebutton.setBackground(Color.WHITE);
		aidebutton.setBounds(42, 515, 136, 44);
		panel_2.add(aidebutton);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(258, 99, 1005, 546);
		panel.add(layeredPane);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 255, 153));
		panel_5.setBounds(0, 0, 1005, 546);
		layeredPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblExamen_1 = new JLabel("EXAMEN");
		lblExamen_1.setForeground(new Color(0, 51, 51));
		lblExamen_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblExamen_1.setBounds(440, 36, 185, 47);
		panel_5.add(lblExamen_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 255, 153));
		panel_4.setForeground(new Color(153, 255, 153));
		panel_4.setBounds(0, 0, 1005, 546);
		layeredPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblProfil_1 = new JLabel("PROFIL");
		lblProfil_1.setForeground(new Color(0, 51, 51));
		lblProfil_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblProfil_1.setBounds(429, 28, 185, 47);
		panel_4.add(lblProfil_1);
		
		JLabel lblNewLabel_5 = new JLabel("IDENTIFIANT");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5.setBounds(157, 111, 141, 47);
		panel_4.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 157, 194, 19);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(157, 232, 194, 19);
		panel_4.add(textField_2);
		
		JLabel lblMotDePasse = new JLabel("MOT DE PASSE");
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblMotDePasse.setBounds(157, 186, 162, 47);
		panel_4.add(lblMotDePasse);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(157, 307, 194, 19);
		panel_4.add(textField_3);
		
		JLabel lblPrenom = new JLabel("EMAIL");
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPrenom.setBounds(157, 261, 141, 47);
		panel_4.add(lblPrenom);
		
		JLabel lblAge_1 = new JLabel("AGE");
		lblAge_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblAge_1.setBounds(587, 261, 141, 47);
		panel_4.add(lblAge_1);
		
		JLabel lblAge = new JLabel("PRENOM");
		lblAge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblAge.setBounds(587, 111, 141, 47);
		panel_4.add(lblAge);
		
		JLabel lblProfession = new JLabel("NOM");
		lblProfession.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblProfession.setBounds(587, 186, 162, 47);
		panel_4.add(lblProfession);
		
		JLabel lblProfession_1 = new JLabel("PROFESSION");
		lblProfession_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblProfession_1.setBounds(587, 336, 141, 47);
		panel_4.add(lblProfession_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(587, 157, 194, 19);
		panel_4.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(587, 232, 194, 19);
		panel_4.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(587, 307, 194, 19);
		panel_4.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(587, 382, 194, 19);
		panel_4.add(textField_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 255, 153));
		panel_3.setBounds(0, 0, 1005, 546);
		layeredPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("BIENVENUE");
		lblNewLabel_3.setForeground(new Color(0, 51, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_3.setBounds(417, 29, 252, 47);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\elian\\git\\Handle\\handle\\img\\corpsbioflash.png"));
		lblNewLabel_4.setBounds(451, 109, 160, 362);
		panel_3.add(lblNewLabel_4);
		
		accueilbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		profilbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		examenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		diagnostiquebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_6);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		aidebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_7);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
	}




}
 

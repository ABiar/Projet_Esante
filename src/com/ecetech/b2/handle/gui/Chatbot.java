package com.ecetech.b2.handle.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JScrollPane;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class Chatbot extends JFrame {

	private JPanel contentPane;
	int xx, xy;
	private JTextField field;
	private static int level = 1;
	private static Chatbot frame;
	private static JTextArea textAreaA;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Chatbot(textAreaA);
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
	public Chatbot(JTextArea textA) {
		textAreaA = textA;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 502);
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
				Chatbot.this.setLocation(x - xx, y - xy);
			}
		});
		north.setBackground(new Color(0, 128, 128));
		north.setBounds(0, 0, 640, 65);
		contentPane.add(north);
		north.setLayout(null);

		JButton fermer = new JButton("");//
		fermer.setBackground(new Color(255, 165, 0));
		fermer.setIcon(new ImageIcon(Chatbot.class.getResource("/img/close.png")));
		fermer.setBounds(527, 10, 40, 45);
		fermer.setContentAreaFilled(false);
		fermer.setOpaque(false);
		fermer.setBorderPainted(false);
		north.add(fermer);

		JButton Reduire = new JButton("");
		Reduire.setIcon(new ImageIcon(Chatbot.class.getResource("/img/icons8-fl\u00E8che-r\u00E9duire-48.png")));
		Reduire.setBounds(477, 10, 40, 45);
		Reduire.setContentAreaFilled(false);
		Reduire.setOpaque(false);
		Reduire.setBorderPainted(false);
		north.add(Reduire);

		JLabel lblNewLabel = new JLabel("ChatBot");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(10, 0, 123, 65);
		north.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setForeground(SystemColor.textHighlight);
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblQuestion.setBounds(28, 64, 411, 52);
		contentPane.add(lblQuestion);

		JLabel lblVotreRponse = new JLabel("Votre R\u00E9ponse");
		lblVotreRponse.setForeground(SystemColor.textHighlight);
		lblVotreRponse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVotreRponse.setBounds(27, 346, 411, 52);
		contentPane.add(lblVotreRponse);
		
		JLabel image1 = new JLabel("");
		image1.setBounds(449, 75, 144, 116);
		contentPane.add(image1);
		
		JLabel image2 = new JLabel("");
		image2.setBounds(449, 220, 144, 116);
		contentPane.add(image2);
		
		JLabel image3 = new JLabel("");
		image3.setBounds(449, 346, 144, 116);
		contentPane.add(image3);

		field = new JTextField();
		field.setBounds(28, 400, 411, 36);
		contentPane.add(field);
		field.setColumns(10);

		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(Chatbot.class.getResource("/img/corpsbioflash.png")));
		image.setBounds(449, 75, 154, 361);
		contentPane.add(image);

		JTextArea txt = new JTextArea();
		txt.setBounds(10, 0, 411, 210);
		contentPane.add(txt);
		txt.append("Alvi= Pouvez vous réaliser ce mouvement ?\n");

		JScrollPane pane = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pane.setBounds(28, 126, 411, 210);
		getContentPane().add(pane);

		
		/// Chatbot pour le diagnostic
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reponse = field.getText();
				txt.append("You = " + reponse + "\n");
				field.setText("");
				switch (level) {
				case 1:
					if (reponse.toLowerCase().equals("oui")) {
						txt.append("Alvi = Observez vous la présence d'un Oedeme de ce type ?\n");
						image.setIcon(new ImageIcon(GUI_home.class.getResource("/img/douleur-poignet-200x300.jpg")));
						level = 2;
					} else if (reponse.toLowerCase().equals("non")) {
						txt.append("Alvi = Mince ! Nous ne pouvons pas vous aider \n");
						frame.dispose();
						try {
							GUI_home window = new GUI_home();
							window.framebis.setVisible(true);
						} catch (Exception exp) {
							exp.printStackTrace();
						}
					}
					else if(reponse.contentEquals("oui")==false || reponse.contentEquals("non")==false ) {
						txt.append("Alvi = Mince ! mauvaise saisie veuillez recommencer !\n");
					}
					break;
				case 2:
					if (reponse.toLowerCase().equals("oui")) {
						txt.append("Alvi = Observez vous la présence d'un de ces Sympthomes ? \n");
						txt.append("Alvi =  Entrez : /1/ pour Difformité \n");
						txt.append("Alvi =  Entrez : /2/ pour Bosse/Nodule \n");
						txt.append("Alvi =  Entrez : /3/ pour Zone Rouge/Chaude \n");
						txt.append("Alvi =  Entrez : 'non' pour presence d'aucun de ces Sympthomes \n");
						image1.setVisible(true);
						image2.setVisible(true);
						image3.setVisible(true);
						image1.setIcon(new ImageIcon(GUI_home.class.getResource("/img/difformite.png")));
						image2.setIcon(new ImageIcon(GUI_home.class.getResource("/img/nodule.png")));
						image3.setIcon(new ImageIcon(GUI_home.class.getResource("/img/rouge.png")));
						image.setVisible(false);
						level = 3;
					} else if (reponse.toLowerCase().equals("non")) {
						txt.append("Alvi = Mince ! Recommencons notre test ! \n");
						image.setIcon(new ImageIcon(GUI_home.class.getResource("/img/corpsbioflash.png")));	
						image.setVisible(true);
						level = 1;
					}
					break;
				case 3:
					if (reponse.toLowerCase().equals("1")) {
						txt.append("Alvi = avez vous réaliser une chuté recemment ? \n");
						level = 4;
					}
					else if (reponse.toLowerCase().equals("2")) {
						txt.append("Alvi = ressenter vous une sensation de chaleur ? \n");
						level = 5;
					}
					else if (reponse.toLowerCase().equals("3")) {
						txt.append("Alvi = ressenter vous une certaine fatigue ? \n");
						level = 7;
					}
					else if (reponse.toLowerCase().equals("non")) {
						txt.append("Alvi = Mince ! Recommencons notre test ! \n");
						image.setIcon(new ImageIcon(GUI_home.class.getResource("/img/corpsbioflash.png")));
						image1.setVisible(false);
						image2.setVisible(false);
						image3.setVisible(false);
						image.setVisible(true);
						level = 1;
					}
					else{
						txt.append("Alvi = Mince ! mauvaise saisie veuillez recommencer !\n");
						level = 3;
					}
					break;
				case 4:
					if (reponse.toLowerCase().equals("oui")) {
						txt.append("Alvi = Il s'agit certainement d'une fracture ! \n");
						textAreaA.append("Alvi = Il s'agit certainement d'une fracture ! \n");
						image1.setVisible(false);
						image2.setVisible(false);
						image3.setVisible(false);
					} else if (reponse.toLowerCase().equals("non")) {
						txt.append("Alvi = Mince ! Recommencons notre test ! \n");
						image.setIcon(new ImageIcon(GUI_home.class.getResource("/img/corpsbioflash.png")));
						image1.setVisible(false);
						image2.setVisible(false);
						image3.setVisible(false);
						image.setVisible(true);
						level = 1;
					}
					break;
				case 5:
					if (reponse.toLowerCase().equals("oui")) {
						txt.append("Alvi = Il s'agit certainement d'une tendinite ! \n");
					} else if (reponse.toLowerCase().equals("non")) {
						txt.append("Alvi = etes vous amener a realise le meme mouvement au cours d'une journée ? (sportif ou professionelle) \n");
						level = 6;
					}
					break;
				case 6:
					if (reponse.toLowerCase().equals("oui")) {
						txt.append("Alvi = Il s'agit certainement d'une entorse ! \n");
					} else if (reponse.toLowerCase().equals("non")) {
						txt.append("Alvi = Mince ! Recommencons notre test ! \n");
						image.setIcon(new ImageIcon(GUI_home.class.getResource("/img/corpsbioflash.png")));	
						image.setVisible(true);
						level = 1;
					}
					break;
				case 7:
					if (reponse.toLowerCase().equals("oui")) {
						txt.append("Alvi = Il s'agit certainement d'une polyarthrite ! \n");
					} else if (reponse.toLowerCase().equals("non")) {
						txt.append("Alvi = Il s'agit certainement d'une tendinite ! \n");
					}
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					break;
				}
			}
		});

		fermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chatbot.this.dispose();
			}
		});

		Reduire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(Chatbot.ICONIFIED);
			}
		});
	}
}

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
	int xx,xy;
	private JTextField field;
	private String question1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chatbot frame = new Chatbot();
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
	public Chatbot() {
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
				Chatbot.this.setLocation(x - xx,y -  xy);
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
		
		JScrollPane pane = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		pane.setBounds(28, 126, 411, 210);
		getContentPane().add(pane);
		
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reponse = field.getText();
				txt.append("You= "+reponse+"\n");
				field.setText("");
				if(reponse.toLowerCase().equals("oui")) {
					txt.append("Alvi = Observez vous la présence d'un Oedeme de ce type ?\n");
					image.setIcon(new ImageIcon(GUI_home.class.getResource("/img/close.png")));
					String reponse1 = field.getText();
					field.setText("");
					if(reponse1.toLowerCase().equals("oui")) {
						txt.append("Alvi = Observez vous la présence d'un de ces SYmpthomes\n");
					}
					else if(reponse1.toLowerCase().equals("non")) {
						txt.append("Alvi = Mince ! Et ce mouvement la pouvez vous le faire ? \n");
						mouvement1 f = new mouvement1();
						f.setUndecorated(true);
						f.setVisible(true);
					}
				}
				else if(reponse.toLowerCase().equals("non")) {
					txt.append("Bot = Mince ! Nous ne pouvons pas vous aider \n");
				}
				else {
					txt.append("Bot = Je ne vous ai pas compris \n");
					txt.append("Bot = Pouvez vous réaliser ce mouvement? \n");
				}
				
			}
		});
		
		
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

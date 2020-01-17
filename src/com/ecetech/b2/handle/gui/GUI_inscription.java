package com.ecetech.b2.handle.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class GUI_inscription extends JFrame {

	private JPanel contentPane;
	public JButton close;

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
		setBounds(100, 100, 519, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel north = new JPanel();
		north.setBackground(new Color(255, 165, 0));
		north.setBounds(0, 0, 548, 65);
		contentPane.add(north);
		north.setLayout(null);
		
		JButton fermer = new JButton("FERMER");
		fermer.setBounds(409, 10, 85, 21);
		north.add(fermer);
		
		JButton Reduire = new JButton("REDUIRE");
		Reduire.setBounds(314, 10, 85, 21);
		north.add(Reduire);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(0, 64, 567, 424);
		contentPane.add(panel_1);
		
		fermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_inscription.this.dispose();
			}
		});
		
		Reduire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(GUI_inscription.ICONIFIED);
			}
		});
	}
}

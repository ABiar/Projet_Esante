package com.ecetech.b2.handle.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class mouvement1 extends JFrame {

	private JPanel contentPane;
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mouvement1 frame = new mouvement1();
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
	public mouvement1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 502);
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
				mouvement1.this.setLocation(x - xx,y -  xy);
			}
		});
		north.setBackground(new Color(0, 128, 128));
		north.setBounds(0, 0, 640, 65);
		contentPane.add(north);
		north.setLayout(null);
		
		JButton fermer = new JButton("");//
		fermer.setBackground(new Color(255, 165, 0));
		fermer.setIcon(new ImageIcon(mouvement1.class.getResource("/img/close.png")));
		fermer.setBounds(527, 10, 40, 45);
		fermer.setContentAreaFilled(false);
		fermer.setOpaque(false);
		fermer.setBorderPainted(false);
		north.add(fermer);
		
		JButton Reduire = new JButton("");
		Reduire.setIcon(new ImageIcon(mouvement1.class.getResource("/img/icons8-fl\u00E8che-r\u00E9duire-48.png")));
		Reduire.setBounds(477, 10, 40, 45);
		Reduire.setContentAreaFilled(false);
		Reduire.setOpaque(false);
		Reduire.setBorderPainted(false);
		north.add(Reduire);
		
		fermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mouvement1.this.dispose();
			}
		});
		
		Reduire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(mouvement1.ICONIFIED);
			}
		});

	}

}

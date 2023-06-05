package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class GerirAtendente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerirAtendente frame = new GerirAtendente();
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
	public GerirAtendente() {
		setBounds(100, 100, 450, 300);

	}

}

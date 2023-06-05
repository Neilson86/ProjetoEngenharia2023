package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class GerirCurso extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerirCurso frame = new GerirCurso();
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
	public GerirCurso() {
		setBounds(100, 100, 450, 300);

	}

}

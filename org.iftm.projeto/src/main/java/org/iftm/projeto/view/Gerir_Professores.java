package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Gerir_Professores {

	private JFrame frmCoordenador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerir_Professores window = new Gerir_Professores();
					window.frmCoordenador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gerir_Professores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCoordenador = new JFrame();
		frmCoordenador.setFont(new Font("Dialog", Font.BOLD, 14));
		frmCoordenador.setTitle("SCHOOL ROBOTS");
		frmCoordenador.setBounds(100, 100, 450, 300);
		frmCoordenador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel IblGerirProfessores = new JLabel("COORDENADOR");
		IblGerirProfessores.setHorizontalAlignment(SwingConstants.CENTER);
		IblGerirProfessores.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmCoordenador.getContentPane().add(IblGerirProfessores, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frmCoordenador.getContentPane().add(panel, BorderLayout.CENTER);
	}

}

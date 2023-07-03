package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaConsultarCurso extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultarCurso frame = new TelaConsultarCurso();
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
	public TelaConsultarCurso() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblConsultarCurso = new JLabel("CONSULTAR CURSO");
		lblConsultarCurso.setBounds(0, 0, 438, 20);
		lblConsultarCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultarCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblConsultarCurso);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setBounds(0, 20, 438, 251);
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CURSOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(47, 37, 283, 22);
		painelCampos.add(comboBox);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(74, 124, 89, 23);
		painelCampos.add(btnNewButton);
		
		JButton btnComfirmar = new JButton("COMFIRMAR");
		btnComfirmar.setBounds(221, 124, 109, 23);
		painelCampos.add(btnComfirmar);

	}

}

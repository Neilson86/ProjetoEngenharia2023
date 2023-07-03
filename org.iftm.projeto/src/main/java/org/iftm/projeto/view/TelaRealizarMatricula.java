package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaRealizarMatricula extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRealizarMatricula frame = new TelaRealizarMatricula();
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
	public TelaRealizarMatricula() {
		setBounds(100, 100, 450, 300);
		
		JLabel lblRequererMatricula = new JLabel("REQUERER MATRICULA");
		lblRequererMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequererMatricula.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblRequererMatricula, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DISCIPLINAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		JComboBox RequererMatricula = new JComboBox();
		RequererMatricula.setBounds(47, 37, 283, 22);
		painelCampos.add(RequererMatricula);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(74, 124, 89, 23);
		painelCampos.add(btnNewButton);
		
		JButton btnComfirmar = new JButton("COMFIRMAR");
		btnComfirmar.setBounds(221, 124, 109, 23);
		painelCampos.add(btnComfirmar);

	}

}

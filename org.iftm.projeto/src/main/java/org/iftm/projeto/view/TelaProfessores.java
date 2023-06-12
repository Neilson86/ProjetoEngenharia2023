package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaProfessores extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProfessores frame = new TelaProfessores();
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
	public TelaProfessores() {
		setBounds(100, 100, 546, 387);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("PROFESSORES");
		lblTitulo.setBounds(0, 0, 534, 20);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblTitulo);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(null, "GERIR PROFESSORES", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(10, 33, 514, 315);
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(10, 26, 46, 14);
		painelCampos.add(lblNOME);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(92, 23, 271, 20);
		painelCampos.add(textField);
		
		JLabel lblCPF = new JLabel("CPF : ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCPF.setBounds(10, 60, 46, 14);
		painelCampos.add(lblCPF);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 57, 271, 20);
		painelCampos.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(161, 95, 202, 20);
		painelCampos.add(textField_2);
		
		JLabel lblDISCIPLINACADASTRADA = new JLabel("DISCIPLINA CADASTRADA : ");
		lblDISCIPLINACADASTRADA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDISCIPLINACADASTRADA.setBounds(10, 98, 141, 14);
		painelCampos.add(lblDISCIPLINACADASTRADA);
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSALVAR.setBounds(327, 241, 89, 23);
		painelCampos.add(btnSALVAR);
		
		JButton btnEDITAR = new JButton("EDITAR");
		btnEDITAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEDITAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEDITAR.setBounds(107, 241, 89, 23);
		painelCampos.add(btnEDITAR);
		
		JPanel panel = new JPanel();
		panel.setBounds(384, 37, 96, 93);
		painelCampos.add(panel);
		
		JLabel lblFoto = new JLabel("FOTO");
		lblFoto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setBounds(404, 14, 45, 13);
		painelCampos.add(lblFoto);

	}
}

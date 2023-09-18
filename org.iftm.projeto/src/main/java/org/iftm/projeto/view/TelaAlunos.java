package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAlunos extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlunos frame = new TelaAlunos();
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
	public TelaAlunos() {
		setBounds(100, 100, 557, 485);
		getContentPane().setLayout(null);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(null, "GERIR DADOS ALUNOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(10, 59, 514, 277);
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(10, 26, 46, 14);
		painelCampos.add(lblNOME);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(92, 23, 393, 20);
		painelCampos.add(textField);
		
		JLabel lblCPF = new JLabel("CPF : ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCPF.setBounds(10, 60, 46, 14);
		painelCampos.add(lblCPF);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 57, 393, 20);
		painelCampos.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 95, 383, 20);
		painelCampos.add(textField_2);
		
		JLabel lblEmail = new JLabel("E-MAIL : ");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmail.setBounds(10, 98, 141, 14);
		painelCampos.add(lblEmail);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO : ");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDataNascimento.setBounds(10, 146, 116, 14);
		painelCampos.add(lblDataNascimento);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(324, 143, 161, 20);
		painelCampos.add(textField_3);
		
		JLabel lblDataMatricula = new JLabel("DATA MATRICULA  : ");
		lblDataMatricula.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDataMatricula.setBounds(10, 190, 141, 14);
		painelCampos.add(lblDataMatricula);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(324, 187, 161, 20);
		painelCampos.add(textField_4);
		
		JLabel lblAlunos = new JLabel("ALUNOS");
		lblAlunos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlunos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlunos.setBounds(10, 10, 534, 20);
		getContentPane().add(lblAlunos);
		
		JButton btnEDITAR = new JButton("PESQUISAR");
		btnEDITAR.setBounds(70, 398, 101, 23);
		getContentPane().add(btnEDITAR);
		btnEDITAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.setBounds(406, 398, 89, 23);
		getContentPane().add(btnSALVAR);
		btnSALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnCADASTRAR = new JButton("CADASTRAR");
		btnCADASTRAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCADASTRAR.setBounds(226, 398, 109, 23);
		getContentPane().add(btnCADASTRAR);
		btnCADASTRAR.setFont(new Font("Tahoma", Font.PLAIN, 12));

	}
}

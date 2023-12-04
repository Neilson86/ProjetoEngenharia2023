package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import control.ProfessorControla;
import model.Professor;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaRealizarMatricula extends JInternalFrame {
	
	
	private JTextField textNome;
	private JTextField textCPF;

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
		
		JLabel lblRequererMatricula = new JLabel("REALIZAR MATRICULA");
		lblRequererMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequererMatricula.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblRequererMatricula, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DISCIPLINAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		JButton btnComfirmar = new JButton("COMFIRMAR");
		btnComfirmar.setBounds(274, 193, 109, 23);
		painelCampos.add(btnComfirmar);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(12, 32, 45, 13);
		painelCampos.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(79, 30, 338, 23);
		painelCampos.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPF.setBounds(12, 72, 45, 13);
		painelCampos.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(79, 70, 338, 19);
		painelCampos.add(textCPF);
		textCPF.setColumns(10);

	}
}

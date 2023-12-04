package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import control.ProfessorControla;
import model.Professor;

public class TelaProfessor extends JInternalFrame {
	private ProfessorControla controle = new ProfessorControla();
	Professor professor;
	
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textCodigo;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProfessor frame = new TelaProfessor();
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
	public TelaProfessor() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(null, "CADASTRAR PROFESSOR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(0, 27, 438, 244);
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(21, 34, 46, 14);
		painelCampos.add(lblNOME);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(60, 32, 332, 20);
		painelCampos.add(textNome);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCPF.setBounds(21, 118, 46, 14);
		painelCampos.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(60, 116, 332, 20);
		painelCampos.add(textCPF);
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSALVAR.setBounds(303, 192, 89, 23);
		painelCampos.add(btnSALVAR);
		
		JLabel lblCODIGO = new JLabel("CODIGO: ");
		lblCODIGO.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCODIGO.setBounds(21, 78, 60, 14);
		painelCampos.add(lblCODIGO);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(70, 72, 322, 20);
		painelCampos.add(textCodigo);
		
		JLabel lblSENHA = new JLabel("SENHA:");
		lblSENHA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSENHA.setBounds(21, 152, 46, 14);
		painelCampos.add(lblSENHA);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(60, 150, 332, 20);
		painelCampos.add(textSenha);
		
		JLabel lblTitulo = new JLabel("PROFESSOR");
		lblTitulo.setBounds(109, 10, 235, 20);
		getContentPane().add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));

	}
}

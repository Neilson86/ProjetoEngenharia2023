package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import control.AlunoControla;
import model.Aluno;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaAlunos extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtDataNascimento;
	private JTextField txtDataMatricula;
	private JLabel lblCodigo;
	
	private AlunoControla controle = new AlunoControla();
	Aluno aluno;

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
		setBounds(100, 100, 770, 485);
		getContentPane().setLayout(null);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(null, "GERIR DADOS ALUNOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(10, 59, 514, 277);
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(10, 53, 46, 14);
		painelCampos.add(lblNOME);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(92, 50, 393, 20);
		painelCampos.add(txtNome);
		
		JLabel lblCPF = new JLabel("CPF : ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCPF.setBounds(10, 87, 46, 14);
		painelCampos.add(lblCPF);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(92, 84, 393, 20);
		painelCampos.add(txtCpf);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(102, 122, 383, 20);
		painelCampos.add(txtEmail);
		
		JLabel lblEmail = new JLabel("E-MAIL : ");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmail.setBounds(10, 125, 141, 14);
		painelCampos.add(lblEmail);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO : ");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDataNascimento.setBounds(10, 173, 116, 14);
		painelCampos.add(lblDataNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(324, 170, 161, 20);
		painelCampos.add(txtDataNascimento);
		
		JLabel lblDataMatricula = new JLabel("DATA MATRICULA  : ");
		lblDataMatricula.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDataMatricula.setBounds(10, 217, 141, 14);
		painelCampos.add(lblDataMatricula);
		
		txtDataMatricula = new JTextField();
		txtDataMatricula.setColumns(10);
		txtDataMatricula.setBounds(324, 214, 161, 20);
		painelCampos.add(txtDataMatricula);
		
		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.setBounds(399, 244, 89, 23);
		painelCampos.add(btnSALVAR);
		btnSALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSALVAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblCodigo = new JLabel("");
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setForeground(Color.RED);
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCodigo.setBounds(403, 27, 82, 13);
		painelCampos.add(lblCodigo);
		
		JLabel lblAlunos = new JLabel("ALUNOS");
		lblAlunos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlunos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlunos.setBounds(10, 10, 534, 20);
		getContentPane().add(lblAlunos);
		
		final JButton btnEDITAR = new JButton("PESQUISAR");
		btnEDITAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer codigo= Integer.parseInt(JOptionPane.showInputDialog("Digite o código a ser pesquisado."));
				
				aluno = controle.buscarPorId(codigo);		
				if (aluno!=null) {
					lblCodigo.setText(aluno.getCodAluno().toString());
					txtNome.setText(aluno.getNome().toString());
					txtCpf.setText(aluno.getCpf().toString());
					txtEmail.setText(aluno.getEmail().toString());
					txtDataNascimento.setText(aluno.getDataNascimento().toString());
					txtDataMatricula.setText(aluno.getMatricula().toString());
					btnEDITAR.setEnabled(true);
				}else {
				JOptionPane.showMessageDialog(null, "Aluno não encontrado");
				}
				
			}
		});
		btnEDITAR.setBounds(528, 228, 101, 23);
		getContentPane().add(btnEDITAR);
		btnEDITAR.setFont(new Font("Tahoma", Font.PLAIN, 12));
	
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setEnabled(false);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aluno.setCpf(txtCpf.getText());
			}
		});
		btnAlterar.setBounds(528, 124, 101, 23);
		getContentPane().add(btnAlterar);
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluir.setBounds(528, 175, 101, 21);
		getContentPane().add(btnExcluir);
		
		JButton btnNOVO = new JButton("NOVO");
		btnNOVO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNOVO.setBounds(528, 76, 101, 21);
		getContentPane().add(btnNOVO);
		
		JButton btnSAIR = new JButton("SAIR");
		btnSAIR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSAIR.setBounds(528, 281, 101, 21);
		getContentPane().add(btnSAIR);

	}
}

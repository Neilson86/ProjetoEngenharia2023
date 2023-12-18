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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaAluno extends JInternalFrame {
	
	//atributos do projeto//
	private TelaAluno objeto;
	private AlunoControla controle = new AlunoControla();
	Aluno aluno;
	
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtDataNascimento;
	private JTextField txtDataMatricula;
	private JLabel lblCodigo;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerirDadosAlunos frame = new TelaGerirDadosAlunos();
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
	public TelaAluno() {
		setBounds(100, 100, 770, 485);
		getContentPane().setLayout(null);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(null, "CADASTRAR ALUNOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(10, 59, 514, 277);
		getContentPane().add(painelCampos);
		
		JLabel lblNOME = new JLabel("NOME : ");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(10, 53, 46, 14);
		painelCampos.add(lblNOME);
		
		txtNome = new JTextField();
		txtNome.setEnabled(false);
		txtNome.setColumns(10);
		txtNome.setBounds(92, 50, 393, 20);
		painelCampos.add(txtNome);
		
		JLabel lblCPF = new JLabel("CPF : ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCPF.setBounds(10, 87, 46, 14);
		painelCampos.add(lblCPF);
		
		txtCpf = new JTextField();
		txtCpf.setEnabled(false);
		txtCpf.setColumns(10);
		txtCpf.setBounds(92, 84, 393, 20);
		painelCampos.add(txtCpf);
		
		txtEmail = new JTextField();
		txtEmail.setEnabled(false);
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
		txtDataNascimento.setEnabled(false);
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(324, 170, 161, 20);
		painelCampos.add(txtDataNascimento);
		
		JLabel lblDataMatricula = new JLabel("DATA MATRICULA  : ");
		lblDataMatricula.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDataMatricula.setBounds(10, 217, 141, 14);
		painelCampos.add(lblDataMatricula);
		
		txtDataMatricula = new JTextField();
		txtDataMatricula.setEnabled(false);
		txtDataMatricula.setColumns(10);
		txtDataMatricula.setBounds(324, 214, 161, 20);
		painelCampos.add(txtDataMatricula);
		
		final JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.setEnabled(false);
		btnSALVAR.setBounds(399, 244, 89, 23);
		painelCampos.add(btnSALVAR);
		btnSALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNome.getText().equals("")) {
					JOptionPane.showMessageDialog(btnSALVAR, "O nome precisa ter está preenchido ");
				}else {
					aluno.setNome(txtNome.getText());
					aluno.setCpf(txtCpf.getText());
					controle.inserir(aluno);
					JOptionPane.showMessageDialog(btnSALVAR,"Aluno cadastrado");
					txtNome.setEnabled(false);
					txtEmail.setEnabled(false);
				}
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
					if (aluno.getMatriculas().size()>0)
						txtDataMatricula.setText(aluno.getMatriculas().get(0).getIdMatricula().toString());
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
		btnExcluir.setEnabled(false);
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aluno != null) {
					controle.excluir(aluno);
				}
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
	private void definirEstadoInicial() {
		txtNome.setText("");
		txtNome.setEnabled(false);
		txtCpf.setText("");
		txtCpf.setEnabled(false);
		txtEmail.setText("");
		txtEmail.setEnabled(false);
		txtDataNascimento.setText("");
		txtDataNascimento.setEnabled(false);
		txtDataMatricula.setText("");
		txtDataMatricula.setEnabled(false);
		
		
	}
}

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal {

	private JFrame frmSchoolRobots;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frmSchoolRobots.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSchoolRobots = new JFrame();
		frmSchoolRobots.setTitle("SCHOOL ROBOTS");
		frmSchoolRobots.setBounds(100, 100, 394, 492);
		frmSchoolRobots.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JDesktopPane desktopPane = new JDesktopPane();
		frmSchoolRobots.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JMenuBar barramenu = new JMenuBar();
		frmSchoolRobots.setJMenuBar(barramenu);
		
		JMenu COORDENADOR = new JMenu("COORDENADOR");
		barramenu.add(COORDENADOR);
		
		JMenuItem GERIR_PROFESSORES = new JMenuItem("GERIR PROFESSOR");
		GERIR_PROFESSORES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGerirProfessores tela = new TelaGerirProfessores();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		COORDENADOR.add(GERIR_PROFESSORES);
		
		JMenuItem CADASTRAR_DISCIPLINAS = new JMenuItem("CADASTAR DISCIPLINA");
		CADASTRAR_DISCIPLINAS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarDisciplinas tela = new TelaCadastrarDisciplinas();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		COORDENADOR.add(CADASTRAR_DISCIPLINAS);
		
		JMenuItem GERIR_DADOS_ALUNOS = new JMenuItem("GERIR DADOS ALUNO");
		GERIR_DADOS_ALUNOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGerirDadosAlunos tela = new TelaGerirDadosAlunos();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		COORDENADOR.add(GERIR_DADOS_ALUNOS);
		
		JMenu ATENDENTE = new JMenu("ATENDENTE");
		barramenu.add(ATENDENTE);
		
		JMenuItem CADASTRAR_CURSO = new JMenuItem("CADASTRAR CURSO");
		CADASTRAR_CURSO.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				TelaCurso tela = new TelaCurso();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		ATENDENTE.add(CADASTRAR_CURSO);
		
		JMenuItem CADASTRAR_PROFESSOR = new JMenuItem("CADASTRAR PROFESSOR");
		ATENDENTE.add(CADASTRAR_PROFESSOR);
		
		JMenuItem CADASTRAR_ALUNO = new JMenuItem("CADASTRAR ALUNO");
		CADASTRAR_ALUNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAluno tela = new TelaAluno();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		ATENDENTE.add(CADASTRAR_ALUNO);
		
		JMenu ALUNO = new JMenu("ALUNO");
		barramenu.add(ALUNO);
		
		JMenuItem CONSULTAR_DISCIPLINA = new JMenuItem("CONSULTAR DISCIPLINA");
		CONSULTAR_DISCIPLINA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultarDisciplina tela = new TelaConsultarDisciplina();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		ALUNO.add(CONSULTAR_DISCIPLINA);
		
		JMenuItem CONSULTAR_CURSO = new JMenuItem("CONSULTAR CURSO");
		CONSULTAR_CURSO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultarCurso tela = new TelaConsultarCurso();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		ALUNO.add(CONSULTAR_CURSO);
		
		
		JMenuItem REALIZAR_MATRICULA = new JMenuItem("REALIZAR MATRICULA");
		REALIZAR_MATRICULA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaRealizarMatricula tela = new TelaRealizarMatricula();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		ALUNO.add(REALIZAR_MATRICULA);
		
		
	}

}

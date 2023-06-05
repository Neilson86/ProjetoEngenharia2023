package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
		
		JMenuBar barramenu = new JMenuBar();
		frmSchoolRobots.setJMenuBar(barramenu);
		
		JMenu COORDENADOR = new JMenu("COORDENADOR");
		barramenu.add(COORDENADOR);
		
		JMenuItem GERIR_PROFESSORES = new JMenuItem("GERIR PROFESSOR");
		COORDENADOR.add(GERIR_PROFESSORES);
		
		JMenuItem CADASTRAR_DISCIPLINAS = new JMenuItem("CADASTAR DISCIPLINA");
		COORDENADOR.add(CADASTRAR_DISCIPLINAS);
		
		JMenuItem GERIR_DADOS_ALUNOS = new JMenuItem("GERIR DADOS ALUNO");
		COORDENADOR.add(GERIR_DADOS_ALUNOS);
		
		JMenu ATENDENTE = new JMenu("ATENDENTE");
		barramenu.add(ATENDENTE);
		
		JMenuItem CADASTRAR_CURSO = new JMenuItem("CADASTRAR CURSO");
		ATENDENTE.add(CADASTRAR_CURSO);
		
		JMenuItem CADASTRAR_PROFESSOR = new JMenuItem("CADASTRAR PROFESSOR");
		ATENDENTE.add(CADASTRAR_PROFESSOR);
		
		JMenuItem CADASTRAR_ALUNO = new JMenuItem("CADASTRAR ALUNO");
		ATENDENTE.add(CADASTRAR_ALUNO);
		
		JMenu ALUNO = new JMenu("ALUNO");
		barramenu.add(ALUNO);
		
		JMenuItem CONSULTAR_DISCIPLINA = new JMenuItem("CONSULTAR DISCIPLINA");
		ALUNO.add(CONSULTAR_DISCIPLINA);
		
		JMenuItem CONSULTAR_CURSO = new JMenuItem("CONSULTAR CURSO");
		ALUNO.add(CONSULTAR_CURSO);
		
		JMenuItem REALIZAR_MATRICULA = new JMenuItem("REALIZAR MATRICULA");
		ALUNO.add(REALIZAR_MATRICULA);
	}

}

package view;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Alunos;
import model.Coordenador;
import model.Curso;
import model.Disciplina;
import model.Matricula;
import model.Professor;

public class Programa {
	public static void main(String[] args) {
		Alunos a1 = new Alunos("Alessandro Belizário",1023325689, "alessandrobelizario@gmail.com", 10/02/1998, 21/12/2020);
		Alunos a2 = new Alunos("Leonardo Duarte", 564231895, "leonardoduarte@gmail.com", 13/04/2002, 20/12/2020);
		Alunos a3 = new Alunos("Neilson Silva", 2013368975, "neilsonsilva@gmail.com", 22/06/1998, 21/12/2020);
		
		Coordenador co1 = new Coordenador(null, "Marcos Antônio", 222336954, "coord1");
		Coordenador co2 = new Coordenador(null, "André Santos", 1335216635, "coord2");
		Coordenador co3 = new Coordenador(null, "Maria Souza", 986235413, "coord3");
		
		Curso c1 =new Curso(null, "Computação",null);
		
		Disciplina d1 = new Disciplina(null, "Algorítmos", null);
		Disciplina d2 = new Disciplina(null, "Raciocínio Lógico", null);
		Disciplina d3 = new Disciplina(null, "Lógica de Programação", null);
		Disciplina d4 = new Disciplina(null, "Sistemas para Internet", null);
		Disciplina d5 = new Disciplina(null, "História da Computação", null);
		Disciplina d6 = new Disciplina(null, "Banco de Dados", null);
		Disciplina d7 = new Disciplina(null, "Robótica", null);
		Disciplina d8 = new Disciplina(null, "Teória da Computação", null);
		
		Matricula m1 = new Matricula(null, "Alessandro Belizário", null);
		Matricula m2 = new Matricula(null, "Leonardo Duarte", null);
		Matricula m3 = new Matricula(null, "Neilson Silva", null);
		
		Professor p1 = new Professor(null, "Carlos Jorge", 222333355, "prof1");
		Professor p2 = new Professor(null, "Bruno José", 225699874, "prof2");
		Professor p3 = new Professor(null, "Helena Santos", 598766425, "prof3");
		Professor p4 = new Professor(null, "Juliana Martins", 321564897, "prof4");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(a1); // chamando gerenciador de tabelas para realizar o insert//;
		em.persist(a2);
		em.persist(a3);
		
		em.persist(co1); 
		em.persist(co2);
		em.persist(co3);
		
		em.persist(c1); 
		
		
		em.persist(d1); 
		em.persist(d2);
		em.persist(d3);
		em.persist(d4);
		em.persist(d5);
		em.persist(d6); 
		em.persist(d7);
		em.persist(d8);
		
		em.persist(m1); 
		em.persist(m2); 
		em.persist(m3); 
		
		em.persist(p1); 
		em.persist(p2); 
		em.persist(p3); 
		em.persist(p4); 
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}
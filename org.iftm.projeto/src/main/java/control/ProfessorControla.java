package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Professor;

public class ProfessorControla {
	private EntityManager em;

	public ProfessorControla() {
		super();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}
	
	public void inserir(Professor obj) {
		try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
		 
	}
	
	public void alterar(Professor obj) {
		try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void excluir(Professor obj) {
		 try {
	            em.getTransaction().begin();
	            em.remove(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
	
	
	public Professor buscarPorId(Integer id) {
		return em.find(Professor.class, id);
	}
	
	public void excluirPorld(Integer id) {
		 try {
			 Professor objeto = buscarPorId(id);
	            excluir(objeto);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}
	
	
	public List<Professor> buscarTodos(){
		String nomeClasse =Professor.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
			

	}

}

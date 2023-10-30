package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Curso;

public class CursoControla {
	private EntityManager em;

	public CursoControla() {
		super();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}
	
	public void inserir(Curso obj) {
		try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
		 
	}
	
	public void alterar(Curso obj) {
		try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void excluir(Curso obj) {
		 try {
	            em.getTransaction().begin();
	            em.remove(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
	
	
	public Curso buscarPorId(Integer id) {
		return em.find(Curso.class, id);
	}
	
	public void excluirPorld(Integer id) {
		 try {
			 Curso objeto = buscarPorId(id);
	            excluir(objeto);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}
	
	
	public List<Curso> buscarTodos(){
		String nomeClasse = Curso.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
			

	}
}





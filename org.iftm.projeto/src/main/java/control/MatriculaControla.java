package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Matricula;

public class MatriculaControla {
	private EntityManager em;

	public MatriculaControla() {
		super();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("secretariaiftm2");
		emf.createEntityManager();
	}
	
	public void inserir(Matricula obj) {
		try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
		 
	}
	
	public void alterar(Matricula obj) {
		try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void excluir(Matricula obj) {
		 try {
	            em.getTransaction().begin();
	            em.remove(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
	
	
	private Matricula buscarPorId(Integer id) {
		return em.find(Matricula.class, id);
	}
	
	public void excluirPorld(Integer id) {
		 try {
			 Matricula objeto = buscarPorId(id);
	            excluir(objeto);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}
	
	
	public List<Matricula> buscarTodos(){
		String nomeClasse =Matricula.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
			

	}

}

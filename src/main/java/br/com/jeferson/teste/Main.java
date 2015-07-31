package br.com.jeferson.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jeferson.dominio.Academia;

public class Main {
	public static void main(String[] args) {
		Academia academia = new Academia();
		academia.setNome("Academia TOP");

	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("projetoAcademia");
	    EntityManager manager = factory.createEntityManager();

	    manager.getTransaction().begin();    
	    manager.persist(academia);
	    manager.getTransaction().commit();  

	    System.out.println("ID da tarefa: " + academia.getId() );

	    manager.close();
	}
}

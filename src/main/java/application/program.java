package application;

import domaine.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class program {

	public static void main(String[] args) {

/*
		
		Person  p1 = new Person(null,"obed","kabwe@gmail.com");
		Person  p2 = new Person(null,"obed","kabwe@gmail.com");
		Person  p3 = new Person(null,"obed","kabwe@gmail.com");
		*/
		
	javax.persistence.EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("obedkabwe");
		javax.persistence.EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
/*
		Person p = new Person();
		p.setId(1);
		p.setName("obed");
		p.setEmail("ka@ham");
		//em.persist(p);
em.persist(p);
*/
		
		Person  p1 = new Person(null,"obed","kabwe@gmail.com");
		Person  p2 = new Person(null,"loice","obed@gmail.com");
		Person  p3 = new Person(null,"joe","loice@gmail.com");
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		//System.out.println(p);
		//System.out.println("Its Working");
		em.getTransaction().commit();
		

	}

}

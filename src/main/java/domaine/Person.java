package domaine;

import java.io.Serializable;

import javax.persistence.Table;



@javax.persistence.Entity
@Table(name = "person")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	
	
	public Person() {
		super();
	}


	public Person(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package ph.com.alliance.entity;

import javax.persistence.*;


/**
 * The persistent class for the mytable database table.
 * 
 */
@Entity
@Table(name="mytable")
@NamedQuery(name="Mytable.findAll", query="SELECT m FROM Mytable m")
public class Mytable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int age;

	private String name;

	public Mytable() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mytable [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
}
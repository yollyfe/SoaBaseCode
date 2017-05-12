package ph.com.alliance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the anothertable database table.
 * 
 */
@Entity
@Table(name="anothertable")
@NamedQuery(name="Anothertable.findAll", query="SELECT a FROM Anothertable a")
public class Anothertable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="an_age")
	private int anAge;

	@Column(name="an_name")
	private String anName;

	public Anothertable() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnAge() {
		return this.anAge;
	}

	public void setAnAge(int anAge) {
		this.anAge = anAge;
	}

	public String getAnName() {
		return this.anName;
	}

	public void setAnName(String anName) {
		this.anName = anName;
	}

}
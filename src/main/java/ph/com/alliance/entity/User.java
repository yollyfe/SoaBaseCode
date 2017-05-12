package ph.com.alliance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="uid")
	private String uid;
	
	private String fname;
	private String lname;
	private String gender;
	private String[] testField;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String[] getTestField() {
		return testField;
	}
	public void setTestField(String[] testField) {
		this.testField = testField;
	}
	@Override
    public String toString() {
        return "User {" + "userID=" + uid + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age=" + age + '}';

    } 
}

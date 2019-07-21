package poly.com.entities;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class Users {
	
	@Id
	private String id;
	private String email;
	private String name;
	private String cmt;
	private String pass;
	private String phone;
	private String role;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String id, String email, String name, String cmt, String pass, String phone, String role) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.cmt = cmt;
		this.pass = pass;
		this.phone = phone;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}

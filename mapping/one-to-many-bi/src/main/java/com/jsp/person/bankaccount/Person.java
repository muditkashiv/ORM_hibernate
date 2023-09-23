package com.jsp.person.bankaccount;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long cnos;
	@OneToMany(mappedBy = "person" , cascade = CascadeType.ALL)
	private List<BankAccount> bankAccount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public long getCnos() {
		return cnos;
	}
	public void setCnos(long cnos) {
		this.cnos = cnos;
	}
	public List<BankAccount> getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(List<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}


}

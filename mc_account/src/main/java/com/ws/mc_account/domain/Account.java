package com.ws.mc_account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Account  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long IdAccount;
	
	String typeAccount;
	
	String description;
	
	/**
	 * @return the typeAccount
	 */
	public String getTypeAccount() {
		return typeAccount;
	}

	/**
	 * @param typeAccount the typeAccount to set
	 */
	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}

package org.sid.ebanking.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String name;
	String email;
	@OneToMany(mappedBy = "customer")
	List<BankAccount> bankAccounts;
	
}

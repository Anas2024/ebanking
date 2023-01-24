package org.sid.ebanking.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BankAccount")
@Data @NoArgsConstructor @AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="TYPE", discriminatorType = DiscriminatorType.STRING, length = 2)
public abstract class BankAccount 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Temporal(TemporalType.DATE)
	Date createdAt;
	double balance;
	@Enumerated(EnumType.STRING)
	AccountStatus status;
	String currency;
	@ManyToOne
	Customer customer;
	@OneToMany(mappedBy = "bankAccount")
	List<Operation> operations;
	

}

package org.sid.ebanking.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Operation {

	 @Id
	 long id;
	 @Temporal(TemporalType.DATE)
	 Date date;
	 double ammount;
	 @Enumerated(EnumType.STRING)
	 OperationType type;
	 @ManyToOne
	 BankAccount bankAccount;
}

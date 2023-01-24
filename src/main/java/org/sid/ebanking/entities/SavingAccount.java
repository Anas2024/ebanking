package org.sid.ebanking.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("SA")
public class SavingAccount extends BankAccount 
{
	double interestRate;

}

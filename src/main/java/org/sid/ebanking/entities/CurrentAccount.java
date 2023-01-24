package org.sid.ebanking.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("CA")
public class CurrentAccount extends BankAccount
{
	double overDaft;
}

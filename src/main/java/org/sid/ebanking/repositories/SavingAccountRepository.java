package org.sid.ebanking.repositories;

import org.sid.ebanking.entities.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingAccountRepository extends JpaRepository<SavingAccount, Long>
{
	
}

package edu.junnikym.transactiontest.repository;

import edu.junnikym.transactiontest.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountJpaRepository extends JpaRepository<Account, Long> {

}

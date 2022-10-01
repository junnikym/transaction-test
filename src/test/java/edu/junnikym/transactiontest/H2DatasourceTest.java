package edu.junnikym.transactiontest;

import edu.junnikym.transactiontest.domain.Account;
import edu.junnikym.transactiontest.repository.AccountJpaRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class H2DatasourceTest {

    @Autowired
    private AccountJpaRepository accountJpaRepository;

    @Test
    void 회원가입() {
        // 멤버 저장
        Account account = new Account();
        account.setName("skyepodium");
        accountJpaRepository.save(account);

        // 저장한 멤버 아이디로 검색
        Account targetAccount = accountJpaRepository.findById(account.getId()).get();
        Assertions.assertThat(account.getName()).isEqualTo(targetAccount.getName());
    }
}


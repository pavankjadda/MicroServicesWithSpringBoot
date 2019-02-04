package com.microservices;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository	extends JpaRepository<Account,Long>
{
    Account findAccountByNumber(Long number);

    List<Account> findAccountByOwner(String owner);
}

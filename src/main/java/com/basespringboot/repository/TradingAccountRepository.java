package com.basespringboot.repository;

import com.basespringboot.entity.TradingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradingAccountRepository extends JpaRepository<TradingAccount, Long> {
}

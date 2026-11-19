package com.basespringboot.repository;

import com.basespringboot.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface TradeRepository extends JpaRepository<Trade, Long> {

    List<Trade> findByAccountId(Long accountId);

    // Returns null when the account has no trade yet.
    @Query("select sum(t.profitLoss) from Trade t where t.account.id = :accountId")
    BigDecimal sumProfitLossByAccount(@Param("accountId") Long accountId);

    // Returns null when there is no trade in the period.
    @Query("select sum(t.profitLoss) from Trade t "
            + "where t.account.id = :accountId and t.openedAt >= :start and t.openedAt < :end")
    BigDecimal sumProfitLossByAccountBetween(@Param("accountId") Long accountId,
                                             @Param("start") LocalDateTime start,
                                             @Param("end") LocalDateTime end);
}

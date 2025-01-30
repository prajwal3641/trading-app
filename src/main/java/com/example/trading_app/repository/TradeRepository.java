package com.example.trading_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.trading_app.domain.*;

public interface  TradeRepository extends JpaRepository<Trade,Long>{

}

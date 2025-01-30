package com.example.trading_app.loader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.trading_app.domain.Trade;
import com.example.trading_app.repository.TradeRepository;

@Component
public class DataLoader implements CommandLineRunner {
    private final TradeRepository tradeRepository;

    public DataLoader(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    @Override
    public void run(String... args) {
        tradeRepository.save(new Trade(null, 101L, "Pending"));
        tradeRepository.save(new Trade(null, 102L, "Completed"));
        System.out.println("Sample trade data inserted!");
    }
}

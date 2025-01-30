
package com.example.trading_app.service;
import org.springframework.stereotype.Service;
import com.example.trading_app.repository.*;
import com.example.trading_app.domain.*;
import java.util.List;
@Service
public class TradeService {

    private TradeRepository tradeRepository;


public TradeService(TradeRepository tradeRepository){
this.tradeRepository =tradeRepository;
}
    public List<Trade> getTrades() {
        return  tradeRepository.findAll();
    }

}

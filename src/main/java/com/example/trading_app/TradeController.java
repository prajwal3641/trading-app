package com.example.trading_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.trading_app.service.*;
import com.example.trading_app.domain.*;
import java.util.List;
@RestController
public class TradeController {
    
    
    private TradeService service;

    public TradeController(TradeService service){
	this.service = service;
    }


    @GetMapping()
    public String home(){
        return "Hello , --->>>> i am working !!";
    }

	
    @GetMapping("/trades")
    public List<Trade> getAllTrades(){

	return service.getTrades();
    }
}

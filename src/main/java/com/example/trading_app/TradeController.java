package com.example.trading_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {
    
    
    @GetMapping()
    public String home(){
        return "Hi i am working !!";
    }
}

package com.example.trading_app.domain;

import jakarta.persistence.*;



@Entity
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trade_id;

    private Long user_id;

    @Column(nullable = false)
    private String status;

    public Long getTrade_id() {
        return trade_id;
    }

    public void setTrade_id(Long trade_id) {
        this.trade_id = trade_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Trade() {
    }

    public Long getUser_id() {
        return user_id;
    }

    public Trade(Long trade_id, Long user_id, String status) {
        this.trade_id = trade_id;
        this.user_id = user_id;
        this.status = status;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}


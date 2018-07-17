package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {
    StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    @Autowired
    public void steruj(StacjaPogodowa stacjaPogodowa) {
        String info = stacjaPogodowa.getInfo(stacjaPogodowa);
        int temp = stacjaPogodowa.getTemp();
        System.out.println("Dzien dobry! Dzisiejsza temperatura to " + temp + "*C i jest " + info + ". To bedzie dobry dzien!");
    }
}


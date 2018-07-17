package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {
    StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }


    public void steruj() {
        String info = stacjaPogodowa.getInfo();
        int temp = stacjaPogodowa.getTemp();
        System.out.println("Dzien dobry! Dzisiejsza temperatura to " + temp + "*C i jest " + info + ". To bedzie dobry dzien!");
    }
}


package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {
    private StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    @Autowired
    public void steruj(StacjaPogodowa stacjaPogodowa) {
        int temp = stacjaPogodowa.getTemp();
        if (temp < 15) {
            System.out.println("Jest zimno wlaczam piec " );
        } else {
            System.out.println("Jest cieplo nie wlaczam pieca " );
        }


    }
}

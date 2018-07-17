package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {
    private String info;
    private int temp;


    @Autowired

    public int getTemp() {
        int i = 0;
        if (info == null) {
            System.out.println("Pobieram informacje pogodowe");
            i++;
        }
         if (i!=0&&i<2) {
            int losowa = getLosowa();

            return temp = losowa;
        }
        return temp;
    }

    private int getLosowa() {
        Random random = new Random();
        return random.nextInt(60) - 25;
    }

    public String getInfo(StacjaPogodowa stacjaPogodowa) {
        if (stacjaPogodowa.temp > 15) {
            return info = "slonecznie";
        }
        return info = "pochmurno";
    }
}

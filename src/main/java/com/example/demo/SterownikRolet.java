package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {
private StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }


    public void steruj() {
        String info = stacjaPogodowa.getInfo();
        int temp = stacjaPogodowa.getTemp();
        if ("slonecznie".equals(info)) {
            System.out.println("Zaslaniam rolety, Jest " + info);
        } else if ("pochmurno".equals(info)) {
            System.out.println("nie zaslaniam rolet, jest " + info);
        }


    }
}

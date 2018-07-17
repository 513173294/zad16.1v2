package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartHome {


    SterownikGlosnika sterownikGlosnika;
    SterownikPieca sterownikPieca;
    SterownikRolet sterownikRolet;
    StacjaPogodowa stacjaPogodowa;

    public SmartHome(SterownikGlosnika sterownikGlosnika, SterownikPieca sterownikPieca,
                     SterownikRolet sterownikRolet, StacjaPogodowa stacjaPogodowa) {
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikPieca = sterownikPieca;
        this.sterownikRolet = sterownikRolet;
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void runApp() {

        sterownikGlosnika.steruj(stacjaPogodowa);
        sterownikPieca.steruj(stacjaPogodowa);
        sterownikRolet.steruj(stacjaPogodowa);

    }


}

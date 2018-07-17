package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartHome {


    SterownikGlosnika sterownikGlosnika;
    SterownikPieca sterownikPieca;
    SterownikRolet sterownikRolet;


    public SmartHome(SterownikGlosnika sterownikGlosnika, SterownikPieca sterownikPieca,
                     SterownikRolet sterownikRolet ) {
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikPieca = sterownikPieca;
        this.sterownikRolet = sterownikRolet;

    }

    public void runApp() {

        sterownikGlosnika.steruj();
        sterownikPieca.steruj();
        sterownikRolet.steruj();

    }


}

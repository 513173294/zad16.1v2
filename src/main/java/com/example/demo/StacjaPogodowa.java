package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {

    private String info;
    private Integer temp;

    public int getTemp() {
        int i = 0;
        if (temp == null) {
            int losowa = getLosowa();
            System.out.println("Pobieram informacje pogodowe");
            temp = losowa;

            if (temp > 10) {
                System.out.println("1");
                info = "slonecznie";
            } else {
                System.out.println("2");
                info = "pochmurno";
            }

        }
        return temp;

    }
        private int getLosowa () {
            Random random = new Random();
            return temp = random.nextInt(60) - 25;
        }

        public String getInfo () {
            return info;
        }
        //    public String getInfo() {
//
//        if (this.temp > 15) {
//            return info = "slonecznie";
//        }
//        return info = "pochmurno";
//    }
    }

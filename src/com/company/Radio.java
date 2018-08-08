package com.company;

public class Radio {
    private String bericht;
    private int volume = 0;



    public void setNieuwsBericht(String nieuwsBericht) {

        this.bericht = nieuwsBericht;


    }

    public int getVolume() {
        return volume;


    }

    public String speelNieuwsBericht() {

        return bericht;

    }

    public void verhoogVolume() {
        volume++;

    }

    public void verlaagVolume() {
        if (volume == 0)
        volume--;

    }
}

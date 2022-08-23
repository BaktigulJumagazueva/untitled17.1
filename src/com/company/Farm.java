package com.company;

import java.util.Arrays;

public class Farm {
    private String adress;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;
    private String overName;

    public Farm(String adress, Cow[] cows, Horse[] horses, Sheep[] sheep, String overName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
       this. overName = overName;
    }
public Farm(String adress,String overName){
        this.adress=adress;
        this.overName= overName;

}

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOverName() {
        return overName;
    }

    public void setOverName(String overName) {
       this. overName = overName;
    }

    @Override
    public String toString() {
        return "Farm{" +"\n"+
                "adress=" + adress + '\'' +"\n"+
                " cows=" + Arrays.toString(cows) +"\n"+
                " horses=" + Arrays.toString(horses) +"\n"+
                " sheep=" + Arrays.toString(sheep) +"\n"+
                " overName=" + overName + '\'' +"\n"+
                '}';
    }
}

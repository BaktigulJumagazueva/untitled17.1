package com.company;

public class Main {
    public static void main(String[] args) {


        Sheep sheep1 = new Sheep(35, 2, "female", "Lia");
        Sheep sheep2 = new Sheep(40, 3, "male", "Lack");
        Sheep sheep3 = new Sheep(33, 1, "female", "Lili");
        Horse horse1 = new Horse(150, 8, "male", "Chack");
        Horse horse2 = new Horse(140, 7, "female", "Cha");
        Cow cow1 = new Cow(160, 9, "female", "Mia");
        Cow cow2 = new Cow(150, 9, "male", "Miagi");
        Cow cow3 = new Cow(170, 9, "female", "Sacha");
        Cow cow4 = new Cow(163, 9, "male", "Uma");
        Cow cow5 = new Cow(168, 10, "male", "Fardi");

        Sheep[] sheep = {sheep1, sheep2, sheep3};
        Horse[] horses = {horse1, horse2};
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Farm farm = new Farm("Kirova", cows,horses,sheep,"Poliana");
        System.out.println(farm);




        Cow cow = new Cow(185, 5, "female", "ziro");
        Horse horse = new Horse(200, 9, "male", "Kondor");
        Sheep sheep6 = new Sheep(65, 4, "female", "Tuzbig");
        Sheep[] sheeps= {sheep6};
        Horse[] horsess = {horse};
        Cow[] cowss = {cow};

        Farm farm2= new Farm("Maevka 12",cowss,horsess,sheeps,"Ekomeat");
        System.out.println(farm2);

    }
    }
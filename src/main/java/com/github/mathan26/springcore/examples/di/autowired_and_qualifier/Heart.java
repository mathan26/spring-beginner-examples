package com.github.mathan26.springcore.examples.di.autowired_and_qualifier;

public class Heart {

    String nameOfAnimal;
    int noOfHeart;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }

    public void pump(){
        System.out.println("I am "+nameOfAnimal);
        System.out.println("I having "+noOfHeart+" hearts...");
        System.out.println("Heart is pumping...");
        System.out.println("Alive");
    }
}

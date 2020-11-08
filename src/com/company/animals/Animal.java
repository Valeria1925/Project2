package com.company.animals;

import foods.Food;

abstract public class Animal {
    int age;
    String name;

    public void eat(Food food) {
        System.out.println("i ate");
    }

    public void checkHealth () {
        System.out.println("i'm health");
    }
}


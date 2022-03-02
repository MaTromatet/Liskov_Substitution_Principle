package fr.afpa.cda;

import java.util.ArrayList;
import java.util.List;

class Test {
    public void addAnimal(List<Animal> animals) { }
 
    public void test() {
        List<Dog> dogs = new ArrayList<Dog>();
        addAnimal(dogs);    // COMPILE ERROR!
    }
}

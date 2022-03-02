package fr.afpa.cda;

import java.util.ArrayList;
import java.util.List;

class Test {
    public void addAnimal(List<Animal> animals) { }
 
    public void test() {
        List<Dog> dogs = new ArrayList<Dog>();
        addAnimal(dogs);    // COMPILE ERROR!
        
        //Nous obtiendrons une erreur de compilation parce qu'à l'intérieur de la méthode addAnimal(),
        //il est possible d'ajouter un objet Animal à la collection passée, qui ne peut accepter que des objets Chiens.

        
    }
}

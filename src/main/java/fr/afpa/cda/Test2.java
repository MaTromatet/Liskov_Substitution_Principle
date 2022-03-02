package fr.afpa.cda;

public class Test2 {
	
    public static void main(String[] args) {

        Rectangle r = getRectangle();
        r.setHeight(10);
        r.setWidth(2);

        System.out.println(r.GetSurface());

    }

    private static Rectangle getRectangle() {
        //return new Carre();
        return new Rectangle();
        
        
        /*
         * Les objets dans un programme doivent être remplaçables par des instances de leur sous-type sans pour autant altérer le bon fonctionnement du programme.
         */
    }

}

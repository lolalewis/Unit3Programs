package Lesson9.shapesv1.monsterexample;

public class HAuntedHouse {
    
    public static void main(String[] args) {
       Monster m[] = new Monster[4];
       
        for (int i = 0; i < m.length; i++) {
            m[i] = i <2? new Zombie("Zombie " + i) : new Vampire("Vampire" + i);
            
        }
        
        System.out.println("Here come the monsters");
        for (int i = 0; i <m.length; i++) {
            System.out.println(m[i].indentify());
        }
        System.out.println("And now for the attack!");
        // let "x" be each Monster in the Monster array "m"
        for (Monster x : m) {
            x.attack();
        }
    }
    
}

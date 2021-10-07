import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Vector v = new Vector(10);
        //System.out.println(v.getElements());
        v.toString();*/

     /**   Random random = new Random();
        Vector vector = new Vector(2);
        Card card = new Card(random.nextInt()%20,random.nextInt()%10);
        vector.add(card);

        System.out.println(card);*/

     Random random = new Random();
     Vector vector = new Vector();

     for ( int i = 0 ; i<3; i++) {
         vector.add(new Card(random.nextInt(4), random.nextInt(14)));
     }

        System.out.println(vector);
    }
}

/**
 * Created by Doron on 10/05/2016.
 */
public class halio_world {

    public static void main (String [] args)
    {

        String x = "ssss";
        String y = "pppp";
        int z = 3;
        int v = 5;
        boolean g= true;
        double h = 5.34;
        z++;
        z--;
        z=z+3;


        System.out.println(x +" Doron " + y);
        System.out.println(z+v);
        System.out.println(z/v);
        System.out.println(v/z);
        System.out.println(v*z);
        System.out.println(v%z);
        System.out.println(z%v);
        System.out.println((z+v)*z);

        System.out.println();
        System.out.println(g);
        g = false;
        System.out.println(g);
        System.out.println(h+v);

    }
}

/*
@author:sdnath
*/
import static java.lang.System.out;

class Test {

    public static void main(String[] args) {
        out.println("hi");

       
        int[] rnos = new int[5];
        int[] rnos2 = {23, 112, 34, 78};

       
        rnos[0] = 1;
        rnos[1] = 2;
        rnos[2] = 3;
        rnos[3] = 4;
        rnos[4] = 5;

        
        for (int i = 0; i < 5; i++) {
            out.println(rnos[i]);
        }

        
        for (int i = 0; i < rnos2.length; i++) {
            out.println(rnos2[i]);
        }
    }
}


/*Given an integer,

        , perform the following conditional actions:

        If

        is odd, print Weird
        If
        is even and in the inclusive range of to
        , print Not Weird
        If
        is even and in the inclusive range of to
        , print Weird
        If
        is even and greater than , print Not Weird
 */


public class main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int rotate = 1;

        for (int i = 0; i < rotate; i++) {
        int j, last;
        last = array[array.length-1];

            for (int k = array.length - 1; k > 0; k--) {
            array[k] = array[k-1];
            }
            array[0] = last;

        }
        System.out.println("Array after right rotation: ");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}



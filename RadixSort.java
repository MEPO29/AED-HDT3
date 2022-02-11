import java.util.Vector;

/*
 * Universidad del Valle de Guatemala
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Mario Puente 21290
 * Clase que sirve para el ordenamiento RadixSort
 * RadixSort.java
 */



public class RadixSort extends BaseSorts{
    
    /**
         * @param list 
         * Algoritmo que compara valores adyacentes
         * y los va intercambiando en caso que no esten ordenados
         * poniendo el mayor en el index atual
         *  
         */
      public RadixSort (Comparable[] list){
      //pre:hay valores menores 1,000,000
       //post:los valores son ordenados en forma decreciente

       for(int i = 0; i < 6; i++){
           bucketPass(list, i);
       }
}
        public int digit( int n, int d) {
            if (d==0 ) return n%10;
            else return digit (n%10,d-1);
        }



        public void bucketPass(Comparable list[], int d) {
            int i, j;
            int value;
            Vector<Vector<Integer>> bucket = new Vector <Vector<Integer>>(10);
            bucket.setSize(10);
            for (j = 0; j < 10; j++) bucket.set(j, new Vector<Integer>());

            int n = list.length;
            for (i = 0; i < n; i++) {
                value = (int) list[i];
                j = digit(value, d);
                bucket.get(j).add(value);
            }

            i = n;
            for(j=9; j>= 0; j--) {
                while(!bucket.get(j).isEmpty());{
                    i--;
                    value = bucket.get(j).remove(j);
                    list[i] = value;
                }
                
            }
      }
}
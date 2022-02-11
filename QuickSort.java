/*
 * Universidad del Valle de Guatemala
* @author Diana Díaz 21066
 * @author Mario Puente 21290
 * @author Sebastián Franco 21484
 * Clase que sirve para el ordenamiento QuickSort
*/

public class QuickSort extends BaseSorts{

    ///Constructor
    public QuickSort(Comparable numeros[]) {
        
        /*Se llama al ordenamiento, que recibe como parámetros:
                    - el arreglo de numeros enteros
                    - el pivote para particionar la lista en el principio, que en nuestro caso
                        es tambien mi first index o minimium index
                    - el last index o maximium index*/
        quicksort(numeros, 0, numeros.length-1);
    }
    
    
    public void  quicksort(Comparable numeros[], int izq, int der){
        int pivot;
        /*Verificacion que los index sean correctos*/
        if (izq >= der) return;
        
        //mis index que funcionan como constantes que almacenan los index en condiciones iniciales
        //int i = izq;
        //int d = der;
        pivot=partition(numeros,izq,der);
        quicksort(numeros,izq,pivot-1);
        quicksort(numeros,pivot+1,der);
        
    }

    ///Es el metodo donde se hace la particion del QuickSort
        private int partition(Comparable numeros[],int izq, int der){
            while(true){
                while(izq<der&&(numeros[izq].compareTo(numeros[der]))>0)der--;
                if(izq<der)swap(numeros,izq++,der);
                else return izq;
                while(izq<der&&(numeros[izq].compareTo(numeros[der])>0))izq++;
                if(izq<der)swap(numeros,izq,der--);
                else return der;
            }
        }

        ///Es el metodo donde se ordenan los datos.
        public void swap(Comparable[] data, int i , int j)
        {
            Comparable temp;
            temp=data[i];
            data[i]=data[j];
            data[j]=temp;
            
        }
    

}

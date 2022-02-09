/*
 * Universidad del Valle de Guatemala
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Mario Puente 21290
 * Clase que ordena una lista con el algoritmo de insertion Sort
 * GnomeSort.java
 */




public class GnomeSort extends BaseSorts{
    
    public GnomeSort(){
        
    }
    
    public GnomeSort(Comparable[] lista)
   //pre: recibe un arreglo de tipo comparable desordenado
   //post: ordena el arreglo de forma ascendente
   {
       
       int numSorted =1;
       
       int index;
       while(numSorted<lista.length)
       {
           //se toma el primer valor no ordenado
           Comparable temp=lista[numSorted];
           //se inserta en la parte del arreglo ordenado
           for(index=numSorted;index>0;index--)
           {
              
               if (temp.compareTo(lista[index-1])>0)
               {
                   lista[index]=lista[index-1];
               }
               else
                   break;
           }
           //se reinserta el valor
           lista[index]=temp;
           numSorted++; //aumenta la cantidad de números ordenados
       }//termina while
       
       
       
   }//termina insertion sort ascendente
        
    
    
}

    //int index = 0;
    //int n = arr.size(); // se obtiene el tamaño del arraylist
    //    while (index < n) {
    //    if (index == 0)
    //    index++; // si el índice es 0 se aumenta en uno para comparar el valor del indice menos 1
    //    if (arr.get(index) >= arr.get(index - 1))
    //    index++; // cuando es mayor quiere decir que "está ordenado" y por ello se aumenta en uno
    //    else {
    //    int temp = 0; // de lo contrario se cambian de posición
    //    temp = arr.get(index);
    //    arr.set(index, arr.get(index-1));
    //    arr.set(index-1, temp);
    //    index--; // se reduce el índice
    //    }
    //    }
    //    return arr;
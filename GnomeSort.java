/*
 * Universidad del Valle de Guatemala
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Mario Puente 21290
 * Clase que ordena una lista con el algoritmo de gnome Sort
 * GnomeSort.java
 */

public class GnomeSort extends BaseSorts {

    ///Es el constructor
    public GnomeSort() {

    }

    public GnomeSort(Comparable[] lista)
    //pre: recibe un arreglo de tipo comparable desordenado
    //post: ordena el arreglo de forma ascendente
    {

        int i = 1;
        int j = 2;
        int index;
        while (i < lista.length) {
            //se toma el primer valor no ordenado
            if (lista[i - 1].compareTo(lista[i]) <= 0) {
                i = j;
                j++;
            } else {
                Comparable tmp = lista[i - 1];
                lista[i - 1] = lista[i];
                lista[i--] = tmp;
                i = (i == 0) ? j++ : i;
            }
        }
    }
}

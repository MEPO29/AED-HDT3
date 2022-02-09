/*
 * Universidad del Valle de Guatemala
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Mario Puente 21290
 * Clase que decide que sort instanciar 
 * Factory.java
 */




public class Factory {
    
    
    
    //dependiendo de la entrada se instancia la clase 
    public BaseSorts getSort(String entry, Comparable[] list){
    //pre: recibe una lista de tipo comparable
    //post: devuelve una clase del tipo base sort que ordena la lista
        
        //se manda como parámetro la lista desordenada y el método la ordena
        
        
        if (entry.equals("1"))
            return new GnomeSort(list);
        if (entry.equals("2"))
            return  new RadixSort(list);
        if (entry.equals("3"))
            return new QuickSort(list);
        else
            return new MergeSort(list);
       
        
    }

   
}

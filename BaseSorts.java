/*
 * Universidad del Valle de Guatemala
 * @author Diana Díaz 21066
 * @authorSebastian Franco 21484
 * @author Mario Puente 21290
 * Clase que sirve como base para instanciar 4 algoritmos de ordenamiento
 * Se hace una clase para cada sort
 */



public class BaseSorts {
    //aqui se guarda la lista de números creadas
    protected Comparable[] listaNumeros;

    public BaseSorts() {
    }

    public Comparable[] getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(Comparable[] listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    

}

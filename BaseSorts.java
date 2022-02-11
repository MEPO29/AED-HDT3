/*
 * Universidad del Valle de Guatemala
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Mario Puente 21290
 * Clase que sirve para el ordenamiento de los Sorts
 * BaseSorts.Java
 */



public class BaseSorts {
    protected Comparable[] listaNumeros; ///Es donde se guarda la Lista de Numeros

    public BaseSorts() {
    }

    public Comparable[] getListaNumeros() {
        return listaNumeros;
    } ///Metodo que obtiene la Lista de numeros

    public void setListaNumeros(Comparable[] listaNumeros) {
        this.listaNumeros = listaNumeros;
    } ///Se crea la lista de numeros
    

}

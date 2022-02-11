 /*
 * Universidad del Valle de Guatemala
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Mario Puente 21290
 * Clase que maneja archivos
 * FileProject.java
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;


public class FileProject {
    /**
     * Constructor
     */
    public FileProject() {
       
    }

    /**
     * Metodo que permite crear un nuevo Archivo, para insertar los numeros en el.
     * @param numerosGenerados
     */
    public void CrearArchivo(Comparable[] numerosGenerados){
        try {

            File file = new File("NumerosAleatorios.txt"); ///De esta forma se Crea y/o Guarda el Nuevo Archivo

                // if FileCreator doesnt exists, then create it
                if (!file.exists()) {
                        file.createNewFile();
                }
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw); ///Para escribir Archivos

                for (int i=0;i<numerosGenerados.length;i++)
                {
                   bw.write(numerosGenerados[i].toString()+"\n"); ///de esta forma guarda los numeros Generados de forma aleatoria.
                }

                bw.close();

                System.out.println("Se ha creado el archivo exitosamente");

        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    public Comparable[] LeerArchivo(){ ///Se lee el archivo de esta manera
      
        int contador=0;
        int tamaño=0;
        BufferedReader br = null;
 
        try {

                String sCurrentLine;
                 File file = new File("NumerosOrdenados.txt");
                br = new BufferedReader(new FileReader(file.getAbsoluteFile()));

               
               
               while ((sCurrentLine = br.readLine()) != null) {
                    
                    tamaño++;
                
                }
               br = new BufferedReader(new FileReader(file));
               Comparable[] list = new Nodo[tamaño];
                while ((sCurrentLine = br.readLine()) != null) {
                    list[contador]=new Nodo(Integer.parseInt(sCurrentLine));
                    contador++;
                
                }
                
        return list;
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (br != null)br.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
        return null;
        
    }

    
    public void CrearArchivoOrdenado(Comparable[] numerosGenerados){ ///Se crea el archivo con los numeros ordenados.
        ///Esto se hace para compararlos
        
         try {


                File file = new File("NumerosOrdenados.txt");

                // if FileCreator doesnt exists, then create it
                if (!file.exists()) {
                        file.createNewFile();
                }

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i=0;i<numerosGenerados.length;i++)
                {
                   bw.write(numerosGenerados[i]+"\n");
                }

                bw.close();

                System.out.println("Se ha creado el archivo exitosamente");

        } catch (IOException e) {
                e.printStackTrace();
        }
        
    }
    

}

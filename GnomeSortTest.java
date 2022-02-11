import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GnomeSortTest {

    FileProject fp = new FileProject();


    public void testGnomeSort(){

        assertEquals(fp.CrearArchivoOrdenado[0],1);
    }
}
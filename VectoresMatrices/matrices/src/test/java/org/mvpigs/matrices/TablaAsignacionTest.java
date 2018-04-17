package org.mvpigs.matrices;

import org.junit.*;
import junit.framework.TestCase;
import junit.framework.Assert;
import java.util.ArrayList;



public class TablaAsignacionTest extends TestCase {
        
    @Test
    public void testGetLetra() {
        TablaAsignacion tabla = new TablaAsignacion(); //Instanciar y crear un objeto tabla
        assertEquals(tabla.getLetra(0), 'T');
        assertEquals(tabla.getLetra(5), 'M');
    }
    public void testLetraPermitida() {

    }
}

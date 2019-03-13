/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;


/**
 *
 * @author lorris
 */

public class AssertionsTest {

    @Ignore
    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        assertArrayEquals("failure - byte arrays not same", expected, actual);

        // verrifie si les 2 arguments font bien la même taille
    }
    @Ignore
    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are not equal", 3, "text");

        // verrifie si les 2 arguments sont bien égaux
    }
    
    @Ignore
    @Test
  public void testAssertFalse() {
    assertFalse("failure - should be false", false);
    
    // le test est bon si en paramètre le boolean est a false 
    // le test n'est pas bon si en paramètre le boolean est a true 
  }
  
  @Ignore
  @Test
  public void testAssertNotNull() {
    assertNotNull("should not be null", new Object());
    
    // le test est bon si l'objet passer en paramètre n'est pas null
  }
  @Ignore
  @Test
  public void testAssertNotSame() {
      
    assertNotSame("should not be same Object", new Object(), new Object());
    
    // le test en bon si les deux paramètre ne font pas référence au meme objet
  }
  @Ignore
  @Test
  public void testAssertNull() {
    assertNull("should be null", null);
    
    // le test est bon si le paramètre est null
  }
  
  @Ignore
  @Test
  public void testAssertSame() {
    Integer aNumber = Integer.valueOf(768);
    assertSame("should be same", aNumber, aNumber);
    
    // le test est bon si les 2 paramètres font reférences au meme objet
    
    
  }
  @Ignore
  @Test
  public void testAssertThatBothContainsString() {
    assertThat("albumen",0,is(0));
    
    //le test passe si la condition exprimé par le matcher est respecter
  }
  
  @Ignore
  @Test
  public void testAssertTrue() {
    assertTrue("failure - should be true", true);
    
    // le test passe si l'argument passer en paramètre est a true
  }

}
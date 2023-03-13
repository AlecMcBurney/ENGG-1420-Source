package sample;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VectorsTest {
    
    public VectorsTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void testEqual() {
        System.out.println("equal");
        assertTrue(Vectors.equal(new int[] {0}, new int[] {0}));
        assertTrue(Vectors.equal(new int[] {0,0}, new int[] {0,0}));
        assertTrue(Vectors.equal(new int[] {5,6,7}, new int[] {5,6,7}));
        assertFalse(Vectors.equal(new int[] {0,0}, new int[] {0,0,0}));
        assertFalse(Vectors.equal(new int[] {0,0,0}, new int[] {0,1,0}));
        
    }

   
    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        assertEquals(39, Vectors.scalarMultiplication(new int[] {3,4}, new int[] {5,6}));
        assertEquals(-39, Vectors.scalarMultiplication(new int[] {-3,4}, new int[] {5,-6}));
        assertEquals(0, Vectors.scalarMultiplication(new int[] {5,9}, new int[] {-9,5}));
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static java.time.Clock.system;

import java.util.Collection;
/**
 *
 * @author Muhammad Ismail
 */
public class TestingIT {
    public Testing test= new Testing();
    
    public TestingIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("set up");
    }
    
    @After
    public void tearDown() {
        System.out.println("tear down");
    }

    /**
     * Test of prove method, of class Testing.
     */
   @Test
    public void equal() {
           int a=1;
           int exp=1;
            int z;
           z = test.prove(a);
           assertEquals(exp,z);
    }
    @Test
    public void true1() {
          
             int a=1;
           int exp=1;
            int z;
           z = test.prove(a);
             assertTrue(true);
           
    }
    @Test
    public void false1() {
          
           int a=1;
           int b=0;
            int z;
           z = test.prove(a);
           assertFalse(false);
    }
    
 
     @Test
    public void notnull() {
        //Testcases test = new Testcases();
            int a=1;
  
            int z;
           z = test.prove(a);
            assertNotNull(z);
        
    }
     @Test
    public void nullcheck12() {
        
              int a=1;
            int  z = test.prove(a);
           int b=0;
            assertNull(a);
    }
    
     @Test
    public void samec() {
       
              int a=1;
           int exp=1;
            int z;
           z = test.prove(a);
              assertSame(z, exp);
        
    }
    
    @Test
    public void notsame() {
      //  Testcases test = new Testcases();
              int a=1;
           int exp=0;
            int z;
           z = test.prove(a);
       assertNotSame(z,exp);
        
    }
     

  
}

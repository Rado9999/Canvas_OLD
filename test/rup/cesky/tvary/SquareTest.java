/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rup.cesky.tvary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rup.cesky.utility.IO;

/**
 *
 * @author RadoK
 */
public class SquareTest {

public SquareTest() {
}

@BeforeClass
public static void setUpClass() {
}

@AfterClass
public static void tearDownClass() {
}

@Before
public void setUp() {
  SpravcePlatna SP = SpravcePlatna.getInstance();
  SP.setKrokRozmer(50, 6, 6);
  Square inst = new Square();
  IO.zprava("QQ");
}

@After
public void tearDown() {
}

  @Test
  public void testSomeMethod() {
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

}

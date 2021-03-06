package SOEN6011.Test;


import SOEN6011.Java.ArcCos;
import SOEN6011.Java.Utility;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ArcCosJunitTest {

  /**
   * Method to test getPiValue function.
   */
  @Test
  public void piValueTest() {
    double value = Utility.getPiValue();
    assertEquals(3.145926536, value, 0);
  }

  /**
   * Method to test the actual arccos values of x.
   */
  @Test
  public void arccosTest() throws Exception {
    double x = ArcCos.calculateArcos(-0.987);
    double y = ArcCos.calculateArcos(0.5);
    assertEquals(170.609319, x, 0);
    assertEquals(60.041329, y, 0);

  }

  /**
   * Method to test the invalid value of x.
   */
  @Test
  public void arccosInvalidTest() throws Exception {

    Exception thrown = assertThrows(Exception.class, () -> {
      double x = ArcCos.calculateArcos(100);
    });
    assertEquals("Input Values should be between -1 and 1", thrown.getMessage());
  }

}

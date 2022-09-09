import static org.junit.jupiter.api.Assertions.*;

import java.security.SecureRandom;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffle() {
    int[] data = {3, 1, 4, 1, 5, 9, 2, 6, 5, 4};
    int[] preShuffle = Arrays.copyOf(data, data.length);
    //class name Shuffler, variable shuffler. instance of the class
    Shuffler shuffler = new Shuffler(new SecureRandom());
    shuffler.shuffle(data);
    System.out.println(Arrays.toString(data));

    //test to see if it was shuffled, returns if arrays are equal, asserting false
    assertFalse(Arrays.equals(preShuffle, data));
  }
}
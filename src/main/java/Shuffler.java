import java.util.Random;

public class Shuffler {
  private final Random rng;

  public Shuffler(Random rng) {
    this.rng = rng;
  }

  //we dont copy an array to copy it, we shuffle it in place.
  public void shuffle(int[] data){
    //int i counter
    for(int i = data.length -1; i >=1; i--){

      //rng up to but not including I
      int t = rng.nextInt(i + 1);
      if (t != i){
        //TODO SWAP!
        //copied value at position t, to my temp variable
        int temp = data[t];
        //read value at position at pos i, and put that value in position t in array.
        data[t] = data[i];
        //read the value in temp and put that value in position I in array.
        data[i] = temp;
      }
    }
  }

}

import java.util.*;

public class Partition {

  /*Modify the array such that:
 *1. Only the indices from start to end inclusive are considered in range
 *2. A random index from start to end inclusive is chosen, the corresponding
 *   element is designated the pivot element.
 *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
 *4. all elements in range that are larger than the pivot element are placed after the pivot element.
 *@return the index of the final position of the pivot element.
 */

  public static int partition (int [] data, int start, int end) {
    // generate random pivot index
    int pivot = (int)(Math.random() * data.length);
    // bring pivot element to index 0
    int temp = data[start];
    data[start] = data[pivot];
    data[pivot] = temp;
    // variables
    pivot = 0;
    start += 1;
  //  System.out.println("O: " + Arrays.toString(data));
    while (start != end) {
      if (data[start] > data[pivot]) {
        // switch start and end
        int t = data[end];
        data[end] = data[start];
        data[start] = t;
        end -= 1;
      } else {
        start += 1;
      }
    //  System.out.println(Arrays.toString(data));
    }
    // switching pivot to the right place
    if (data[start] <= data[pivot]) {
      int t = data[start];
      data[start] = data[pivot];
      data[pivot] = t;
      pivot = start;
    } else {
      int t = data[start-1];
      data[start-1] = data[pivot];
      data[pivot] = t;
      pivot = start-1;
    }
//    System.out.println(Arrays.toString(data));
    return pivot;
  }

  public static void main(String[] args) {
  //  Partition p = new Partition();
    int[] test = new int[] { 1, 4, 2, 9, 3, 5 };
    System.out.println(Partition.partition(test,0,test.length-1));
  }

}

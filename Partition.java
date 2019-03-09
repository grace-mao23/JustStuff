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

    return pivot;
  }

  public static void main(String[] args) {
  //  Partition p = new Partition();
    int[] test = new int[] { 1, 4, 2, 9, 3, 5 };
    System.out.println(Partition.partition(test,0,0));
  }

}

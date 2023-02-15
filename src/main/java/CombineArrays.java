
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int arr3Index = 0;
        for(int i = 0; i < arr1.length; i++) {
            arr3[arr3Index] = arr1[i];
            arr3Index++;
        }
        for(int i = 0; i < arr2.length; i++) {
            arr3[arr3Index] = arr2[i];
            arr3Index++;
        }
        return arr3;
    }
}

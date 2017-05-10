
public class Solution {
    public int GetNumberOfK(int[] array, int k) {

        if (array == null || array.length == 0)
            return 0;

        int firstIndex = getFirstIndex(array, 0, array.length - 1, k);
        int lastIndex = getLastIndex(array, 0, array.length - 1, k);
        if (firstIndex > -1 && lastIndex > -1)
            return (lastIndex - firstIndex) + 1;
        else
            return 0;
    }


   
    private int getFirstIndex(int[] array, int low, int high, int k) {

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (array[mid] == k) {
                if (mid == low || array[mid - 1] != k)
                    return mid;
                else
                    high = mid - 1;
            } else if (array[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;

    }

    private int getLastIndex(int[] array, int low, int high, int k) {

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (array[mid] == k) {
                if (mid == high || array[mid + 1] != k)
                    return mid;
                else
                    low = mid + 1;
            } else if (array[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

}

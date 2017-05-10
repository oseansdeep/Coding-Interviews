public class Solution {
  

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {

        if (array == null || array.length < 2)
            return;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp ^= array[i];
        }
        int indexBit = findFirstBitIs(temp);
        num1[0] = 0;
        num2[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if (isBit(array[i], indexBit))
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }

    public int findFirstBitIs(int num) {

        int indexBit = 0;
        while ((num & 1) == 0 && indexBit < 32) {
            num = num >> 1;
            ++indexBit;
        }
        return indexBit;
    }

    public boolean isBit(int num, int indexBit) {

        num = num >> indexBit;
        return (num & 1) == 1;
    }
}
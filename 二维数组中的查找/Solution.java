public class Solution {


    public boolean Find(int[][] array, int target) {

        //校验参数
        if (array == null || array.length == 0)
            return false;
        int row = array.length;//行
        int col = array[0].length;//列

        //从array[row-1][0]即左下角查找
        int i = row - 1;
        int j = 0;
        while (i >= 0 && j < col) {
            if (array[i][j] < target)
                j++;
            else if (array[i][j] > target)
                i--;
            else
                return true;
        }
        return false;
    }

    
}
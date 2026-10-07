class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int low, high;
        low = 0;
        high = matrix.length*matrix[0].length - 1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;

            int row = mid / matrix[0].length;
            int column = mid % matrix[0].length;

            if(matrix[row][column] == target)
                return true;

            else if(matrix[row][column] > target)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return false;
    }
}
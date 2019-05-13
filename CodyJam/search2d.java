public class HelloWorld{

     public static void main(String []args){
       
     int[][] matrix = {
      {1,   3,  5,  7},
      {10, 11, 16, 20},
      {23, 30, 34, 50}
    };

    int target = 12;

        boolean b = searchMatrix(matrix , target);
        
         System.out.println("Hello World: " + b);
     }
     
     public static boolean searchMatrix(int[][] matrix, int target) {
         if(matrix.length < 1 || matrix == null || matrix[0].length < 1)
         {
             return false;
         }
         int m = matrix.length;
         int n = matrix[0].length;
         int start = -1;
         int end = -1;
         
         for(int i = 0; i < m ; i ++){
             if(matrix[i][0] == target){
                 return true;
                 
             }
             if(matrix[i][0] < target){
                start = i ;
             }
             if(matrix[i][0] > target){
                end = i ;
             }
         }
         
         if(start > -1){
             for(int j = 1; j < n; j ++){
                 if(matrix[start][j] == target){
                     return true;
                 }
                 
             }
         }
         return false;
     }
}

/* ============== Star Pattern 4 ==============
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 
*/  

public class Pattern4{
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = i; j < rows; j++){
                System.out.print("  "); // Two Space
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
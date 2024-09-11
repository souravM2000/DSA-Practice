package pattern;

public class StarPattern {

    /**
     Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
     For every value of ‘N’, help sam to print the corresponding N-dimensional forest.
     Example:
     Input: ‘N’ = 3
     Output:
             * * *
             * * *
             * * *

     Time Complexity : O(N^2)
     Space complexity: O(1)
     */
    public static void nForest1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
    Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
    An N/2-dimensional forest is represented by the lower triangle of the pattern filled with ‘*’.
    For every value of ‘N’, help sam to print the corresponding N/2-dimensional forest.
     Example:
     Input:  ‘N’ = 3
     Output:
     *
     * *
     * * *

    Time Complexity : O(N^2)
    Space complexity: O(1)
     */
    public static void nForest2(int n) {
        // Write your code here
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            for (int space = 0; space < n - row; space++) {
                System.out.println(" ");
            }
        }
    }

    /**

    Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.
    For every value of ‘N’, print the field if the trees are represented by ‘*’.
    Example:
    Input: ‘N’ = 3
    Output:
    * * *
    * *
    *

    Time Complexity : O(N^2)
    Space complexity: O(1)
     */
    public static void seeding(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**

    Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.
    Example:
    Input: ‘N’ = 3
    Output:
      *
     ***
    *****

     */
    public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**

    Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.
    Example:
    Input: ‘N’ = 3
    Output:
    *****
     ***
      *

     */
    public static void nStarReverseTriangle(int n) {
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**

    Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.
    Example:
    Input: ‘N’ = 3
    Output:
      *
     ***
    *****
    *****
     ***
      *

     */
    public static void nStarDiamond(int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**

    Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.
    Example:
    Input: ‘N’ = 3
    Output:
    *
    **
    ***
    **
    *

     */

    public static void nStarRotatedTriangle(int n) {
        for(int i=1;i<=2*n-1;i++){

            int stars=i>n?(2*n-i):i;

            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

package pattern;

public class NumberPattern {

    /**

    Sam is making a Triangular painting for a maths project.
    An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.
    For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.
    Example:
    Input: ‘N’ = 3
    Output:
    1
    1 2
    1 2 3

    Time Complexity : O(N^2)
    Space complexity: O(1)
     */
    public static void nTriangle1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    /**

    Sam is making a Triangular painting for a maths project.
    An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers representing the row number.
    For every value of ‘N’, help sam to print the corresponding Triangle.
    Example:
    Input: ‘N’ = 3
    Output:
    1
    2 2
    3 3 3

    Time Complexity : O(N^2)
    Space complexity: O(1)
     */
    public static void nTriangle2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    /**

     Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Number Triangle.
     Example:
     Input: ‘N’ = 3
     Output:
     1
     2 3
     4 5 6

     */
    public static void nNumberTriangle(int n) {
        int count=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    /**

    Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.
    Example:
    Input: ‘N’ = 3
    Output:
    1 2 3
    1 2
    1

    Time Complexity : O(N^2)
    Space complexity: O(1)
     */
    public static void nNumberInverseTriangle(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    /**

     Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.
     You are required to print the pattern as shown in the examples below.
     Example:
     Input: ‘N’ = 3
     Output:
     1
     0 1
     1 0 1
     */
    public static void nBinaryTriangle(int n) {
        int bool=1;
        for(int i=0; i<n; i++){
            bool=i%2==0?1:0;
            for(int j=0; j<=i; j++){
                System.out.print(bool+" ");
                bool=1-bool;
            }
            System.out.println();
        }
    }

    /**

     Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.
     Given 'N', print the corresponding pattern.
     Example:
     Input: ‘N’ = 3
     Output:
     1         1
     1 2     2 1
     1 2 3 3 2 1

     */
    public static void numberCrown(int n) {
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            space-=2;
        }
    }
}

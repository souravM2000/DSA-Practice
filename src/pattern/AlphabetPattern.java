package pattern;

public class AlphabetPattern {

    /**

     Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Letter Triangle.
     Example:
     Input: ‘N’ = 3
     Output:
     A
     A B
     A B C
     */
    public static void nLetterTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(char j='A'; j<'A'+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /**

     Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.
     You must print a matrix corresponding to the given Reverse Letter Triangle.
     Example:
     Input: ‘N’ = 3
     Output:
     A B C
     A B
     A
     */
    public static void nLetterInvertedTriangle(int n) {
        for(int i=n; i>=1; i--){
            for(char j='A'; j<'A'+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /**

     An Alpha-Ramp is represented by a triangle, where alphabets are filled from the top in order.
     For every value of ‘N’, help sam to return the corresponding Alpha-Ramp.
     Example:
     Input: ‘N’ = 3
     Output:
     A
     B B
     C C C
     */
    public static void alphaRamp(int n) {
        char a='A';
        for(int i=1; i<=n; i++){
            for(char j=1; j<=i; j++){
                System.out.print(a+" ");
            }
            System.out.println();
            a++;
        }
    }
}

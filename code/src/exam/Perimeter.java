package exam;

/**
 * Question 1:
 * Given the perimeter of a right triangle, the function should return the number of valid triangles without 
 * duplication. Duplication means that the Triangle with edges 3,4,and 5 is considered the same triangle as 4,3,5.
 * While p is 12, the output should be 12.
 * 
 */

public class Perimeter {
    public static int getTriangleNum(int p) {
        int ans=0;

        for(int i=1; i<p/3; i++) {
            for(int j=i; j<p/2; j++) {
                int k = p-i-j;
                if(i*i + j*j == k*k) {
                    // System.out.println("edges: " + i+", "+j+", "+k);
                    ans++;
                }
            }
        }

        return ans;
    }   
}

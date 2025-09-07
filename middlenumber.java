class Solution {
    // Function to find the middle number among three integers
    int middle(int a, int b, int c) {
        // if a is less than b
        if (a < b)
            // return b if b is less than c, else return the maximum of a and c
            return (b < c) ? b : Math.max(a, c);
        // if a is greater than or equal to b
        return (a < c) ? a : Math.max(b, c); // return a if a is less than c, else
                                             // return the maximum of b and c
    }
}

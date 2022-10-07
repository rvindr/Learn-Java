 # Linear Search
 * <b >Linear Search</b> is defined as a sequential search algorithm that starts at one end and goes through each element of a list until the desired

 * Worst-case complexity is <b>O(n)</b>
 ***
 # Largest in Array
 1. -∞ --> Integer.MIN_VALUE;  
 1. +∞ --> Integer.MAX_VALUE;
 * Both are already present in java.util.* package;
 * For finding largest value we use -∞ so that we can compare the smallest value with another value to find the largest.
 ***
 # Binary Search
 * <b>Binary search</b> is a 'divide and conquer' algorithm which requires the initial array to be sorted before searching. It is called binary because it splits the array into two halves as part of the algorithm. Initially, a binary search will look at the item in the middle of the array and compare it to the search terms.
 * <b>Prerequisite</b> Array must be sorted(increasing/decreasing order)
 * ### Pseudocode
    1. start=0; end=n-1;
    1. while(start<=end)
        find mid; (start+end)/2
        compare mid & key

        mid==key //Element Found
        mid > key (end=mid-1)//repeat step 2 on left side
        mid < key (start=mid+1)//repeat step 2 on right side
 *  Time complexity of the binary search algorithm is <b>O(log n)</b>.
 ***
 

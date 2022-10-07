/*
 Find the LARGEST number in array;
Given array: {1,2,6,3,5}
*/
package Java_DSA.Java_Arrays;
public class largestInArray{
    public static int largestNum(int numbers[]){
        int largest=Integer.MIN_VALUE;// Integer.MIN_VALUE is smallest value of integer -∞
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        int bigNum=largestNum(numbers);
        System.out.println("The largest number in an array is : "+bigNum);
    }
}
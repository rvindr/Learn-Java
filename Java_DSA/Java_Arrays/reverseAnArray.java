// Reverse an array 
package Java_DSA.Java_Arrays;
public class reverseAnArray{
    public static void revArray(int numbers[]){
        int start=0; int end=numbers.length-1;
        while(start<=end){
            //swap
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

            start++;
            end--;
        }
        
    }
    public static void printArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8};
        printArray(numbers);
        revArray(numbers);
        printArray(numbers);
        
    }
}
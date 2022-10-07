/* Find the INDEX of element in a given array? 
key=10;
array={2,4,6,8,10,11,12,16} 
*/
package Java_DSA.Java_Arrays;

public class binarySearch {

    public static int bSearch(int numbers[],int key){
        int start=0; int end=numbers.length-1;
        while(start<=end){
            // calculate mid
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }else if(numbers[mid]<key){//right half part
                start=mid+1;
            }else{// left half part
                end=mid-1;
            }

        }


        return -1;

    }
    public static void main(String[] args) {
        int key=16;
        int numbers[]={2,4,6,8,10,11,12,16};

        int index=bSearch(numbers, key);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element "+key+" found at index : "+index);
        }
    }
}

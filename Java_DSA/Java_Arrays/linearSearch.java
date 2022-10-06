/* Find the INDEX of element in a given array? 
key=10;
array={2,4,6,8,10,11,12,16} 
*/

package Java_DSA.Java_Arrays;
public class linearSearch {
    public static int linearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(key==numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int key=10;
        int numbers[]={2,4,6,8,10,11,12,16};
        int index=linearSearch(numbers, key);

        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element "+key+" found at index: "+index);
        }
    }
}

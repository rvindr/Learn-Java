// pairs in array
package Java_DSA.Java_Arrays;

public class pairsInArray {
    public static void pairInArray(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6};
        pairInArray(numbers);
    }
}

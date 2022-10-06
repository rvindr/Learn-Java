public class Patterns {
    public static void star_pattern(int n){
        // outer loop 
        for(int i=1;i<=n;i++){
            // inner loop 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_star_pattern(int n){
            // outer loop 
            for(int i=n;i>=1;i--){
                // inner loop 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        
    }
    public static void half_pyramid_with_number(int n){
        // outer loop 
        for(int i=1;i<=n;i++){
            // inner loop 
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void character_pattern(int n){
        for(int i=1;i<=n;i++){
            char myChar='a'; 
            // inner loop 
            for(int j=1;j<=i;j++){
                System.out.print(myChar+" ");
                myChar++;
            }
            System.out.println();
        }
    }
    public static void hollow_rectangle(int totalRow, int totalCol){
        // outer loop
        for(int i=1;i<=totalRow;i++){
            // inner loop 
            for(int j=1;j<=totalCol;j++){
                // cells(i,j)
                if(i==1 || i==totalRow || j==1 || j==totalCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_with_numbers(int n) {
        // outer loop 
        for(int i=1;i<=n;i++){
            // inner loop 
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floyd(int n) {
        
        int counter=1;
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void binPattern(int n) {
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){//even num
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly() {
    
        // outer loop
        for(int i=1;i<=4;i++){
            // inner loop 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // mirror image
        for(int i=4;i>=1;i--){
            // inner loop 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    public static void solid_rhombus() {
        //outer loop
        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_solid_rhombus(int n){
        // outer loop 
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // hollow 
            for(int k=1;k<=n;k++){
                if(i==1 || i==n || k==1 ||k==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        // 1st half 
        // outer loop 
        for(int i=1;i<=n;i++){
            // spaces 
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars 
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half 
        // outer loop 
        for(int i=n;i>=1;i--){
            // spaces 
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars 
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
     public static void main(String[] args) {
            // star_pattern(4);
            // inverted_star_pattern(10);
            // half_pyramid_with_number(8);
            // hollow_rectangle(5, 4);
            // inverted_half_pyramid_with_numbers(5);
            // floyd(6);
            // binPattern(7);
            // butterfly();
            // solid_rhombus();
            // character_pattern(26);
            // hollow_solid_rhombus(9);
            // diamond(4);
        }
    }
    
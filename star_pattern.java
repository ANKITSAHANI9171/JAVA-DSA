/* 
public class star_pattern {
    public static void main(String[] args){
        for(int line=1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//print inverted star pattern
/*
public class star_pattern{
    public static void main(String[] args){
        int n = 4; //number of line
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//Print half-pyramid pattern
/*
public class star_pattern{
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/
//Print character pattern
public class star_pattern{
    public static void main(String[] args){
        char ch = 'A';
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
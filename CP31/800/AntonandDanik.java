import java.util.Scanner;
// A. Anton and Danik
// https://codeforces.com/contest/734/problem/A


public class AntonandDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() ;

        String s = sc.next();

        int Anton = 0 ;

        int Danik = 0 ;


        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == 'A'){
                Anton++;
            }
            else{
                Danik++;
            }
        }

        if(Anton == Danik){
            System.out.println("Friendship");
        }
        else if(Anton > Danik){
            System.out.println("Anton");
        }
        else{
            System.out.println("Danik");
        }
    }
}

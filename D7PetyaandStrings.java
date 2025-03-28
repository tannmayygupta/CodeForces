import java.util.*;


public class D7PetyaandStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String l1 = s1.toLowerCase();
        String l2 = s2.toLowerCase();

        int compare = l1.compareTo(l2);

        if(compare < 0){
            System.out.println("-1");
        }
        else if(compare > 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
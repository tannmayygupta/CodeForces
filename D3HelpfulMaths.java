import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D3HelpfulMaths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        List<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '+'){
                arr.add(Character.getNumericValue(s.charAt(i)));
            }
        }

        Integer[] array = arr.toArray(new Integer[0]);

        Arrays.sort(array);

        for(int i = 0 ; i < array.length ; i++){
            if(i == array.length -1){
                System.out.print(array[i]);   
            }
            else{
                System.out.print(array[i]+"+");
            }
        }

        // System.out.println(arr);
    }
}
package Arrays;
import java.util.*;
// import java.util.ArrayList;

public class Java02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creating Array List
        ArrayList<String> inpuArrayList = new ArrayList<>();

        System.out.println("Enter the elements :");
        System.out.println("type 'done' after giving the input");
        while(true){
            String inp=sc.nextLine();

            if(inp.equalsIgnoreCase("done")){
                break;
            }

            inpuArrayList.add(inp);
        }

        for (String string : inpuArrayList) {
            System.out.println(string);
        }

        
    }
}

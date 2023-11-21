package Arrays;

import java.util.*;
// import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Array List
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        // System.out.println("Enter the elements :");
        // System.out.println("type 'done' after giving the input");

        list.add(12);
        list.add(32);
        list.add(14);
        list.add(3);
        list.add(2);
        list.add(30);
        list.add(13);
        list.add(35);

        System.out.println(list.contains(5));
        list.set(0, 240);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(Integer.valueOf(35));
        System.out.println(list);

        System.out.println("--------------");
        System.out.println("Enter elements : ");
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println(list1);
        System.out.println("--OR--");

        for (int i = 0; i < 5; i++) {
            System.out.println(list1.get(i));
        }

        sc.close();
    }
}

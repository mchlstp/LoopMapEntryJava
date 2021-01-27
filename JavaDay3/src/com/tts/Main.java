package com.tts;
import java.util.*;


public class Main {

    public static void main(String[] args) {
      List<Integer>  myArr = new ArrayList<>();
        Scanner whatNum = new Scanner(System.in);
//        myArr.add(whatNum.nextInt());
        int a = 0;
        for(int i = 1; i <= 5; i++){
            System.out.println();
            myArr.add(whatNum.nextInt());
        }
        int sum = 0;
        System.out.println(myArr);
        for (int i : myArr) {
            sum += i;
            System.out.println("The sum is " + sum);
        }
        int pro = 1;

        for (int i : myArr) {
            pro *= i;
            System.out.println("The product is " + pro);


        }
        int max = Integer.MIN_VALUE;
        for (int num : myArr){
            if (num > max){
                max = num;

            }

        }
        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for (int num : myArr) {
            if (num < min){
                min = num;
            }

        }
        System.out.println(min);
//        myArrayList.stream().max.()

//        int max = myArr.stream().max().getAsInt();
//        System.out.println("Largest in array is " + max);
    }
}

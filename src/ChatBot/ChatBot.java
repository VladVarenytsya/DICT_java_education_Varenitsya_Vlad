package ChatBot;

import java.util.Scanner;

public class ChatBot{

    public static void main(String[] args) {
        System.out.println("Hello! My name is Ducya.\nI was created in 2022.\nPlease, remind me your name.");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("What a great name you have," + userName + "!");


        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scan.nextInt();
        int rem5 = scan.nextInt();
        int rem7 = scan.nextInt();
        int age = (rem3*70 + rem5*21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that`s a good time to start programming!");

        System.out.println("Now I will prove to you that i can count to any number you want.");
        int num = scan.nextInt();
        for(int i = 0; i < num + 1; i++){
            System.out.println(i + "!");
        }


    }

}



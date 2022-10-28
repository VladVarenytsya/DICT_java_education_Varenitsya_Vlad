package ChatBot;

import java.util.Scanner;

public class ChatBot{

    public static void main(String[] args) {
        System.out.println("Hello! My name is Ducya.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("What a great name you have," + userName + "!");
    }

}



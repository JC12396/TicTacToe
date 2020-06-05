package main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class TicTacToe {
    public static void main(String[] args) {
        List<String> ticTacToeBoardRow1 = new ArrayList<>();
        List<String> ticTacToeBoardRow2 = new ArrayList<>();
        List<String> ticTacToeBoardRow3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ticTacToeBoardRow1.add("■");
            ticTacToeBoardRow2.add("■");
            ticTacToeBoardRow3.add("■");
        }
        int playerPlacement;
        boolean ticTacToeWin = false;
//        int num[] = new int[5];
        int aiPlacement = 0;
        int turns = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Joe's TicTacToe");
        System.out.print("Would you like to play? (1 to play, 0 to leave) >> ");
        int playAnswer = input.nextInt();
        if (playAnswer == 1) {
            System.out.println("Thanks");
            System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
            while (turns != 10 && ticTacToeWin != true) {
                System.out.print("Please enter which square you would like for your X!(It's setup like a keypad.) >> ");
                playerPlacement = input.nextInt();
                if (playerPlacement <= 9 && playerPlacement > 0) {
                    if (playerPlacement == 1) {
                        ticTacToeBoardRow1.remove(0);
                        ticTacToeBoardRow1.add(0,"X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                    } else if (playerPlacement == 2)
                        ticTacToeBoardRow1.remove(1);
                        ticTacToeBoardRow1.add(1,"X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                } else if (playerPlacement == 3) {
                        ticTacToeBoardRow1.remove(2);
                        ticTacToeBoardRow1.add(2,"X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                } else if (playerPlacement == 4) {
                        ticTacToeBoardRow2.remove(0);
                        ticTacToeBoardRow2.add("X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                } else if (playerPlacement == 5) {
                        ticTacToeBoardRow2.remove(1);
                        ticTacToeBoardRow2.add( "X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                } else if (playerPlacement == 6) {
                        ticTacToeBoardRow2.remove(2);
                        ticTacToeBoardRow2.add( "X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                } else if (playerPlacement == 7) {
                        ticTacToeBoardRow3.remove(0);
                        ticTacToeBoardRow3.add( "X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                } else if (playerPlacement == 8) {
                        ticTacToeBoardRow3.remove(1);
                        ticTacToeBoardRow3.add("X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                } else if (playerPlacement == 9) {
                        ticTacToeBoardRow3.remove(2);
                        ticTacToeBoardRow3.add( "X");
                        System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                        turns++;
                }
                else {
                    System.out.println("no");
                    System.exit(0);

                }
                aiPlacement = (int) ((Math.random() * 9) + 1);
                if (aiPlacement == 1) {
                    ticTacToeBoardRow1.remove(0);
                    ticTacToeBoardRow1.add(0, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else if (aiPlacement == 2) {
                    ticTacToeBoardRow1.remove(1);
                    ticTacToeBoardRow1.add(1, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else if (aiPlacement == 3) {
                    ticTacToeBoardRow1.remove(2);
                    ticTacToeBoardRow1.add(2, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else if (aiPlacement == 4) {
                    ticTacToeBoardRow2.remove(0);
                    ticTacToeBoardRow2.add(0, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else if (aiPlacement == 5) {
                    ticTacToeBoardRow2.remove(1);
                    ticTacToeBoardRow2.add(1, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else if (aiPlacement == 6) {
                    ticTacToeBoardRow2.remove(2);
                    ticTacToeBoardRow2.add(2, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else if (aiPlacement == 7) {
                    ticTacToeBoardRow3.remove(0);
                    ticTacToeBoardRow3.add(0, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else if (aiPlacement == 8) {
                    ticTacToeBoardRow3.remove(1);
                    ticTacToeBoardRow3.add(1, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else if (aiPlacement == 9) {
                    ticTacToeBoardRow3.remove(2);
                    ticTacToeBoardRow3.add(2, "O");
                    System.out.println(ticTacToeBoardRow1 + "\n" + ticTacToeBoardRow2 + "\n" + ticTacToeBoardRow3);
                    turns++;
                } else {
                    System.out.println("no");
                    System.exit(0);
                }
                if (ticTacToeBoardRow1.get(0) == "X" && ticTacToeBoardRow1.get(1) == "X" && ticTacToeBoardRow1.get(2) == "X") {
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow1.get(0) == "X" && ticTacToeBoardRow2.get(0) == "X" && ticTacToeBoardRow3.get(0) == "X"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow1.get(1) == "X" && ticTacToeBoardRow2.get(1) == "X" && ticTacToeBoardRow3.get(1) == "X"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow1.get(2) == "X" && ticTacToeBoardRow2.get(2) == "X" && ticTacToeBoardRow3.get(2) == "X"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow2.get(0) == "X" && ticTacToeBoardRow2.get(1) == "X" && ticTacToeBoardRow2.get(2) == "X"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow3.get(0) == "X" && ticTacToeBoardRow3.get(1) == "X" && ticTacToeBoardRow3.get(2) == "X"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow1.get(0) == "X" && ticTacToeBoardRow2.get(1) == "X" && ticTacToeBoardRow3.get(2) == "X"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow3.get(0) == "X" && ticTacToeBoardRow2.get(1) == "X" && ticTacToeBoardRow1.get(2) == "X"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                if (ticTacToeBoardRow1.get(0) == "O" && ticTacToeBoardRow1.get(1) == "O" && ticTacToeBoardRow1.get(2) == "O") {
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow1.get(0) == "O" && ticTacToeBoardRow2.get(0) == "O" && ticTacToeBoardRow3.get(0) == "O"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow1.get(1) == "O" && ticTacToeBoardRow2.get(1) == "O" && ticTacToeBoardRow3.get(1) == "O"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow1.get(2) == "O" && ticTacToeBoardRow2.get(2) == "O" && ticTacToeBoardRow3.get(2) == "O"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow2.get(0) == "O" && ticTacToeBoardRow2.get(1) == "O" && ticTacToeBoardRow2.get(2) == "O"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow3.get(0) == "O" && ticTacToeBoardRow3.get(1) == "O" && ticTacToeBoardRow3.get(2) == "O"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow1.get(0) == "O" && ticTacToeBoardRow2.get(1) == "O" && ticTacToeBoardRow3.get(2) == "O"){
                    System.out.println("You Win");
                    System.exit(0);
                }
                else if(ticTacToeBoardRow3.get(0) == "O" && ticTacToeBoardRow2.get(1) == "O" && ticTacToeBoardRow1.get(2) == "O"){
                    System.out.println("You Win");
                    System.exit(0);
                }


//                num[i] = playerPlacement;
//                aiPlacement = (int) ((Math.random() * 9) + 1);
//                if (aiPlacement == num[i])
//                {
//                    aiPlacement = (int) ((Math.random() * 9) + 1);
//                }
//                else if(aiPlacement !)
//            }
//            if () {
//                ticTacToeWin = true;

            }
        }
        else if(playAnswer == 0)

        {
            System.out.println("Fine then.");
            System.exit(0);
        }
        else

        {
            System.out.println("You cannot do that mate!");
            System.exit(0);
        }

    }


}






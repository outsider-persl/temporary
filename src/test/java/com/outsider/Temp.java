package com.outsider;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        unicodePositions();
        palindromeNumber(scanner);
        guessNumberGame(scanner);
        arrayReference();

        // close system.in
        scanner.close();
    }

    // 输出汉字“你”，“我”，“他”在Unicode表中的位置
    public static void unicodePositions() {
        String[] characters = {"你", "我", "他"};
        for (String character : characters) {
            int codePoint = character.codePointAt(0);
            System.out.println("汉字 '" + character + "' 在Unicode表中的位置是: " + codePoint);
        }
    }

    //  用户从键盘输入一个1~99999之间的数，程序将判断这个数是几位数，并判断这个数是否是回文数
    public static void palindromeNumber(Scanner scanner) {
        System.out.print("请输入一个1~99999之间的数：");
        int number = scanner.nextInt();
        if (number < 1 || number > 99999) {
            System.out.println("输入的数不在范围内！");
        } else {
            String numberStr = String.valueOf(number);
            int length = numberStr.length();
            boolean isPalindrome = isPalindrome(numberStr);
            System.out.println("这个数是 " + length + " 位数");
            System.out.println("这个数是 " + (isPalindrome ? "回文数" : "非回文数"));
        }
    }
    // 判断是否是回文
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    // 猜数游戏
    public static void guessNumberGame(Scanner scanner) {
        int numberToGuess = (int) (Math.random() * 100) + 1; // 生成一个1到100之间的随机数
        int guess = 0;
        System.out.println("猜猜我想的是哪个1到100之间的数字？");

        while (guess != numberToGuess) {
            System.out.print("请输入你的猜测：");
            guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("太小了！");
            } else if (guess > numberToGuess) {
                System.out.println("太大了！");
            } else {
                System.out.println("恭喜你，猜对了！");
            }
        }
        scanner.close();
    }

    // 数组的引用与元素
    public static void arrayReference() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reference = numbers; // 创建一个引用数组的变量
        reference[0] = 10; // 修改引用数组的第一个元素

        System.out.println("修改后的数组：");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
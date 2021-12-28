package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(number(25,17));
        System.out.println(number(14,23));
        System.out.println(number(22,12));
        System.out.println(number(42,31));
        System.out.println(number(24,15));
        System.out.println(number(gerateRandomAge(), generateRandomTemp()));

    }
    public static String number (int age,int temperature) {

      if (age > 20 && age < 45 && temperature >= 20 && temperature <= 30){
          return "можно идти гулять";
      }else if (age <= 20 && temperature >= 0 && temperature < 28){
          return "можно идти гулять";
      }else if (age >= 40 && temperature >= -10 && temperature <= 25){
          return "можно идти гулять";
      }else {
          return "остатся дома";
      }

        }
        public static int gerateRandomAge(){
            Random random = new Random();
            int age = random.nextInt(10);
            return age;
        }
        public static int generateRandomTemp (){
        Random random = new Random();
        int temperature = random.nextInt(15);
        return temperature;
        }

    }




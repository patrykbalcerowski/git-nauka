package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        System.out.println("Podaj imie:");
        Scanner nameScanner = new Scanner(System.in);
        String userName = nameScanner.nextLine();
        System.out.println("Twoje imię to: "+userName);
        String userLastname = nameScanner.nextLine();
        System.out.println("Imie: "+userName+"\nNazwisko: "+userLastname);

        List<String> userAges = new ArrayList<>();
        userAges.add("Dwanascie");
        System.out.println(userAges);
    }

}

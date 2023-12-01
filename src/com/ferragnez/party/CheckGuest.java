package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ARRAY LISTA INVITATI
        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        System.out.println("Nome e Cognome dell'invitato");
        String userGuest = scanner.nextLine();

        boolean guestPresence = false;

        for (int i = 0; i < guestList.length; i++) {
            if (userGuest.equalsIgnoreCase(guestList[i])){
                guestPresence = true;
                break;
            }
        }
        if (guestPresence){
            System.out.println("Può entrare!");
        } else {
            System.out.println("Non può entrare");
        }

        scanner.close();
    }
}

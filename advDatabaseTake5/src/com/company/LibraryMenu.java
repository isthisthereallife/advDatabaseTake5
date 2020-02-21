package com.company;

import java.util.Scanner;

public class LibraryMenu {
    LibraryMenu() {
        String whatDo;
        System.out.println("~~~This is library~~~\n");
        do {
            System.out.println("What do?\n1. Search\n2. View all books\n3. Add Book\n0. Quit");
            whatDo = new Scanner(System.in).nextLine();
            switch (whatDo) {
                case "1":
                    new SearchMenu();
                    break;
                case "2":
                    Search.printResult(Search.findMany("bookID","",Library.bookPath));
                    break;
                case "3":
                case "0":
                    break;
                default:
                    System.out.println("Wrong. Try again.\n");
            }
        } while (!whatDo.equals("0"));
    }
}

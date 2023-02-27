package practice;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        System.out.println("Welcome to Angel's Mad Lib Generator! Answer the prompts below with the specified input:");

        System.out.println("Noun =>");
        Scanner nounInput1 = new Scanner(System.in);
        String noun1 = nounInput1.nextLine();

        System.out.println("Name =>");
        Scanner nameInput1 = new Scanner(System.in);
        String name1 = nameInput1.nextLine();

        System.out.println("Verb =>");
        Scanner verbInput1 = new Scanner(System.in);
        String verb1 = verbInput1.nextLine();

        System.out.println("Adjective =>");
        Scanner adjInput1 = new Scanner(System.in);
        String adj1 = adjInput1.nextLine();

        System.out.println("Adjective =>");
        Scanner adjInput2 = new Scanner(System.in);
        String adj2 = adjInput2.nextLine();

        String madLib = "I lost my pet potato " + name1 + " some days ago :(. He used to love " + verb1 + " in the " + adj1 + " neighbors front yard. In mourning the loss of " + name1 + ", my neighbor invited me over for some " + adj2 + " 'Potato Fajitas' he calls it! I'm glad to have such a supportive neighbor <3 ";

        System.out.println(madLib);
    }
}
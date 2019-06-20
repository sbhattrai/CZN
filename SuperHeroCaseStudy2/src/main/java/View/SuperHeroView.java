package View;

import controller.SuperHeroController;
import dto.AddSuperHeroDto;
import service.InvalidSuperTeamNameException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SuperHeroView implements SuperHeroRunner {
    SuperHeroController controller;

    @Override
    public void run(SuperHeroController c) {
        controller = c;


        System.out.println(c.listSuperHero());

        Scanner UserInput = new Scanner(System.in);

        boolean menu = true;
        int opt = 0;

        while (menu) {

            System.out.println("Welcome to SuperHeroTeam");

            System.out.println("1. View all super heros" +
                    "\n2.View all teams" +
                    "\n3.View super heros by teams" +
                    "\n4. Add a new super hero" +
                    "\n5. Exit ");

            System.out.println("Enter an option: ");

            opt = UserInput.nextInt();

            switch (opt) {

                case 1:
                    System.out.println(c.listSuperHero());
                    break;

                case 2:
                    System.out.println(c.getSuperTeam());
                    break;

                case 3:
                    try {


                        System.out.println("Enter a Super Team: ");
                        String stem = UserInput.next();
                        System.out.println(c.listSuperHero(stem));
                    } catch (InvalidSuperTeamNameException e) {
                        System.out.println("invalid SuperTeam Name ");
                    }
                    break;
                case 4:
                    System.out.println("Enter a superhero name: ");
                    String supame = UserInput.next();

                    System.out.println("Enter superhero real name: ");
                    String realName = UserInput.next();

                    System.out.println("Enter Powers: ");
                    String p = UserInput.next();
                    ArrayList<String> powers = new ArrayList<String>(Arrays.asList());

                    System.out.println("Enter Age: ");
                    int age = UserInput.nextInt();

                    System.out.println("Enter Height: ");
                    int height = UserInput.nextInt();

                    System.out.println("Enter Weight: ");
                    int weight = UserInput.nextInt();

                    System.out.println("Enter Sex: ");
                    char sex = UserInput.next().charAt(0);

                    System.out.println(c.getSuperTeam());
                    System.out.println("\nEnter a team from team above:");
                    String team = UserInput.next();

                    // System.out.println(c.addSuperHero());
                    System.out.println("Added Successfully");
                    c.addSuperHero(new AddSuperHeroDto(supame, realName, powers, age, height, weight, sex, team));
                    break;
                case 5:
                    System.out.println("GoodBye!");
                    menu = false;
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

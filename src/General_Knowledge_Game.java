import java.util.Scanner;

public class General_Knowledge_Game {

    public static void main(String[] args) {

        System.out.println("Welcome to the General Knowledge Game!");

        Scanner in = new Scanner(System.in);

        System.out.println("Type 'Yes' to continue");
        System.out.println("Type 'No' to exit");

        String input = in.nextLine();

        if (input.equals("Yes")) {
            System.out.println("Let's start");
        }

        int score = 0;
        while (input.equals("Yes")) {

            System.out.println("What country drinks the most coffee per capita?");

            String answer = in.nextLine();

            if (answer.equals("Finland")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            System.out.println("Which planet in the Milky Way is the hottest?");

            answer = in.nextLine();

            if (answer.equals("Venus")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            System.out.println("What city is known as 'The Eternal City'?");

            answer = in.nextLine();

            if (answer.equals("Rome")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            System.out.println("Roald Amundsen was the first man to reach the South Pole, but where was he from?");

            answer = in.nextLine();

            if (answer.equals("Norway")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            System.out.println("Who discovered that the earth revolves around the sun?");

            answer = in.nextLine();

            if (answer.equals("Nicolaus Copernicus")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            System.out.println("What company was initially known as 'Blue Ribbon Sports'?");

            answer = in.nextLine();

            if (answer.equals("Nike")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            System.out.println("Which planet has the most moons?");

            answer = in.nextLine();

            if (answer.equals("Saturn")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            //8
            System.out.println("How many bones do we have in an ear?");

            answer = in.nextLine();

            if (answer.equals("3")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            //9
            System.out.println("Who famously crossed the Alps with elephants on the way to war with the Romans?");

            answer = in.nextLine();

            if (answer.equals("Hannibal")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            //10
            System.out.println("What software company is headquartered in Redmond, Washington?");

            answer = in.nextLine();

            if (answer.equals("Microsoft")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            //11
            System.out.println("What is the largest Spanish-speaking city in the world?");

            answer = in.nextLine();

            if (answer.equals("Mexico City")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            //12
            System.out.println("The Parthenon Marbles are controversially located in what museum?");

            answer = in.nextLine();

            if (answer.equals("The British Museum")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            break;
        }

        String newScore = Integer.toString(score);
        double value = score;
        System.out.println("You got " + newScore + " questions correct!");
        System.out.println("You got " + ((value / 12) * 100) + "%.");

    }
}



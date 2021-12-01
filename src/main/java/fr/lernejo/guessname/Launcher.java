package fr.lernejo.guessname;

import java.security.SecureRandom;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Choisissez un mode de lancement");

        boolean help = true;
        while (help) {
            String choix = args[0];
            switch (choix) {
                case "-interactive":
                    help = false;
                    HumanPlayer paul = new HumanPlayer();
                    Simulation sim = new Simulation(paul);
                    SecureRandom random = new SecureRandom();
                    long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
                    sim.initialize(randomNumber);
                    System.out.println("La partie est prête");
                    sim.loopUntilPlayerSucceed(Long.MAX_VALUE);
                    break;
                case "-auto":
                    help = false;
                    if(args[1] != null){
                        String nb = args[1];
                        Long nb1 = Long.parseLong(nb);
                        ComputeurPlayer cp = new ComputeurPlayer(nb1);
                        Simulation sim1 = new Simulation(cp);
                        SecureRandom rd = new SecureRandom();
                        long rdNum = rd.nextInt(100)+1;
                        sim1.initialize(rdNum);
                        System.out.println("La partie est prête");
                        sim1.loopUntilPlayerSucceed(1000);
                    }
                    break;
                case "-help":
                    System.out.println("Vous avez 2 choix possibles : \n le choix -interactive qui vous permet de jouer vous-même. \n le choix -auto qui fait jouer un ordinateur à votre place. \n");

                    break;
                default:
                    System.out.println("la commande n'est pas reconnue par le logiciel.");
            }
        }
    }
}

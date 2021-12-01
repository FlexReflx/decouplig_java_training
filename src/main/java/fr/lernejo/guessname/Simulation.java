package fr.lernejo.guessname;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;
public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;

    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long guess = player.askNextGuess();
        if (guess == numberToGuess) {
            return true;
        } else {
            player.respond(guess > numberToGuess);
        }
        return false;
    }

    public void loopUntilPlayerSucceed(long max_iter) {
        logger.log("to GUESS : " + this.numberToGuess);
        long restant = 0;
        long debut = System.currentTimeMillis();
        while (!this.nextRound() && restant < max_iter) {
            restant++;
        }
        long duree = System.currentTimeMillis() - debut;
        if (restant < max_iter) {
            long s = duree/1000;
            long sss= duree%1000;
            logger.log("Partie terminée avec succès en:"+s+":"+sss);
        } else {
            logger.log("Perdu ! ");
        }
    }
}

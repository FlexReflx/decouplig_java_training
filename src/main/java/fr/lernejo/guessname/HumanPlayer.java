package fr.lernejo.guessname;
import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
        logger.log("devinez le nombre");
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            this.logger.log("plus petit");
        }else{
            this.logger.log("plus grand");
        }
    }
}

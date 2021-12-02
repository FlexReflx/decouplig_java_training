package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputeurPlayer implements Player{
    Logger logger = LoggerFactory.getLogger("player");
    long nb;
    long min =0;
    long max = 100;

    public ComputeurPlayer(Long nb1) {
        this.nb = nb1;
    }

    @Override
    public long askNextGuess() {
        return nb;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        logger.log("guess : "+nb);
        if(lowerOrGreater){
            this.max = nb;
            this.nb= (long)nb/2;
        }else{
            this.min = nb;
            this.nb = (long)(nb+(this.max-nb)/2);
        }
    }
}

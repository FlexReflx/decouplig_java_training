package fr.lernejo.guessname;

public class ComputeurPlayer implements Player{
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
        System.out.println("guess : "+nb);
        if(lowerOrGreater){
            this.max = nb;
            this.nb= (long)nb/2;
        }else{
            this.min = nb;
            this.nb = (long)(nb+(this.max-nb)/2);
        }
    }
}

public class CadetCompetition extends FencingCompetition{
    public CadetCompetition(CompetitionFormat format){
        super(format);
    }

    @Override
    public void startCompetition() {
        System.out.println("Starting Cadet Fencing Competition");
        format.conduct();
    }
}

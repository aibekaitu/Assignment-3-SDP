public class JuniorCompetiton extends FencingCompetition{
    public JuniorCompetiton(CompetitionFormat format){
        super(format);
    }

    @Override
    public void startCompetition() {
        System.out.println("Starting Junior Fencing Competition");
        format.conduct();
    }
}

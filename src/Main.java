public class Main {
    public static void main(String[] args){
        FencingCompetition competition= new CadetCompetition(new PoolFormat());
        competition.startCompetition();
        System.out.println();
        competition.setFormat(new DirectEliminationFormat());
        competition.startCompetition();
        FencingCompetition juniorCompetitiom = new JuniorCompetiton(new PoolFormat());
        juniorCompetitiom.startCompetition();
    }
}
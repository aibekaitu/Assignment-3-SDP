public abstract class FencingCompetition {
    protected CompetitionFormat format;
    public FencingCompetition(CompetitionFormat format){
        this.format = format;
    }

    public void setFormat(CompetitionFormat format) {
        this.format = format;
    }
    public abstract void startCompetition();
}

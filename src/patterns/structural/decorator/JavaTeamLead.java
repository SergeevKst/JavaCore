package patterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String sentReport(){
        return ", Sent report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sentReport();
    }
}

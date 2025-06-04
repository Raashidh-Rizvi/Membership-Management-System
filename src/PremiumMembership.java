public class PremiumMembership extends Membership{
    private boolean includesPersonalTraining;

    public PremiumMembership(){
        super();
        this.includesPersonalTraining = false;
    }
    public PremiumMembership(String membershipID,String membershipName,int durationMonth,boolean includesPersonalTraining){
        super(membershipID,membershipName,durationMonth);
        this.includesPersonalTraining = includesPersonalTraining;

    }

    public boolean isIncludesPersonalTraining() {
        return includesPersonalTraining;
    }

    public void setIncludesPersonalTraining(boolean includesPersonalTraining) {
        this.includesPersonalTraining = includesPersonalTraining;
    }

    @Override
    public double calculateFee(){
        double trainingFee = 0;
        if(includesPersonalTraining){
            trainingFee = 100;
        }
        return  (300 * getDurationMonths())+trainingFee;
    }
    @Override
    public void displayMembershipDetails(){
        super.displayMembershipDetails();
        System.out.println("Total Fee: "+calculateFee());
        System.out.println("Training Included : "+isIncludesPersonalTraining());

    }

}

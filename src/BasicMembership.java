public class BasicMembership extends Membership {
    private boolean hasGymAccess;


    public BasicMembership(){
        super();
        this.hasGymAccess = false;
    }
    public BasicMembership(String membershipName,String membershipID,int durationMonth,boolean hasGymAccess){
        super(membershipName,membershipID,durationMonth);
        this.hasGymAccess = hasGymAccess;
    }
    @Override
    public double calculateFee(){
        return 200 * getDurationMonths();

    }
    @Override
    public void displayMembershipDetails(){
        super.displayMembershipDetails();
        System.out.println("Total Fee: "+calculateFee());
        System.out.println("Gym Access: "+hasGymAccess);

    }





}

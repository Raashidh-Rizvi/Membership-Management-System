

public class Membership {
    private String membershipID;
    private String membershipName;
    private int durationMonths;

    public Membership(){
        this.membershipID = "N/A";
        this.membershipName = "N/A";
        this.durationMonths = 0;

    }
    public Membership (String membershipId,String membershipName,int durationMonths){
        this.membershipID = membershipId;
        this.membershipName = membershipName;
        this.durationMonths = durationMonths;
    }
    public void displayMembershipDetails(){
        System.out.println("Membership ID: " + this.membershipID);
        System.out.println("Membership Name: " + this.membershipName);
        System.out.println("Membership Duration Months: " + this.durationMonths);
    }
    public double calculateFee(){
        return 5000;
    }
    public double calculateFee(double discountPercentage){
        return calculateFee() -(calculateFee()*discountPercentage/100);
    }

    public String getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }
}

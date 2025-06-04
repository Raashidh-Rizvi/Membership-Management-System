public class main {
    public static void main(String[] args) {

        BasicMembership membership = new BasicMembership();

        PremiumMembership premiumMembership = new PremiumMembership("M001","Shaahidh",7,true);


        membership.calculateFee();
        premiumMembership.calculateFee();


        membership.displayMembershipDetails();
        System.out.println("After Discount: "+ membership.calculateFee(10) );
        System.out.println();

        premiumMembership.displayMembershipDetails();
        System.out.println("After Discount: "+ premiumMembership.calculateFee(15) );
    }
}

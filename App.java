public class App {
    public static void main(String[] args) throws Exception {
       
    MemberPlatinum member = new MemberPlatinum(); // ini polimorfisme
    member.hitungTotalPembayaran(11005000);
    member.getPoin();
    
    System.out.println("Member Platinum");
    System.out.println("total belanja :" +11005000);
    System.out.println("Diskon: "+member.hitungTotalPembayaran(11005000) );
    }
}

import javax.naming.ldap.ManageReferralControl;

public class Bank_main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.toCreateAccount();
        b1.deposit();
        ICICI i1 = new ICICI();
        i1.toCreateAccount();
        i1.deposit();
        i1.toCreate();
        AXIS a1 = new AXIS();
        a1.toCreateAccount();
        a1.deposit();

    }
}

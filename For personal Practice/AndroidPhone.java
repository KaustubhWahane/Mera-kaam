public class AndroidPhone {
    int battery;
    String contacts;
    boolean isPerson;
     AndroidPhone(int battery, String contacts, boolean isPerson) {
        this.battery = battery;
        this.contacts = contacts;
        this.isPerson  = isPerson;
    }
    public void connector() {
        System.out.println("Battery Life is: " + battery + "Contact Name is: " + contacts + "Is it a person? " + isPerson );
    }
}

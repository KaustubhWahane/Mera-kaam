class Player_main {
    public static void main(String[] args) {
        //Here the stadium method is overrided
        Player p1 = new Cricketer();
        p1.stadium();

        //Downcasting
        Cricketer c1 = (Cricketer)p1;
        c1.ball();

        //Upcasting
        Player p2 = (Footballer)p1;
        p2.stadium();

        //Doing downcasting in footballer class
        //In order to call the rest of two methods we have to type cast it again
        Footballer f1 = (Footballer)p1;

        f1.ball();

        //Instanceof example
        if( p1 instanceof Cricketer ){
            System.out.println("Yes it is true");
        }

    }
}
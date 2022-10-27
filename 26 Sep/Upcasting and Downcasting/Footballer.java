class Footballer extends Player{
    
    //Overriding the same method
    @Override
    void stadium(){
        System.out.println("This stadium is 10km wide");
    }
    void ball(){
        System.out.println("Football ko laat me marunga");
    }

    void defender(){
        System.out.println("Me bhidunga");
    }
}
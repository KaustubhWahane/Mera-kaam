class Cricketer extends Player{
    
    //Overriding the same method
    @Override
    void stadium(){
        System.out.println("This stadium is 15km wide");
    }
    void bat(){
        System.out.println("Batting pe me utrega");
    }

    void ball(){
        System.out.println("Dhang se balling kariyo");
    }
}
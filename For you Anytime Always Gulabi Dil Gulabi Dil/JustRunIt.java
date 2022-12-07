import java.util.Scanner;

class JustRunIt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the cases matlab ye in 6 cases me se tujhe jo accha lagta hai vo case likhna hai bas yaad rahe only one \ni love you matlab \nis it a relationship \naakhir tu hi kyu \nkya me bahut sochta hu \nwhat if you love someone else \nkya me tere baare me har waqt sochta hu \nhow did i knew that you are the one ");
        String love = sc.nextLine();
        love = love.toLowerCase();
        sc.close();
        System.out.println();
        switch(love){
            case  "i love you matlab"-> System.out.println(" Dekh simple hai mujhe bas jyada complicate nahi karna hai is chiz ko and me koi relationship me aana nahi chahta it is what it is bas");
            case  "is it a relationship"-> System.out.println("Bahenchodd kab bola mene me bas dosti ke khatir bola the only thing i just ever wanted from you bas tu aaj pata nahi kesa hoga kal najane kesa hoga but aaj tu hai bas aur kuch nako");
            case  "aakhir tu hi kyu"-> System.out.println("Jara soch jo bhagwan ko itna manti hai and bonus ye hai ki vo kabhi relationship me hai hi nahi toh tu hi bata aesi ladki toh aesa hogayi ki Sone me Suhagan");
            case  "kya me bahut sochta hu"-> System.out.println("Agar sochta toh us din himmat karke nahi batata ek toh tune block kiya nahi aur abhi chahti hai ye sawal ka me jawab du?");
            case  "what if you love someone else"-> System.out.println("Agar karti hai koi baat nahi lekin single rehna chahti hai single reh no issue lekin if you don't want any relationship me tere saat hi hu mujhe bas ek bandi chahiye jiske saat me har chiz share kar saku bina soche samje");
            case  "kya me tere baare me har waqt sochta hu"-> System.out.println("Har waqt nope lekin jab bhi saara kam hojata hai that empty void loneliness ke waqt and then i feel good bas thats it na jyada na kam sochta hu");
            case "how did i knew that you are the one" -> System.out.println("ye case select kiya hai right tujhe iska jawab toh meri dosti karke hi milega");
            default-> System.out.println("ye case iske liye agar tune koi alphabet galat likh diya ya fir kuch hogaya galat or tune block kar diya :)");
        }
    }
}
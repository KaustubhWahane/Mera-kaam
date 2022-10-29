import javax.swing.plaf.synth.SynthScrollBarUI;

public class Bird {
    void tosing(){
        System.out.println("She sings");
    }
    public int  toprint(){
        return 215;
    }
    public static void main(String[] args) {
        Pelican p1 = new Pelican();
        p1.tosing();

        Bird b1 = new Bird();
        System.out.println(b1.toprint());

        Kingfisher k1 = new Kingfisher();
        k1.tosing();
        

    }
}


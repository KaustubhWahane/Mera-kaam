

public class ClassString {
    public static void main(String[] args) {
        String a = "Yokoso";
        String b = "Yokoso";
        //Reason is stack me a and b alag store ho rha hai and the word Yokoso ek hi memory me store ho rha hai

        System.out.println(a == b);

        //Now another way to make it false
        String c = new String("Hatbhadwe");
        String d = new String("Hatbhadwe");
        System.out.println(c == d);
        //False due to the reason of its making another memory allocation of Hatbadwe ;)
        System.out.println(c.equals(d));
        //Reason this is true because ham us object ke value ko check kar rhe hai
        System.out.println(a.equals("Yokoso"));
        //Finds the length of the string
        System.out.println(a.length());
        //This will start the char of the string literal and it will begin to write from the index which user gives
        System.out.println(d.substring(2));
        //This is the same as substring but here we are giving it where to end the index of the string
        System.out.println(c.substring(2,4));
    }
}

public class method03a {
    static void myMethod(String fname) {
        System.out.println(fname + " is a nice friend");
    }

    public static void main(String[] args) {
        String[] fname = {"Tom","Jennie","Anna"};
        for (String myName : fname) {
            myMethod(myName);
        }
    }
}    

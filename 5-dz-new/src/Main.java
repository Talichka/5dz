    public class Main {
        public static void main(String[] args) {
            SecondClass secondClass = new SecondClass ();
            secondClass.myMethod();

            String myNewMethod = String.format("~~~<%d>~~~",secondClass.a);
            System.out.println(myNewMethod);}


    }
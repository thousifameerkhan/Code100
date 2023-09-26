class CodeDay3{

    CodeDay3(){}

    public static void main(String[] args){
        System.out.println("Code day 3");

        int i = 5 ;

        int[] arrays1 = new int[i];

        arrays1[0] = 570;

        // for each loop in java
        for(int k : arrays1)
        {

            System.out.println(k);
        }


        CodeDay3 c = new CodeDay3();
        System.out.println(c.addSubstrig("Thousif"));
      //  String k = (String a)->System.out.println("Songle line function "+a);

       // () -> System.out.println("Zero parameter lambda");
    }


    public String addSubstrig(String a){
        return "Welcome "+a;
    }

}
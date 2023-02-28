public class Classroom {
    public static void main(String[] args){
        Wilder marko = new Wilder("Marko", false);
        Wilder djam = new Wilder("Djam", true);
        Wilder cyril = new Wilder("Cyril",false);
        Wilder steph = new Wilder("steph",true);

        System.out.println(marco.whoAmI());
        System.out.println(djam.whoAmI());
        System.out.println(cyril.whoAmI());
        System.out.println(steph.whoAmI());
    }
}
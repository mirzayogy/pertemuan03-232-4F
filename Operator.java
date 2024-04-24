public class Operator{
    public static void main(String[] args){
        //operator dan operand
        //binary
        // - assignment (=)
        String nama = "Mirza";
        double ipk = 3.89;
        int jumlahSks = 144;

        // - aritmatika (+, -, *, /, %)

        //unary
        int i = 1;
        // System.out.println(i);
        // System.out.println(i++);
        // System.out.println(i);
        // System.out.println(++i);

        // System.out.println(i);
        // System.out.println(i--);
        // System.out.println(i);
        // System.out.println(--i);

        //illegal
        // System.out.println(i);
        // System.out.println(i**);
        // System.out.println(i);
        // System.out.println(**i);

        System.out.println(i+=3);
        System.out.println(i-=3);
        System.out.println(i*=3);
        System.out.println(i/=3);

    }
}
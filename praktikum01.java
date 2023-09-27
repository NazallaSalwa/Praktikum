import java.util.Scanner;
public class praktikum01 {
    public static void main(String[] args) {
        Scanner inputdata = new Scanner(System.in);
        double p, l, t, volume;

        System.out.print("panjang balok = "); p = inputdata.nextDouble();
        System.out.print("lebar balok = "); l = inputdata.nextDouble();
        System.out.print("tinggi balok = "); t = inputdata.nextDouble();

        volume = p*l*t;

        System.out.println("volume balok tersebut adalah = " + volume);

        
    }
}

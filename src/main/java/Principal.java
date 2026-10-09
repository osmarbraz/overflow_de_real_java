
public class Principal {

    public static void main(String[] args) {
        System.out.println("OVERFLOW DO TIPO FLOAT");
        System.out.println("---------------------------");
        float numeroFloat = Float.MAX_VALUE;
        System.out.println("Maior float=" + numeroFloat); //3.4028235E38
        System.out.println("---------------------------");
        numeroFloat = numeroFloat * 2;
        System.out.println("float * 2=" + numeroFloat);

        System.out.println("\nOVERFLOW DO TIPO DOUBLE");
        System.out.println("---------------------------");
        double numeroDouble = Double.MAX_VALUE;
        System.out.println("Maior double=" + numeroDouble); //1.7976931348623157E308
        System.out.println("---------------------------");
        numeroDouble = numeroDouble * 2;
        System.out.println("double * 2=" + numeroDouble);
    }
}

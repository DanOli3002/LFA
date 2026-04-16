public class Fraction {
    Integer denominador, numerador;
    public Fraction(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Integer getNumerador() {
        return numerador;
    }
    public Integer getDenominador() {
        return denominador;
    }
    public static Fraction addFraction(Fraction f1, Fraction f2) {
        Integer a = f1.getNumerador();
        Integer b = f1.getDenominador();
        Integer c = f2.getNumerador();
        Integer d = f2.getDenominador();

        Integer num = a*d + c*b;
        Integer den = b*d;

        return new Fraction(num, den);
    }
    public static Fraction subFraction(Fraction f1, Fraction f2) {
        Integer a = f1.getNumerador();
        Integer b = f1.getDenominador();
        Integer c = f2.getNumerador();
        Integer d = f2.getDenominador();

        Integer num = a*d - c*b;
        Integer den = b*d;

        return new Fraction(num, den);
    }
    public static Fraction mulFraction(Fraction f1, Fraction f2) {
        Integer a = f1.getNumerador();
        Integer b = f1.getDenominador();
        Integer c = f2.getNumerador();
        Integer d = f2.getDenominador();

        Integer num = a*c;
        Integer den = b*d;

        return new Fraction(num, den);
    }
    public static Fraction divFraction(Fraction f1, Fraction f2) {
        Integer a = f1.getNumerador();
        Integer b = f1.getDenominador();
        Integer c = f2.getNumerador();
        Integer d = f2.getDenominador();

        Integer num = a*d;
        Integer den = b*c;

        return new Fraction(num, den);
    }
    @Override 
    public String toString() {
        if(denominador == 1) {
            return Integer.toString(numerador);
        } else {
            return numerador + "/" + denominador;
        }
    }
}

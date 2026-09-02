public class principal {
    public static void main(String[] args) {
        circulo c1 = new circulo(2);
        circulo c2 = new circulo(3);
        circulo c3 = new circulo(5);
        circulo c4 = new circulo(10);

        System.out.println("Área do círculo 1: " + c1.calcularArea());
        System.out.println("Área do círculo 2: " + c2.calcularArea());
        System.out.println("Área do círculo 3: " + c3.calcularArea());
        System.out.println("Área do círculo 4: " + c4.calcularArea());
    }
}


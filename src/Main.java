public class Main {
    public static void main(String[] args) {

        double ladoQuadrado = 2;
        double raioCirculo = 2;

        double areaQuadrado = Formulas.calcularAreaQuadrado(ladoQuadrado);
        double areaCirculo = Formulas.calcularAreaCirculo(raioCirculo);


        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
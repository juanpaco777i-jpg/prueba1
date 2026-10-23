public class Main {
    public static void main(String[] args) {
        double nota1 = 6.0;
        double nota2 = 8.0;
        double nota3 = 10.0;
        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("Media de los tres examenes: " + media);

        double examen = 7.0;
        double practicas = 9.0;
        double notaFinal = calcularNotaFinal(examen, practicas);
        System.out.println("Nota final: " + notaFinal);
    }

    public static double calcularMedia(double a, double b, double c) {
        // CORRECCIÓN: Metí los paréntesis para forzar que sume todo antes de dividir entre 3
        double suma = (a + b + c) / 3;
        return suma;
    }

    public static double calcularNotaFinal(double examen, double practicas) {
        double parteExamen = examen * 0.6;
        // CORRECCIÓN: Cambié el 0.6 por 0.4 porque las prácticas valen un 40%
        double partePracticas = practicas * 0.4;
        return parteExamen + partePracticas;
    }
}
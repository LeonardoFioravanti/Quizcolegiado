package quiz;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        Estudiante[] top10Estudiantes = new Estudiante[10];

        top10Estudiantes[0] = new Estudiante("Juan", "Programación", "Profesor A", 95.5);
        top10Estudiantes[1] = new Estudiante("María", "Algoritmos", "Profesor B", 90.0);

        System.out.println("Listado general de estudiantes:");
        for (Estudiante estudiante : top10Estudiantes) {
            if (estudiante != null) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getCalificacion());
            }
        }

        System.out.println("Estudiante con la nota mayor:");
        Estudiante estudianteNotaMayor = getEstudianteNotaMayor(top10Estudiantes);
        System.out.println(estudianteNotaMayor.getNombre() + " - " + estudianteNotaMayor.getCalificacion());

        System.out.println("Estudiante con la nota menor:");
        Estudiante estudianteNotaMenor = getEstudianteNotaMenor(top10Estudiantes);
        System.out.println(estudianteNotaMenor.getNombre() + " - " + estudianteNotaMenor.getCalificacion());

        double promedio = calcularPromedio(top10Estudiantes);
        System.out.println("Promedio de calificaciones: " + promedio);

        System.out.println("Calificaciones por encima del promedio:");
        for (Estudiante estudiante : top10Estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() > promedio) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getCalificacion());
            }
        }

        System.out.println("Calificaciones por debajo del promedio:");
        for (Estudiante estudiante : top10Estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() < promedio) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getCalificacion());
            }
        }
    }

    private static Estudiante getEstudianteNotaMayor(Estudiante[] estudiantes) {
        Arrays.sort(estudiantes, (a, b) -> Double.compare(b.getCalificacion(), a.getCalificacion()));
        return estudiantes[0];
    }

    private static Estudiante getEstudianteNotaMenor(Estudiante[] estudiantes) {
        Arrays.sort(estudiantes, (a, b) -> Double.compare(a.getCalificacion(), b.getCalificacion()));
        return estudiantes[0];
    }

    private static double calcularPromedio(Estudiante[] estudiantes) {
        double suma = 0;
        int count = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                suma += estudiante.getCalificacion();
                count++;
            }
        }
        return count > 0 ? suma / count : 0;
    }
}

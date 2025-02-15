package Taller1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Libro libro = new Libro();

        System.out.print("Ingrese el titulo del libro: ");
        String nombreLibro = entrada.next();
        libro.setTitulo(nombreLibro);
        System.out.print("Ingrese el Autor del libro: ");
        String AutorLibro = entrada.next();
        libro.setAutor(AutorLibro);


        System.out.println(libro);


        System.out.println();
        CuentaBancaria cuentaBancaria = new CuentaBancaria();

        System.out.print("Ingrese su numero de cuenta: ");
        String NC = entrada.next();
        cuentaBancaria.setNumeroCuenta(NC);
        System.out.print("Ingrese su saldo: ");
        String S = entrada.next();
        cuentaBancaria.setSaldo(S);
        System.out.println("Tipo de Cuenta: ");
        String TC = entrada.next();
        cuentaBancaria.setTipoCuenta(TC);

        System.out.println(cuentaBancaria);


        System.out.println();
        Estudiante estudiante = new Estudiante();

        System.out.println("Nombre: ");
        String N = entrada.next();
        estudiante.setNombre(N);
        System.out.println("Edad: ");
        float E = entrada.nextFloat();
        estudiante.setEdad(E);
        System.out.println("Curso: ");
        String C = entrada.next();
        estudiante.setCurso(C);

        System.out.println(estudiante);



    }
}

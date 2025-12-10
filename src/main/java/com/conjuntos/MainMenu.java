package com.conjuntos;

import java.util.Scanner;

public class MainMenu {

    public static void line() {
        System.out.println("\n===============================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("⚙ Configuración inicial");
        line();

        System.out.print("→ Ingrese el tamaño del conjunto A: ");
        int sizeA = sc.nextInt();

        System.out.print("→ Ingrese el tamaño del conjunto B: ");
        int sizeB = sc.nextInt();

        SetVector A = new SetVector(sizeA);
        SetVector B = new SetVector(sizeB);

        line();
        System.out.println("✍ Ingrese los valores de A:");
        for (int i = 0; i < sizeA; i++) {
            System.out.print("  A[" + (i + 1) + "] = ");
            A.add(sc.nextInt());
        }

        System.out.println("\n✍ Ingrese los valores de B:");
        for (int i = 0; i < sizeB; i++) {
            System.out.print("  B[" + (i + 1) + "] = ");
            B.add(sc.nextInt());
        }

        line();
        System.out.println("📌 Conjunto A: " + A);
        System.out.println("📌 Conjunto B: " + B);
        line();

        System.out.println("📚 Resultados:");
        System.out.println("→ Unión: " + SetOperations.union(A, B));
        System.out.println("→ Intersección: " + SetOperations.intersection(A, B));
        System.out.println("→ Diferencia A-B: " + SetOperations.difference(A, B));
        System.out.println("→ Diferencia Simétrica: " + SetOperations.symmetricDifference(A, B));
        System.out.println("→ ¿A es subconjunto de B?: " + SetOperations.isSubset(A, B));
        System.out.println("→ ¿A y B son iguales?: " + SetOperations.areEqual(A, B));
        System.out.println("→ ¿A y B son disjuntos?: " + SetOperations.areDisjoint(A, B));

        sc.close();
    }
}

package com.conjuntos;

/**
 * Esta clase contiene todas las operaciones de conjuntos usando vectores.
 */
public class SetOperations {

    /**
     * Unión de dos conjuntos.
     */
    public static SetVector union(SetVector A, SetVector B) {
        SetVector result = new SetVector(A.getSize() + B.getSize());

        for (int x : A.getElements()) result.add(x);
        for (int x : B.getElements()) result.add(x);

        return result;
    }

    /**
     * Intersección de dos conjuntos.
     */
    public static SetVector intersection(SetVector A, SetVector B) {
        SetVector result = new SetVector(A.getSize());

        for (int x : A.getElements()) {
            if (B.contains(x)) result.add(x);
        }

        return result;
    }

    /**
     * Diferencia A - B.
     */
    public static SetVector difference(SetVector A, SetVector B) {
        SetVector result = new SetVector(A.getSize());

        for (int x : A.getElements()) {
            if (!B.contains(x)) result.add(x);
        }

        return result;
    }

    /**
     * Diferencia simétrica.
     */
    public static SetVector symmetricDifference(SetVector A, SetVector B) {
        SetVector part1 = difference(A, B);
        SetVector part2 = difference(B, A);

        return union(part1, part2);
    }

    /**
     * Complemento: universal - A.
     */
    public static SetVector complement(SetVector universal, SetVector A) {
        return difference(universal, A);
    }

    /**
     * Subconjunto: A ⊆ B
     */
    public static boolean isSubset(SetVector A, SetVector B) {
        for (int x : A.getElements()) {
            if (!B.contains(x)) return false;
        }
        return true;
    }

    /**
     * Igualdad de conjuntos.
     */
    public static boolean areEqual(SetVector A, SetVector B) {
        return isSubset(A, B) && isSubset(B, A);
    }

    /**
     * Conjuntos disjuntos.
     */
    public static boolean areDisjoint(SetVector A, SetVector B) {
        for (int x : A.getElements()) {
            if (B.contains(x)) return false;
        }
        return true;
    }
}

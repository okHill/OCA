package Q_1_12;

public class Q_4 {

    public static void main(String[] args) {

        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;

//        Question: Three assignments will fail. Which of them?

        fVar = iVar;    // small number fits into a larger container
//        iVar = fVar;
//        fVar = dVar;
        dVar = fVar;
//        iVar = dVar;
        dVar = iVar;
    }

    /*

    - small values can fit into larger containers
    - but the opposite is not true.
    - Primitives in ascending (small -> big) order:
            char
            byte
            short
            int
            long
            float
            double
    * */
}

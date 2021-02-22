package Q_11_20;

public class Q_24 {



    public static void main(String[] args) {
        // Given the code fragment
        String[] strs=new String[2];
        int idx=0;

        for (String s : strs) {     // s: null
//            s.concat("element "+idx);
//            strs[idx].concat("element "+idx);

            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}

/*
         * What is the output?
         * A. Element 0Element 1
         * B. Null element 0Nullelement 1
         * C. NullNull
         * D. A null pointer exception is thrown at runtime.
         */

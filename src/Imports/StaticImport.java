package Imports;

import static java.util.Arrays.asList;
import java.util.Arrays;
import java.util.List;

    public class StaticImport {
    }

        class imports {

//          .asList() is a static method.
//          It can be called by the class name Arrays.

            public static void main(String[] args) {
                List<String> list = Arrays.asList("One", "Two");
            }
        }

//        Static methods can be imported. See above

        class StaticImports {

            public static void main(String[] args) {
                List<String> list = asList("One", "Two");
            }

        }



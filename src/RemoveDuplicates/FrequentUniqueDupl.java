package RemoveDuplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequentUniqueDupl {

//    remove duplicates method
//    find frequency method
//    find unique ones method
//    Mapping into JSON format

    public static void main(String[] args) {

        String str = "AAAABBBCDDEFFGH";
        System.out.println(removeDup(str));
        System.out.println(unique(str));
        System.out.println(frequency(str));
//        we can create Map too
//        This is how data put into JSON format.
        Map<String, String> isimSoyisim = new HashMap<>();
        isimSoyisim.put("Eren", "Okur");
        Map<String, Integer> isimTel = new HashMap<>();
        isimTel.put("Eren", 77399999);

        Map<String, String> anotherString = new HashMap<>();
        anotherString.put(str, "832938");

        System.out.println(isimSoyisim);
        System.out.println(isimTel);
        System.out.println(anotherString);

    }

    public static String removeDup(String string) {
        return Arrays.stream(string.split(""))
                    .distinct()
                    .reduce("", (x,y) -> x+y);
    }

    public static String unique (String string) {

        String [] strArr = string.split("");
        Map<String, Integer> mapping = new HashMap<>();

//        System.out.println(mapping);    // it is now empty -> {}

        for (String str : strArr) {

            if (!mapping.containsKey(str)) {
                mapping.put(str,1);
            }else {
                mapping.put(str, mapping.get(str) + 1);
            }
        }

//        System.out.println(mapping); // {A=4, B=3, C=1, D=2, E=1, F=2, G=1, H=1}
//        String was mapped as key and value.

        return mapping.entrySet().stream()
                                .filter(x -> x.getValue() == 1)
                                .map(x -> x.getKey())
                                .collect(Collectors.joining());
    }

    public static String frequency(String string) {


        String [] strArr = string.split("");
        Map<String, Integer> mapping = new HashMap<>();

//        System.out.println(mapping);    // it is now empty -> {}

        for (String str : strArr) {

            if (!mapping.containsKey(str)) {
                mapping.put(str,1);
            }else {
                mapping.put(str, mapping.get(str) + 1);
            }
        }

//        System.out.println(mapping); // {A=4, B=3, C=1, D=2, E=1, F=2, G=1, H=1}
//        String was mapped as key and value.

        return mapping.entrySet().stream()
                .map(x -> x.getKey() + x.getValue())
                .collect(Collectors.joining());

    }

}

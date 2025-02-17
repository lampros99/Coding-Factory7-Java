package gr.aueb.cf.ch20;

public class regExMain {

    public static void main(String[] args) {
        String s = "Athens unic     Economics          and buss es";


//        String[] tokens = doSplit(s); //false
//
//        for(String token : tokens){
//            System.out.print(token + " ");
//        }


        System.out.println(doReplaceBackReference(s));

        System.out.println(doReplace(s));
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι το "red"
     * @param s
     * @return
     */
    public static boolean isRed(String s){
        return s.matches("red");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι το "red" η "green"
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s){
        return s.matches("red|green");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι το "red" η "Red" ή "green" ή "Green"
     * @param s
     * @return
     */

    public static boolean isrRedOrgGreen(String s){
        return s.matches("[rR]ed|[gG]een");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι απο A Εως Ζ ΚΑΙ τελειώνει σε ing.
     * @param s
     * @return
     */

    public static boolean isBigginsWithOneUpperCaseAndeEndsInIng(String s){
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsIng(String s){
        return s.matches("[A-Za-z]ing");
    }

    /**
     *  Ελέγχει αν το String s ξεκινά με ένα
     *  whitespace (κενό, tab ή newline) και ακολουθείται
     *  αμέσως από έναν ψηφίο (0-9).
     * @param s
     * @return
     */
    public static boolean whiteSpaceDigit(String s){
        return s.matches("\\s\\d");
    }

    public static boolean anySymbolDigit(String s){
        return s.matches(".\\d");
    }

    public static boolean isEmail(String s){
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s){
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s){
        return s.split("\\s+");
    }

    /**
     * Αντικαταστει ενα pattern με ενα αλλο replacement
     * @param s
     * @return
     */
    public static String doReplace(String s){
        return s.replaceAll("\\s+","&");
    }

    public static String doReplaceBackReference(String s){
        return s.replaceAll("(.+)\\s+(.+)","$2, $1" );
    }

}

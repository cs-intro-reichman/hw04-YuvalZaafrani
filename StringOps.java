public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
      
      }


    public static String capVowelsLowRest (String string) {
        String newString = "";
        String eitan = "aeiou";
        for (int i = 0; i < string.length(); i++){
            char letter = string.charAt(i);
            if (eitan.indexOf(toLower(letter)) != -1) {
               newString += toUpper(letter);  
            }
            else {
                 newString += toLower(letter);
            }
        }
        return newString;
    }
    private static String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private static String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static char toUpper (char ch) {
        int index = lowerCaseLetters.indexOf(ch);
        if (index == -1){
            return ch;
        }
        else {
            return upperCaseLetters.charAt(index); 
        }

    }
    private static char toLower (char ch) {
        int index = upperCaseLetters.indexOf(ch);
        if (index == -1){
            return ch;
        }
        else {
            return lowerCaseLetters.charAt(index); 
        }

    }

    public static String camelCase (String string) {
        String newString = "";
        boolean afterSpace = false;
        for (int i = 0; i < string.length(); i++){
             char letter = string.charAt(i);
             if (letter == ' ') {
                afterSpace = true;
             }
             else{
                if (afterSpace){
                    newString += toUpper(letter);
                }
                else {
                    newString += toLower(letter);
                }
                afterSpace = false;
             }
            
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr) {
                counter++;
            }
        }
        int[] array = new int[counter];
        int index = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}

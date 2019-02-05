 

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String hw = "Hello World";
        return hw;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String fs = "" + firstSegment;
        String res = fs + secondSegment;
        return res;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        if(input.length()<3){
            return input;
        }
        else{
            
        return input.substring(0,3);
    }
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        if(input.length()<3){
            return input;
        }
        else{
            
        return input.substring(input.length() - 3);
    }
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        if(inputValue == comparableValue){
        return true;}
        else {
        return false;
        }
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
   
       
        if (inputValue.length() % 2 == 0){
        return inputValue.charAt((inputValue.length() / 2)-1);
       }
       else{ 
        return inputValue.charAt((inputValue.length() / 2));
        }
           
    
    }
    

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String arr[] = spaceDelimitedString.split(" ", 2);
        return arr[0];
        //return spaceDelimitedString.substring(0,7);
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String arr[] = spaceDelimitedString.split(" ", 2);
        return arr[1];
        //return spaceDelimitedString.substring(8,18);
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        int i, len = stringToReverse.length();
        StringBuilder rs = new StringBuilder(len);
        
        for(i = (len - 1); i >= 0; i--){
            rs.append(stringToReverse.charAt(i));
        }
        
        return rs.toString();
    }
}

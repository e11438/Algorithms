
public class reverseString {
	/*they say that this is not efficient and nor correct either 
	 * this isn't handled null characters and surrogate pairs*/
	public String reverse(String s) {
        char[] array = new char[s.length()];
        array = s.toCharArray();
        for(int i=0; i<array.length/2; i++) {
            char tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        return charArrayToString(array);
    }

    public String charArrayToString(char[] array) {
        StringBuffer sb = new StringBuffer();
        sb.append(array);
        return sb.toString();
    }
    
    /*corrected some points still not correct because doesn't handle null 
     * and surrogate pairs*/
    public String reverse2(String s) {
        char[] array = s.toCharArray();
        char tmp;
        for(int i=array.length/2; i >= 0; i--) {
            tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        return new String(array);
    }
    
    /*complete run in 23 ms
     * For each of those 'hot' runs, I am reversing the order of 479829 words 
     * (linux.words) (and there are 4473870 characters in the data excluding 
     * newlines)*/
    public String reverse3(final String s) {
        if (s == null) {
            return null;
        }
        final char[] array = s.toCharArray();
        char tmp;
        for(int i=array.length/2; i >= 0; i--) {
            tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        //surrogte pairs will have been swapped.
        //identify, and un-swap them.
        for (int i = 1; i < array.length; i++) {
            if (Character.isHighSurrogate(array[i]) && Character.isLowSurrogate(array[i - 1])) {
                tmp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmp;
            }
        }
        return new String(array);
    }
    /*complete reverse in 25 ms*/
    public String reverse4(String s) {
        char[] array = new char[s.length()];
        for(int i=array.length - 1, j = 0; i >= 0; i--, j++) {
            array[i] = s.charAt(j);
        }
        return new String(array);
    }
    
    //use built in class and correct as avove
    public static String reverse5(final String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
    
    //this kind of methods can be used to check methods for surrogate pairs
    /*public void testCstring() {
    	
        assertEquals("\uD800\uDC00",reverse("\uD800\uDC00")); // fails
        assertEquals("\uD800\uDC00",reverse("\uDC00\uD800")); // OK
    }*/
    
    public static void main(String[] args){
    	
    	
    }

}

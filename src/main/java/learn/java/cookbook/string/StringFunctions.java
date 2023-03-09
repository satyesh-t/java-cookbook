package learn.java.cookbook.string;

public class StringFunctions {

    public char testCharAt(String str,int index) {
        // returns the char at the 0 based index or IndexOutOfBoundsException
       return  str.charAt(index);
    }
    public String toUpperCase(String str) {
        //Satyesh-->SATYESH
        return str.toUpperCase();
    }
    public String toLowerCase(String str){
        //Satyesh--> satyesh
        return str.toLowerCase();
    }
    public byte[] toByteArray(String str) {
        return str.getBytes();
    }
    public String byteArrayToString(byte[] array){
        return new String(array);
    }
    public boolean startsWith(String str,String searchStr){
       return str.startsWith(searchStr);
    }
    public boolean startsWith(String str,String searchStr,int offset){
        /*Tests if the substring of this string
        beginning at the specified index starts
        with the specified prefix.
        Params:prefix – the prefix.
         toffset – where to begin looking in this string.*/
        return str.startsWith(searchStr,offset);
    }


}

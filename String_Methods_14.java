//nameing Methods

public class String_Methods_14 {
    public static void main(String[] args){
        String name="Hola";
        System.out.println(name);

        int value=name.length();  //return the length of the string (Which is start in 0)
        System.out.println(value);

        String upperstr=name.toUpperCase();  //convert the Whole string in uppercase
        System.out.println(upperstr);

        String lowerstr=name.toLowerCase();   //convert the whole string in lowercase
        System.out.println(lowerstr);

        System.out.println(name.substring(2));   //return a substring from start Substring(2) to the end (2 is index of the string)

        System.out.println(name.substring(0,2));  //(Start :0, End:2 is excluded)
        System.out.println(name.substring(1,4));  //(Start :0, End:2 is excluded)

        //return a new string after removing all the leading and trailing space from the original string
        String nontrimmed="      harry     ";
        System.out.println(nontrimmed);

        String trimmed1=nontrimmed.trim();
        System.out.println(trimmed1);

        System.out.println(name.replace('l','a'));
        System.out.println(name.replace("Hola","Hello"));  //return a new string after replacing it "Hola" to "Hello"

        System.out.println(name.startsWith("Ho"));    //It's return (true) if it start with given string otherwise gives false

        System.out.println(name.endsWith("lla"));  //It's return (true) if it ends with given string otherwise gives false

        System.out.println(name.charAt(2));    //return a character at the given index position

        System.out.println(name.indexOf("ol"));//returns the index of ther given string
        System.out.println(name.indexOf("ll"));//returns the index of ther given string -1 if it doesn't found

        String modifiedname="hollalla";
        System.out.println(modifiedname.indexOf("lla",4));  //(Char,  start index no.

        System.out.println(modifiedname.lastIndexOf("la",4));  //(Char,  start of index no. before index 4)

        System.out.println(name.equals("Hola"));  //Returns true if string is equals with original string (with cases)

        System.out.println(name.equalsIgnoreCase("hoLA"));  //returns true if it's equals to the original string (without case)


    }
}

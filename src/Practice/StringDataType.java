package Practice;

public class StringDataType {
    public static void main(String[] args) {
        String s = "NeSo academy";
        // toUpperCase(), toLowerCase();
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        // length();
        System.out.println(s.length());

        // isEmpty();
        System.out.println(s.isEmpty());

        //isBlank();
        System.out.println(s.isBlank());

        //charAt()
        char c = s.charAt(0);
        System.out.println(c);


        //indexOf() , lastIndex()
        s.indexOf('a');
        System.out.println(s.indexOf('a'));// it will give int number
        System.out.println(s.lastIndexOf('a'));// it will give the last index number



        //concat()
        String s2 = s.concat(" Academy"); // this method concatenate the two strings.
        System.out.println(s2); // we will get Neso academy Academy
    }
}

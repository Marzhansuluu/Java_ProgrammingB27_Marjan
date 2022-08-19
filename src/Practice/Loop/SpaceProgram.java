package Practice.Loop;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Given a string return a version of with space between all the letters. If there is already a space in the String put an underscore.
        Ex: java --> j a v a
        space -----> s p a c e
        more words -> m o r e _ w o r d s
         */
        String s ="java";
        String result = "";

        for(int i =0; i < s.length(); i++){
            char letter = s.charAt(i);

            if(letter == ' '){
                result += "_";
            }else{
                result += letter + " ";
            }
        }
        System.out.println(result.trim());
    }
}

/**
 * Class for code war practices
 * Created by eddietseng on 8/9/15.
 */
public class CodeWar {
    public static String toJadenCase(String phrase) {
        if( phrase != null ) {
            if( phrase.length() == 0 )
                return null;

            String[] words = phrase.trim().split( "\\s+" );
            for( int i = 0; i < words.length; i ++ ) {
                char[] temp = words[i].toCharArray();
                temp[0] = Character.toUpperCase( temp[0] );
                words[i] = new String( temp );
            }

            String line = "";
            for( String s : words )
                line = line + " " + s;

            return line.trim();
        }
        else
            return null;
    }

    public static void main(String[] args) {
        String s = toJadenCase( "i am good." );
        System.out.println( s );
    }
}

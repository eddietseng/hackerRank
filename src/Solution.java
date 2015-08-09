import java.util.Scanner;

/**
 * Solutions for HakerRank Java Domain
 * Created by eddietseng on 8/8/15.
 */
public class Solution {
    /**
     * Java Stdin and Stdout
     */
    /*public static void main(String[] args) {
        Scanner stdin = new Scanner( System.in );
        String line;
        double d;
        int j;
        String test;

        j = stdin.nextInt();
        d = stdin.nextDouble();
        stdin.nextLine(); // next double will not parse the \n character
        line = stdin.nextLine();

        System.out.println( "String: " + line );
        System.out.println( "Double: " + d );
        System.out.println( "Int: " + j );
    }*/

    /**
     * Java Stdin and Stdout
     * parse the corresponding type with the given formate
     */
    /*public static void main(String[] args) {
        Scanner stdin = new Scanner( System.in );
        String line;
        while( stdin.hasNext() ) {
            line = stdin.nextLine();
            if( line.matches( "^\\d+\\.\\d*$" ) )
                System.out.println( "Double: " + line );
            else if( line.matches( "^\\d+$" ) )
                System.out.println( "Int: " + line );
            else
                System.out.println("String: " + line);
        }
    }*/

    /**
     * Java Output Formatting processing method
     */
    /*protected static String printLine( String line ){
        String[] temp = line.trim().split( "\\s+" ); // split by whitespace
        if( temp.length == 2 ) {
            String str1 = temp[0];
            String str2 = temp[1];
            if( temp[0].length() != 10 ){
                int nSpace = 10 - temp[0].length();
                for( int i = 0; i < nSpace ; i++ ) {
                    str1 = str1 + " ";
                }
            }
            if( temp[1].length() != 3 ) {
                int nZero = 3 - temp[1].length();
                for( int i = 0; i < nZero ; i++ ) {
                    str2 = "0" + str2 ;
                }
            }
            return( str1+str2 );
        }
        return "";
    }*/

    /**
     * Java Output Formatting Processing method
     */
    /*public static void main(String[] args) {
        Scanner stdin = new Scanner( System.in );

        String[] temp = stdin.nextLine().trim().split( "\\s+" );
        String s1 = temp[0];
        int a1 = Integer.parseInt(temp[1]);
        temp = stdin.nextLine().trim().split( "\\s+" );
        String s2 = temp[0];
        int a2 = Integer.parseInt( temp[1] );
        temp = stdin.nextLine().trim().split( "\\s+" );
        String s3 = temp[0];
        int a3 = Integer.parseInt( temp[1] );

        // stdin.next() will get elements by whitespaces
        // String s1 = stdin.next;
        // int a1 = Integer.parseInt( stdin.next ); will do the trick too.

        System.out.println( "================================" );
        // Format specifiers begin with a percent sign (%) and end with a converter
        System.out.printf("%-15s%03d %n", s1, a1); // "-" = Left-justified; 15 = 15 characters in width; s = String converter
        System.out.printf("%-15s%03d %n",s2,a2); // "03" = 3 characters in width, with leading zeroes as necessary.
        System.out.printf("%-15s%03d %n",s3,a3); // d = decimal integer converter; n = new line
        System.out.println( "================================" );
    }*/

    /**
     * Java Output Formatting
     */
    /*public static void main(String[] args) {

        Scanner stdin = new Scanner( System.in );
        String str1 = printLine( stdin.nextLine() );
        String str2 =printLine( stdin.nextLine() );
        String str3 =printLine( stdin.nextLine() );
        System.out.println( "================================" );
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println( "================================" );
    }*/
}

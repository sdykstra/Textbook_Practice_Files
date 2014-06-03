package Chapter6;

/**
 *
 * @author FT
 */
public class NumberTableOctHexBinary {

    public static void main(String args[]) {
        int num = 63;
                System.out.printf("Base 10\t|Hexadecimal| Octal\t | Binary\n");

        for (int i = 1; i < num; i++) {
                    System.out.printf("%d \t|%x\t    |%o\t\t |%s\n",i,i,i,binary(i));

        }
 for (int i = 64; i <= 256; i++) {
                    System.out.printf("%d \t|%x\t    |%o\t |%s\n",i,i,i,binary(i));

        }
    }// end main

    public int octal(int baseTen) {
        int octal = 0;

        return octal;
    }// end octal

    public static String binary(int baseTen) {
        String binary = ""+baseTen%2;
                baseTen = baseTen / 2;
        int holdNum = 0;
        do {
            
                binary += baseTen % 2;
                baseTen = baseTen / 2;
           
            
        } while (baseTen != 0);
        String fix = "";
        for(int i = binary.length()-1; i>=0 ; i--){
           // System.out.println(binary.charAt(i));
            fix +=binary.charAt(i);
        }
        return fix;
    }// end octal
}// end NumberTableOctHexBinary

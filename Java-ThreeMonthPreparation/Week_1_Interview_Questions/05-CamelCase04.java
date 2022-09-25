package HackRankSandbox;

import java.util.Arrays;

/*
S - Split  /   C - Combine
--------------------------------------
M - Method / C - Class / V - Variable

S;V;pictureFrame                picture frame

S;C;LargeSoftwareBook           large software book

S;M;plasticCup()                plastic cup

---------------------------------------------------------------

C;V;mobile phone                mobilePhone

C;C;coffee machine              CoffeeMachine

C;M;white sheet of paper        whiteSheetOfPaper()



 */
public class App {

    public static void main(String[] args) {

        String splitMethodTest = "S;M;plasticCup()";
        String combineMethodTest = "C;M;white sheet of paper";

        String[] splitTestArr = splitMethodTest.split(";");
        String[] combineTestArr = combineMethodTest.split(";");

        String splitInput = splitTestArr[2];
        String combineInput = combineTestArr[2];

        if (splitTestArr[1].equals("M")) {
            splitInput = splitInput.substring(0, splitInput.length() - 2);
        }

        if (combineTestArr[1].equals("M")) {
            combineInput = combineTestArr[2] + "()";
        }

      //  SplitMethods(splitInput);
        CombineMethods(combineInput);
    }

    public static void SplitMethods(String input) {

        String[] strArr = input.split("");
        StringBuilder builder = new StringBuilder(strArr.length + 1);

        for (int letter = 0; letter < input.length(); letter++) {
            if (Character.isUpperCase(input.charAt(letter))) {
                builder.append(" ").append(Character.toLowerCase(input.charAt(letter)));
                continue;
            }
            builder.append(input.charAt(letter));
        }
        System.out.println(builder.toString());
    }

    public static void CombineMethods(String input) {
       
        String[] strArr = input.split(" ");
        StringBuilder builder = new StringBuilder(strArr.length);
        builder.append(Character.toLowerCase(strArr[0].charAt(0)));
        for(int word=0; word<strArr.length; word++){
            if(Character.isLowerCase(input.charAt(word)))
                continue;
            
            builder.append(input.charAt(word));
            
        }
            
        
        System.out.println(builder);  
    }
}
// Arrays.asList(strArr).forEach(word->System.out.println(word));
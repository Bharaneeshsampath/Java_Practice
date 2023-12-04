package Works;

import java.util.HashSet;

public class Check_if_the_Sentence_Is_Pangram_1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        HashSet<Character> alpha = new HashSet<Character>();
        for (int i=0;i<sentence.length();i++){
            alpha.add(sentence.charAt(i));
        }
        if(alpha.size()==26){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

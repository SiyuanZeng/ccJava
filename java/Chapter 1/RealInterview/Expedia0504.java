package RealInterview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by SiyuanZeng's on 5/4/2016.
 * http://collabedit.com/mbjh8
 *
 * Sarah Hand
 *
 */
public class Expedia0504 {
    public static Character findMostFrequentChar(String input)  {
        if (null == input) {
            throw new IllegalArgumentException("please provide valid input");
        }

        if (input.trim().equals("")){
            throw new IllegalArgumentException("Input can't be empty");
        }

        Map<Character, Integer> dupMap = new LinkedHashMap<Character, Integer>();
        char[] inputArr = input.toCharArray();
        for (Character ch: inputArr) {
            if (dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch) + 1) ;
            } else {
                dupMap.put(ch, 1);
            }
        }

        Set<Character> keys = dupMap.keySet(); // a:2; b:2;   keyset: a, b

        Character res =null;
        int temp = Integer.MIN_VALUE;

        for (Character ch: keys) {
            if (dupMap.get(ch) > temp ) {
                temp = dupMap.get(ch);
                res = ch;
            }
        }
        return res;
    }


        public static void main(String[] args) {
            String newWord = "abbaa";
            char [] word = newWord.toCharArray();
            int [] freq = new int [word.length];
            for (int i=0; i<word.length; i++){
                boolean present = false;
                int count = 1;
                if(i==0){
                    int j = i + 1;
                    while(j <word.length){
                        if(word[i]==word[j]){
                            count++;
                        }
                        j++;
                    }
                    freq[i] = count;
                }
                else{
                    for (int m =0; m<i; m++){
                        if (word[i]==word[m]){
                            present = true;
                            count = 0;
                            freq[i] = count;
                            break;
                        }
                    }
                    if(present == false){
                        int j = i + 1;
                        while(j <word.length ){
                            if(word[i]==word[j]){
                                count++;
                            }
                            j++;
                        }
                        freq[i] = count;
                    }
                }
            }
            int max = 0;
            for (int i = 1;i<freq.length; i++){
                if (freq[i]>freq[max]){
                    max = i;
                }
            }
            int outcome =0;
            for (int i = 0;i<freq.length; i++){
                if (freq[max] == freq[i]){
                    outcome++;
                }
            }
            if (outcome>1){
                System.out.println("More than one character has the highest frequency");
            }
            else{
                System.out.println(word[max]);
                System.out.println(Arrays.toString(freq));
            }
        }

}







//-->  1 --> 2 --> 3 --> 4 --> .
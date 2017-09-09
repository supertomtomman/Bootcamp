package pl.kodolamacz.podstawy;

import java.util.Stack;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(ReverseWords.reverseWords("The greatest victory is that which requires no battle"));
        // should return "battle no requires which that is victory greatest The"

    }



    public static String reverseWords(String str){
        String result="";
        String[] split = str.split(" ");
        Stack<String> myStack = new Stack();
        for (String s : split) {
            myStack.push(s+" ");
        }


        while(!myStack.empty()){
            result=result+myStack.pop();
        }
        return result.trim();
        }


    }


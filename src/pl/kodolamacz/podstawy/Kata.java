package pl.kodolamacz.podstawy;





public class Kata {

    public static void main(String[]args){
        System.out.println(Kata.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        // => returns "(123) 456-7890"
    }

    public static String createPhoneNumber(int[] numbers) {
        String result = "(";
        for (int i = 0; i <numbers.length; i++) {
            if(i==2){

                result=result+numbers[i]+") ";
            }
            else if(i==5){
                result=result+numbers[i]+"-";
            }
            else {
                result=result+numbers[i]+"";
            }
        }

        return result;
    }
}

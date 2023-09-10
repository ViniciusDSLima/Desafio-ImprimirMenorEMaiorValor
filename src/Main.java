import java.util.Scanner;

public class Main {
    public static String LongestAndShortesWords(String sen){
        String[] frase = sen.split(" ");

        String longest = "";
        String shortest = "";
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        for(String palavras : frase){
            if(palavras.length() > maxLength){
                longest = palavras;
                maxLength = palavras.length();
            }

            if(palavras.length() < minLength){
                shortest = palavras;
                minLength = palavras.length();
            }
        }

        return longest + " " +  shortest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(LongestAndShortesWords(scanner.nextLine()));
    }
}
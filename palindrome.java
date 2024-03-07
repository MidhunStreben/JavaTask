// /**
//  * palindrome
//  */
public class palindrome {

    String word;
    public  void Mymethod(String word){
        this.word=word;
        StringBuilder reversedword= new StringBuilder(word).reverse();
        

        if(word.equals(reversedword.toString())){
            System.out.println("the String is Palindrome");

        }else{
            System.out.println("the string is not palindrome..");
        }
        

    }
    public static void main(String[] args) {
        palindrome obj= new palindrome();
       obj.Mymethod("141");

       
    }
    
}



 class PalindromeChecker {
    public static void main(String[] args) {
        String str1 = "radar";
        String str2 = "hello";

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        // Base case: if the string has 0 or 1 characters, it's  palindrome
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        // Compare the first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursively check if the substring excluding the first and last characters is a palindrome
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}

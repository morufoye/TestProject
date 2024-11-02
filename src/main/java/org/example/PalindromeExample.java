package org.example;

class PalindromeExample{


    boolean isPalindrome(String s){
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        int right = 0;
        int left = cleaned.length() - 1;
        System.out.println(cleaned);
        System.out.println(left < right);
        while (right < left) {
            System.out.println(" >>>>" + left);
            System.out.println(" >>>>" + right);
            System.out.println(" >>>>" + cleaned.charAt(left));
            System.out.println( " >>>>" + cleaned.charAt(right));
            System.out.println(".           ");
             if (cleaned.charAt(left) != cleaned.charAt(right)) {
                 return false;
             }
             right++;
             left --;
        }
        return true;
    }


    public static void main(String args[]){
        int n=454;//It is the number variable to be checked for palindrome
        PalindromeExample test = new PalindromeExample();
        System.out.println(test.isPalindrome("Java developer"));

        //String a = "Moruff";
        //String b = "Moruff";

        //System.out.println(" why :  " + a == b);
        //System.out.println(" a.equals(b)  : " + a.equals(b));

       /*
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
        */
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PalindromeExample that = (PalindromeExample) o;
        return isPalindrome(that.toString());

    }
}

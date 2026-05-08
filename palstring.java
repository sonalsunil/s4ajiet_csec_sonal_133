class palstring {
    public static void main(String[] args) {
       String s="madam";
       StringBuilder m=new StringBuilder(s);
       m.reverse();
       String f=m.toString();
       if(s.equals(f)){
           System.out.println("it is a palindrome");
       }
       else{
           System.out.println("it is not a palindrome");
       }
       
    }
}

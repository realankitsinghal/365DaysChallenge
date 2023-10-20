//Reverse a String

class String{

    public static String reverse(String arr)
    {
        String a="";
        for(int i=arr.length()-1;i>=0;i--)
        {
            a+=arr.charAt(i);
        }

        return a;
    }
    public static void main(String arg[])
    {
        System.out.println(reverse("Hello World"));
    }
}
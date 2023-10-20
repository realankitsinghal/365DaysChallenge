import java.util.*;

class Array{
    public static boolean ArrayChallenge(int[] a)
    {
        Arrays.sort(a);
        int l=a[a.length-1];
        int s=0;

        for(int i=0;i< a.length;i++)
        {
            s+=a[i];
        }
        if(s>=l)
            return true;
        else
            return false;
    }
    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        System.out.print(ArrayChallenge(s.nextLine()));
    }
}
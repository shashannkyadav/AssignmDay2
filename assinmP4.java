package AssignmDay2;

public class assinmP4 {
    public static void main (String as[])
    {
        int n; int c=0; int sum=0;
        for(int i=0;i<as.length;i++)
        {
            try
            {
                n=Integer.parseInt(as[i]);
                sum= sum+n;
            }
            catch (NumberFormatException e)
            {
//system.out.println("invalid integer:");
                c++;
            }
        }
        System.out.println("Sum of only valid integers is= "+sum) ;

        System.out.println("Invalid integers are: "+c) ;
    }
}

// Assignment problem no 5

    // Click Start, Run.
       // In the Run box, type "CMD" and press enter.
       // In the Command prompt that opens, type "hostname" and press enter. The computer name displays on the next line.


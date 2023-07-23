import java.util.*;

public class Xyz {
    Scanner S = new Scanner(System.in);
    int i,j;
    int a[][] = new int[3][3];
    for(i=0;i<a.length;i++) 
    {
        for(j=0;j<a.length;j++)
        {
            a[i][j] = S.nextInt();
            for(i=0;i<a.length;i++)
            {
                System.out.println();
                for(j=0;j<a.length;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}
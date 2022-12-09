class spiral
{
public static void main(String args[])
{
    int a[][]=new int[4][4];
    int r1=0,r2=3,c1=0,c2=3,i,k=1;
    for(i=c1;i<=c2;i++)
    {
        a[r1][i]=k;
        k++;
    }
    r1++;
    for(i=r1;i<=r2;i++)
    {
        a[i][c2]=k;
        k++;
        
    }
    c2--;
    for(i=c2;i>=c1;i--)
    {
        a[r2][i]=k;
        k++;
    }
    r2--;
    for(i=r2;i>=r1;i--)
    {
        a[i][c1]=k;
        k++;
    }
    c1++;
    for(i=c1;i<=c2;i++)
    {
       a[r2][i]=k;
         k++;
    }
    for(i=0;i<4;i++) 
    {
        for(int j=0;j<4;j++)
        {
           System.out.print(" " +a[i][j]);
        }
        System.out.println();
    }
 }
}
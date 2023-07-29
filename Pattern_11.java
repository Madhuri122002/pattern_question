public class Pattern_11
{
    public static void main(String[] args) 
    {
            int k=0;
            for(int i1=1 ;i1<=5;i1++)
            {
                for(int j=1;j<=i1;j++)
                {
                    System.out.print("*");
                }
                k=(4-i1)*2+1;
                for(int k1=0;k1<=k;++k1)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i2=5;i2>0;i2--)
            {
                for(int j=1;j<=i2;j++)
                {
                    System.out.print("*");
                }
                k=(5-i2)*2;
                for(int k2=1;k2<=k;k2++)
                {
                    System.out.print(" ");
                }    
                for(int j=1;j<=i2;j++)
                {
                    System.out.print("*");
                } 
                System.out.println();
            }    
        }
    }
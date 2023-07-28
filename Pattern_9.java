public class Pattern_9
{
    public static void main(String[] args) {
        {
            int val=1;
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(val);
                    if(val==1)
                    {
                        val=0;
                    }
                    else{
                        val=1;
                    }
                }
                System.out.println();
            }
        }
    }
}
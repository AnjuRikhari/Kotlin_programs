import java.util.Random;

public class random_no
{
        public static void main(String[] args)
        {
            Random r1 = new Random();
            int c=5;
            for(int i=0;i<c;i++)

            {
                System.out.println((i+1)+"random no : "+r1.nextInt(100));
            }
        }
}

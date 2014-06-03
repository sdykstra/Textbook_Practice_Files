import java.util.Random;

public class Die
{
  private Random r;

  public Die()
  {
    r = new Random( 0 );
  }

  public int roll()
  {
    return r.nextInt(6 ) + 1;
  }

  public static void main( String[] args)
  {
    Die d = new Die();

    for( int k=1; k<=100; k++ )
    {
      System.out.print( d.roll() + "  " );
      if( k % 5 == 0 )
        System.out.println();
    }

  }
}

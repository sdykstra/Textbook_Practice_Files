


public class DrinkComp {


    public static void main(String[] args) 
    {
       double customers, likeCitrus, boughtDrink, numBoughtDrink, NumLikeCitrus;
        
        customers = 12467;
        boughtDrink = .14;
        likeCitrus = .64;
       
        numBoughtDrink = customers*boughtDrink;
        NumLikeCitrus = numBoughtDrink*likeCitrus;
        
        System.out.printf("The number of customers that bought engery drinks was %,.0f\n",numBoughtDrink);
        System.out.printf("The number of customers who bought drinks that like citrus was %,.0f\n", NumLikeCitrus);
    }
}

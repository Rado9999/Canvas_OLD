package rup.cesky.tvary;

public class Circle extends Elipsa {
    
public Circle(){
    this(0, 0, getKrok());
}
  
public Circle( int x, int y, int diameter )
    {
        super( x, y, diameter, diameter, IMPLICITNI_BARVA );
    }


    /***************************************************************************
     * Vytvori novou instanci se zadanou polohou, rozmery
     * a barvou.
     *
     * @param pozice    Pozice vytvarene instance
     * @param rozmer    Rozmer vytvarene instance
     * @param barva     Barva vytvarene instance
     */
    public Circle(Pozice pozice, Rozmer rozmer, Barva barva)
    {
        this( pozice.x, pozice.y, Math.min(rozmer.sirka, rozmer.vyska), barva );
    }


    /***************************************************************************
     * Vytvori novou instanci vyplnujici zadanou oblast
     * a majici zadanou barvu.
     *
     * @param oblast   Oblast definujici pozici a rozmer vytvarene instance
     * @param barva    Barva vytvarene instance
     */
    public Circle(Oblast oblast, Barva barva)
    {
        this( oblast.x, oblast.y, Math.min(oblast.sirka, oblast.vyska), barva );
    }


    /***************************************************************************
     * Vytvori novou instanci se zadanymi rozmery, polohou a barvou.
     *
     * @param x      x-ova souradnice instance, x>=0, x=0 ma levy okraj platna
     * @param y      y-ova souradnice instance, y>=0, y=0 ma horni okraj platna
     * @param sirka  Sirka vytvarene instance,  sirka >= 0
     * @param vyska  Vyska vytvarene instance,  vyska >= 0
     * @param barva  Barva vytvarene instance
     */
    public Circle(int x, int y, int diameter, Barva barva)
    {
        super(x, y, diameter, diameter, barva);
    }
    
    
    @Override
    public void setRozmer(int sirka, int vyska)
    {
    try{
        if (sirka != vyska) throw new IllegalArgumentException(
                        "\nSirka a vyska nie su zhodne!");
        }
    catch(IllegalArgumentException ex) {
        public void setRozmer(int Math.min(sirka, vyska);
        }
    }
  
public void  setRozmer(int strana){
  super(strana, strana);
}
}  

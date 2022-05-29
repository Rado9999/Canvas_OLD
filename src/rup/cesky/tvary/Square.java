/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rup.cesky.tvary;

/**
 *
 * @author RadoK
 */
public class Square extends Obdelnik {

  
public Square(){
  this(0, 0, SP.getKrok());
  SP.pridej(this);
}

public Square(int x, int, y, int strana){
  super(x, y, strana, strana);
}
  
public Square(Pozice pozice, Rozmer rozmer, Barva barva)
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
    public Square(Oblast oblast, Barva barva)
    {
        this( oblast.x, oblast.y, oblast.sirka, oblast.vyska, barva );
    }


    /***************************************************************************
     * Vytvori novou instanci se zadanymi rozmery, polohou a barvou.
     *
     * @param x       x-ova souradnice instance, x>=0, x=0 ma levy okraj platna
     * @param y       y-ova souradnice instance, y>=0, y=0 ma horni okraj platna
     * @param sirka  Sirka vytvarene instance,  sirka >= 0
     * @param vyska  Vyska vytvarene instance,  vyska >= 0
     * @param barva   Barva vytvarene instance
     */
    public Square(int x, int y, int sirka, int vyska, Barva barva)
    {
        //Test platnosti parametru
        if( (x<0) || (y<0) || (sirka<0) || (vyska<0) ) {
            throw new IllegalArgumentException(
                "\nParametry nemaji povolene hodnoty: x="
                + x + ", y=" + y + ", sirka=" + sirka + ", vyska=" + vyska );
        }

        //Parametry akceptovany --> muzeme tvorit
        this.nazev = this.getClass().getSimpleName() + "_" + ++pocet;
        this.xPos  = x;
        this.yPos  = y;
        this.sirka = sirka;
        this.vyska = vyska;
        this.barva = barva;
    }

  /**
   *
   * @param width
   * @param height
   */
//@Override
//public void setRozmer(int width, int height){
//  
//}
public void  setRozmer(int width){
  
}
}

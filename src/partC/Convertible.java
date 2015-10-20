/****************************************
Programmer : Anthony D'Ambrosio
Title      : Lab08
Date       : 10/19/2015
*****************************************/
package partC;

public class Convertible extends Car
{
    private boolean topUp;
    
    public Convertible ( String name, boolean topUp )
    {
        super( name );
        this.topUp = topUp;
    }
    
    public void putTopUp ()
    {
        topUp = true;
        System.out.println("Putting top up");
    }
    
    @Override
    public void TurnOff()
    {
        topUp = true;
        System.out.println("Putting top up");
        super.TurnOff();
        
    }
    
    
    
}

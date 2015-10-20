/****************************************
Programmer : Anthony D'Ambrosio
Title      : Lab08
Date       : 10/19/2015
*****************************************/
package partB;


public abstract class MotorVehicle
{
    private String name;
    
    public MotorVehicle ( String name )
    {
        this.name = name;   
    }
    
    public String getName()
    {
        return name;
    }
    
    public abstract void TurnOn();
    
    public abstract void TurnOff();

    
}

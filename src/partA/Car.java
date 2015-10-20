/****************************************
Programmer : Anthony D'Ambrosio
Title      : Lab08
Date       : 10/19/2015
*****************************************/
package partA;

public class Car extends MotorVehicle
{   
    @Override
    public void TurnOn()
    {
        System.out.println("Car is starting");
    }
         
    @Override
    public void TurnOff()
    {
        System.out.println("Car is stopping");
    }
}

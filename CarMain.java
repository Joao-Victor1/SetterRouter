package Encapsulation;
public class CarMain
{

    public static void main(String[] Args){
        SetterRouter car = new SetterRouter();
        
        car.setCar("Wolkswagen", "ABC123");
        String[] carInfo = car.getCar();
        

        System.out.println("Marca: ".concat(carInfo[0] + "\nPlaca: ".concat(carInfo[1])));
    }
}

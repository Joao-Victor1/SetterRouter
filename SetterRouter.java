package Encapsulation;
public class SetterRouter extends Car {

    public String[] getCar(){

        return getCarInfoArray();
    }
    
    public void setCar(String marca, String placa){
        setCarInfo(marca, placa);
    }
}

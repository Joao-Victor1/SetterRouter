package Encapsulation;
public class Car
{
    private String marca;
    private String placa;

    protected String[] getCarInfoArray(){

        String[] carInfo = {marca, placa};
        return carInfo;
    }

    protected void setCarInfo(String marca, String placa){
        this.marca = marca;
        this.placa = placa;

    }

}


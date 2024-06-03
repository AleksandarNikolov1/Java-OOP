package L04_Interfaces_and_Abstraction.Lab.P02_Car_Shop_Extended;

public interface Rentable extends Car{

    Integer getMinRentDay();
    Double getPricePerDay();
}

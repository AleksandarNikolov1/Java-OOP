package L04_Interfaces_and_Abstraction.Lab.P01_Car_Shop;

import java.io.Serializable;

public interface Car extends Serializable {

    static final Integer TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}

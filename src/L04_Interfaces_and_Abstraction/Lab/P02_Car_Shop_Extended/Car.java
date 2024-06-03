package L04_Interfaces_and_Abstraction.Lab.P02_Car_Shop_Extended;

import java.io.Serializable;

public interface Car extends Serializable {

    static final Integer TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}

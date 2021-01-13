import org.junit.Test;
import org.junit.jupiter.api.*;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;


public class CalculatePriceTest {
    CalculatePrice  service = new CalculatePrice();
    public  static Restaurant restaurant;
    int total;


    void BeforeEach() {

        restaurant = new Restaurant("Amelie's cafe", "Chennai", openingTime, closingTime);
        restaurant.addToMenu("Sweet corn soup", 119);
        restaurant.addToMenu("Vegetable lasagne", 269);
    }

    @Test
    public void calculate_total_for_selected_menu_items(){
        total = service.CalculateTotal("Sweet corn soup","Vegetable lasagne");

        assertEquals(388,total);

    }

}

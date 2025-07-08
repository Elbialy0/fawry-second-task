package Service;


import dto.ShippingBookDto;

import java.util.List;

public class ShippingService {
    public static double shipping(ShippingBookDto shippingBook) {
        System.out.println("Shipping order send successfully for "+shippingBook.getIsbn()+" to "+shippingBook.getAddress());
        return calculateTotalPrice(shippingBook.getWeight()*shippingBook.getQuantity())+
                shippingBook.getPrice()*shippingBook.getQuantity();
    }
    private static double calculateTotalPrice(double weight) {
        return weight * 0.45;
    }

}

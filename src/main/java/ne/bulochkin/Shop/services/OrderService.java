package ne.bulochkin.Shop.services;

import ne.bulochkin.Shop.components.OrderComponent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderComponent orderComponent;

    public OrderService(OrderComponent orderComponent) {
        this.orderComponent = orderComponent;
    }

    public void add(int[] ids){
        orderComponent.add(ids);
    }
    public List<Integer> get(){
        return orderComponent.get();
    }
}

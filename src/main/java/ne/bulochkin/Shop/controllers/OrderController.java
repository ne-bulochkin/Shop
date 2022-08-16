package ne.bulochkin.Shop.controllers;

import ne.bulochkin.Shop.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {


    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping(path = "/get")
    public List<Integer> getOrder() {
        return orderService.get();
    }

    @GetMapping(path = "/add")
    public String addOrder(@RequestParam() int[] ids) {
        orderService.add(ids);
        return "{\"success\": true}";
    }
}

package ne.bulochkin.Shop.controllers;

import ne.bulochkin.Shop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/get")
    public List<Integer> getOrder() {
        return orderService.get();
    }

    @PostMapping(path = "add")
    public String addOrder(@RequestParam() int[] ids) {
        orderService.add(ids);
        return "{\"success\": true}";
    }
}

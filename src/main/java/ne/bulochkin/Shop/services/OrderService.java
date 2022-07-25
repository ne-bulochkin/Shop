package ne.bulochkin.Shop.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
@SessionScope
public class OrderService {
    List<Integer> bucket = new ArrayList<>();

    public void add(int[] ids) {
        Arrays.stream(ids).forEach(e -> bucket.add(e));
    }

    public List<Integer> get() {
        return bucket;
    }
}

package ne.bulochkin.Shop.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@SessionScope
public class OrderComponent {
    private final List<Integer> bucket = new ArrayList<>();

    public void add(int[] ids) {
        Arrays.stream(ids).forEach(bucket::add);
    }

    public List<Integer> get() {
        return bucket;
    }
}

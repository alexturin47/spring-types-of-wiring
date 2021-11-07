package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {
    @Autowired
    private Rabbit4 rabbit;

    @Override
    public String toString() {
        return ", в сундуке заяц " + rabbit.toString();
    }
}

package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private final Box box;

    @Autowired
    public Wood3(Box box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return ", на дереве сундук " + box.toString();
    }
}

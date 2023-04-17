package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = source.stream().peek(x -> {
            if (x < f) {
                logger.log("Элемент " + x + " проходит");
            } else {
                logger.log("Элемент " + x + " не проходит");
            }
        }).filter(x -> x < f).collect(Collectors.toList());
        return result;
    }

}

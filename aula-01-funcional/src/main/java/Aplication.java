import java.util.List;

public class Aplication {
    public static void main(String[] args) {
        List
                .of(1, 2, 3)
                .stream()
                .map(Integer::new)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}

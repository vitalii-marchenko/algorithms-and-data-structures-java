package self_preparation.java_features.streams;

import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1 + 1;

        Supplier<Boolean> booleanSupplier = () -> false;
        LongSupplier longSupplier = () -> 1L;
        Integer integer = supplier.get();
    }
}

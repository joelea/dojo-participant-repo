package cannot.touch;

import java.util.function.Supplier;

public class Retrying {
    public static <T> T withRetry(Supplier<T> supplier) throws InterruptedException {
        for(int i = 0; i < 60; i++) {
            try {
                return supplier.get();
            } catch(Exception e) {
                System.out.println("We could not connect to the database right now. We'll try again shortly!");
                Thread.sleep(1000);
            }
        }
        throw new IllegalStateException("Failed to connect to the database after 60 attempts");
    }
}

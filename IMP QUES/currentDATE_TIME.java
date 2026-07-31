import java.time.LocalDateTime;

public class currentDATE_TIME {
    public currentDATE_TIME() {
    }

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println(" CURRENT DATE & TIME IS :" + String.valueOf(current));
    }
}
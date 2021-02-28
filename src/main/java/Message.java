import lombok.Data;

@Data
public class Message {
    private final String id;
    private final String content;
    private final User user;
}

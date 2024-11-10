package Model.Session1;

public class YieldSwitch {
    public String detect_gender(String name){
        return switch (name) {
            case "ali", "hamed", "james" -> "male";
            case "mary", "fatemeh", "sara" -> "female";
            default -> {
                yield "unknown";
            }
        };
    }
}

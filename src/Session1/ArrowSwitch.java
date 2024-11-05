package Session1;

public class ArrowSwitch {
    public String detect_gender(String name){
        String gender = switch (name) {
            case "ali", "hamed", "james" -> "male";
            case "mary", "fatemeh", "sara" -> "female";
            default -> "unknown";
        };

        return gender;
    }
}

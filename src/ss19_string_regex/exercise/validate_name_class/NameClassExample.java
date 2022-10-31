package ss19_string_regex.exercise.validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static final String NAME_CLASS_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public NameClassExample() {
    }

    public boolean isvalid(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

package ss19_string_regex.exercise.validate_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String PHONE_NUM_REGEX="^[(]\\d{2}[)]-[(]0\\d{9}[)]$";

    public ValidatePhoneNumber() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

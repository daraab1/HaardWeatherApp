import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class valid {
    public static boolean zipCode (String s){
        Pattern pattern = Pattern.compile("^\\d{5}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        boolean matchFound = matcher.find();

        return matchFound;

    }
}

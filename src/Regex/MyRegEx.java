package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyRegEx 
{
    private static Matcher matcher;
    private static final String PATTERN="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,40})";
    private static final String PATTERN_EMAIL="^[a-zA-Z0-9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
    private static final String PATTERN_IP="^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                              "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                              "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    private static final String PATTERN_SPLIT= "\\."; //"[А-ЯA-Z].{15,}?(\\.|\\!|\\?)(?=\\ |\\r|\\n|$)";
    private static final String PATTERN_SPLIT2="([^\\\\]+$)";//"[А-ЯA-Z].{15,}?(\\.|\\!|\\?)(?=\\ |\\r|\\n|$)";
    private static final String PATTERN_INTERVAL="^.*[4-6][0-9][0-9].*$";
    private static Pattern PtternPass = Pattern.compile(PATTERN_INTERVAL);
    public static boolean checkPass(String str)
    {
        PtternPass = Pattern.compile(PATTERN);
        matcher=PtternPass.matcher(str);
        return matcher.matches();
    }
    public static boolean checkIP(String str)
    {
        PtternPass = Pattern.compile(PATTERN_IP);
        matcher=PtternPass.matcher(str);
        return matcher.matches();
    }
    public static boolean checkMail(String str)
    {
        PtternPass = Pattern.compile(PATTERN_EMAIL);
        matcher=PtternPass.matcher(str);
        return matcher.matches();
    }
    public static String[] SplitText(String str)
    {
        PtternPass = Pattern.compile(PATTERN_SPLIT);
        return PtternPass.split(str);
    }
     public static String[] SplitText2(String str)
    {
        return str.split(PATTERN_SPLIT2);
    }
    public static boolean checkInterval(String str)
    {
        PtternPass = Pattern.compile(PATTERN_INTERVAL);
        matcher=PtternPass.matcher(str);
        return matcher.matches();
    }
}

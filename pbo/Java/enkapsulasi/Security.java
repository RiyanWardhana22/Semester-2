package enkapsulasi;
import java.util.regex.*;

public class Security {            
            private String text;

            public Security(String text){
                        setText(text);
            }

            public void setText(String text){
                        Pattern pattern = Pattern.compile("<[^>]*>");
                        Matcher matcher = pattern.matcher(text);
                        this.text = matcher.replaceAll("");
            }

            public String getText(){
                        return text;
            }

            public static void main(String[] args) {
                        String htmlText = "<p>Hello, <b>World</b>!</p>";
                        Security filteredString = new Security(htmlText);
                        System.out.println("Teks setelah filter HTML = " + filteredString.getText());
            }
}

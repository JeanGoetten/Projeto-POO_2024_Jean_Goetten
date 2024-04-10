package ManipuladorStrings;

public class ManipuladorStrings {
    private String text = "";
    public void concatenar(String... args){
        for(String word : args){
            text += word;
        }
        System.out.print(text);
    }
}

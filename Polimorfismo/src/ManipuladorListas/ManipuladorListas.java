package ManipuladorListas;

import java.util.ArrayList;
import java.util.Arrays;

public class ManipuladorListas {
    private ArrayList<String> stringList = new ArrayList<>();
    private ArrayList<Float> floatList = new ArrayList<>();
    private ArrayList<Integer> intList = new ArrayList<Integer>();

    private Float soma = 0f;
    private String txt = "";
    public void addElemento(String... value){ // isso ficava bom com os slices em golang haha
        stringList.addAll(Arrays.asList(value));
    }
    public void addElemento(Integer... value){
        intList.addAll(Arrays.asList(value));
    }
    public void addElemento(Float... value){
        floatList.addAll(Arrays.asList(value));
    }
    public Float media(){
        for(Float a : floatList){
            soma += a;
        }
        for(Integer a : intList){
            soma += a;
        }
        return soma/(floatList.size() + intList.size());
    }
    public void concatenar(){
        for(String word : stringList){
            txt += word;
        }
        for(Float a : floatList){
            txt += a;
        }
        System.out.print(txt);
    }
}

package uaslp.enginering.labs;
import java.util.List;

public class Checkbox extends Control{
    String label;
    List<Control> checkbox;

    public Checkbox(String label){
        this.label = label;
    }
    public void draw(){
        System.out.print("[ ]"+ label);
    }
}

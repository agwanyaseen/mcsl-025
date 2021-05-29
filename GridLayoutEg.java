import java.applet.*;
import java.awt.*;

public class GridLayoutEg extends Applet  {
    public void init(){
        this.setLayout(new GridLayout());
        this.add(new Button("Button 1"));
        this.add(new Button("Button 2"));
        this.add(new Button("Button 3"));
        this.add(new Button("Button 4"));       
    } 
}
/*
<applet code="GridLayoutEg.class" height="300" width="300"></applet>
*/      
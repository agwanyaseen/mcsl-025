import java.applet.*;
import java.awt.*;

public class FlowLayoutEg extends Applet  {
    public void init(){
        this.setLayout(new FlowLayout());
        this.add(new Button("Button 1"));
        this.add(new Button("Button 2"));
        this.add(new Button("Button 3"));
        this.add(new Button("Button 4"));       
    } 
}
/*
<applet code="FlowLayoutEg.class" height="300" width="300"></applet>
*/      
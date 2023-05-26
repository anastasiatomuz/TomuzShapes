import java.awt.Graphics;

public class Arc extends Shape {
    // per docs for drawArc method in Graphics class, the drawArc method requires
    // a start angle and arc angle, so our subclass needs to capture these values
    // as instance variables
    private int startAngle;
    private int arcAngle;

    public Arc() {
        super();  // call Shape constructor
        startAngle = 30; // default value
        arcAngle = 70; // default value
    }

    @Override
    public void draw(Graphics g) {
        // set the color
        g.setColor(getColor());

        // draw the arc
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}


import java.util.Random;
/**
 * Random Walk.
 * @author Jake
 * @version 1.0
 */
public class RandomWalk {
    
    /**
     * Declare x.
     */
    private int x;
    
    /**
     * Declare y.
     */
    private int y;
    
    /**
     * Declare maximum steps.
     */
    private int maxSteps;
    
    /**
     * Declare how many steps need to walk.
     */
    private int numSteps;
    
    /**
     * Declare edge.
     */
    private int edge;
    
    /**
     * Declare varibable for step up.
     */
    private final int UP = 0;
    
    /**
     * Declare varibable for step down.
     */
    private final int DOWN = 1;
    
    /**
     * Declare varibable for step right.
     */
    private final int RIGHT = 2;
    
    /**
     * Declare varibable for step left.
     */
    private final int LEFT = 3;
    
    /**
     * Declare maximum distance.
     */
    private int maxDistance;
    
    /**
     * Random walk.
     * @param max
     * max steps
     * @param edge
     * edge
     */
    public RandomWalk(int max, int edge) {
        this.maxSteps = max;
        this.edge = edge;
        this.x = 0;
        this.y = 0;
        this.numSteps = 0;
        this.maxDistance = 0;
    }
    
    /**
     * Random walk.
     * @param max
     * max steps
     * @param edge
     * edge
     * @param startX
     * start at X
     * @param startY
     * start at Y
     */
    public RandomWalk(int max, int edge, int startX, int startY) {
        this.maxSteps = max;
        this.edge = edge;
        this.x = startX;
        this.y = startY;
        this.numSteps = 0;
        this.maxDistance = 0;
    }
    
    /**
     * Max. 
     * @param i1
     * @param i2
     * @return
     * max
     */
    private int max(int i1, int i2) {
        if (i1 > i2) {
            return i1;
        } else {
            return i2;
        }
    }

    /**
     * Set up random walk direction.
     */
    public void takeStep() {
        Random generator = new Random();
        int direction = generator.nextInt(4);
        
        switch (direction) {
        case UP:
            this.y++;
            break;
        case DOWN:
            this.y--;
            break;
        case RIGHT:
            this.x++;
            break;
        case LEFT:
            this.x--;
            break;
        }
        int distanceToOrigin = this.max(Math.abs(this.x), Math.abs(this.y));
        this.maxDistance = this.max(distanceToOrigin, this.maxDistance);
        this.numSteps++;
    }

    /**
     * Set up countinue to step.
     * @return
     * countinue or not.
     */
    public boolean moreStep() {
        if (this.numSteps < this.maxSteps) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Set up varible to check we still in the edge or not.
     * @return
     * inside or not
     */
    public boolean inBounds() {
        int max = this.edge;
        int min = 0 - this.edge;
        if (this.x > min && this.x < max && this.y > min && this.y < max) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Start walking.
     */
    public void walk() {
        while (this.moreStep() && this.inBounds()) {
            this.takeStep();
        }
    }

    /**
     * Get arrive X position.
     * @return
     * x
     */
    public int getX() {
        return this.x;
    }

    /**
     * Get arrive Y position.
     * @return
     * y
     */
    public int getY() {
        return this.y;
    }

    /**
     * Get distance after finish walk.
     * @return
     * distance
     */
    public int getMaxDistance() {
        return this.maxDistance;
    }

    /**
     * Return steps and position of the arrive point.
     * @return
     * step, x, y
     */
    public String toString() {
        return "Step: " + this.numSteps + "; "
                +  "Position: (" + this.x + "," + this.y + ")";
    }
}

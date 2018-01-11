
public class Collisons {
    
    static final int MAX_COORDS = 2000000;
    
    static final int MAX_STEPS = 100000;
    
    static final int P1_START_X = -3;
    
    static final int P2_START_X = 3;
    
    static final int P1_START_Y = 0;
    
    static final int P2_START_Y = 0;
    
    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        if (p1.getX() == p2.getX() 
                && p1.getY() == p2.getY()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        RandomWalk particle1 = new RandomWalk(MAX_STEPS, MAX_COORDS, P1_START_X, P1_START_Y);
        RandomWalk particle2 = new RandomWalk(MAX_STEPS, MAX_COORDS, P2_START_X, P2_START_Y);
        int numCollisons = 0;
        
        do {
            particle1.walk();
            particle2.walk();
            /*if (particle1.getX() == particle2.getX() 
                    && particle1.getY() == particle2.getY()) {
                numCollisons++;
            } */
            if (samePosition(particle1, particle2)) {
                numCollisons++;
            }
        } while (particle1.inBounds() && particle1.moreStep() 
                && particle2.inBounds() && particle2.moreStep()); 
        System.out.println("Number of Collisons: " + numCollisons);
    }

}

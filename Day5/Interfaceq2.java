package Assignment5;

interface Movable 
{
	void moveUp();
	void moveDown();
	void movLeftp();
	void moveRight();
}

class MovablePoint implements Movable {
	 int x, y, xSpeed, ySpeed;
	 
	 MovablePoint(int x, int y, int xSpeed, int ySpeed) {
	        this.x = x;
	        this.y = y;
	        this.xSpeed = xSpeed;
	        this.ySpeed = ySpeed;
	    }
	 
	@Override
	public void moveUp() {
		y += ySpeed;
		
	}

	@Override
	public void moveDown() {
		y -= ySpeed;
		
	}

	@Override
	public void movLeftp() {
		x -= xSpeed;
		
	}

	@Override
	public void moveRight() {
		x += xSpeed;
		
	}
	
	public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

class MovableCircle implements Movable
{
	int radius;
    MovablePoint center;
    
    MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

	@Override
	public void moveUp() {
		center.moveUp();
		
	}

	@Override
	public void moveDown() {
		center.moveDown();
		
	}

	@Override
	public void movLeftp() {
		center.movLeftp();
		
	}

	@Override
	public void moveRight() {
		center.moveRight();
		
	}
	
	public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }
}




class MovableRectangle implements Movable {
    MovablePoint topLeft, bottomRight;

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
            throw new IllegalArgumentException("Speeds must be equal");
        }
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void movLeftp() {
        topLeft.movLeftp();
        bottomRight.movLeftp();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

}

public class Interfaceq2 {

	public static void main(String[] args) {
		MovablePoint p1 = new MovablePoint(0, 0, 2, 2);
        p1.moveUp();
        p1.moveRight();
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(5, new MovablePoint(3, 3, 1, 1));
        c1.moveDown();
        c1.movLeftp();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(
            new MovablePoint(1, 1, 1, 1),
            new MovablePoint(4, 4, 1, 1)
        );
        r1.moveRight();
        r1.moveUp();
        System.out.println(r1);

	}

}

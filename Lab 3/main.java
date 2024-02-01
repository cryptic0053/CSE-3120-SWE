public class main implements Comparable<main> {

    private int x;
    private int y;

    // Constructors
    public main() {
        this.x = 0;
        this.y = 0;
    }
    public main(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(main o) {
        if (this.x < o.x) return -1;
        else if (this.x > o.x) return 1;
        else if (this.y < o.y) return -1;
        else if (this.y > o.y) return 1;
        else return 0;
    }

    // Override toString() for better representation
    @Override
    public String toString() {
        return "Main [x=" + x + ", y=" + y + "]";
    }

    public static void main(String[] args) {
        main main1 = new main(5, 10);
        main main2 = new main(3, 8);

        System.out.println(main1.compareTo(main2));
        System.out.println(main2.compareTo(main1));

        System.out.println(main1);
    }
}

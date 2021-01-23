package human;

public class Athlete  implements Actions{
    String walking;
    @Override
    public void run(String walk) {
        walking = walk;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "walking='" + walking + '\'' +
                '}';
    }
}

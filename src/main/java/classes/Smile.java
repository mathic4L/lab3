package classes;

public class Smile extends Emotion {
    @Override
    public String express() {
        return "улыбнулся";
    }

    @Override
    public String toString() {
        return "Smile{}";
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

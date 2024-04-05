package classes;

import interfaces.Headdress;

public class Cylinder implements Headdress {
    @Override
    public String getType() {
        return "цилиндр";
    }

    @Override
    public String toString() {
        return "Cylinder{}";
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

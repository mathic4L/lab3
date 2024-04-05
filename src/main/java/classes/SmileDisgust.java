package classes;

public class SmileDisgust extends Smile {
    @Override
    public String express() {
        return
                " изобразив на лице подобие улыбки,которую с таким же успехом можно было принять за гримасу отвращения ";
    }

    @Override
    public String toString() {
        return "SmileDisgust{}";
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

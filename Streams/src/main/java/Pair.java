import java.util.Objects;

public class Pair {
    private String toUpperCase;
    private String toLowerCase;

    public Pair(String toUpperCase, String toLowerCase) {
        this.toUpperCase = toUpperCase;
        this.toLowerCase = toLowerCase;
    }

    public String getToUpperCase() {
        return toUpperCase;
    }

    public void setToUpperCase(String toUpperCase) {
        this.toUpperCase = toUpperCase;
    }

    public String getToLowerCase() {
        return toLowerCase;
    }

    public void setToLowerCase(String toLowerCase) {
        this.toLowerCase = toLowerCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(toUpperCase, pair.toUpperCase) && Objects.equals(toLowerCase, pair.toLowerCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toUpperCase, toLowerCase);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "toUpperCase='" + toUpperCase + '\'' +
                ", toLowerCase='" + toLowerCase + '\'' +
                '}';
    }
}

package lab.action;

public abstract class Action {
    public abstract String execute();
    public abstract String getDescription();

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Action)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        return false;
    }
}

package Demo1;

import java.util.HashSet;
import java.util.Set;

public class Names<String> {
    private final Set<String> names = new HashSet<>();

    public void add(String name) {
        names.add(name);
    }

    @Override
    public java.lang.String toString() {
        return "Current Names" + names;
    }
}

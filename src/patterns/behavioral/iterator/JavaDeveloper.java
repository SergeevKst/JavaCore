package patterns.behavioral.iterator;

public class JavaDeveloper implements Collection<String> {
    private final String name;
    private final String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<String> getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator<String> {
        int index;

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public String next() {
            return skills[index++];
        }
    }
}

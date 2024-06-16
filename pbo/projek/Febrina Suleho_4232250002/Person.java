public abstract class Person {
    protected String name;
    protected int birthDay, birthMonth, birthYear;

    public Person(String name, int birthDay, int birthMonth, int birthYear) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public abstract void displayAge(int currentDay, int currentMonth, int currentYear);
}

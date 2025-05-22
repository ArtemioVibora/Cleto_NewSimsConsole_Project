public class Character extends Person {

    public Character(String name, int age)
    {
        super(name, age);
    }

    public Character()
    {

    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
}

public class Character extends Person {

    private float angry;
    private float sad;
    private float happy;
    private float neutral;

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

    public void setAngry(float angry) {
        this.angry = angry;
    }

    public void setSad(float sad) {
        this.sad = sad;
    }

    public void setHappy(float happy) {
        this.happy = happy;
    }

    public void setNeutral(float neutral) {
        this.neutral = neutral;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public float getAngry() {
        return angry;
    }

    public float getSad() {
        return sad;
    }

    public float getHappy() {
        return happy;
    }

    public float getNeutral() {
        return neutral;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

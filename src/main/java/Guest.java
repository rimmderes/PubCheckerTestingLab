public class Guest {

    private String name;
    private int age;
    private double money;
    private int soberScale;

    private String banned;
    private char currency;


    public Guest(String name, int age, double money, String banned, int soberScale, char currency) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.soberScale = soberScale;
        this.banned = banned;
        this.currency = currency;

    }






    /// GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public int getSoberScale() {
        return soberScale;
    }
    public void setSoberScale(int soberScale) {
        this.soberScale =soberScale;
    }

    public String getBanned() {
        return banned;
    }

    public char getCurrency() {
        return currency;
    }

}


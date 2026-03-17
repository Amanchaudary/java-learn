package encapsulation_inhertance;

public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amout) {
        balance += amout;
    }

    public void withdraw(int amout) {
        balance -= amout;
    }

    // getters and setters
    public double getBalance() {
        return balance;
    }
}

class Student {
    private String name;
    private int rollNumbers;
    private int age;
    private String college;
    Student( String name,int rollNumbers,int age,String college){
        this.name=name;
        this.age=age;
        this.rollNumbers=rollNumbers;
        this.college=college;
    }
    // getters ans setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumbers() {
        return rollNumbers;
    }
    public void setRollNumbers(int rollNumbers) {
        this.rollNumbers = rollNumbers;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
}

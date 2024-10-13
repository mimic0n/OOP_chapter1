public class Account {
    private String id;
    private String name;
    private int balance ;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit (int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else
            System.out.println(" Amount exceed balance");
        return balance;
    }
    public int transferTo(Account another, int amount) {
        if (balance >= amount) {
            balance -= amount;
            another.credit (amount);

        }
        else System.out.println( " Amount exceed balance");
        return balance;
    }
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }



}

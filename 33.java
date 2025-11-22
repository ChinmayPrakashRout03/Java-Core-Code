// 33. Program to find max balance user (Model Class Required)
import java.util.ArrayList;

// The Model Class (for data)
class Account {
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private int id;
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private long balance; // Using long for potentially large balances

    // Constructor to initialize the object
    public Account(int id, String name, long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter method to access the private balance
    public long getBalance() {
        return balance;
    }

    // Getter method to access the private name
    public String getName() {
        return name;
    }
    
    // Setter for name (just for demonstration of encapsulation)
    public void setName(String name) {
        this.name = name;
    }
}

@SuppressWarnings("unused")
class BankTester {
    public static void main(String[] args) {
        // Q8. Find name of user who has maximum balance
        
        // Create a list to hold the accounts
        ArrayList<Account> accounts = new ArrayList<>();
        
        // Add sample data
        accounts.add(new Account(101, "Amit", 1000));
        accounts.add(new Account(102, "Kamini", 1000000)); // Max balance
        accounts.add(new Account(103, "Ravi", 15000));
        
        // Variables to track the max balance and the owner's name
        long maxBalance = 0;
        String maxName = "No Account Found";

        // Loop through all accounts
        for (Account acc : accounts) {
            if (acc.getBalance() > maxBalance) {
                maxBalance = acc.getBalance();
                maxName = acc.getName();
            }
        }
        
        System.out.println("--- Bank Account Analysis (BTech Code) ---");
        System.out.println("The maximum balance found is: " + maxBalance);
        System.out.println("The user with the maximum balance is: " + maxName);
    }
}
package exercise2;

abstract class GameTester {
    private String name;
    private boolean isFullTime;

    // Constructor
    public GameTester(String name, boolean isFullTime) {
        this.name = name;
        this.isFullTime = isFullTime;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Abstract method
    public boolean isFullTime() {
        return isFullTime;
    }
    
    public abstract double determineSalary();
}


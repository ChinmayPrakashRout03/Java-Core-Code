// 26. Constructor Overloading
class Language {
    String name;
    
    // Default constructor
    Language() {
        System.out.println("Default constructor called.");
    }
    
    // Parameterized constructor
    Language(String t) {
        name = t;
        System.out.println("Parameterized constructor called for: " + name);
    }
    
    public static void main(String[] args) {
        Language cpp = new Language();
        Language java = new Language("Java");
        
        cpp.setName("C++");
        java.getName();
        cpp.getName();
    }
    
    void setName(String t) {
        name = t;
    }
    
    void getName() {
        System.out.println("Language name: " + name);
    }
}
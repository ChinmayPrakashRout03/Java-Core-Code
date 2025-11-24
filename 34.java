// 34. student class method
class Student {
    private int studentId;
    private String studentName;

    // Default constructor is always good to have
    public Student() {
        this.studentId = 0;
        this.studentName = "N/A";
    }

    // Q7. createStudent method
    public void createStudent(int id, String name) {
        if (this.studentId != 0) {
            System.out.println("ERROR: Student already created with ID " + this.studentId);
            return;
        }
        this.studentId = id;
        this.studentName = name;
        System.out.println("Student created successfully: ID=" + id + ", Name=" + name);
    }

    // Q7. updateStudent method
    public void updateStudent(String newName) {
        if (this.studentId == 0) {
            System.out.println("ERROR: Cannot update. Student object is empty.");
            return;
        }
        
        System.out.println("Updating student " + this.studentName + " (ID: " + this.studentId + ")");
        this.studentName = newName;
        System.out.println("Update complete. New Name: " + this.studentName);
    }
    
    // Simple display method
    public void display() {
        System.out.println("Current Student Data: " + this.studentId + " - " + this.studentName);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        
        // 1. Create a student
        s1.createStudent(390, "Gautam Sharma");
        s1.display();
        
        // 2. Update the student
        s1.updateStudent("Gautam S. (BTech 2nd Year)");
        s1.display();
        
        // 3. Trying to create again should fail
        s1.createStudent(391, "New Student");
    }
}

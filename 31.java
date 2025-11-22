// 31. Thread joining using join()
class TestJoinMethod extends Thread {
    @SuppressWarnings({"override", "UseSpecificCatch"})
    public void run() {
        for (int i = 1; i <= 3; i++) { // Reduced loop for brevity
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String args[]) {
        TestJoinMethod t1 = new TestJoinMethod();
        TestJoinMethod t2 = new TestJoinMethod();
        TestJoinMethod t3 = new TestJoinMethod();
        
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        
        try {
            // t2 and t3 must wait for t1 to finish
            t1.join(); 
        } catch (Exception e) {
            System.out.println(e);
        }
        
        t2.start();
        t3.start();
    }
}
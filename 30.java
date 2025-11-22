// 30. Create Multithreading program 
class MultiThread extends Thread {
    // The code to be executed by the thread
    @SuppressWarnings("override")
    public void run() {
        System.out.println("Thread is running... (created by Chinmay)");
    }
    
    public static void main(String args[]) {
        MultiThread t1 = new MultiThread();
        // Start the thread, which calls the run() method
        t1.start();
    }
}
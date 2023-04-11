public class Main {
    public static void main(String[] args) {

        System.out.println("Inside Main thread");
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);
        thread.setName("FirstThread");
        System.out.println(thread.getName());
        System.out.println(thread.getId());




        System.out.println("Terminating main thread");

    }
}
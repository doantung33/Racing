public class Main {
    public static void main(String[] args) {
        Racing car1= new Racing("di bo");
        Racing car2= new Racing("mec");
        Racing car3= new Racing("xe dap");
        Thread thread1= new Thread(car1);
        Thread thread2= new Thread(car2);
        Thread thread3= new Thread(car3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

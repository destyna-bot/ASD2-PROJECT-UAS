
package Queue;

public class Antrian_App {
    public static void main(String[] args){
        Antrian antrian = new Antrian(5);
        antrian.enqueue(34);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan = "+ antrian.peek());
        System.out.println("Nama saya adalah DESTY NURUL ANITSA 20090134");
        System.out.println(" ");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil dalam antrian = "+ antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = "+ antrian.peek());
   
    }
}

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    //Пример PriorityQueue с компаратором
    Queue<Ticket> customerPriorityQueue = new PriorityQueue<>(10, idComparator);

    addDataToQueue(customerPriorityQueue); //добавление в очередь
    pollDataFromQueue(customerPriorityQueue); // распечатка элементов

    }

    // Компаратор
    private static Comparator<Ticket> idComparator = (c1, c2) -> {
     if (c1.isVip() && c2.isVip()) {
         if(c1.getPrice()>c2.getPrice()) { return -1;}
         if(c1.getPrice()<c2.getPrice()) { return 1;}
     }if (!c1.isVip() && !c2.isVip()) {
         if(c1.getPrice()>c2.getPrice()) { return -1;}
         if(c1.getPrice()<c2.getPrice()) { return 1;}
     }if (!c1.isVip() && c2.isVip()) {
         return 1;
     }if (c1.isVip() && !c2.isVip()) {
         return -1;
     }

    return 0;

    };

    // Метод добавления элементов в очередь
    private static void addDataToQueue(Queue<Ticket> customerPriorityQueue) {
            customerPriorityQueue.add(new Ticket(true, 500));
            customerPriorityQueue.add(new Ticket(true, 60));
            customerPriorityQueue.add(new Ticket(false, 1000));
            customerPriorityQueue.add(new Ticket(true, 80));
            customerPriorityQueue.add(new Ticket(false, 900));
            customerPriorityQueue.add(new Ticket(true, 15));
            customerPriorityQueue.add(new Ticket(true, 110));
            customerPriorityQueue.add(new Ticket(false, 50));
            customerPriorityQueue.add(new Ticket(false, 5000));
            customerPriorityQueue.add(new Ticket(true, 5000));
    }

    //Метод для распечатки данных очереди
    private static void pollDataFromQueue(Queue<Ticket> customerPriorityQueue) {
        while(true){
            Ticket cust = customerPriorityQueue.poll();
            if(cust == null) break;
            System.out.println(cust);
        }
    }
}


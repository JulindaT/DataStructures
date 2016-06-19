

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        String[] anArray = {"1","2","3","4","a","b","c","d"};
//
//        System.out.println(contains(anArray,"d"));
//        computesum();


//        Queue myQueue = new Queue();
//        System.out.println("adding Hi and Hello to Queue...");
//        myQueue.enqueue("Hi");
//        myQueue.enqueue("Hello");
//        while (myQueue.countOfEntries() > 0) {
//            System.out.println("There are now " + myQueue.countOfEntries() + " entries");
//            System.out.println("Removed " + myQueue.dequeue());
//            System.out.println("Queue is empty!");
//        }

        List myList = new List();

        myList.enqueue("Strang");
        myList.add("Strang2");

        System.out.println(myList.getEntry(2));

        myList.toArray();

        System.out.println("Java".hashCode());
        System.out.println((int)"Java".charAt(0));


    }


    public static void computesum() {
        // Computing the sum of the consecutive integers from 1 to n:
        long n = 10000; // ten thousand
        // Algorithm A
        long sum = 0;
        for (long i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println(sum);
        // Algorithm B
        sum = 0;
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= i; j++)
                sum = sum + 1;
        } // end for
        System.out.println(sum);
        // Algorithm C
        sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    public static boolean contains(String[] anArray, String anEntry) {
        boolean found = false;
        for (int index = 0; !found && (index < anArray.length); index++) {
            if (anEntry.equals(anArray[index])) {
                found = true;
            } // end if
        } // end for
        return found;
    } // end contains
}

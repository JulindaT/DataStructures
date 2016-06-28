

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


        HashTable myTable = new HashTable();
        System.out.println(myTable.toString());
        myTable.insert(new Address("Bob", "Smith", "555-235-1111","bsmith@somewhere.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Jane", "Williams", "555-235-1112","jw@something.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Mohammed", "al-Salam", "555-235-1113","mas@someplace.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Pat", "Jones", "555-235-1114","pjones@homesweethome.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Billy", "Kidd", "555-235-1115","billy_the_kid@nowhere.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("H.", "Houdini", "555-235-1116","houdini@noplace.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Jack", "Jones", "555-235-1117","jjones@hill.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Jill", "Jones", "555-235-1118","jillj@hill.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("John", "Doe", "555-235-1119","jdoe@somedomain.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Jane", "Doe", "555-235-1120","jdoe@somedomain.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Test", "Case", "555-235-1121","Test_Case@testcase.com"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Nadezhda", "Kanachekhovskaya", "555-235-1122","dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru"));
        System.out.println(myTable.toString());
        myTable.insert(new Address("Jo", "Wu", "555-235-1123","wu@h.com"));
        System.out.println(myTable.toString());
        myTable.removeEntry(new Address("Mohammed", "al-Salam", "555-235-1113","mas@someplace.com"));
        System.out.println(myTable.toString());


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

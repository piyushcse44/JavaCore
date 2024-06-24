package colllections.list;

import java.util.*;
import java.util.LinkedList;



public class Lists {
    
    public static void main(String[] args) {


        // LinkedList<Integer> linkedList = new LinkedList<>();
        // System.out.println(LocalTime.now());
        // for(int i=0;i<10000000;i++)
        // linkedList.add(i);
    
        // ArrayList<Integer> arrayList = new ArrayList<>(linkedList);

        // System.out.println(LocalTime.now());
        // System.out.println(linkedList.get(5000000));
        // System.out.println(LocalTime.now());
        // System.out.println(arrayList.get(5000000));
        // System.out.println(LocalTime.now());

        // System.out.println(linkedList instanceof Serializable);
        // System.out.println(arrayList instanceof Serializable);

        // System.out.println(linkedList instanceof Cloneable);
        // System.out.println(arrayList instanceof Cloneable);

        // System.out.println(linkedList instanceof RandomAccess);
        // System.out.println(arrayList instanceof RandomAccess);

        // ArrayList is by default non syncronous
        // To make it syncronous we use synchronizedList(List l)


        // List<Integer> linkedList = new LinkedList<>();
        // for(int i=0;i<12;i++)
        // {
        //     linkedList.add(i);
        // }

        // System.out.println(linkedList);

        // linkedList.addFirst(12);

        // System.out.println(linkedList.getFirst());
        // System.out.println(linkedList.getLast());

        // linkedList.removeFirst();
        // System.out.println(linkedList.getFirst());
        // linkedList.removeLast();
        // System.out.println(linkedList.getLast());
        // linkedList.set(2,16);
        // System.out.println(linkedList);

        // Stack<Integer> st = new Stack<>();
        // st.push(10);
        // st.push(20);
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // System.out.println(st.peek());
        // st.push(22);
        // System.out.println(st.search(2));

       //                         Iterator

                    LinkedList<Integer> lls = new LinkedList<>();
                    for(int i=0;i<10;i++)
                    {
                        lls.add(i);
                    }
                    Iterator<Integer> it = lls.iterator();
                    while(it.hasNext())
                    {
                        Integer val =  it.next();
                        if(val %2==0) it.remove();
                        System.out.println(val);
                    }
                        System.out.println("outside");

                    it = lls.iterator();
                        while(it.hasNext())
                    {
                        Integer val =  it.next();
                        System.out.println(val);
                    } 

        //                     ListIterator
                     LinkedList<Integer> lls = new LinkedList<>();
                    for(int i=0;i<10;i++)
                    {
                        lls.add(i);
                    }
                    ListIterator<Integer> it = lls.listIterator();

                    while(it.hasNext())
                    {
                        Integer val = it.next();
                        it.add(val+1);
                    }
                    System.out.println();
                    System.out.println(lls);
                    while(it.hasPrevious())
                    {
                        Integer val = it.previous();
                        System.out.print(it.previousIndex());
                        System.out.println(" "+val);

                    }
                        
        

    



    }
}


import java.util.LinkedList;
public class LinkedListFramework {
    public static void main(String[] args){
        //Create LL
        LinkedList<Integer> list = new LinkedList<>();

        //Add node
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //Add at Beginning
        list.addFirst(5);
        System.out.println(list);

        //Add at End
        list.addLast(40);
        System.out.println(list);

        //Addd at Specific Index
        list.add(3,25);
        System.out.println(list);

        //Get an Element
        list.get(2);

        //Get first
        list.getFirst();

        //Get last
        list.getLast();

        //Remove First Element
        list.removeFirst();
        System.out.println(list);

        //Remove Last Element
        list.removeLast();
        System.out.println(list);

        //Remove bby Index
        list.remove(1);
        System.out.println(list);

        //Remove by Value
        list.remove(Integer.valueOf(20));
        System.out.println(list);

        //Check if Element Exists
        if(list.contains(30)){
            System.out.println("Found");
        }

        //Find Size
        System.out.println(list.size());

        //Check Empty List
        System.out.println(list.isEmpty());

        //Traverse LinkedList
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i ));
        }
    }
}

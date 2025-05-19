import java.util.*;

class Parent {
    private void display() {
        System.out.println("Parent method");
    }

    public void getNumber(){
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
}

class Child extends Parent {
    private void display() {
        System.out.println("Child method");
    }

    @Override
    public void getNumber() {
        System.out.println("getting Number");
        super.getNumber();
    }
}


public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        Parent obj1 = new Parent();
        Child obj4 = new Child();
        obj.getNumber();
        obj1.getNumber();
        obj4.getNumber();

        Map<Long,Integer> noOfOpeningMap = new HashMap<>();
        Map<Long,Integer> noOfOffersMadeMap = new HashMap<>();

        noOfOffersMadeMap.get("rahul");
        System.out.println("rahul");

        getHierarchyList("India>Uttarakhand>Dehradun>Cluster 2>Cluster 2>Dehradun>Dehradun>Dehradun-Max Super Speciality Hospital");
    }

    public static List<String> getHierarchyList(String hierarchy){
        List<String> hierarchyList=null;
        StringBuilder hierarchyBuilder=null;
        if (hierarchy != null && hierarchy != "") {
            hierarchyList=new ArrayList<>();
            hierarchyBuilder=new StringBuilder();
            String[] arrOfStr = hierarchy.split(">");
            boolean isRepeating = true;
            for (String a : arrOfStr) {
                if (!isRepeating) {
                    hierarchyBuilder.append(">");
                } else {
                    isRepeating = false;
                }
                hierarchyBuilder.append(a);
                hierarchyList.add(hierarchyBuilder.toString());
            }
        }


        System.out.println(hierarchyList);
        return hierarchyList;
    }
}
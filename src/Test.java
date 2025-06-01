import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
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
//        System.out.println("rahul");

        String mailToPlaceHolder = "", mailTo;

        System.out.println(mailToPlaceHolder);

        System.out.println(validate(mailToPlaceHolder));

//        getHierarchyList("Asia>India>Maharashtra>Thane");
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

    public static boolean validate(final String hex) {
        Pattern pattern;
        Matcher matcher;
        boolean isEmail = false;
        try{
            pattern = Pattern.compile(EMAIL_PATTERN);

            if(pattern != null){
                matcher = pattern.matcher(hex);
                isEmail = matcher.matches();
            }

        }catch(Exception e){
        }
        return isEmail;

    }
}
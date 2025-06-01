
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test2 {

    public static void main(String[] args) {
//    resolveIJPJobsPlaceholder(null);

        int[] arr = new int[3];
        System.out.println(arr[0]);

    }

    private static void resolveIJPJobsPlaceholder(String content) {

        String groupStyleLeft = " width=\"200\" style=\"border:solid 1px #ccc; padding:7px 10px; font-weight:bold; text-align:left;\"";
        String groupStyleRight = " width=\"200\" style=\"border:solid 1px #ccc; padding:7px 10px; font-weight:bold; text-align:right;\"";
        String payHeadStyleLeft = " width=\"200\" style=\"border:solid 1px #ccc; padding:7px 10px; text-align:left;\"";
        String payHeadStyleRight = " width=\"200\" style=\"border:solid 1px #ccc; padding:7px 10px; text-align:right;\"";

        List<Object[]> dummyData = new ArrayList<>();

        dummyData.add(new Object[] {
                101L, "Alice Johnson", "alice.johnson@company.com",
                "Software Engineer", "SE101", new Date(), "alice.hr@company.com",
                "Band 5", "Grade A", "India>DELHI>New Delhi>Home Office>Home Office>Delhi Home Office>Home Office>Home Office-Gurgaon", "Bangalore"
        });

        dummyData.add(new Object[] {
                102L, "Bob Smith", "bob.smith@company.com",
                "Data Analyst", "DA202", new Date(), "bob.hr@company.com",
                "Band 4", "Grade B", "India>DELHI>New Delhi>Home Office>Home Office>Delhi Home Office>Home Office>Home Office-Gurgaon", "Hyderabad"
        });

        dummyData.add(new Object[] {
                103L, "Carol Lee", "carol.lee@company.com",
                "Product Manager", "PM303", new Date(), "carol.hr@company.com",
                "Band 6", "Grade C", "India>DELHI>New Delhi>Home Office>Home Office>Delhi Home Office>Home Office>Home Office-Gurgaon", "Chennai"
        });

        dummyData.add(new Object[] {
                104L, "David Kumar", "david.kumar@company.com",
                "UX Designer", "UX404", new Date(), "david.hr@company.com",
                "Band 3", "Grade D", "Org Unit 1> org Unit 2> orgUnit 3> Orgunit 4> Orgunit 5", "Mumbai"
        });

        dummyData.add(new Object[] {
                105L, "Eva Mendes", "eva.mendes@company.com",
                "QA Engineer", "QA505", new Date(), "eva.hr@company.com",
                "Band 2", "Grade E", "Org Unit 1> org Unit 2> orgUnit 3> Orgunit 4> Orgunit 5", "Pune"
        });


        String rowData="";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String completeTableHTML="";

        String htmlHeader = "<tr>"
                + "<td" + groupStyleLeft + ">" + "Job Code" + "</td>"
                + "<td" + groupStyleLeft + ">" + "Job Title" + "</td>"
                + "<td" + groupStyleLeft + ">" + "Band" + "</td>"
                + "<td" + groupStyleLeft + ">" + "Grade" + "</td>"
                + "<td" + groupStyleLeft + ">" + "Business Unit" + "</td>"
                + "<td" + groupStyleLeft + ">" + "Joining Location" + "</td>"
                + "<td" + groupStyleLeft + ">" + "IJP Closing Date" + "</td>"
                + "</tr>";

        for (Object[] recruiterTO : dummyData) {
            rowData = rowData +
                    "<tr>"
                    + "<td" + payHeadStyleLeft + ">" + recruiterTO[4] + "</td>"
                    + "<td" + payHeadStyleLeft + ">" + recruiterTO[3] + "</td>"
                    + "<td" + payHeadStyleLeft + ">" + recruiterTO[7]+ "</td>"
                    + "<td" + payHeadStyleLeft + ">" + recruiterTO[8] + "</td>"
                    + "<td" + payHeadStyleLeft + ">" + recruiterTO[9] + "</td>"
                    + "<td" + payHeadStyleLeft + ">" + recruiterTO[10] + "</td>"
                    + "<td" + payHeadStyleLeft + ">" + df.format(recruiterTO[5])  + "</td>"
                    + "</tr>";
        }
        completeTableHTML = "<table cellspacing=\"0\" border=\"0\" style=\"border-collapse:separate; width:100%; border-spacing:0; font-size: 11px;\" >" + htmlHeader + rowData + "</table>";
        System.out.println(completeTableHTML);
    }
}

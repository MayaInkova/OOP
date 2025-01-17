package SOLID;


// Клас, който само се грижи за отпечатване на доклада
public class ReportPrinter {
    public void print(Report report) {
        System.out.println("Printing Report: " + report.getContent());
    }
}

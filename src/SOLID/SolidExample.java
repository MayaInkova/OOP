package SOLID;

public class SolidExample {
    public static void main(String[] args) {
        Report report = new Report("This is a standard report.");
        ReportPrinter printer = new ReportPrinter();
        printer.print(report);

        // Демонстрация на OCP и DIP
        ReportExporter pdfExporter = new PDFExporter();
        ReportService service = new ReportService(pdfExporter);
        service.exportReport(report);

        // Демонстрация на замяна на зависимост
        ReportExporter csvExporter = new CSVExporter();
        service = new ReportService(csvExporter);
        service.exportReport(report);
    }
}


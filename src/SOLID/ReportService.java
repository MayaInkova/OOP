package SOLID;


// Принцип 5: Dependency Inversion Principle (DIP)
public class ReportService {
    private ReportExporter exporter;

    public ReportService(ReportExporter exporter) {
        this.exporter = exporter;
    }

    public void exportReport(Report report) {
        exporter.export(report);
    }
}


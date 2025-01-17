package SOLID;

class PDFExporter implements ReportExporter {
    @Override
    public void export(Report report) {
        System.out.println("Exporting report as PDF: " + report.getContent());
    }
}

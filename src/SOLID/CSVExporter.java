package SOLID;


class CSVExporter implements ReportExporter {
    @Override
    public void export(Report report) {
        System.out.println("Exporting report as CSV: " + report.getContent());
    }
}

package SOLID;


// Принцип 3: Liskov Substitution Principle (LSP)
class  SpecialReport extends Report {
    public SpecialReport(String content) {
        super(content);
    }

    public void specialFeature() {
        System.out.println("Special feature in action!");
    }
}

public class FactoryMethodPatternExample {
    interface Document{
        void  open();
    }
static class WordDocument implements Document{
    public void open(){
        System.out.println("Opening the word Document");
    }

}
static class PdfDocument implements Document{
    public void open(){
        System.out.println("Opening the PDF Document");
    }
}
static class ExcelDocument implements Document{
    public void open(){
        System.out.println("Opening the Excel Document");
    }
}
abstract static class DocumentFactory{
    public abstract Document creatDocument();
}  
static class WordDocumentFactory extends DocumentFactory{
    public Document creatDocument(){
        return new WordDocument();
    }
}
static class PdfDocumentFactory extends DocumentFactory{
    public Document creatDocument(){
        return new PdfDocument();
    }
}
static class ExcelDocumentFactory extends DocumentFactory{
    public Document creatDocument(){
        return new ExcelDocument();
    }
}
public static void main(String[] args){
    DocumentFactory WordFactory=new WordDocumentFactory();
    DocumentFactory PdfFactory=new PdfDocumentFactory();
    DocumentFactory ExcelFactory=new ExcelDocumentFactory();
    Document wordDoc=WordFactory.creatDocument();
    Document pdfDoc=PdfFactory.creatDocument();
    Document excelDoc=ExcelFactory.creatDocument();
    wordDoc.open();
    pdfDoc.open();
    excelDoc.open();
}
}

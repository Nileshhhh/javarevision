package javarevision.Library;

public class Book {
    private String title;
    private int copies;
    private int totalCopies;

     public Book(String title, int copies,  int totalCopies) {
        this.title = title;
         this.totalCopies = totalCopies;
         if (copies >totalCopies)
        {
            System.out.println("Copies cannot exceed total, using " + totalCopies);
            this.copies = totalCopies;
        } else {
            this.copies = copies;
        }
     }
    public void borrow()
    {
        if(copies>0) {
            copies = copies - 1;
            System.out.println("You borrowed " + title);
        } else {
            System.out.println("No copies left");
        }
    }
    public void giveBack()
    {
        if (copies<totalCopies)
        {
            copies = copies + 1;
            System.out.println(title + " returned");
        } else {
            System.out.println("All copies are already returned");
        }
    }
    public String getTitle() {
        return title;
    }
    public int getCopies(){
         return copies;
    }
}

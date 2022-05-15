package libraryManagement.view;
import controller.bookControl;
import controller.issueControl;
import java.util.ArrayList;
    import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import utility.database;
 
public class availableBook {

 

    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    availableBook()
    {
        

        f = new JFrame();
 
        // Frame Title
        f.setTitle("JTable Example");
 
        // Data to be displayed in the JTable
        
        
        ArrayList<String []> bookTable=  bookControl.availableBooksTable();
        String bookdata[][]=new String[bookTable.size()][bookTable.get(0).length];
        for (int i = 0; i < bookTable.size(); i++) {
            String [] temp=bookTable.get(i);
            for (int k = 0; k < bookTable.get(0).length; k++) {
                bookdata[i][k]=temp[k];
            }
        }
     
        String[] columnNames = { "Book id", "Book Name", "Publisher" ,"Publish Year","price"};
 
       //  Initializing the JTable;
        j = new JTable(bookdata,columnNames);
        j.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
      //   Frame Size
        f.setSize(500, 200);
       //  Frame Visible = true
        f.setVisible(true);
    }
 
    // Driver  method
    public static void main(String[] args)
    {
        new availableBook();
    }
}

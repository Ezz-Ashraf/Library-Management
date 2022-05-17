
package libraryManagement.view;
import controller.issueControl;
import java.util.ArrayList;
    import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import utility.database;
 
public class issueTable {

 

    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    issueTable()
    {
        
        if(!issueControl.isEmptyTable()){
        f = new JFrame();
 
        // Frame Title
        f.setTitle("JTable Example");
 
        // Data to be displayed in the JTable
        
        
        ArrayList<String []> issueData=   issueControl.issuesTable();
        String data[][]=new String[issueData.size()][issueData.get(0).length];
        for (int i = 0; i < issueData.size(); i++) {
            String [] temp=issueData.get(i);
            for (int k = 0; k < issueData.get(0).length; k++) {
                data[i][k]=temp[k];
            }
        }
     
        String[] columnNames = { "Book id", "Student Id", "issue Date" ,"Due Date","Status","Return Date"};
 
       //  Initializing the JTable;
        j = new JTable(data,columnNames);
        j.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
      //   Frame Size
        f.setSize(500, 200);
       //  Frame Visible = true
        f.setVisible(true);
    }}
 
    // Driver  method
    public static void main(String[] args)
    {
        new issueTable();
    }
}


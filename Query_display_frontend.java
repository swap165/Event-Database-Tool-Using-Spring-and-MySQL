package assignment3;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;


public class Query_display_frontend extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JTabbedPane queries;

	
	public static void main(String[] args) {
        
		EventQueue.invokeLater(new Runnable() {
            
			public void run() {
                
				try {
                    Query_display_frontend frame = new Query_display_frontend();
                    frame.setVisible(true);
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	
	
	@SuppressWarnings({ "unchecked" })
	public Query_display_frontend() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(true);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);
        
        
        
        
        // CALL Q2 METHOD TO EXECUTE QUERY
        
        
        SQL_methods.Q2();
        
        
        
        // QUERY 1 TABLE
        
        DefaultTableModel model = new DefaultTableModel(SQL_methods.getData1(), SQL_methods.getColumnNames1());
        JTable table = new JTable(model);
        JScrollPane s1 = new JScrollPane(table);
        
        
        
        // QUERY 2 TABLE
        
        
        DefaultTableModel model2 = new DefaultTableModel(SQL_methods.getData2(), SQL_methods.getColumnNames2());
        JTable table2 = new JTable(model2);
        JScrollPane s2 = new JScrollPane(table2);
        
        
        
        
        // tabbed panes 
        
        queries = new JTabbedPane();
        
        JPanel query_1 = new JPanel();
        query_1.add(s1);
        queries.addTab("Query 1", query_1);
        queries.setMnemonicAt(0, KeyEvent.VK_1);
        
        JPanel query_2 = new JPanel();
        queries.addTab("Query 2", query_2);
        queries.setMnemonicAt(1, KeyEvent.VK_2);
        
        queries.setBounds(15, 15, 500, 500);
        queries.addChangeListener(new ChangeListener() {
        	
        	public void stateChanged(ChangeEvent e) {
        		
        		if (queries.getSelectedIndex() == 0) {
        			
        			query_1.add(s1);
        		}
        		
        		if (queries.getSelectedIndex() == 1) {
        			
        			query_2.add(s2);
        		}
        	}
        });
        panel.add(queries);        
	}
}


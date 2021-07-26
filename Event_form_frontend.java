package assignment3;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Event_form_frontend extends JFrame {

	public static void main(String[] args) {
        
		EventQueue.invokeLater(new Runnable() {
            
			public void run() {
                
            	try {
                    Event_form_frontend frame = new Event_form_frontend();
                    frame.setVisible(true);
                } 
            	catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	
	private static final long serialVersionUID = 1L;
	private JPanel heading;
    private static JTextField eventname;
    private static JTextField weblink;
    private static JTextField cfptext;
    private JButton insertbutton;
    private static JTextField city;
    private static JTextField country;
    private static JTextField date;
    private static JTextField journalName;
    private static JTextField publisher;
	private static JTextField eventType;
	private JTabbedPane people;
	private JTabbedPane activity;
	private JTabbedPane research;
	private static JTextField personname1;
	private static JTextField personname2;
	private static JTextField personname3;
	private static JTextField affiliation1;
	private static JTextField affiliation2;
	private static JTextField affiliation3;
	private static JTextField role1;
	private static JTextField role2;
	private static JTextField role3;
	private static JTextField activityname1;
	private static JTextField activityname2;
	private static JTextField activityname3;
	private static JTextField date1;
	private static JTextField date2;
	private static JTextField date3;
	private static JTextField topicname1;
	private static JTextField topicname2;
	private static JTextField topicname3;
	private static JTextField area1;
	private static JTextField area2;
	private static JTextField area3;



	
	public static String getEventName() {
		return eventname.getText();
	}
	
	public static String getWebLink() {
		return weblink.getText();
	}
	
	public static String getCFPText() {
		return cfptext.getText();
	}
    
	public static String getCity() {
		return city.getText();
	}
	
	public static String getCountry() {
		return country.getText();
	}
	
	public static String getDate() {
		return date.getText();
	}
	
	public static String getJournalName() {
		return journalName.getText();
	}
	
	public static String getEventType() {
		return eventType.getText();
	}
	
	public static String getPublisher() {
		return publisher.getText();
	}
	
	public static String getPersonName1() {
		return personname1.getText();
	}
	
	public static String getPersonName2() {
		return personname2.getText();
	}
	
	public static String getPersonName3() {
		return personname3.getText();
	}
	
	public static String getActivityName1() {
		return activityname1.getText();
	}
	
	public static String getActivityName2() {
		return activityname2.getText();
	}
	
	public static String getActivityName3() {
		return activityname3.getText();
	}
	
	public static String getTopicName1() {
		return topicname1.getText();
	}
	
	public static String getTopicName2() {
		return topicname2.getText();
	}
	
	public static String getTopicName3() {
		return topicname3.getText();
	}

	public static String getRole1() {
		return role1.getText();
	}
	
	public static String getRole2() {
		return role2.getText();
	}
	
	public static String getRole3() {
		return role3.getText();
	}
	
	public static String getDate1() {
		return date1.getText();
	}
	
	public static String getDate2() {
		return date2.getText();
	}
	
	public static String getDate3() {
		return date3.getText();
	}
	
	public static String getArea1() {
		return area1.getText();
	}
	
	public static String getArea2() {
		return area2.getText();
	}
	
	public static String getArea3() {
		return area3.getText();
	}
	
	public static String getAffiliation1() {
		return affiliation1.getText();
	}
	
	public static String getAffiliation2() {
		return affiliation2.getText();
	}
	
	public static String getAffiliation3() {
		return affiliation3.getText();
	}
	

	public Event_form_frontend() {

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(450, 190, 1014, 597);
         setResizable(true);
         heading = new JPanel();
         heading.setBorder(new EmptyBorder(5, 5, 5, 5));
         setContentPane(heading);
         heading.setLayout(null);
         	
    	JLabel newEvent = new JLabel("Insert Event");
        newEvent.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        newEvent.setBounds(360, 30, 150, 40);
        heading.add(newEvent);
                
        JLabel lbleventType = new JLabel("Event Type");
        lbleventType.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbleventType.setBounds(50, 100, 100, 25);
        heading.add(lbleventType);
        
        JLabel lbleventName = new JLabel("Event Name");
        lbleventName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbleventName.setBounds(50, 150, 100, 25);
        heading.add(lbleventName);
        
        JLabel lblwebLink = new JLabel("Web Link");
        lblwebLink.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblwebLink.setBounds(50, 200, 100, 25);
        heading.add(lblwebLink);
        
        JLabel lblcfptext = new JLabel("CFP Text");
        lblcfptext.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblcfptext.setBounds(50, 250, 100, 25);
        heading.add(lblcfptext);
        
        JLabel lblpublisher = new JLabel("Publisher");
        lblpublisher.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblpublisher.setBounds(50, 300, 100, 25);
        heading.add(lblpublisher);
        
        JLabel lblpeople = new JLabel("People");
        lblpeople.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblpeople.setBounds(50, 350, 100, 25);
        heading.add(lblpeople);
               	
        JLabel lblcity = new JLabel("City");
        lblcity.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblcity.setBounds(500, 100, 100, 25);
        heading.add(lblcity);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblcountry.setBounds(500, 150, 100, 25);
        heading.add(lblcountry);
        
        JLabel lbldate = new JLabel("Date");
        lbldate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbldate.setBounds(500, 200, 100, 25);
        heading.add(lbldate);
        
        JLabel lbljournal = new JLabel("Journal Name");
        lbljournal.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbljournal.setBounds(500, 250, 115, 25);
        heading.add(lbljournal);
        
        JLabel lblactivity = new JLabel("Activity");
        lblactivity.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblactivity.setBounds(500, 300, 100, 25);
        heading.add(lblactivity);
        
        JLabel lblresearch = new JLabel("Research Topic");
        lblresearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblresearch.setBounds(500, 425, 125, 25);
        heading.add(lblresearch);
                    
        eventType = new JTextField();
        eventType.setFont(new Font("Tahoma", Font.PLAIN, 14));
        eventType.setBounds(175, 100, 150, 32);
        heading.add(eventType);
        eventType.setColumns(10);
        
        eventname = new JTextField();
        eventname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        eventname.setBounds(175, 150, 150, 32);
        heading.add(eventname);
        eventname.setColumns(10);
        
        weblink = new JTextField();
        weblink.setFont(new Font("Tahoma", Font.PLAIN, 14));
        weblink.setBounds(175, 200, 150, 32);
        heading.add(weblink);
        weblink.setColumns(10);
        
        cfptext = new JTextField();
        cfptext.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cfptext.setBounds(175, 250, 150, 32);
        heading.add(cfptext);
        cfptext.setColumns(10);
        
        publisher = new JTextField();
        publisher.setFont(new Font("Tahoma", Font.PLAIN, 14));
        publisher.setBounds(175, 300, 150, 32);
        heading.add(publisher);
        publisher.setColumns(10);
        
       
        // people
        
        people = new JTabbedPane();
        
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        personname1 = new JTextField();
        personname1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        personname1.setPreferredSize(new Dimension(70, 25));
        
        personname2 = new JTextField();
        personname2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        personname2.setPreferredSize(new Dimension(70, 25));
        
        personname3 = new JTextField();
        personname3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        personname3.setPreferredSize(new Dimension(70, 25));
        
        
        JLabel lblaffiliation = new JLabel("Affiliation");
        lblaffiliation.setFont(new Font("Tahoma", Font.PLAIN, 12));
        //lblaffiliation.setBounds(395, 365, 80, 20);
        
        affiliation1 = new JTextField();
        affiliation1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        affiliation1.setPreferredSize(new Dimension(70, 25));
        
        affiliation2 = new JTextField();
        affiliation2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        affiliation2.setPreferredSize(new Dimension(70, 25));
        
        affiliation3 = new JTextField();
        affiliation3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        affiliation3.setPreferredSize(new Dimension(70, 25));
        
        JLabel lblrole = new JLabel("Role");
        lblrole.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        role1 = new JTextField();
        role1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        role1.setPreferredSize(new Dimension(70, 25));
        
        role2 = new JTextField();
        role2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        role2.setPreferredSize(new Dimension(70, 25));
        
        role3 = new JTextField();
        role3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        role3.setPreferredSize(new Dimension(70, 25));
        
        JPanel person1 = new JPanel();
        person1.add(lblname);
        person1.add(personname1);
        person1.add(lblaffiliation);
        person1.add(affiliation1);
        person1.add(lblrole);
        person1.add(role1);
        people.addTab("Person 1", person1);
        people.setMnemonicAt(0, KeyEvent.VK_1);
        
        JPanel person2 = new JPanel();
        people.addTab("Person 2", person2);
        people.setMnemonicAt(1, KeyEvent.VK_2);
        
        JPanel person3 = new JPanel();
        
        people.addTab("Person 3", person3);
        people.setMnemonicAt(2, KeyEvent.VK_3);
        people.setBounds(175, 353, 250, 100);
        
        people.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                
            	if (people.getSelectedIndex() == 0) {
            		person1.add(lblname);
                    person1.add(personname1);
                    person1.add(lblaffiliation);
                    person1.add(affiliation1);
                    person1.add(lblrole);
                    person1.add(role1);
                }
            	
            	if (people.getSelectedIndex() == 1) {
            		person2.add(lblname);
                    person2.add(personname2);
                    person2.add(lblaffiliation);
                    person2.add(affiliation2); 
                    person2.add(lblrole);
                    person2.add(role2);
                }
            	
            	if (people.getSelectedIndex() == 2) {
            		person3.add(lblname);
                    person3.add(personname3);
                    person3.add(lblaffiliation);
                    person3.add(affiliation3);
                    person3.add(lblrole);
                    person3.add(role3);
                 }
            	
            }
        });
        heading.add(people);
        
        
        // activity
        
        
        activity = new JTabbedPane();
        
        activityname1 = new JTextField();
        activityname1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        activityname1.setPreferredSize(new Dimension(70, 25));
        
        activityname2 = new JTextField();
        activityname2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        activityname2.setPreferredSize(new Dimension(70, 25));
        
        activityname3 = new JTextField();
        activityname3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        activityname3.setPreferredSize(new Dimension(70, 25));
        
        
        JLabel lblactdate = new JLabel("Date");
        lblactdate.setFont(new Font("Tahoma", Font.PLAIN, 12));
        //lblaffiliation.setBounds(395, 365, 80, 20);
        
        date1 = new JTextField();
        date1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        date1.setPreferredSize(new Dimension(70, 25));
        
        date2 = new JTextField();
        date2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        date2.setPreferredSize(new Dimension(70, 25));
        
        date3 = new JTextField();
        date3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        date3.setPreferredSize(new Dimension(70, 25));
        
        JPanel activity1 = new JPanel();
        activity1.add(lblname);
        activity1.add(activityname1);
        activity1.add(lblactdate);
        activity1.add(date1);
        activity.addTab("Activity 1", activity1);
        activity.setMnemonicAt(0, KeyEvent.VK_1);
        
        JPanel activity2 = new JPanel();
        activity.addTab("Activity 2", activity2);
        activity.setMnemonicAt(1, KeyEvent.VK_2);
        
        JPanel activity3 = new JPanel();
        activity.addTab("Activity 3", activity3);
        activity.setMnemonicAt(2, KeyEvent.VK_3);
        activity.setBounds(625, 303, 250, 100);
        
        activity.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                
            	if (activity.getSelectedIndex() == 0) {
            		activity1.add(lblname);
                    activity1.add(activityname1);
                    activity1.add(lblactdate);
                    activity1.add(date1);
                }
            	
            	if (activity.getSelectedIndex() == 1) {
            		activity2.add(lblname);
                    activity2.add(activityname2);
                    activity2.add(lblactdate);
                    activity2.add(date2);
                }
            	
            	if (activity.getSelectedIndex() == 2) {
            		activity3.add(lblname);
                    activity3.add(activityname3);
                    activity3.add(lblactdate);
                    activity3.add(date3);
                 }
            	
            }
        });
        heading.add(activity);
        
        
        // research topic
        
        research = new JTabbedPane();
        
        topicname1 = new JTextField();
        topicname1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        topicname1.setPreferredSize(new Dimension(70, 25));
        
        topicname2 = new JTextField();
        topicname2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        topicname2.setPreferredSize(new Dimension(70, 25));
        
        topicname3 = new JTextField();
        topicname3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        topicname3.setPreferredSize(new Dimension(70, 25));
        
        
        JLabel lblarea = new JLabel("Area");
        lblarea.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        area1 = new JTextField();
        area1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        area1.setPreferredSize(new Dimension(70, 25));
        
        area2 = new JTextField();
        area2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        area2.setPreferredSize(new Dimension(70, 25));
        
        area3 = new JTextField();
        area3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        area3.setPreferredSize(new Dimension(70, 25));
        
        JPanel topic1 = new JPanel();
        topic1.add(lblname);
        topic1.add(topicname1);
        topic1.add(lblarea);
        topic1.add(area1);
        research.addTab("Topic 1", topic1);
        research.setMnemonicAt(0, KeyEvent.VK_1);
        
        JPanel topic2 = new JPanel();
        research.addTab("Topic 2", topic2);
        research.setMnemonicAt(1, KeyEvent.VK_2);
        
        JPanel topic3 = new JPanel();
        research.addTab("Topic 3", topic3);
        research.setMnemonicAt(2, KeyEvent.VK_3);
        research.setBounds(650, 428, 250, 100);
        
        research.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                
            	if (research.getSelectedIndex() == 0) {
            		topic1.add(lblname);
                    topic1.add(topicname1);
                    topic1.add(lblarea);
                    topic1.add(area1);
                }
            	
            	if (research.getSelectedIndex() == 1) {
            		topic2.add(lblname);
                    topic2.add(topicname2);
                    topic2.add(lblarea);
                    topic2.add(area2);
                }
            	
            	if (research.getSelectedIndex() == 2) {
            		topic3.add(lblname);
                    topic3.add(topicname3);
                    topic3.add(lblarea);
                    topic3.add(area3);
                 }
            	
            }
        });
        heading.add(research);
        
        
        
        // city
        
        city = new JTextField();
        city.setFont(new Font("Tahoma", Font.PLAIN, 14));
        city.setBounds(640, 100, 150, 32);
        heading.add(city);
        city.setColumns(10);
        
        country = new JTextField();
        country.setFont(new Font("Tahoma", Font.PLAIN, 14));
        country.setBounds(640, 150, 150, 32);
        heading.add(country);
        country.setColumns(10);
        
        date = new JTextField();
        date.setFont(new Font("Tahoma", Font.PLAIN, 14));
        date.setBounds(640, 200, 150, 32);
        heading.add(date);
        date.setColumns(10);
        
        journalName = new JTextField();
        journalName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        journalName.setBounds(640, 250, 150, 32);
        heading.add(journalName);
        journalName.setColumns(10);
        
        insertbutton = new JButton("Insert");
        insertbutton.addActionListener(new ActionListener() {
            
        	public void actionPerformed(ActionEvent e) {
                
        		SQL_methods.Q1();
            }
        });
        
        insertbutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        insertbutton.setBounds(400, 500, 110, 35);
        heading.add(insertbutton);
    }

}


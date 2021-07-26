package assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

public class SQL_methods {
	
	@SuppressWarnings("rawtypes")
	static Vector columnNames1 = null;
    @SuppressWarnings("rawtypes")
	static Vector data1 = null;
    @SuppressWarnings("rawtypes")
	static Vector columnNames2 = null;
    @SuppressWarnings("rawtypes")
	static Vector data2 = null;
    
    
    @SuppressWarnings("rawtypes")
	public static Vector getData1() {
    	return data1;
    }
    
    @SuppressWarnings("rawtypes")
	public static Vector getData2() {
    	return data2;
    }
    
    @SuppressWarnings("rawtypes")
	public static Vector getColumnNames1() {
    	return columnNames1;
    }
    
    @SuppressWarnings("rawtypes")
	public static Vector getColumnNames2() {
    	return columnNames2;
    }
    
    
    
    // METHOD FOR QUESTION 1
    
    
	public static void Q1() {
		
		String eventName = Event_form_frontend.getEventName();
        String webLink = Event_form_frontend.getWebLink();
        String cfpText = Event_form_frontend.getCFPText();
        String eventtype = Event_form_frontend.getEventType();
        String City = Event_form_frontend.getCity();
        String Country = Event_form_frontend.getCountry();
        String Date = Event_form_frontend.getDate();
        String journalname = Event_form_frontend.getJournalName();
        String Publisher = Event_form_frontend.getPublisher();                
        
        try {
        	// CHANGE PASSWORD FIELD BEFORE SUBMITTING
        	
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/events?allowMultiQueries=true", "root", "");

            
            // add event
            
            
            String query1 = "";
            
            if (!eventName.equals("")) {
            query1 += "INSERT INTO event values('" + eventName + "','" + webLink + "','" + cfpText + "');\n";
            }
            
            // add event type
            
            if (eventtype.equals("EventConference")) {
            	query1 += "INSERT INTO EventConference VALUES('" + eventName + "','" + City + "','" + Country + "','" + Date + "');\n";
            }
            if (eventtype.equals("EventJournal")) {
            	query1 += "INSERT INTO EventJournal VALUES('" + eventName + "','" + journalname + "','" + Publisher + "');\n";
            }
            if (eventtype.equals("EventBook")) {
            	query1 += "INSERT INTO EventBook VALUES('" + eventName + "','" + Publisher + "');\n";
            }
            
            
            // add activity happens
            
            if (!Event_form_frontend.getActivityName1().equals("")) {
            	query1 += "INSERT INTO ActivityHappens VALUES ('" + eventName + "','" + Event_form_frontend.getActivityName1() + "','" + java.sql.Date.valueOf(Event_form_frontend.getDate1()) + "');\n";
            }
            if (!Event_form_frontend.getActivityName2().equals("")) {
            	query1 += "INSERT INTO ActivityHappens VALUES ('" + eventName + "','" + Event_form_frontend.getActivityName2() + "','" + java.sql.Date.valueOf(Event_form_frontend.getDate2()) + "');\n";
            }
            if (!Event_form_frontend.getActivityName3().equals("")) {
            	query1 += "INSERT INTO ActivityHappens VALUES ('" + eventName + "','" + Event_form_frontend.getActivityName3() + "','" + java.sql.Date.valueOf(Event_form_frontend.getDate3()) + "');\n";
            }
            
            
            // add people and organizes
            
            if (!Event_form_frontend.getPersonName1().equals("")) {
            	query1 += "INSERT INTO People VALUES ('" + Event_form_frontend.getPersonName1() + "','" + Event_form_frontend.getAffiliation1() + "');\n";
            	query1 += "INSERT INTO Organizes VALUES ('" + eventName + "','" + Event_form_frontend.getPersonName1() + "','" + Event_form_frontend.getRole1() + "');\n";
            }
            if (!Event_form_frontend.getPersonName2().equals("")) {
            	query1 += "INSERT INTO People VALUES ('" + Event_form_frontend.getPersonName2() + "','" + Event_form_frontend.getAffiliation2() + "');\n";
            	query1 += "INSERT INTO Organizes VALUES ('" + eventName + "','" + Event_form_frontend.getPersonName2() + "','" + Event_form_frontend.getRole2() + "');\n";

            }
            if (!Event_form_frontend.getPersonName3().equals("")) {
            	query1 += "INSERT INTO People VALUES ('" + Event_form_frontend.getPersonName3() + "','" + Event_form_frontend.getAffiliation3() + "');\n";
            	query1 += "INSERT INTO Organizes VALUES ('" + eventName + "','" + Event_form_frontend.getPersonName3() + "','" + Event_form_frontend.getRole3() + "');\n";

            }
            
            
            // add research topic and covers
            
            if (!Event_form_frontend.getTopicName1().equals("")) {
            	query1 += "INSERT INTO ResearchTopic VALUES ('" + Event_form_frontend.getTopicName1() + "','" + Event_form_frontend.getArea1() + "');\n";
            	query1 += "INSERT INTO Covers VALUES ('" + eventName + "','" + Event_form_frontend.getTopicName1() + "');\n";
            }
            if (!Event_form_frontend.getTopicName2().equals("")) {
            	query1 += "INSERT INTO ResearchTopic VALUES ('" + Event_form_frontend.getTopicName2() + "','" + Event_form_frontend.getArea2() + "');\n";
            	query1 += "INSERT INTO Covers VALUES ('" + eventName + "','" + Event_form_frontend.getTopicName2() + "');\n";
            }
            if (!Event_form_frontend.getTopicName3().equals("")) {
            	query1 += "INSERT INTO ResearchTopic VALUES ('" + Event_form_frontend.getTopicName3() + "','" + Event_form_frontend.getArea3() + "');\n";
            	query1 += "INSERT INTO Covers VALUES ('" + eventName + "','" + Event_form_frontend.getTopicName3() + "');";
            }                    
                                
            
            // execute query
            
            
            java.sql.Statement sta = connection.createStatement();
            sta.executeUpdate(query1);
            
            
            connection.close();
        } 
        
        catch (Exception exception) {
            exception.printStackTrace();
        }
	}
	
	
	
	// METHOD FOR QUESTION 2
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void Q2() {
		
		
		try {
        	
        	
        	// QUERY 1
        	
        	
        	
			// CHANGE PASSWORD FIELD BEFORE SUBMITTING
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/events?allowMultiQueries=true", "root", "");            

			String query1 = "SELECT \"EventConference\" as Type, Concat(monthname(Date),\", \",Year(Date)) as Month, count(*) as Count\r\n"
					+ "FROM EventConference\r\n"
					+ "GROUP BY Year(Date), Month(Date)\r\n"
					+ "UNION\r\n"
					+ "Select \"EventJournal\" as type, Concat(monthname(Temp.ADate),\", \",Year(Temp.ADate)) as Month, Count(*) as\r\n"
					+ "Count\r\n"
					+ "From (\r\n"
					+ "Select EventName, Min(ActivityDate) as ADate from ActivityHappens\r\n"
					+ "WHERE EventName IN\r\n"
					+ "(Select EventName FROM EventJournal)\r\n"
					+ "Group by EventName\r\n"
					+ ") as Temp\r\n"
					+ "Group by Year(Temp.ADate), Month(Temp.ADate)"
					+ "UNION\r\n"
					+ "Select \"EventBook\" as type, Concat(monthname(Temp.ADate),\", \",Year(Temp.ADate)) as Month, Count(*) as\r\n"
					+ "Count\r\n"
					+ "From (\r\n"
					+ "Select EventName, Min(ActivityDate) as ADate from ActivityHappens\r\n"
					+ "WHERE EventName IN\r\n"
					+ "(Select EventName FROM EventBook)\r\n"
					+ "Group by EventName\r\n"
					+ ") as Temp\r\n"
					+ "Group by Year(Temp.ADate), Month(Temp.ADate);";

			java.sql.Statement sta1 = connection.createStatement();
			ResultSet rs1 = sta1.executeQuery(query1);

			ResultSetMetaData md1 = rs1.getMetaData();
			int columns1 = md1.getColumnCount();


			//  Get column names
			columnNames1 = new Vector();
			data1 = new Vector();

			for (int i = 1; i <= columns1; i++)
			{
				columnNames1.addElement(md1.getColumnName(i));
			}

			//  Get row data

			while (rs1.next())
			{
				Vector row = new Vector(columns1);

				for (int i = 1; i <= columns1; i++)
				{
					row.addElement(rs1.getString(i));
				}

				data1.addElement( row );
			}
			
			rs1.close();
			sta1.close();
			
			
			
			// QUERY 2
			
			
			String query2 = "SELECT \"EventConference\" as Type, MIN(ActivityDate) as UpcomingEvent, EventConference.EventName\r\n"
					+ "FROM ActivityHappens JOIN EventConference \r\n"
					+ "WHERE ActivityHappens.EventName = EventConference.EventName\r\n"
					+ "\r\n"
					+ "UNION\r\n"
					+ "\r\n"
					+ "-- EventJournal\r\n"
					+ "SELECT \"EventJournal\" as Type, MIN(ActivityDate) as UpcomingEvent, EventJournal.EventName \r\n"
					+ "FROM ActivityHappens JOIN EventJournal \r\n"
					+ "WHERE ActivityHappens.EventName = EventJournal.EventName\r\n"
					+ "\r\n"
					+ "UNION\r\n"
					+ "\r\n"
					+ "-- EventBook\r\n"
					+ "SELECT \"EventBook\" as Type, MIN(ActivityDate) as UpcomingEvent, EventBook.EventName \r\n"
					+ "FROM ActivityHappens JOIN EventBook\r\n"
					+ "WHERE ActivityHappens.EventName = EventBook.EventName;";
			
			java.sql.Statement sta2 = connection.createStatement();
			ResultSet rs2 = sta2.executeQuery(query2);

			ResultSetMetaData md2 = rs2.getMetaData();
			int columns2 = md2.getColumnCount();


			//  Get column names
			columnNames2 = new Vector();
			data2 = new Vector();

			for (int i = 1; i <= columns2; i++)
			{
				columnNames2.addElement(md2.getColumnName(i));
			}

			//  Get row data

			while (rs2.next())
			{
				Vector row2 = new Vector(columns2);

				for (int i = 1; i <= columns2; i++)
				{
					row2.addElement(rs2.getString(i));
				}

				data2.addElement(row2);
			}
			
			rs2.close();
			
			sta2.close();
			connection.close();
		}

		catch (Exception exception) {
			exception.printStackTrace();
		}
		
	}
	
}

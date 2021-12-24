package DAY_27.JDBC_Demo.com.demo.test;

import com.mongodb.DB;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCursor;

public class MongoDBConnection {
	
	public static void main(String args[]) {

        try (//MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")
        		MongoClient mongoClient = MongoClients.create("mongodb+srv://edbda:edbda@cluster0.pyejg.mongodb.net/test?retryWrites=true&w=majority")	) {

            MongoDatabase database = mongoClient.getDatabase("test");

            System.out.println("database name -> " + database.getName());

          for (String name: database.listCollectionNames()) {

                System.out.println(name);
            }
            
            
            ///to find all documents
           MongoCollection collection = database.getCollection("LMS_MEMBERS");
            MongoCursor cursor = collection.find().iterator();
            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next());
                }

            } finally {
                cursor.close();
            }
            
            
        }
    }
}

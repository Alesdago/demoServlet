package com.dago;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;

public class DB {

	// Method to make a connection to the mongodb server listening on a default port
	private static MongoClient getConnection() {
		int port_no = 27017;
		String url = "localhost";

		MongoClient mongoClntObj = new MongoClient(url, port_no);
		return mongoClntObj;
	}

	
		public static FindIterable<Document> ricercaColoreAuto(String colore) {
			
			// Get the particular record from the mongodb collection		
			List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
			obj.add(new BasicDBObject("colore", colore));

			// Form a where query
			BasicDBObject whereQuery = new BasicDBObject();
			whereQuery.put("$and", obj);
			System.out.println("Sql query is?= " + whereQuery.toString());

			FindIterable<Document> cursor = getConnection().getDatabase("automobili").getCollection("garage").find(whereQuery);
			for(Document doc : cursor) {
				System.out.println("Found?= " + doc);
			}
			return cursor;
		}
		
		public static FindIterable<Document> ricercaMarcaAuto(String marca) {
			
			// Get the particular record from the mongodb collection		
			List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
			obj.add(new BasicDBObject("marca", marca));

			// Form a where query
			BasicDBObject whereQuery = new BasicDBObject();
			whereQuery.put("$and", obj);
			System.out.println("Sql query is?= " + whereQuery.toString());

			FindIterable<Document> cursor = getConnection().getDatabase("automobili").getCollection("garage").find(whereQuery);
			for(Document doc : cursor) {
				System.out.println("Found?= " + doc);
			}
			return cursor;
		}

		public static FindIterable<Document> ricercaModelloAuto(String modello) {
			
			// Get the particular record from the mongodb collection		
			List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
			obj.add(new BasicDBObject("modello", modello));
		
			// Form a where query
			BasicDBObject whereQuery = new BasicDBObject();
			whereQuery.put("$and", obj);
			System.out.println("Sql query is?= " + whereQuery.toString());
		
			FindIterable<Document> cursor = getConnection().getDatabase("automobili").getCollection("garage").find(whereQuery);
			for(Document doc : cursor) {
				System.out.println("Found?= " + doc);
			}
			return cursor;
		}
	
}
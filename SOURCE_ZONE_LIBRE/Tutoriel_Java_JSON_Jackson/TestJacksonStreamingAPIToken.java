package com.iut.tutoJackson.essai.streamingAPI;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;

public class TestJacksonStreamingAPIToken {

	public static void main(String[] args) {

		// //////////////////////////////
		// Lecture d'un flux JSON
		// //////////////////////////////
		JsonFactory factory = new JsonFactory();
		File src = new File("userStreamAPI.json");

		try {
			JsonParser jsonParser = factory.createJsonParser(src);

			if (jsonParser.nextToken() == JsonToken.START_OBJECT) {

				// on boucle jusqu'à ce que le jeton soit égal à "}"
				while (jsonParser.nextToken() != JsonToken.END_OBJECT) {

					String fieldname = jsonParser.getCurrentName();
					jsonParser.nextToken();

					if ("name".equals(fieldname)) {

						while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
							String namefield = jsonParser.getCurrentName();
							jsonParser.nextToken();

							if ("first".equals(namefield)) {
								System.out.println(jsonParser.getText()); // affichage
							} else if ("last".equals(namefield)) {
								System.out.println(jsonParser.getText()); // affichage
							} else {
								throw new IllegalStateException("Non reconnu '"
										+ fieldname + "'!");
							}
						}


					} else if ("gender".equals(fieldname)) {
						System.out.println(jsonParser.getText()); // affichage
						
					} else if ("verified".equals(fieldname)) {
						if (jsonParser.getCurrentToken() == JsonToken.VALUE_TRUE)  // affichage
							System.out.println(Boolean.TRUE);
						else
							System.out.println(Boolean.FALSE);
						
					} else if ("msgs".equals(fieldname)) {

						// le jeton courant est "[", 
						// on va avancer sur le jeton suivant grâce 
						// à la 1ere instruction dans le while jsonParser.nextToken

						// les messages sont dans un array
						// on boucle jusqu'à ce que le jeton soit égal à "]"
						while (jsonParser.nextToken() != JsonToken.END_ARRAY) {

							// display msg1, msg2, msg3
							System.out.println(jsonParser.getText());

						}
					} else {
						throw new IllegalStateException("Non reconnu '"
								+ fieldname + "'!");
					}
				}
			}

			// Fermer le parser
			jsonParser.close();
			
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

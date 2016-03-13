package com.iut.tutoJackson.essai.treemodel;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.iut.tutoJackson.metier.User;

public class TestJacksonTreeModelUser {

	public static void main(String[] args) {

		// //////////////
		// Lecture
		// /////////////
		ObjectMapper mapper = new ObjectMapper();
		File src = new File("users_1.json");
		JsonNode rootNode = null;
		try {
			rootNode = mapper.readTree(src);

			JsonNode nameNode = rootNode.path("firstname");
			System.out.println(nameNode.asText());

			JsonNode lastNameNode = rootNode.path("lastname");
			System.out.println(lastNameNode.asText());

			JsonNode loginNode = rootNode.path("login");
			System.out.println(loginNode.asText());

			JsonNode twitterNode = rootNode.path("twitter");
			System.out.println(twitterNode.asText());

			JsonNode webNode = rootNode.path("web");
			System.out.println(webNode.asText());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// /////////////////////////////////////////////////
		// Mise à jour et écriture dans un nouveau flux JSON
		// /////////////////////////////////////////////////
		ObjectNode currentRootNode = (ObjectNode) rootNode;
		currentRootNode.put("nickname", "Isa");

		((ObjectNode) rootNode).remove("login");

		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
		File dest = new File("users_1_treeModel.json");
		try {
			writer.writeValue(dest, currentRootNode);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

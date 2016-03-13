package com.iut.tutoJackson.essai.treemodel;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TestJacksonCreateTreeModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ///////////////////////////////////////
		// Ecriture d'un Tree Model from Scratch
		// //////////////////////////////////////
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode rootNode = mapper.createObjectNode();
		ObjectNode nameObj = rootNode.putObject("name");
		nameObj.put("last", "Blasquez");
		nameObj.put("first", "Isabelle");

		rootNode.put("gender", "FEMALE");

		rootNode.put("verified", Boolean.FALSE);

		ArrayNode arrayNode = mapper.createArrayNode();
		arrayNode.add("Message 1");
		arrayNode.add("Message 2");
		arrayNode.add("Message 3");
		rootNode.put("msgs", arrayNode);

		File dest = new File("createTreeModel.json");

		try {
			ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
			writer.writeValue(dest, rootNode);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

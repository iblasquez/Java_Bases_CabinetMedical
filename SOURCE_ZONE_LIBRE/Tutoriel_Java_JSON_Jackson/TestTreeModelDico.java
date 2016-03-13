package com.iut.tutoJackson.essai;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;



public class TestTreeModelDico {
	public static void main(String[] args) {

		// //////////////
		// Lecture
		// /////////////
		ObjectMapper mapper = new ObjectMapper();
		File src = new File("dictionnaire.json");

		try {
			JsonNode root = mapper.readTree(src);
			JsonNode lettres = root.path("lettres");
			System.out.println("Lettres");

			for (Iterator<JsonNode> iterator = lettres.iterator(); iterator.hasNext();) {
				JsonNode lettre = iterator.next();
				JsonNode titre = lettre.get("lettre");
				System.out.println(titre.asText());
				JsonNode mots = lettre.get("mots");

				for (Iterator<JsonNode> iterator2 = mots.iterator(); iterator2.hasNext();) {
					JsonNode mot = iterator2.next();
					titre = mot.get("mot");
					System.out.println("==> Mot : " + titre.asText());
					JsonNode definitions = mot.get("definitions");
					System.out.println("DEFINITIONS");

					for (Iterator<JsonNode> iterator3 = definitions.iterator(); iterator3.hasNext();) {
						JsonNode definition = iterator3.next();
						System.out.println("\t --> Définition : "
								+ definition.get("contenu").asText() + " / " //contenu si l'annonation JsonProperty est toujours présente, content sinon...
								+ definition.get("rapporteur").asText() + " / "
								+ definition.get("date").asText());
					}
				}
			}

			// /////////////////////////////////////////////////
			// Mise à jour et écriture dans un nouveau flux JSON
			// /////////////////////////////////////////////////
			ObjectNode currentRootNode = (ObjectNode) root;
			currentRootNode.put("note", "Note");
			ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
			File dest = new File("dictionnaire_treeModel.json");
			writer.writeValue(dest, currentRootNode);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

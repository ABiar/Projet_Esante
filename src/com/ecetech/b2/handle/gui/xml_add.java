package com.ecetech.b2.handle.gui;

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class xml_add {

public static void main(String[] args) {
	try {
		File xmlFile = new File("session.xml");
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse(xmlFile);
		Element documentElement = document.getDocumentElement();
		Element textNode = document.createElement("name");
		textNode.setTextContent("sammy");
		Element textNode1 = document.createElement("psw");
		textNode1.setTextContent("rabhine");
		Element textNode2 = document.createElement("email");
		textNode2.setTextContent("elian.wolf@gmail.com");
		Element nodeElement = document.createElement("session");
		nodeElement.appendChild(textNode);
		nodeElement.appendChild(textNode1);
		nodeElement.appendChild(textNode2);
		documentElement.appendChild(nodeElement);
		document.replaceChild(documentElement, documentElement);
		Transformer tFormer =
		TransformerFactory.newInstance().newTransformer();
		tFormer.setOutputProperty(OutputKeys.METHOD, "xml");
		Source source = new DOMSource(document);
		Result result = new StreamResult(xmlFile);
		tFormer.transform(source, result);
	
	
	} catch (Exception ex) {
		System.out.println(ex);
		}
	}
}
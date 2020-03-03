package com.asif.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParserDemo {

	public static void main(String[] args) {

		try {

			File f = new File("Students.xml");

			System.out.println(f.exists());

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = factory.newDocumentBuilder();

			Document doc = builder.parse(f);

			System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());

			NodeList nlist = doc.getElementsByTagName("Student");

			System.out.println(nlist.getLength());

			for (int i = 0; i < nlist.getLength(); i++) {
				Node node = nlist.item(i);
				System.out.println("Node Name:" + node.getNodeName());

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					System.out.println(element.getElementsByTagName("rollno").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("name").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("email").item(0).getTextContent());

				}
				System.out.println("========================");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

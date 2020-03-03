package com.asif.xml;

import java.io.Console;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import static java.lang.System.out;


class SAXHelper extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Start Document");
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("End Document");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.print(qName+" : ");

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		// System.out.println("End Element");

	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		String str = new String(ch, start, length);
		System.out.print( str);
	}

}



public class SAXParserDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello Friend");
		sb.insert(6, "My ");
		
		 System.out.println(sb); 
		
		
		int num1 = 10;
for (int i = 0; i < 10; i++) {
	if(i<num1--) {
		System.out.println((i*num1)+" ");
	}
	
}
		
		int num = 1;
		
		/*
		 * if (num) { System.out.println("1"); }
		 */
		
		System.out.println(3.14%2);
		
		File f = new File("Students.xml");

		System.out.println(f.exists());

		try {
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();

			parser.parse(f, new SAXHelper());

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

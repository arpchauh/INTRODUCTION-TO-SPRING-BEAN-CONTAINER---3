package com.acadgild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("TextEditorConfig.xml");
		
		TextEditor te = (TextEditor) context.getBean("TextEditor");
		te.spellCheck();

	}

}

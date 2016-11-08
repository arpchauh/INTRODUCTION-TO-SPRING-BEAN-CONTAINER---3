package com.acadgild;

public class TextEditor {
	
	private SpellChecker spellchecker;

	public SpellChecker getSpellchecker() {
		return spellchecker;
	}

	public void setSpellchecker(SpellChecker spellchecker) {
		System.out.println("Inside setSpellChecker");
		this.spellchecker = spellchecker;
	} 
	
	public void spellCheck(){
		
		spellchecker.checkSpelling();
		
	}

}

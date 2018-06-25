package com.patterns.strategypattern;

public class LowerTextFormatter implements TextFormatter{

	@Override
	public void format(String text) {
		System.out.println("[EditareaTextuluicuLitereMici]: "+text.toLowerCase());
	}

}

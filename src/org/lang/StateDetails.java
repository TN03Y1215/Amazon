package org.lang;

public class StateDetails {

	public void southIndia() {
		System.out.println("Tamilnadu");
	}

	public void northIndia() {
		System.out.println("Delhi");
	}

	public static void main(String[] args) {

		StateDetails st = new StateDetails();
		st.southIndia();
		st.northIndia();
		LanguageInfo la = new LanguageInfo();
		la.tamilLanguage();
		la.englishLanguage();
		la.hindiLanguage();
	}
}

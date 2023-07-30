package com.bussiness.association.boot;

import javax.sql.rowset.WebRowSet;

import com.bussiness.association.app.Browser;

public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in BrowserRunner");
		
		Browser browser = new Browser();
		browser.open();
		browser.goBack();

	}

}

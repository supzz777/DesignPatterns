package com.bridgelabz.designpatternz.structural.proxy;

public class ProxyPatternMain 
{
	public static void main(String[] args) 
	{
		ExecuteQuery nonAdminExecuter = new QueryImplementorWithProxy ("nonadmin","supzz");
		nonAdminExecuter.QueryExecution("delete");
		
		
		ExecuteQuery AdminExecuter = new QueryImplementorWithProxy ("admin","supzz");
		AdminExecuter.QueryExecution("delete");
		
		
	}

}

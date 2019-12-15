package com.bridgelabz.designpatternz.structural.proxy;

public class QueryImplementor implements ExecuteQuery
{

	@Override
	public void QueryExecution(String query)
	{
		
		System.out.println("going to execute query."+query);
		
	}
	

}

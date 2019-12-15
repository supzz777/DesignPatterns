package com.bridgelabz.designpatternz.structural.proxy;

public class QueryImplementorWithProxy implements ExecuteQuery
{
	boolean ifAdmin;
	QueryImplementor qImplementor ;
	
	//parameterized constructor
	 public QueryImplementorWithProxy (String name, String password)
	 {
		 
		 if(name=="admin" && password=="supzz")
		 {
			 ifAdmin = true;
			 qImplementor = new QueryImplementor();
			 
		 }
		 
	 }
	

	@Override
	public void QueryExecution(String query) 
	{ 
		if (ifAdmin)
		{
			qImplementor.QueryExecution(query);
		}
		else
		{
				
				if( query.equals("delete") )
				{
					System.out.println("Delete query not allowed for non admin users.");
				}
				else
				{
					qImplementor.QueryExecution(query);
				}
			
		}
		
	}

	

}

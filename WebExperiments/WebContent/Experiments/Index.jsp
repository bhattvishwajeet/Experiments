<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Effective Java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Tabulation example</title>

        <style type="text/css">
            dummydeclaration { padding-left: 4em; } /* Firefox ignores first declaration for some reason */
            tab1 { padding-left: 4em; }
            tab2 { padding-left: 8em; }
            tab3 { padding-left: 12em; }
            tab4 { padding-left: 16em; }
            tab5 { padding-left: 20em; }
            tab6 { padding-left: 24em; }
            tab7 { padding-left: 28em; }
            tab8 { padding-left: 32em; }
            tab9 { padding-left: 36em; }
            tab10 { padding-left: 40em; }
            tab11 { padding-left: 44em; }
            tab12 { padding-left: 48em; }
            tab13 { padding-left: 52em; }
            tab14 { padding-left: 56em; }
            tab15 { padding-left: 60em; }
            tab16 { padding-left: 64em; }

        </style>
</head>

<%@page import="com.vbsoft.issues.*, com.vbsoft.item1.*, com.vbsoft.item2.*" %> 
<body>
Welcome to Effective Java!<br>
<% 
	//MARK Item1: Encourage use of public static factory methods
		Coordinates myCoordinates = Coordinates.getInstanceFromXY(1, 2);
		System.out.println("MY XY Coordinates:"+myCoordinates.getX());
		System.out.println("MY XY Coordinates:"+myCoordinates.getY());
		System.out.println("-----------------");
		myCoordinates = Coordinates.getInstanceFromPolarXY(1, 2);
		System.out.println("MY XY PolarCoordinates:"+myCoordinates.getX());
		System.out.println("MY XY PolarCoordinates:"+myCoordinates.getY());
		//SubCoordinates subCoordinates = (SubCoordinates)SubCoordinates.getInstanceFromXY(1, 2);
		
	//MARK Item1: Ends here.	
	
	//MARK Item1: Consider a builder when faced with many optional constructor parameters
		NutritionFacts.Builder obj = new NutritionFacts.Builder(1,2);
		obj = obj.optionalParam1(3);
		obj = obj.optionalParam2(4);
		NutritionFacts nutritionFacts = obj.build();
		System.out.println("Nutrition Facts: Required Param1"+nutritionFacts.getRequiredParam1());
		System.out.println("Nutrition Facts: Required Param2"+nutritionFacts.getRequiredParam2());
		System.out.println("Nutrition Facts: Optional Param1"+nutritionFacts.getOptionalParam1());
		System.out.println("Nutrition Facts: Optional Param2"+nutritionFacts.getOptionalParam2());
	
		
	/*	Better way of writing the client code 
		NutritionFacts obj = new NutritionFacts.Builder(1,2).optionalParam1(3).build();
		System.out.println("Nutrition Facts: Required Param1"+obj.getRequiredParam1());
		System.out.println("Nutrition Facts: Required Param2"+obj.getRequiredParam2());
		System.out.println("Nutrition Facts: Optional Param1"+obj.getOptionalParam1());
		System.out.println("Nutrition Facts: Optional Param2"+obj.getOptionalParam2());
	*/
%>  

-----------------------------------------------------------------------------
<h3>Item 1: Encourage use of Public Static Factory Methods.</h3>
Advantages:
<br>a. Unlike constructors they have names
<br>b. Unlike constructors they are not required to create objects each time they are invoked
<br>	<tab1>i. One can cache the objects getting created and return same objects</tab1>
<br>	<tab1>Example: Boolean class in Java </tab1>
<br>c. Class of the returned object can vary from call to call
<br>d. Suitable for service provider frameworks*
<br>Disadvantages:
<br>a. Do not scale well to large number of optional parameters
<br>-------------------------------------------------------------------------

<h3>Item 2: Consider a builder when faced with many optional parameters.</h3>
Advantages:
<br>a. Good when designing classes whose constructors or static factories would have more than a handful of parameters.
<br>-------------------------------------------------------------------------
<h3>Item 3: Use enum to enforce the singleton property</h3>
Scenario:
<br>a. You want to ensure only one object exists in the system.
<br>b. Suitable in case of constants
<br>-------------------------------------------------------------------------
<h3>Item 4: Make default constructor private to ensure noninstantiability</h3>
<br>-------------------------------------------------------------------------
<h3>Item 5: Prefer dependency injection to hardwiring resources</h3>

<br>-------------- General Notes ----------
1. Make each class or member as inaccessible as possible
2. Use try with resources
3. Instance fields of public classes should rarely be public
<tab1> a. Classes with public mutable fields are not thread safe</tab1>
4. Never expose public static final String [] ERRORS = ... These can be modified.
<tab1>Prefer use of public getMethods... and make ERRORS[] as private </tab1>

Minimize Mutability
<br>To make classes immutable follow these steps,
<br><tabl1>a. Don’t provide methods that modify the object’s state</tabl1>
<br><tabl1>b. Ensure that the class can’t be extended.</tabl1>
<br><tabl1>c. Make all fields final.</tabl1>
<br><tabl1>d. Make all fields private.</tabl1>
<br><tabl1>e. Ensure exclusive access to any mutable components.</tabl1>

<br>Rationale
<br><tab1>i. Immutable objects are thread safe & require no synchronization</tab1>
<br><tab1>ii.They can be shared freely










 
</body>
</html>
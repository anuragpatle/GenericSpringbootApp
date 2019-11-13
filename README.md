# GenericSpringbootApp
A Generalized Spring Boot App.

===================================================================

1. How to access the H2 db from the console.

Step 1:	Hit url - http://localhost:8080/h2-console/

Stpe 2: Saved settings: Generic H2 embedded
        Setting name: Generic H2 embedded
		user name: sa
		pass: password
		
==================================================================


2. Testing rest services using postman.

(1). GET request: http://localhost:8080/products

(2) Post request: http://localhost:8080/products

	body = 
	{ 
		"name" : "product1",
		"description" : "product1 description",
		"price" : "2000"
	}
	
	You will find output as : 
	
	{
	    "id": 1,
	    "name": "product1",
	    "description": "product1 description",
	    "price": 2000,
	    "createdAt": "2019-10-23T13:07:23.465+0000",
	    "updatedAt": "2019-10-23T13:07:23.466+0000"
	}

(3) GET product by id: 
GET Request: http://localhost:8080/products/1


(4) PUT - update a product

PUT request: http://localhost:8080/products/2

Send raw json in the body: 
{ 
	"name" : "product3",
	"description" : "Updated 1 time: product3 description",
	"price" : "6000"
}


//adding a line to test a git operation

//Adding line 2 for testing
	

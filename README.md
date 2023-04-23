<h1 align = "center"> MANAGING RESTAURANT DATA </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
This project is a Managing restaurant data built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The Restaurant data model is defined in the Restaurant class, which has the following attributes:
```
restaurantId : unique identifier for each restaurant
restaurantName : name of the restaurant
restaurantAddress : address of the restaurant
phoneNumber : Phone number of the restaurant
specialty : specialty of the restaurant
totalStaff : staff in the restaurant
```

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>

>* PostMapping: /addNewRestaurant
```
This endpoint makes a call to method in RestaurantService class which is connected to database. In database we add a new restaurant given through API.
```

>* GetMapping: "/restaurants"
```
This endpoint makes a call to method in RestaurantService class which retrieves data of all restaurants from database. This data is sent to controller which is then sent through the API to client.
```

>* GetMapping: "/restaurantId"
```
This endpoint returns data of specific restaurant based on restaurantId through API
```

>* PutMapping : "/restaurantId/{restaurantId}"
```
This endpoint makes a call to method in RestaurantService class which is connected to database. In database we update a Restaurant by restaurantid given through API.
```

>* DeleteMapping : "/restaurantId/{restaurantId}"
```
This endpoint makes a call to method in RestaurantService class which is connected to database. In database we delete a restaurant by restaurantId given through API.
```

---

## Data structure Used
>* Hashmap
```
We have used HashMap data structure as a database to implement CRUD Operations like create , read , update and delete .
```

>* ArrayList
```
We have used ArrayList data structure for GetMapping to return list of all the restaurants to the client .
```
---

## Project Summary

This project is a RESTful API built using Spring Boot. Its purpose is to manage restaurant data by providing CRUD (Create, Read, Update, Delete) operations. The API can be used to get a restaurant by ID, get all restaurants, add a new restaurant, update a restaurant's specialty, and delete a restaurant from the database.

The Restaurant model class defines the properties of a restaurant, including its id , name, address, phone number, specialty, and total number of staff. These properties are used in the API's endpoints to create, retrieve, update, and delete restaurants from the database.

## Author

👤 **Ajinkya Padule**

* GitHub: [AjinkyaPersonal](https://github.com/AjinkyaPersonal)

* LinkedIn: [Ajinkya Padule](https://www.linkedin.com/in/ajinkya-padule-04b8541a6/)
    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [Ajinkya Padule](https://github.com/AjinkyaPersonal).<br />

This project is [MIT]("url") licensed.
    
---

# Spring-Boot-Java-
* Cannection with Mongodb


## Project Details
* Required Technical Skills:
1. Core Java 
2. Spring Boot & MVC
3. Knowledge About Mongodb Database

## Required IDE'S:
1. STS (Spring Suite Tool)
2. Mongodb Compass
3. VS Code With Thunder Clients Extensions

## Description Of Projects......

#### About:
* In this project i have created two collections(tables in terms of sql database) in mongodb.
* First Collection name is StudentDetails and Second Collection is Subjects.

#### StudentDetails Collection stor following Entities with DataTypes...
| Entities Name |    DataType   |
----------------|---------------|
|    ID         |  String       |
| Student Name  |  String       |
| Father Name   |  String       |
| Mother Name   |   String      |
| School Name   |  String       |
| Roll Number   |  String       |
| Phone Number  |  String       |
|  Email ID     |   String      |
| Subject Name  |  String       |
| Subject Marks |  Integer      |
| Total Marks   |  Integer      |
| Percentage    |  Double       |      

* Note : Here Subject Name & Subject Marks Store using HsahMap ( where Subject Name : Key ,  Subject Marks : Values)

### Subjects Collection:

| Entities Name  |   Data Type  |
-----------------|--------------|
|   id           |  String      |
|  maximum Marks |  String      |
| Obtained Marks |  String      |
| Subject Name   |  String      |
| Student Name   |  String      |
|  Student Id    |  String      |

* In this Collection i have store Student Name and Student Id using Hash Map. Where Student Name is key and Student Id is values. And Please Noted down here Student Name and Student Id will be same as from StudentDetails collection.

### Important API's:

* Call an API for StudentDetails collection which give top 3 student details on the basic of their percentage.
* Perform CRUD opertation for StudentDetail collection.
 



drop table if exists Contact ;
create table Contact (
contactId INT PRIMARY KEY,
firstName VARCHAR(30),
lastName VARCHAR(100),
address VARCHAR(80),
phoneNumber VARCHAR(40),
emailAddress VARCHAR(90)
);
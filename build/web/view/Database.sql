create table Users(
User_ID int primary key not null,
Password varchar(50) not null,
User_Type varchar(50) not null,
Full_Name varchar(50) not null,
User_Email varchar(50) not null,
User_ContactNumber char(11) not null
);





create table Courses(
Course_ID int primary key not null,
Course_Name varchar(50) not null,
Category varchar(50) not null,
Table_Of_Content varchar(50) not null,
Course_Fees char(30) not null
);

create table Course_Content(
Content_Id int primary key not null,
Content_Topic_Name varchar(50) not null,
Detail_Content char(10) not null,
Video_Link varchar(50) not null,
Reference varchar(50) not null,
Course_Id int not null
);
/* add foregin key to Course_Content */
alter table Course_Content add foreign key (Course_Id) references Courses(Course_Id);

create table Courses_Registration(
User_Id int primary key not null,
Course_ID char(30) not null,
Payment_ID char(30) not null
);

create table Payment(
Payment_Id int primary key not null,
Payment_Date varchar(50) not null,
Payment_Amount char(10) not null,
Payment_Type varchar(50) not null,
Payment_Remarks varchar(50) not null,
User_ID int not null,
Course_ID int not null
);
/* add foregin key to Payment */
alter table Payment add foreign key (Course_Id) references Courses(Course_Id);
alter table Payment add foreign key (User_ID) references Users(User_ID);
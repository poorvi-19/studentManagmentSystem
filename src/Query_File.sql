use  studentdb;
select * from admin;
-- drop table student;
-- drop table teacher_details;
-- drop table student_details;
-- drop table class_details;
-- drop table teacher_details;
Alter table admin add father_name varchar(50);
Alter table admin add  designation varchar(50);
CREATE TABLE teacher_details (
    user_name VARCHAR(50),
    name VARCHAR(50),
    password VARCHAR(50),
    father_name VARCHAR(50),
    qualification VARCHAR(50),
    gender VARCHAR(10),
    teaching_exp VARCHAR(50),
    fav_subject VARCHAR(40),
    email VARCHAR(50),
    phone VARCHAR(50),
    city VARCHAR(50),
    blood_group VARCHAR(40),
    age VARCHAR(50),
    date_of_birth VARCHAR(50)
);

CREATE TABLE student_details (
    user_name VARCHAR(50),
    name VARCHAR(50),
    password VARCHAR(50),
    father_name VARCHAR(50),
    class VARCHAR(50),
    gender VARCHAR(10),
    city VARCHAR(50),
    rollno VARCHAR(40),
    email VARCHAR(50),
    phone VARCHAR(50),
    blood_group VARCHAR(40),
    section VARCHAR(50),
    age VARCHAR(50),
    date_of_birth VARCHAR(50)
);
CREATE TABLE class_details (
    class_name VARCHAR(40),
    section VARCHAR(40),
    student_strength VARCHAR(50),
    enrolled_student VARCHAR(50)
); 
CREATE TABLE subject_details (
    subject_id INT,
    subject_name VARCHAR(40)
);
CREATE TABLE marks_details (
    class_name INT,
    section VARCHAR(40),
    student_user_name VARCHAR(50),
    student_name VARCHAR(50),
    subject VARCHAR(50),
    marks INT,
    term INT
);
CREATE TABLE fee_structure(
    class_name VARCHAR(50),
	fee INT
);
create table student_fee(
class_name varchar(40),
user_username varchar(40)
);
use studentdb;
-- inserting some values in all the tables


insert into admin (username, name, password, father_name,designation) values ('admin2', 'Praveen singh','Apple@123', 'Vijay bahadur singh','admin');
select * from admin;
update  admin set name='Poorvi singh' WHERE username='admin1';
update admin set father_name='Vijay bahadur singh', designation='admin' where username='admin1';

ALTER TABLE student_details
modify name varchar(50);
ALTER TABLE student_details
modify phone varchar(50);
ALTER TABLE student_details
modify section varchar(50);
ALTER TABLE student_details
modify date_of_birth varchar(50);

ALTER TABLE student_details
add primary key (rollno);

insert into student_details (user_name,name,password, father_name,class,gender,city,rollno,email,phone,blood_group,section,age,date_of_birth) 
values ('janhvi@123','janhvi','janhvi@123','heeralal',8,'Female','Allahabad',1,'janhvi@gmail.com',9123456789,'0+','A',15,'12.05.2005');

insert into student_details (user_name,name,password,father_name,class,gender,city,rollno,email,phone,blood_group,section,age,date_of_birth) 
values('janhvi@123','janhvi','janhvi@123','heeralal','8','Female','Prayagraj','1','janhvi@gmail.com','9123456789','0+','A','15','12.05.2005');
select * from student_details;
DELETE FROM student_details WHERE city='Prayagraj';
update student_details  set user_name='janhvi@123',name='janhvi',password='janhvi@123',
father_name='heeralal',class='7',gender='Female',city='Allahabad',rollno='1',email='jahnvi@gmail.com',
phone='9123456789',blood_group='o+',section='A',age='15',date_of_birth='12.05.2005' where rollno='1';

update student_details  set user_name='janhvi@123',name='janhvi',password='janhvi@123',father_name='heeralal',class='6',gender='Female',city='Allahabad',rollno='1',email='jahnvi@gmail.com',
phone='9123456789',blood_group='o+',section='A',age='16',date_of_birth='12.05.2005' where rollno='1';


update student_details  set user_name='janhvi@123',name='janhvi',password='janhvi@123',father_name='heeralal',class='8',gender='Female',city='Allahabad',rollno='1',email='jahnvi@gmail.com',
phone='9123456789',blood_group='o+',section='A',age='18',date_of_birth='12.05.2005' where rollno='1';
DELETE FROM student_details WHERE hindi=89;

insert into student_details  values('puchu@28','Puchu','Puchu@123','Puchu ke papa','12','Female','Prayagraj','2','puchu@gmail.com','7007665524','O+','A','16','28.09.2005');



select * from teacher_details;
delete from teacher_details where blood_group='O+';
select * from class_details;
insert into class_details values('1','A','20','0');
insert into class_details values('2','A','25','0');
select * from student_details;

select * from teacher_details where user_name='';
Select name from student_details WHERE user_name='puchu@28';
delete from teacher_details where father_name='asdfds';
delete from teacher_details where user_name='sdaff';



ALTER TABLE class_details
modify enrolled_student int ;


UPDATE class_details
SET enrolled_student=enrolled_student+1
WHERE class_name='1';

UPDATE class_details
SET enrolled_student=1
WHERE class_name='2';

Select enrolled_student from class_details where class_name='2';
Select enrolled_student from class_details where class_name='1';

update student_details set rollno=1 where name='puchu';

delete from student_details where user_name='janhvi@123';

alter table student_details add hindi varchar(20);
alter table student_details add english varchar(20);
alter table student_details add math varchar(20);
alter table student_details add evs varchar(20);
alter table student_details add gk varchar(20);

update  student_details set hindi='80',english='75',math='83',evs='81',gk='89' where user_name='janvi@26';
update  student_details set hindi='89',english='70',math='83',evs='80',gk='82' where user_name='tanya@25';
update  student_details set hindi='70',english='73',math='83',evs='79',gk='82' where user_name='prince@456';
update  student_details set hindi='83',english='65',math='83',evs='77',gk='78' where user_name='sdfga';
update  student_details set hindi='84',english='89',math='83',evs='84',gk='89' where user_name='khushi@user';

select * from student_details;
select * from class_details;
select * from teacher_details;
select * from admin;
insert into student_details (rollno) values (1);
delete from student_details where user_name='' and rollno=1;
  delete from student_details 
        where user_name is null;
update class_details set rollno=1 where user_name='prince@456';
update student_details set rollno=2 where user_name='vishal@1996';



/* This is table for config of app,
	id is the event ID and the ID num cannot be null. It also need to be auto increase as the event adding to db.
	key_ is to recod the info of event, value is to record the amount of event*/
CREATE TABLE config (
  id int IDENTITY(1,1) NOT NULL ,
  key_ varchar(255) ,
  value varchar(255)
)

/* This is table for Category of app 
	id is the primary key and cannot be null.  It also need to be auto increase as the event adding to db.
	Name is the name of Category
 */
CREATE TABLE category (
  id int IDENTITY(1,1) NOT NULL,
  name varchar(255)
)

/* This is table for each record of app
	id is the primary key and cannot be null.  It also need to be auto increase as the event adding to db.
	spend is the amount of payment 
	cid is to connect with category 
	comment is for commitment 
	data is the time 
 */
 CREATE TABLE record (
  id int IDENTITY(1,1) NOT NULL,
  spend int,
  cid int,
  comment varchar(255) ,
  date Date
) 
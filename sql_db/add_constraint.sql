/* add constraint to each table with id in each table 
	the id cannot be null and duplicate
*/

alter table category add constraint pk_category_id primary key (id);
alter table record add constraint pk_record_id primary key (id);
alter table config add constraint pk_config_id primary key (id);
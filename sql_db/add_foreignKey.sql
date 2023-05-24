/* Add foreign key between record and categoty. The analyazing process is displayed in the picture
 */
alter table record add constraint fk_record_category foreign key (cid) references category(id);
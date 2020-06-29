

ALTER TABLE DISK_ACL ADD COLUMN ENTITY_REF VARCHAR(50);
ALTER TABLE DISK_ACL ADD COLUMN ENTITY_CATALOG VARCHAR(50);
ALTER TABLE DISK_ACL ADD COLUMN MASK INT;

ALTER TABLE DISK_ACL ADD COLUMN RULE_ID BIGINT;
ALTER TABLE DISK_ACL ADD CONSTRAINT FK_DISK_ACL_RULE FOREIGN KEY(RULE_ID) REFERENCES DISK_RULE(ID);


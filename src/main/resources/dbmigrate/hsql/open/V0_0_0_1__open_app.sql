

-------------------------------------------------------------------------------
--  open app
-------------------------------------------------------------------------------
CREATE TABLE OPEN_APP(
    ID BIGINT NOT NULL,
    CODE VARCHAR(50),
    NAME VARCHAR(50),
    CLIENT_ID VARCHAR(100),
    CLIENT_SECRET VARCHAR(100),
    STATUS VARCHAR(50),
    USER_ID VARCHAR(64),
    DESCRIPTION VARCHAR(200),
    CREATE_TIME DATETIME,
    GROUP_CODE VARCHAR(50),
    TENANT_ID VARCHAR(50),
    CONSTRAINT PK_OPEN_APP PRIMARY KEY(ID)
);

COMMENT ON TABLE OPEN_APP IS '账号';
COMMENT ON COLUMN OPEN_APP.ID IS '主键';
COMMENT ON COLUMN OPEN_APP.CODE IS '编号';
COMMENT ON COLUMN OPEN_APP.NAME IS '名称';
COMMENT ON COLUMN OPEN_APP.CLIENT_ID IS '应用编号';
COMMENT ON COLUMN OPEN_APP.CLIENT_SECRET IS '应用凭证';
COMMENT ON COLUMN OPEN_APP.STATUS IS '状态';
COMMENT ON COLUMN OPEN_APP.USER_ID IS '创建人';
COMMENT ON COLUMN OPEN_APP.DESCRIPTION IS '备注';
COMMENT ON COLUMN OPEN_APP.CREATE_TIME IS '创建时间';
COMMENT ON COLUMN OPEN_APP.GROUP_CODE IS '分组';
COMMENT ON COLUMN OPEN_APP.TENANT_ID IS '租户';


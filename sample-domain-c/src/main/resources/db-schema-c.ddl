DROP TABLE IF EXISTS e_cx;

-- ======== ======== ======== ========
-- cx
-- ======== ======== ======== ========
CREATE TABLE e_cx
(
    id       BIGSERIAL             NOT NULL,
    name_    VARCHAR               NULL,
    bx_id    BIGINT                NULL,
    deleted_ BOOLEAN DEFAULT FALSE NOT NULL,
    created_ TIMESTAMP             NULL,
    updated_ TIMESTAMP             NULL,
    CONSTRAINT cx_pk PRIMARY KEY (id),
    CONSTRAINT cx_fk_bx FOREIGN KEY (bx_id) REFERENCES e_bx (id)
);

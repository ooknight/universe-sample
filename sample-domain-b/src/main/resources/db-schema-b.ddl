DROP TABLE IF EXISTS e_bx CASCADE;

-- ======== ======== ======== ========
-- bx
-- ======== ======== ======== ========
CREATE TABLE IF NOT EXISTS e_bx
(
    id       BIGSERIAL             NOT NULL,
    name_    VARCHAR               NULL,
    ax_id    BIGINT                NULL,
    deleted_ BOOLEAN DEFAULT FALSE NOT NULL,
    created_ TIMESTAMP             NULL,
    updated_ TIMESTAMP             NULL,
    CONSTRAINT bx_pk PRIMARY KEY (id),
    CONSTRAINT bx_fk_ax FOREIGN KEY (ax_id) REFERENCES e_ax (id)
);

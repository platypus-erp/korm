CREATE TABLE IF NOT EXISTS post_tag (
  color        INT         NOT NULL,
  external_ref VARCHAR(50) NOT NULL,
  name         VARCHAR(50) NOT NULL,
  id           BIGSERIAL PRIMARY KEY
)


DROP TABLE IF EXISTS edge_properties;
DROP TABLE IF EXISTS vertex_properties;
DROP TABLE IF EXISTS edges;
DROP TABLE IF EXISTS vertices;

CREATE TABLE vertices (
  vertex_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE edges (
  edge_id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  edge_outv INT(10) NOT NULL,
  edge_inv INT(10) NOT NULL,
  edge_label VARCHAR(255) NOT NULL,
  CONSTRAINT FOREIGN KEY (edge_outv) REFERENCES vertices (vertex_id) ON DELETE CASCADE,
  CONSTRAINT FOREIGN KEY (edge_inv) REFERENCES vertices (vertex_id) ON DELETE CASCADE
);


CREATE TABLE vertex_properties(
  vertex_id INT(10) NOT NULL,
  prop_name VARCHAR(255) NOT NULL,
  prop_value TEXT,
  prop_value_num INT,
  PRIMARY KEY(vertex_id, prop_name),
  CONSTRAINT FOREIGN KEY (vertex_id) REFERENCES vertices (vertex_id) ON DELETE CASCADE
);


CREATE TABLE edge_properties(
  edge_id INT(10) NOT NULL,
  prop_name VARCHAR(255) NOT NULL,
  prop_value TEXT,
  prop_value_num INT,
  UNIQUE KEY(edge_id, prop_name),
  CONSTRAINT FOREIGN KEY (edge_id) REFERENCES edges (edge_id) ON DELETE CASCADE
);


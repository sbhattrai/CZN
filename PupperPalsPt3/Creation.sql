
DROP TABLE pupper;
DROP TABLE breed;

CREATE TABLE breed (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255),
	temperament VARCHAR(255),
	coat VARCHAR(255)
	);
	
CREATE TABLE pupper (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255),
	sex CHAR(1),
	weight DECIMAL(4,1),
	height DECIMAL(4,1),
	color VARCHAR(255),
	date_of_birth DATE,
	breed_id INT, 
    FOREIGN KEY (breed_id) REFERENCES breed(id)
	);
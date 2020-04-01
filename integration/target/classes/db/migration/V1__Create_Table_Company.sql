CREATE TABLE `company` (
	`id_company` INT(20) NOT NULL AUTO_INCREMENT,
	`code` TEXT(5) NOT NULL,
	`name` TEXT(80) NOT NULL,
	`id_type` INT(20) NOT NULL,
	`id_status` INT(20) NOT NULL,
	PRIMARY KEY (`id_company`)
);

CREATE TABLE `class` (
	`id_class` INT(20) NOT NULL AUTO_INCREMENT,
	`code` TEXT(5) NOT NULL,
	`name` TEXT(30) NOT NULL,
	PRIMARY KEY (`id_class`)
);

CREATE TABLE `type` (
	`id_type` INT(20) NOT NULL AUTO_INCREMENT,
	`name` TEXT(30) NOT NULL,
	PRIMARY KEY (`id_type`)
);

CREATE TABLE `status` (
	`id_status` INT(20) NOT NULL AUTO_INCREMENT,
	`name` TEXT(50) NOT NULL,
	PRIMARY KEY (`id_status`)
);

CREATE TABLE `company_class` (
	`id_company` INT(20) NOT NULL UNIQUE,
	`id_class` INT(20) NOT NULL UNIQUE,
	PRIMARY KEY (`id_company`,`id_class`)
);

ALTER TABLE `company` ADD CONSTRAINT `fk_company_type` FOREIGN KEY (`id_type`) REFERENCES `type`(`id_type`);

ALTER TABLE `company` ADD CONSTRAINT `fk_company_status` FOREIGN KEY (`id_status`) REFERENCES `status`(`id_status`);

ALTER TABLE `company_class` ADD CONSTRAINT `fk_company_class_company` FOREIGN KEY (`id_company`) REFERENCES `company`(`id_company`);

ALTER TABLE `company_class` ADD CONSTRAINT `fk_company_class_class` FOREIGN KEY (`id_class`) REFERENCES `class`(`id_class`);

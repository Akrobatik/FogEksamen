-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema FOG
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema FOG
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `FOG` DEFAULT CHARACTER SET utf8 ;
USE `FOG` ;

-- -----------------------------------------------------
-- Table `FOG`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FOG`.`User` (
  `idUser` INT NOT NULL auto_increment,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `tlf` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FOG`.`Admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FOG`.`Admin` (
  `idAdmin` INT NOT NULL auto_increment,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAdmin`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FOG`.`SuperAdmin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FOG`.`SuperAdmin` (
  `idSuperAdmin` INT NOT NULL auto_increment,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idSuperAdmin`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FOG`.`Storage`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FOG`.`Storage` (
  `idStorage` INT NOT NULL auto_increment,
  `description` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idStorage`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FOG`.`Order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FOG`.`Order` (
  `idOrder` INT NOT NULL auto_increment,
  `rooftype` VARCHAR(45) NOT NULL,
  `width` DOUBLE(10,5) NOT NULL,
  `length` DOUBLE(10,5) NOT NULL,
  `height` DOUBLE(10,5) NOT NULL,
  `User_idUser` INT NOT NULL,
  PRIMARY KEY (`idOrder`),
  INDEX `fk_Order_User1_idx` (`User_idUser` ASC),
  CONSTRAINT `fk_Order_User1`
    FOREIGN KEY (`User_idUser`)
    REFERENCES `FOG`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FOG`.`Material`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FOG`.`Material` (
  `Order_idOrder` INT NOT NULL,
  `Storage_idStorage` INT NOT NULL,
  PRIMARY KEY (`Order_idOrder`, `Storage_idStorage`),
  INDEX `fk_Order_has_Storage_Storage1_idx` (`Storage_idStorage` ASC),
  INDEX `fk_Order_has_Storage_Order1_idx` (`Order_idOrder` ASC),
  CONSTRAINT `fk_Order_has_Storage_Order1`
    FOREIGN KEY (`Order_idOrder`)
    REFERENCES `FOG`.`Order` (`idOrder`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Order_has_Storage_Storage1`
    FOREIGN KEY (`Storage_idStorage`)
    REFERENCES `FOG`.`Storage` (`idStorage`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


drop table Material;

drop table `Order`;

drop table Storage;

drop table User;

drop table Admin;

drop table SuperAdmin;

insert into User (username, password, firstname, lastname, tlf, email) 
values('Anders', 'Anders123', 'Anders', 'Nissen', 66666666, 'lala@gmail.com');

insert into Admin (username, password, firstname, lastname) 
values ('Emil', 'Emil123', 'Emil', 'Rasmussen');

insert into SuperAdmin(username, password)
values('Admin', 'Admin123');

alter table `Order` drop column heigth;

alter table `Order` add column height double;

insert into `Order` (User_idUser, rooftype, width, length, height ) 
values ((select idUser from User where username = 'Anders'), 'Skrå tag', 2.2, 6.0, 2.5);

insert into `Order` (rooftype, width, length, height, User_idUser) values ('Skrå tag', 1.1, 2.2, 2.2, 1);

create table test (
idOrder int not null auto_increment, 
rooftype varchar(255) not null, 
width double(10, 2) not null, 
length double (10, 2) not null, 
height double (10, 2) not null, 
User_idUser int not null, 
primary key (idOrder)
);

insert into test (rooftype, width, length, height, User_idUser) values ('Skrå tag', 2.2, 2.2, 2.2, 1);

insert into test (rooftype, width, length, height, User_idUser) values ('Flat tag', 4.5, 6.3, 3.6, 2);

drop table test;

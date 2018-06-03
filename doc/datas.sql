-- phpMyAdmin SQL Dump
-- version 4.7.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 03, 2018 at 05:07 PM
-- Server version: 5.6.35
-- PHP Version: 7.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `supcooking`
--

--
-- Dumping data for table `CATEGORY`
--

INSERT INTO `CATEGORY` (`ID`, `NAME`) VALUES
(1, 'patisserie'),
(2, 'dessert'),
(3, 'entrée'),
(4, 'salade'),
(5, 'gateau');

--
-- Dumping data for table `DESCRIPTION`
--

INSERT INTO `DESCRIPTION` (`ID`, `CONTENT`, `PICTURE`) VALUES
(1, 'Gâteau au yaourt simple', NULL),
(2, 'Le gâteau napolitain est l’une des gourmandises que l’on retrouve le plus souvent dans les boîtes à goûter. Il est facile à manger et très gourmand. Alors pour la rentrée, je vous propose ', 'https://www.odelices.com/images/recettes/napolitain5-820x1111.jpg');

--
-- Dumping data for table `PRODUCT`
--

INSERT INTO `PRODUCT` (`ID`, `NAME`, `PRICE`, `QUANTITY`, `COOCKINGRECIPE_ID`) VALUES
(1, 'sucre', NULL, '2 g', 1),
(2, 'huile de tournesol', NULL, '10 cl', 1),
(3, 'tomme de vache', NULL, '800 g', 3),
(4, 'veau', NULL, '400 g', 3),
(5, 'chou vert', NULL, '1', 3),
(6, 'creme fraiche', NULL, '100 g', 3);

--
-- Dumping data for table `RECIPE`
--

INSERT INTO `RECIPE` (`ID`, `COOKINGTIME`, `NAME`, `PREPARATIONTIME`, `CATEGORY_ID`, `OWNER_ID`, `DESCRIPTION_ID`) VALUES
(1, '05:00:00', 'Gateau yaourt', '05:00:00', 1, 4, 1),
(3, '05:00:00', 'napolitain maison', '05:00:00', 1, 2, 2);

--
-- Dumping data for table `SEQUENCE`
--

INSERT INTO `SEQUENCE` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', '60');

--
-- Dumping data for table `USER`
--

INSERT INTO `USER` (`ID`, `ADDRESS`, `FIRSTNAME`, `LASTNAME`, `LOGIN`, `PASSWORD`) VALUES
(2, 'villa n* 4', 'Franky', 'Rakatomalala', 'francky', 'passera'),
(3, 'villa n* 4', 'kevin', 'doh', 'kevDoh', 'passera'),
(4, '77 avenue de Bonneuil', 'Massamba', 'FALL', 'mass', 'passera'),
(10, 'villa n* 4', 'Fall', 'Massamba', 'mass_daboss', 'passera');

-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2014 at 02:41 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `eventplanning`
--

-- --------------------------------------------------------

--
-- Table structure for table `bookinginfo`
--

CREATE TABLE IF NOT EXISTS `bookinginfo` (
  `bookingID` varchar(100) NOT NULL,
  `placeID` varchar(100) NOT NULL,
  `photographerID` varchar(100) NOT NULL,
  `foodID` varchar(100) NOT NULL,
  `packageID` varchar(100) NOT NULL,
  `transportID` varchar(100) NOT NULL,
  `DecorationID` varchar(100) NOT NULL,
  `userID` varchar(100) NOT NULL,
  `bookingDate` varchar(100) NOT NULL,
  `startTime` varchar(100) NOT NULL,
  `endTime` varchar(100) NOT NULL,
  `cost` double NOT NULL,
  `flag` int(11) NOT NULL,
  `type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `decorationinfo`
--

CREATE TABLE IF NOT EXISTS `decorationinfo` (
  `decorationID` varchar(100) NOT NULL,
  `decorationDetails` varchar(100) NOT NULL,
  `cost` double NOT NULL,
  `decorationType` varchar(100) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`decorationID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `decorationinfo`
--

INSERT INTO `decorationinfo` (`decorationID`, `decorationDetails`, `cost`, `decorationType`, `flag`) VALUES
('decoration1', 'abcd', 25000, 'wedding', 0),
('decoration2', 'abcd', 50000, 'wedding', 0),
('decoration3', 'abcd', 75000, 'wedding', 0),
('decoration4', 'abcd', 100000, 'wedding', 0);

-- --------------------------------------------------------

--
-- Table structure for table `foodinfo`
--

CREATE TABLE IF NOT EXISTS `foodinfo` (
  `foodID` varchar(100) NOT NULL,
  `foodName` varchar(100) NOT NULL,
  `foodType` varchar(100) NOT NULL,
  `cost` double NOT NULL,
  `foodDetails` varchar(1000) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`foodID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `foodinfo`
--

INSERT INTO `foodinfo` (`foodID`, `foodName`, `foodType`, `cost`, `foodDetails`, `flag`) VALUES
('food1', 'Chinese ', 'wedding', 120000, 'abxcd', 0),
('food2', 'Thai', 'conference', 150000, 'abxcd', 0),
('food3', 'Mexican', 'wedding', 150000, 'abxcd', 0);

-- --------------------------------------------------------

--
-- Table structure for table `packageinfo`
--

CREATE TABLE IF NOT EXISTS `packageinfo` (
  `packageID` varchar(100) NOT NULL,
  `placeID` varchar(100) NOT NULL,
  `foodItem` varchar(100) NOT NULL,
  `capacity` int(11) NOT NULL,
  `type` varchar(100) NOT NULL,
  `cost` double NOT NULL,
  `packageDetail` varchar(1000) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`packageID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `packageinfo`
--

INSERT INTO `packageinfo` (`packageID`, `placeID`, `foodItem`, `capacity`, `type`, `cost`, `packageDetail`, `flag`) VALUES
('package1', 'place1', 'food1', 150, 'wedding', 300000, 'abcd', 0),
('package2', 'place1', 'food2', 200, 'wedding', 500000, 'abcd', 0),
('package3', 'place2', 'food3', 50, 'conference', 200000, 'abcd', 0);

-- --------------------------------------------------------

--
-- Table structure for table `photographerinfo`
--

CREATE TABLE IF NOT EXISTS `photographerinfo` (
  `photographerID` varchar(100) NOT NULL,
  `photographerName` varchar(100) NOT NULL,
  `costPerHour` double NOT NULL,
  `type` varchar(100) NOT NULL,
  `photographerDetail` varchar(1000) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`photographerID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `photographerinfo`
--

INSERT INTO `photographerinfo` (`photographerID`, `photographerName`, `costPerHour`, `type`, `photographerDetail`, `flag`) VALUES
('photographer1', 'Rifath', 15000, 'wedding', 'abcd', 0),
('photographer2', 'Jessica', 15000, 'wedding', 'abcd', 0);

-- --------------------------------------------------------

--
-- Table structure for table `placeinfo`
--

CREATE TABLE IF NOT EXISTS `placeinfo` (
  `placeID` varchar(100) NOT NULL,
  `placeName` varchar(100) NOT NULL,
  `placeType` varchar(100) NOT NULL,
  `placeCost` varchar(100) NOT NULL,
  `placeDetails` varchar(1500) NOT NULL,
  `placeCapacity` int(11) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`placeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `placeinfo`
--

INSERT INTO `placeinfo` (`placeID`, `placeName`, `placeType`, `placeCost`, `placeDetails`, `placeCapacity`, `flag`) VALUES
('place1', 'Golf Club', 'wedding', '150000', 'abcd', 500, 0);

-- --------------------------------------------------------

--
-- Table structure for table `queryclient`
--

CREATE TABLE IF NOT EXISTS `queryclient` (
  `queryno` int(11) NOT NULL,
  `userName` varchar(100) NOT NULL,
  `fullName` varchar(1000) NOT NULL,
  `email` varchar(1000) NOT NULL,
  `subject` varchar(1000) NOT NULL,
  `message` varchar(10000) NOT NULL,
  `flag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `queryclient`
--

INSERT INTO `queryclient` (`queryno`, `userName`, `fullName`, `email`, `subject`, `message`, `flag`) VALUES
(2, 'anonymous', 'alu alu', 'edcvggv', 'abcd', '1234', 0),
(2, 'rifath1', 'rifu', 'sr.rifat@gmail.com', 'gvhjbjb', 'i am rifu', 0);

-- --------------------------------------------------------

--
-- Table structure for table `transportinfo`
--

CREATE TABLE IF NOT EXISTS `transportinfo` (
  `transportID` varchar(100) NOT NULL,
  `transportName` varchar(100) NOT NULL,
  `costPerTransport` double NOT NULL,
  `transportDetails` varchar(1000) NOT NULL,
  `transportCapacity` int(11) NOT NULL,
  `transportType` varchar(100) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`transportID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transportinfo`
--

INSERT INTO `transportinfo` (`transportID`, `transportName`, `costPerTransport`, `transportDetails`, `transportCapacity`, `transportType`, `flag`) VALUES
('transport1', 'Bus', 30000, 'abcd', 150, 'wedding', 0),
('transport2', 'Bus', 30000, 'abcd', 150, 'conference', 0);

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE IF NOT EXISTS `userinfo` (
  `userID` varchar(100) NOT NULL,
  `userName` varchar(100) NOT NULL,
  `password` varchar(1000) NOT NULL,
  `mobile` varchar(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `bankName` varchar(100) NOT NULL,
  `bankAccount` varchar(100) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`userID`, `userName`, `password`, `mobile`, `email`, `bankName`, `bankAccount`, `flag`) VALUES
('rifath1', 'Saidur Rahman', 'QL0AFWMIX8NRZTKeof9cXsvbvu8=', '01682224730', 'sr.rifat@gmail.com', 'bankAsia', 'fc1234567', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

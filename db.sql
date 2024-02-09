-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2024 at 04:34 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_dbmovies`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `AName` varchar(50) NOT NULL,
  `APassword` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AName`, `APassword`) VALUES
('admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `payment_details`
--

CREATE TABLE `payment_details` (
  `payment_id` int(30) NOT NULL,
  `card_number` varchar(50) NOT NULL,
  `card_holder_name` varchar(50) NOT NULL,
  `cvv` varchar(30) NOT NULL,
  `ticket_count` int(30) NOT NULL,
  `movie_name` varchar(50) NOT NULL,
  `theater` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `time` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment_details`
--

INSERT INTO `payment_details` (`payment_id`, `card_number`, `card_holder_name`, `cvv`, `ticket_count`, `movie_name`, `theater`, `date`, `time`) VALUES
(1, '235346', 'raju', '344', 3, 'Dunki', 'Cinépolis', '21-Feb-2024', '01:00PM - 14:00PM');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `phone` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`id`, `name`, `email`, `password`, `phone`) VALUES
(1, 'prashant', 'prashant@gmail.com', '1234', '9984529509'),
(2, 'raj', 'raj@gmail.com', '1234', '124725346');

-- --------------------------------------------------------

--
-- Table structure for table `table3`
--

CREATE TABLE `table3` (
  `id` int(11) NOT NULL,
  `movieName` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `theatre` varchar(30) NOT NULL,
  `shows` varchar(30) NOT NULL,
  `tickets` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table3`
--

INSERT INTO `table3` (`id`, `movieName`, `date`, `theatre`, `shows`, `tickets`) VALUES
(1, 'Fighter', '16-Feb-2024', 'Wave Cinemas', '09:00AM - 12:00PM', 343),
(2, 'Fighter', '16-Feb-2024', 'Cinépolis', '09:00AM - 12:00PM', 345),
(3, 'Fighter', '17-Feb-2024', 'Cinépolis', '09:00AM - 12:00PM', 345),
(4, 'Fighter', '18-Feb-2024', 'Cinépolis', '09:00AM - 12:00PM', 345),
(5, 'Fighter', '18-Feb-2024', 'Wave Cinemas', '09:00AM - 12:00PM', 345),
(6, 'Fighter', '20-Feb-2024', 'Wave Cinemas', '09:00AM - 12:00PM', 345),
(7, 'Dunki', '20-Feb-2024', 'Wave Cinemas', '09:00AM - 12:00PM', 345),
(8, 'Dunki', '17-Feb-2024', 'Wave Cinemas', '09:00AM - 12:00PM', 345),
(9, 'Dunki', '17-Feb-2024', 'Wave Cinemas', '01:00PM - 14:00PM', 358),
(10, 'Dunki', '21-Feb-2024', 'Cinépolis', '01:00PM - 14:00PM', 355),
(11, 'Dunki', '19-Feb-2024', 'Cinépolis', '01:00PM - 14:00PM', 358),
(12, 'Dunki', '16-Feb-2024', 'Cinépolis', '01:00PM - 14:00PM', 358),
(13, 'Dunki', '16-Feb-2024', 'Cinépolis', '09:00AM - 12:00PM', 358),
(14, 'Dunki', '17-Feb-2024', 'Cinépolis', '09:00AM - 12:00PM', 358),
(15, 'Dunki', '19-Feb-2024', 'Cinépolis', '09:00AM - 12:00PM', 358),
(16, 'Dunki', '19-Feb-2024', 'INOX Lucknow', '09:00AM - 12:00PM', 358),
(17, 'Dunki', '18-Feb-2024', 'INOX Lucknow', '09:00AM - 12:00PM', 358),
(18, 'Dunki', '17-Feb-2024', 'INOX Lucknow', '09:00AM - 12:00PM', 358),
(19, 'Dunki', '16-Feb-2024', 'INOX Lucknow', '09:00AM - 12:00PM', 358),
(20, 'Dunki', '16-Feb-2024', 'INOX Lucknow', '01:00PM - 04:00PM', 358),
(21, 'Dunki', '17-Feb-2024', 'INOX Lucknow', '01:00PM - 04:00PM', 358),
(22, 'Dunki', '18-Feb-2024', 'INOX Lucknow', '01:00PM - 04:00PM', 358),
(23, '12th Fail', '18-Feb-2024', 'INOX Lucknow', '01:00PM - 04:00PM', 358),
(24, '12th Fail', '19-Feb-2024', 'INOX Lucknow', '01:00PM - 04:00PM', 358),
(25, '12th Fail', '17-Feb-2024', 'INOX Lucknow', '01:00PM - 04:00PM', 358),
(26, '12th Fail', '17-Feb-2024', 'INOX Lucknow', '09:00PM - 12:00PM', 358),
(28, '12th Fail', '16-Feb-2024', 'INOX Lucknow', '09:00PM - 12:00PM', 358),
(29, '12th Fail', '16-Feb-2024', 'Cinépolis', '09:00PM - 12:00PM', 358),
(30, '12th Fail', '17-Feb-2024', 'Cinépolis', '09:00PM - 12:00PM', 358),
(31, '12th Fail', '18-Feb-2024', 'Cinépolis', '09:00PM - 12:00PM', 358);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `payment_details`
--
ALTER TABLE `payment_details`
  ADD PRIMARY KEY (`payment_id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `table3`
--
ALTER TABLE `table3`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `payment_details`
--
ALTER TABLE `payment_details`
  MODIFY `payment_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `table3`
--
ALTER TABLE `table3`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE IF NOT EXISTS `register` (
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`name`, `email`, `password`) VALUES
('prashant', 'prashant@gmail.com', 'prashant');

-- --------------------------------------------------------

--
-- Table structure for table `table3`
--

CREATE TABLE IF NOT EXISTS `table3` (
  `theatre` varchar(30) NOT NULL,
  `shows` varchar(30) NOT NULL,
  `tickets` int(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table3`
--

INSERT INTO `table3` (`theatre`, `shows`, `tickets`) VALUES
('srivishnu', '11:00AM', 250),
('srivishnu', '7:00AM', 296),
('asscars', '9:00PM', 250),
('galaxy', '7:00AM', 250),
('PVR', '7:00AM', 255),
('srivishnu', '9:00PM', 300),
('srivishnu', '2:00PM', 260),
('srivishnu', '6:00PM', 250),
('asscars', '6:00PM', 350),
('asscars', '2:00PM', 241),
('asscars', '11:00AM', 300),
('galaxy', '11:00AM', 300),
('galaxy', '2:00PM', 250),
('galaxy', '6:00PM', 350),
('galaxy', '9:00PM', 250),
('asscars', '7:00AM', 260),
('PVR', '11:00AM', 300),
('PVR', '2:00PM', 250),
('PVR', '6:00PM', 350),
('PVR', '9:00PM', 250);
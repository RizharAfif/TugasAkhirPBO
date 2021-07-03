-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2021 at 08:56 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tugasakhir`
--

-- --------------------------------------------------------

--
-- Table structure for table `hasil_akhir`
--

CREATE TABLE `hasil_akhir` (
  `id_hasil` int(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `totalPkn` int(100) NOT NULL,
  `totalUjian` int(100) NOT NULL,
  `hasilAkhir` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hasil_akhir`
--

INSERT INTO `hasil_akhir` (`id_hasil`, `nama`, `totalPkn`, `totalUjian`, `hasilAkhir`) VALUES
(1, 'Raditya', 76, 84, 79),
(2, 'Rizhar', 75, 69, 73);

-- --------------------------------------------------------

--
-- Table structure for table `login_user`
--

CREATE TABLE `login_user` (
  `id` int(100) NOT NULL,
  `user` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `hakakses` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_user`
--

INSERT INTO `login_user` (`id`, `user`, `pass`, `hakakses`) VALUES
(1, 'admin', '123', 'Admin'),
(2, 'mahasiswa', '123', 'Mahasiswa'),
(3, 'dosen', '123', 'Dosen');

-- --------------------------------------------------------

--
-- Table structure for table `nilai_pkn`
--

CREATE TABLE `nilai_pkn` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `sopan` int(100) NOT NULL,
  `disHadir` int(100) NOT NULL,
  `disPeker` int(100) NOT NULL,
  `kePrak` int(100) NOT NULL,
  `tngjwb` int(100) NOT NULL,
  `mau` int(100) NOT NULL,
  `ilPrak` int(100) NOT NULL,
  `trampil` int(100) NOT NULL,
  `bicara` int(100) NOT NULL,
  `gaul` int(100) NOT NULL,
  `total` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nilai_pkn`
--

INSERT INTO `nilai_pkn` (`id`, `nama`, `sopan`, `disHadir`, `disPeker`, `kePrak`, `tngjwb`, `mau`, `ilPrak`, `trampil`, `bicara`, `gaul`, `total`) VALUES
(14, 'Rizhar', 77, 67, 89, 88, 77, 89, 76, 44, 66, 77, 75),
(15, 'Raditya', 99, 87, 76, 77, 88, 76, 77, 67, 40, 78, 76);

-- --------------------------------------------------------

--
-- Table structure for table `nilai_ujian`
--

CREATE TABLE `nilai_ujian` (
  `id_ujian` int(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `keberhasilan` varchar(100) NOT NULL,
  `penulisan` varchar(100) NOT NULL,
  `keaktifan` varchar(100) NOT NULL,
  `totalNilai` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nilai_ujian`
--

INSERT INTO `nilai_ujian` (`id_ujian`, `nama`, `keberhasilan`, `penulisan`, `keaktifan`, `totalNilai`) VALUES
(5, 'Raditya', '88', '89', '77', 84),
(8, 'Rizhar', '55', '66', '88', 69);

-- --------------------------------------------------------

--
-- Table structure for table `tb_mahasiswa`
--

CREATE TABLE `tb_mahasiswa` (
  `id_mahasiswa` int(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `judulPkn` varchar(100) NOT NULL,
  `nilai` varchar(100) NOT NULL,
  `nim` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tempat` varchar(100) NOT NULL,
  `waktu` date NOT NULL,
  `status` enum('Diterima','Belum Diterima') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_mahasiswa`
--

INSERT INTO `tb_mahasiswa` (`id_mahasiswa`, `nama`, `judulPkn`, `nilai`, `nim`, `alamat`, `tempat`, `waktu`, `status`) VALUES
(1, 'Rizhar', 'LEMBAGA PKN', 'Sanggahan dari sangggahan.docx', '2020147', 'Malang', 'PT SEMPURNA SEJATI', '1970-01-01', 'Diterima'),
(11, 'Raditya', 'babi ngepet', 'UTS KALKULUS.docx', '14448', 'Surabaya ', 'CV GATAU', '2021-06-28', 'Diterima'),
(16, 'Rizhar Afif', 'cddd', 'DIKTAT.pdf', '123', 'abcd', 'abcde', '2021-06-29', 'Belum Diterima'),
(17, 'Rizhar Afif', '', '', '2021266', 'malang', 'CV SURGA SEJATI', '2021-06-30', 'Belum Diterima');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hasil_akhir`
--
ALTER TABLE `hasil_akhir`
  ADD PRIMARY KEY (`id_hasil`);

--
-- Indexes for table `login_user`
--
ALTER TABLE `login_user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nilai_pkn`
--
ALTER TABLE `nilai_pkn`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `nilai_ujian`
--
ALTER TABLE `nilai_ujian`
  ADD PRIMARY KEY (`id_ujian`);

--
-- Indexes for table `tb_mahasiswa`
--
ALTER TABLE `tb_mahasiswa`
  ADD PRIMARY KEY (`id_mahasiswa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hasil_akhir`
--
ALTER TABLE `hasil_akhir`
  MODIFY `id_hasil` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `login_user`
--
ALTER TABLE `login_user`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `nilai_pkn`
--
ALTER TABLE `nilai_pkn`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `nilai_ujian`
--
ALTER TABLE `nilai_ujian`
  MODIFY `id_ujian` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tb_mahasiswa`
--
ALTER TABLE `tb_mahasiswa`
  MODIFY `id_mahasiswa` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Agu 2024 pada 19.59
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `skripsi_ta`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_guru`
--

CREATE TABLE `tb_guru` (
  `id_guru` char(15) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `tempat` varchar(100) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `agama` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_guru`
--

INSERT INTO `tb_guru` (`id_guru`, `nama`, `jenis_kelamin`, `tempat`, `tgl_lahir`, `agama`, `email`, `alamat`) VALUES
('IDG2024001', 'Paijo Ahmad', 'Laki-Laki', 'Bandung', '1995-12-07', 'Islam', 'Paijo@gmail.com', 'Depok'),
('IDG2024002', 'Paiman Sukur', 'Laki-Laki', 'Bogor', '1993-10-11', 'Islam', 'Paiman@gmail.com', 'Bogor'),
('IDG2024003', 'Paseto tejo', 'Laki-Laki', 'Jakarta', '1990-09-20', 'Islam', 'Tejo@gmail.com', 'Tebet'),
('IDG2024004', 'Pasuji Rahman', 'Laki-Laki', 'Bali', '1990-06-27', 'Islam', 'Pasuji@gmail.com', 'Depok'),
('IDG2024005', 'Santi Nur', 'Perempuan', 'Depok', '1997-07-14', 'Islam', 'Santi@gmail.com', 'Cilodong'),
('IDG2024006', 'Aulia Zahra', 'Perempuan', 'Depok', '1993-08-07', 'Islam', 'Aul@gmail.com', 'Depok');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_hasilakhir`
--

CREATE TABLE `tb_hasilakhir` (
  `Nama` varchar(50) NOT NULL,
  `Hasil_Akhir` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_hasilakhir`
--

INSERT INTO `tb_hasilakhir` (`Nama`, `Hasil_Akhir`) VALUES
('Paijo Ahmad', 0.464),
('Paiman Sukur', 0.286),
('Paseto tejo', 0.152),
('Pasuji Rahman', 0.098);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_kriteria`
--

CREATE TABLE `tb_kriteria` (
  `kode_kriteria` char(15) NOT NULL,
  `nama_kriteria` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_kriteria`
--

INSERT INTO `tb_kriteria` (`kode_kriteria`, `nama_kriteria`) VALUES
('K1', 'Pedagogik'),
('K2', 'Kepribadian'),
('K3', 'Profesional'),
('K4', 'Sosial');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_penilaianalternatif`
--

CREATE TABLE `tb_penilaianalternatif` (
  `Kode_Alt` varchar(50) NOT NULL,
  `Kriteria` varchar(50) NOT NULL,
  `Paijo` float NOT NULL,
  `Paiman` float NOT NULL,
  `Paseto` float NOT NULL,
  `Pasuji` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_penilaianalternatif`
--

INSERT INTO `tb_penilaianalternatif` (`Kode_Alt`, `Kriteria`, `Paijo`, `Paiman`, `Paseto`, `Pasuji`) VALUES
('KG1', 'Pedagogik', 0.419, 0.264, 0.177, 0.14),
('KG2', 'Kepribadian', 0.437, 0.354, 0.129, 0.08),
('KG3', 'Profesional', 0.558, 0.263, 0.122, 0.057),
('KG4', 'Sosial', 0.578, 0.193, 0.185, 0.044);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_penilaiankriteria`
--

CREATE TABLE `tb_penilaiankriteria` (
  `Kode` varchar(50) NOT NULL,
  `Pedagogik` float NOT NULL,
  `Kepribadian` float NOT NULL,
  `Profesional` float NOT NULL,
  `Sosial` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_penilaiankriteria`
--

INSERT INTO `tb_penilaiankriteria` (`Kode`, `Pedagogik`, `Kepribadian`, `Profesional`, `Sosial`) VALUES
('KP1', 0.426, 0.303, 0.197, 0.075);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `id` char(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `jabatan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`id`, `nama`, `username`, `password`, `jabatan`) VALUES
('ADM001', 'Admin', 'Admin', 'Admin', 'Admin'),
('ADM002', 'Kepsek', 'Kepsek', 'Kepsek', 'Kepala Sekolah'),
('ADM003', 'Adi', 'Reza', 'Adiiii', 'Admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

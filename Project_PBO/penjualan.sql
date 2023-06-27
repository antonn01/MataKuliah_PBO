-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Jan 2023 pada 05.46
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `jenis_barang` varchar(100) DEFAULT NULL,
  `harga_beli` int(12) DEFAULT NULL,
  `harga_jual` int(12) DEFAULT NULL,
  `ukuran` varchar(10) DEFAULT NULL,
  `stok` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `no_faktur` varchar(10) NOT NULL,
  `tanggal` varchar(20) DEFAULT NULL,
  `total` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan_rinci`
--

CREATE TABLE `penjualan_rinci` (
  `id_penjualan` int(11) NOT NULL,
  `no_faktur` varchar(10) DEFAULT NULL,
  `id_barang` varchar(10) DEFAULT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `jumlah` int(12) DEFAULT NULL,
  `harga` int(12) DEFAULT NULL,
  `total` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`no_faktur`);

--
-- Indeks untuk tabel `penjualan_rinci`
--
ALTER TABLE `penjualan_rinci`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `f` (`no_faktur`),
  ADD KEY `b` (`id_barang`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `penjualan_rinci`
--
ALTER TABLE `penjualan_rinci`
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `penjualan_rinci`
--
ALTER TABLE `penjualan_rinci`
  ADD CONSTRAINT `b` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`) ON DELETE CASCADE,
  ADD CONSTRAINT `f` FOREIGN KEY (`no_faktur`) REFERENCES `penjualan` (`no_faktur`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

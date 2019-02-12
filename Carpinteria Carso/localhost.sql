-- phpMyAdmin SQL Dump
-- version 2.10.2
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 19-06-2013 a las 12:49:12
-- Versión del servidor: 5.0.45
-- Versión de PHP: 5.2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `cc`
-- 
CREATE DATABASE `cc` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `cc`;

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `clientes`
-- 

CREATE TABLE `clientes` (
  `Id_Cliente` decimal(10,0) NOT NULL,
  `Nombre` varchar(15) default NULL,
  `Edad` decimal(5,0) default NULL,
  `Direccion` varchar(20) default NULL,
  `RFC` varchar(15) default NULL,
  `Email` varchar(15) default NULL,
  `Telefono` decimal(10,0) default NULL,
  `Promo` varchar(15) default NULL,
  `Des` varchar(15) default NULL,
  `Pago1` varchar(15) default NULL,
  `Sexo` varchar(12) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `clientes`
-- 

INSERT INTO `clientes` VALUES (1, 'JUAN', 21, 'ACANTO', 'LKJQWEWQ99808', 'JOELHKLJKJ', 2298797897, 'Con Promoción', 'Descuento', 'Tarjeta', 'Masculino');
INSERT INTO `clientes` VALUES (2, 'joel', 12, 'casc', 'joiu', 'iopiopi', 9890890, 'Promoción', 'Descuento', 'Pago', 'Sexo');

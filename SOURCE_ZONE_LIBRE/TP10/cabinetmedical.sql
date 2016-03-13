-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le : Mer 23 Novembre 2011 à 20:43
-- Version du serveur: 5.5.16
-- Version de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `cabinetmedical`
--

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE IF NOT EXISTS `adresse` (
  `idAdresse` int(10) NOT NULL AUTO_INCREMENT,
  `numero` varchar(6) DEFAULT NULL,
  `rue` varchar(50) DEFAULT NULL,
  `voie` varchar(10) DEFAULT NULL,
  `batiment` varchar(10) DEFAULT NULL,
  `codePostal` varchar(5) DEFAULT NULL,
  `ville` varchar(25) DEFAULT NULL,
  `pays` varchar(25) DEFAULT NULL,
  `idPersonne` int(10) DEFAULT NULL,
  PRIMARY KEY (`idAdresse`),
  KEY `idPersonne` (`idPersonne`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `adresse`
--

INSERT INTO `adresse` (`idAdresse`, `numero`, `rue`, `voie`, `batiment`, `codePostal`, `ville`, `pays`, `idPersonne`) VALUES
(1, '15', 'avenue Jean Jaurès', '', '', '87000', 'Limoges', 'France', 1),
(2, '3', 'rue de Limoges', '', '', '87170', 'Isle', 'France', 2),
(3, '10', 'rue de Toulouse', '', 'Batiment A', '87000', 'Limoges', 'France', 3),
(4, '123Bis', 'Boulevard d''ici', '', '', '87000', 'Limoges', 'France', 4);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE IF NOT EXISTS `personne` (
  `idPersonne` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(25) DEFAULT NULL,
  `prenom` varchar(25) DEFAULT NULL,
  `datenaissance` varchar(10) DEFAULT NULL,
  `male` int(1) DEFAULT NULL,
  `telephone` varchar(14) DEFAULT NULL,
  `portable` varchar(14) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `idAscendant` int(10) DEFAULT NULL,
  `idTypePersonne` int(1) DEFAULT NULL,
  `nir` varchar(15) DEFAULT NULL,
  `medecinTraitant` varchar(50) DEFAULT NULL,
  `immatriculation` varchar(9) DEFAULT NULL,
  `specialite` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idPersonne`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`idPersonne`, `nom`, `prenom`, `datenaissance`, `male`, `telephone`, `portable`, `email`, `idAscendant`, `idTypePersonne`, `nir`, `medecinTraitant`, `immatriculation`, `specialite`) VALUES
(1, 'DUPONT', 'Julie', '1960-05-21', 0, '0555434355', '0606060606', 'julie.dupont@tralala.fr', NULL, 0, '260058700112367', 'LEDOC Paul', NULL, NULL),
(2, 'LEDOC', 'Paul', '1976-07-10', 1, '0555434343', '0612345678', 'paul.ledoc@lesmedecins.fr', 0, 1, '', '', '871255358', 'g'),
(3, 'CHILDREN', 'Rose', '1970-02-16', 0, '0555434343', '0678654321', 'rose.children@lesmedecins.fr', 0, 1, '', '', '312444555', 'p'),
(4, 'DURAND', 'Alfred', '1968-05-23', 1, '0512348989', '0605050505', 'alfred.durand@unfournisseur.fr', NULL, 0, '168072B12345652', 'LEDOC Paul', NULL, NULL);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD CONSTRAINT `adresse_ibfk_1` FOREIGN KEY (`idPersonne`) REFERENCES `personne` (`idPersonne`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

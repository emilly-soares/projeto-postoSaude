CREATE DATABASE IF NOT EXISTS `posto_saude`;
USE `posto_saude`;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Estrutura para tabela `Paciente`
--
CREATE TABLE `Paciente` (
  `nomepc` varchar(120) NOT NULL,
  `datnascpac` DATE NOT NULL,
  `endpac` varchar(45) DEFAULT NULL,
  `telepac` char(10) DEFAULT NULL,
  `sexo` char(1) NOT NULL,
  `rg` char(12) DEFAULT NULL,
  `uf` char(2) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `codpaci` int(11) NOT NULL,
  `certidao` varchar(45) DEFAULT NULL,
  `celpac` char(10)
);

INSERT INTO Paciente (nomepc, datnascpac, endpac, telepac, sexo, rg, uf, cidade, bairro, certidao, celpac)
VALUES ('Nome do Paciente 2', '2023-11-26', 'Endereço do Paciente', '1234567890', 'M', '123456789012', 'SP', 'São Paulo', 'Bairro do Paciente', 'Certidão do Paciente', '9876543210');

SELECT * FROM Paciente;

--
-- Estrutura para tabela `Vacina_Paciente`
--
CREATE TABLE `Vacina_Paciente` (
  `codvacpac` int NOT NULL,
  `codvac` int NOT NULL,
  `codpac` int NOT NULL,
  `datavacpac` DATE NOT NULL,
  `dose` varchar(10) NOT NULL
);

--
-- Estrutura para tabela `Vacina`
--
CREATE TABLE `Vacina` (
  `nomevaci` varchar(45) NOT NULL,
  `form_admvaci` char(9) NOT NULL,
  `via_admvaci` char(15) NOT NULL,
  `lugar_admvaci` char(13) NOT NULL,
  `codvaci` int NOT NULL,
  `descricao` TEXT NOT NULL
);

--
-- Estrutura para tabela `Funcionario`
--
CREATE TABLE `Funcionario` (
  `nomefun` varchar(120) NOT NULL,
  `datnascfun` DATE NOT NULL,
  `endfun` varchar(45) NOT NULL,
  `telefun` char(10) NOT NULL,
  `ogexp` char(5) NOT NULL,
  `rg` char(12) NOT NULL,
  `uffunc` char(2) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `cpf` char(11) NOT NULL,
  `funcaofun` varchar(45) NOT NULL,
  `codfun` int(11) NOT NULL,
  `sexo` char(1) NOT NULL,
  `celfun` char(10) NOT NULL
);

--
-- Estrutura para tabela `Login`
--
CREATE TABLE `Login` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `senha` char(8) NOT NULL,
  `permissao` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo`)  -- Remova esta linha se `codigo` já for chave primária
);

--
-- Estrutura para tabela `Plantao`
--
CREATE TABLE `Plantao` (
  `codeplanenf` int(11) NOT NULL,
  `codenf` int(11) NOT NULL,
  `horentrada` TIME NOT NULL,
  `horsaida` TIME NOT NULL,
  `dataplant` DATE NOT NULL,
  `codmed` int(11) NOT NULL
);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `Paciente`
--
ALTER TABLE `Paciente`
  ADD PRIMARY KEY (`codpaci`);

--
-- Índices de tabela `Vacina_Paciente`
--
ALTER TABLE `Vacina_Paciente`
  ADD PRIMARY KEY (`codvacpac`);

--
-- Índices de tabela `Vacina`
--
ALTER TABLE `Vacina`
  ADD PRIMARY KEY (`codvaci`);

--
-- Índices de tabela `Funcionario`
--
ALTER TABLE `Funcionario`
  ADD PRIMARY KEY (`codfun`);

--
-- Índices de tabela `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices de tabela `Plantao`
--
ALTER TABLE `Plantao`
  ADD PRIMARY KEY (`codeplanenf`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `Paciente`
--
ALTER TABLE `Paciente`
  MODIFY `codpaci` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `Vacina_Paciente`
--
ALTER TABLE `Vacina_Paciente`
  MODIFY `codvacpac` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `Vacina`
--
ALTER TABLE `Vacina`
  MODIFY `codvaci` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `Funcionario`
--
ALTER TABLE `Funcionario`
  MODIFY `codfun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `Login`
--
ALTER TABLE `Login`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `Plantao`
--
ALTER TABLE `Plantao`
  MODIFY `codeplanenf` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
